/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * The {@link FilterPanel} initially only offers the selection of Attributes.
 * Upon selecting one, the fitting criteria are offered by instantiating the
 * correct {@link FilterControl}.
 * 
 * @author jastram
 */
public class FilterPanel extends Composite {

	private ReqIF reqif;
	private ComboViewer attributeCombo;

	/**
	 * This constructor creates an empty {@link FilterPanel}.
	 */
	public FilterPanel(final Composite parent, ReqIF reqif) {
		super(parent, SWT.BORDER);
		this.reqif = reqif;
		setLayout(new GridLayout(3, false));

		createCloseButton(parent);
		createAttributeCombo();
	}

	/**
	 * This constructor uses an existing {@link IFilter} to populate the panel.
	 */
	public FilterPanel(Composite parent, ReqIF reqif, IFilter filter) {
		this(parent, reqif);
		
		// see whether the attribute of the filter still exists
		Object[] input = ((Object[])attributeCombo.getInput());
		int attributeIndex = Arrays.asList(input).indexOf(filter.getAttribute());
		if (attributeIndex == -1) return;

		attributeCombo.getCombo().select(attributeIndex);
		FilterControl filterControl = FilterControl.createFilterControl(this, filter);
		filterControl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		layout();
		getParent().pack();
	}

	/**
	 * The close button disposes the {@link FilterPanel} and repacks the parent.
	 * @param parent
	 */
	private void createCloseButton(final Composite parent) {
		Label close = new Label(this, SWT.FLAT);
		close.setText("\u2716");
		close.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				dispose();
				parent.pack();
			}
		});
	}

	/**
	 * Create the combo that contains both internal attributes and the model's
	 * attributes. Upon selection change, the corresponding
	 * {@link FilterControl} is built.
	 */
	private void createAttributeCombo() {
		attributeCombo = new ComboViewer(this, SWT.DROP_DOWN | SWT.BORDER
				| SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		layoutData.widthHint = 180;
		attributeCombo.getControl().setLayoutData(layoutData);
		attributeCombo.setLabelProvider(new AttributeLabelProvider());
		attributeCombo.setContentProvider(new ArrayContentProvider());
		attributeCombo.setInput(createAttributeInput().toArray());

		attributeCombo
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						if (!event.getSelection().isEmpty()) {
							Object selectedAttr = ((IStructuredSelection) event
									.getSelection()).getFirstElement();
							attributeChanged(selectedAttr);
						}
					}
				});
	}

	/**
	 * Create a {@link List} that acts as the input for {@link #attributeCombo}.
	 * The list is first sorted by {@link SpecType} and then sorted by
	 * {@link AttributeDefinition}.
	 */
	private List<?> createAttributeInput() {
		List<? super Object> list = new ArrayList<Object>();

		// Internal Attributes
		list.addAll(Arrays.asList(StringFilter.InternalAttribute.values()));
		list.addAll(Arrays.asList(DateFilter.InternalAttribute.values()));
		
		// All Attributes in the model
		Map<String, AttributeDefinition> attributes = new HashMap<String, AttributeDefinition>();
		for (SpecType specType : reqif.getCoreContent().getSpecTypes()) {
			for (AttributeDefinition ad : specType.getSpecAttributes()) {
				attributes.put(specType.getLongName() + "." + ad.getLongName() + "." + ad.getIdentifier(), ad);
			}
		}

		// Add them in alphabetical order.
		List<String> sortedKeys = new ArrayList<String>(attributes.keySet());
		Collections.sort(sortedKeys);
		for (String key : sortedKeys) {
			list.add(attributes.get(key));			
		}

		return list;
	}

	/**
	 * Reacts to attribute changes by creating the correct {@link FilterControl}
	 * . If there already is a {@link FilterControl}, it is discarded.
	 */
	protected void attributeChanged(Object attribute) {
		if (getFilterControl() != null) getFilterControl().dispose();
		
		FilterControl filterControl;
		if (attribute instanceof AbstractTextFilter.InternalAttribute) {
			filterControl = FilterControl.createFilterControl(this,
					(AbstractTextFilter.InternalAttribute) attribute);
		} else if (attribute instanceof DateFilter.InternalAttribute) {
			filterControl = FilterControl.createFilterControl(this,
					(DateFilter.InternalAttribute) attribute);
		} else if (attribute instanceof AttributeDefinition) {
			filterControl = FilterControl.createFilterControl(this,
					(AttributeDefinition) attribute);
		} else {
			MessageDialog.openError(getShell(), "Invalid Selection",
					"Cannot handle (yet): " + attribute);
			filterControl = null;
		}

		filterControl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));
		layout();
		getParent().pack();
	}

	/**
	 * @return the current FilterControl, or null of not set.
	 */
	private FilterControl getFilterControl() {
		if (getChildren().length != 3) return null;
		Control control = getChildren()[2];
		if (! (control instanceof FilterControl)) return null;
		return (FilterControl) control;
	}

	/**
	 * @return the {@link IFilter} representing the state of the
	 * {@link FilterPanel}, or null if not set or incorrectly configured.
	 */
	public IFilter getFilter() {
		return getFilterControl() == null ? null : getFilterControl().getFilter();
	}

	/**
	 * To handle objects in the Attribute dropdown, instead of just Strings..
	 */
	class AttributeLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof AttributeDefinition) {
				AttributeDefinition ad = (AttributeDefinition)element;
				SpecType specType = (SpecType) ad.eContainer();
				return ad.getLongName() + " (" + specType.getLongName() + ")";
			}
			return element.toString();
		}
	}
}
