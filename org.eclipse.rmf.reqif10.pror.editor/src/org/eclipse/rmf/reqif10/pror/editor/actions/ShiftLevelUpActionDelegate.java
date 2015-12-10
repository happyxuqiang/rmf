/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * 
 * Action for adding test objects to the current SpecHierarchy.
 * 
 * @author jastram
 *
 */
public class ShiftLevelUpActionDelegate implements IEditorActionDelegate,
		IWorkbenchWindowActionDelegate {

	private IStructuredSelection selection;
	private IEditorPart editor;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		if (!(editor instanceof ISpecificationEditor))
			return;
		ISpecificationEditor specificationEditor = (ISpecificationEditor) editor;
		EditingDomain editingDomain = specificationEditor.getEditingDomain();
		
		for (@SuppressWarnings("rawtypes")
		Iterator it = selection.iterator(); it.hasNext(); ) {
			Object next = it.next();
			if (next instanceof SpecHierarchy) {
				SpecHierarchy specHierarchy = (SpecHierarchy) next;
				//if (specHierarchy.getObject() == null){
				//	break;
				//}
				ShiftLevelCommand cmd = new ShiftLevelCommand("Shifting Up " );
				cmd.setSelection(selection);
				
				Command shiftCommand = createShiftCommand(specHierarchy, editingDomain);
				if (shiftCommand != null){
					cmd.append(shiftCommand);
					editingDomain.getCommandStack().execute(cmd);
				}
			}
		}

	}
	
	
	
	/**
	 * creates command to shift a single specHierarchy 
	 * 
	 * @param specHierarchy
	 * @param editingDomain
	 * @return
	 */
	private Command createShiftCommand(SpecHierarchy specHierarchy, EditingDomain editingDomain){
		EObject eContainer = specHierarchy.eContainer();
		if(!(eContainer instanceof SpecHierarchy))
			return null;
		SpecHierarchy parent = (SpecHierarchy) eContainer;
	
		int indexOf = parent.getChildren().indexOf(specHierarchy);
	
		ShiftLevelCommand cmd = new ShiftLevelCommand("Shifting Up " );
		cmd.setSelection(selection);

		List<SpecHierarchy> followers = parent.getChildren().subList(indexOf+1, parent.getChildren().size());
		for(SpecHierarchy follower: followers) {
			cmd.append(AddCommand.create(editingDomain, specHierarchy, ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN, follower));
		}
		
		EObject grandparent =  parent.eContainer();
		int pIndexOf = 0;
		if(grandparent instanceof SpecHierarchy) {
			pIndexOf= ((SpecHierarchy)grandparent).getChildren().indexOf(parent);
			
			// we have to add an explicit remove command to make the shift undoable
			cmd.append(RemoveCommand.create(editingDomain, parent,
					ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
					specHierarchy)
			);
			cmd.append(AddCommand 
					.create(editingDomain, grandparent,
							ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
							specHierarchy,pIndexOf+1));
		}else if (grandparent instanceof Specification) {
			pIndexOf= ((Specification)grandparent).getChildren().indexOf(parent);
			
			// we have to add an explicit remove command to make the shift undoable
			cmd.append(RemoveCommand.create(editingDomain, parent,
					ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
					specHierarchy)
			);
			
			cmd.append(AddCommand 
					.create(editingDomain, grandparent,
							ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
							specHierarchy,pIndexOf+1));
		}
		
		return cmd;
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = targetEditor;
	}

	
}
