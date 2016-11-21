/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.gef.toolbar.editor;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Ecsoya (jin.liu@soyatec.com)
 */
public abstract class GraphicalEditorWithToolBarPalette extends GraphicalEditor {

	private ViewForm partControl;

	public GraphicalEditorWithToolBarPalette() {
		setEditDomain(new ToolBarEditDomain(this));
	}

	protected ToolBarEditDomain getEditDomain() {
		return (ToolBarEditDomain) super.getEditDomain();
	}

	final public void createPartControl(final Composite parent) {
		partControl = new ViewForm(parent, SWT.NONE);

		final ToolBarPalette palette = new ToolBarPalette(partControl, SWT.NONE);
		palette.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		configurePalette(palette);

		partControl.setTopLeft(palette);
		final RulerComposite content = new RulerComposite(partControl, SWT.NONE);
		super.createPartControl(content);
		content.setGraphicalViewer((ScrollingGraphicalViewer) getGraphicalViewer());
		partControl.setContent(content);
	}

	public void setFocus() {
		if (partControl != null && !partControl.isDisposed()) {
			partControl.setFocus();
		}
	}

	private void configurePalette(final ToolBarPalette palette) {
		final ToolBarEditDomain editDomain = getEditDomain();
		final PaletteRoot paletteRoot = createPaletteRoot();

		editDomain.setPaletteRoot(paletteRoot);
		editDomain.setPalette(palette);
		palette.init(editDomain, paletteRoot);
	}

	protected abstract PaletteRoot createPaletteRoot();
}
