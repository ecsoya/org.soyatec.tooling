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

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.ui.IEditorPart;

/**
 * @author Ecsoya (jin.liu@soyatec.com)
 */
public class ToolBarEditDomain extends DefaultEditDomain {

	private ToolBarPalette palette;

	public ToolBarEditDomain(IEditorPart editorPart) {
		super(editorPart);
	}

	public void loadDefaultTool() {
		super.loadDefaultTool();
		if (palette != null) {
			palette.loadDefaultTool();
		}
	}

	public void setPalette(ToolBarPalette palette) {
		this.palette = palette;
	}
}
