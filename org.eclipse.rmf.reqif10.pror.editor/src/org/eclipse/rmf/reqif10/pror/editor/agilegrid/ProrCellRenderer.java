/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import org.agilemore.agilegrid.AgileGrid;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationServiceManager;
import org.eclipse.rmf.reqif10.pror.provider.Reqif10EditPlugin;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

public class ProrCellRenderer extends AbstractProrSpecCellRenderer {

	private final Image specHierarchyIcon;
	private final Image specObjectIcon;
	private final Image specRelationIcon;
	
	/**
	 * Create a ProRCellRenderer. Note that the associated ContentProvider must
	 * be a {@link ProrAgileGridContentProvider}.
	 * @param adapterFactory 
	 * 
	 * @throws ClassCastException
	 *             If the contentProvider associated with the agileGrid is not a
	 *             {@link ProrAgileGridContentProvider}.
	 */
	public ProrCellRenderer(AgileGrid agileGrid, AdapterFactory adapterFactory,
			EditingDomain editingDomain) {
		super(agileGrid, adapterFactory);
		// FIXME: Remove these static dependencies
		specObjectIcon = ExtendedImageRegistry.getInstance().getImage(
				Reqif10EditPlugin.INSTANCE
						.getImage("full/obj16/SpecObject.png"));
		specHierarchyIcon = ExtendedImageRegistry.getInstance().getImage(
				Reqif10EditPlugin.INSTANCE
						.getImage("full/obj16/SpecHierarchy.png"));
		specRelationIcon = ExtendedImageRegistry.getInstance().getImage(
				Reqif10EditPlugin.INSTANCE
						.getImage("full/obj16/SpecRelation.png"));
	}
	
	@Override
	protected void doDrawCellContent(GC gc, Rectangle rect, int row, int col) {

		ProrAgileGridContentProvider contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();

		ProrRow prorRow = contentProvider.getProrRow(row);
		if (! prorRow.isVisible()) {
			updateCellHeight(row, col, 1);
			return;
		}

		// Only do indenting and icon drawing for Column 0
		if (col == 0) {
			rect = doIndenting(gc, rect, row);
		}

		int rowHeight = getHeightAndDrawCell(gc, rect, row, col);

		// Prevent Scrolling becoming impossible by truncating large cells vertically.
		int tableSize = agileGrid.getSize().y;
		if (rowHeight > (tableSize * .5)) {
			rowHeight = (int) (tableSize * .5);
			Color oldForeground = gc.getForeground();
			Color oldBackground = gc.getBackground();
			
			gc.setBackground(COLOR_BACKGROUND);
			gc.setForeground(COLOR_LINE_LIGHTGRAY);
			gc.fillRectangle(rect.x, rect.y + rowHeight + 4 - 20, rect.width, 20);
			gc.setForeground(COLOR_RED);
			gc.drawLine(rect.x, rect.y + rowHeight + 4 - 20, rect.x + rect.width, rect.y + rowHeight + 4 - 20);
			gc.drawText("Truncated", rect.x + 5, rect.y + rowHeight - 15);
			gc.setForeground(oldForeground);
			gc.setBackground(oldBackground);
		}
		updateCellHeight(row, col, rowHeight);
	}

	/**
	 * Does the actual drawing, without truncating.
	 */
	public int getHeightAndDrawCell(GC gc, Rectangle rect, int row, int col) {
		ProrAgileGridContentProvider contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();
		ProrRow prorRow = contentProvider.getProrRow(row);
		Object content = contentProvider.getContentAt(row, col);

		int rowHeight;
		IProrCellRenderer renderer = null;
		AttributeValue attrValue = contentProvider.getValueForColumn(
				prorRow.getSpecElement(), row, col);

		// Consult the presentation
		ProrPresentationConfiguration config = ConfigurationUtil
				.getPresentationConfiguration(attrValue);
		if (config != null) {
			ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory,
					config);
			if (ip instanceof PresentationEditorInterface) {
				renderer = ((PresentationEditorInterface) ip)
						.getCellRenderer(attrValue);
			}
		}

		// See whether there is a default renderer
		if (renderer == null) {
			renderer = PresentationServiceManager.getDefaultCellRenderer(
					attrValue, adapterFactory);
		}

		if (renderer != null) {
			rowHeight = renderer.doDrawCellContent(gc, rect, content);
		} else {
			rowHeight = doDrawCellContentDefault(gc, rect, content);
		}
		return rowHeight;
	}

	/**
	 * Computes the hierarchy depth and modifies rect to reflect the
	 * corresponding indenting. It also draws the Icon
	 */
	public Rectangle doIndenting(GC gc, Rectangle rect, int row) {

		ProrAgileGridContentProvider contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();

		ProrRow prorRow = contentProvider.getProrRow(row);

		int offset = prorRow.getLevel() * 8;
		Image icon;
		if (prorRow.getSpecElement() instanceof SpecObject) {
			icon = specObjectIcon;
		} else if (prorRow.getSpecElement() instanceof SpecRelation) {
			icon = specRelationIcon;
		} else {
			icon = specHierarchyIcon;
		}

		gc.drawImage(icon, rect.x + offset + 1, rect.y + (rect.height - 16) / 2);
		rect = new Rectangle(rect.x + offset + 18, rect.y, rect.width - offset
				- 18, rect.height);
		return rect;

	}

	private void updateCellHeight(int row, int col, int height) {
		if (agileGrid.getLayoutAdvisor() instanceof ProrLayoutAdvisor) {
			((ProrLayoutAdvisor) agileGrid.getLayoutAdvisor()).setCellHeight(
					row, col, height + 2);
		}
	}
	
}
