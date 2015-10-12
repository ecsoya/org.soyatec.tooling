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
package org.soyatec.tooling.gef.direct_edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;
import org.soyatec.tooling.gef.figures.ILabelFigure;

/**
 * Located the <code>TextCellEditor</code> on <code>ILabelFigure</code>.
 * 
 * @see TextDirectEditManager
 * @author Ecsoya
 */
public class TextCellEditorLocator implements CellEditorLocator {

	private ILabelFigure labelFigure;

	public TextCellEditorLocator(ILabelFigure labelFigure) {
		this.labelFigure = labelFigure;
	}

	public void relocate(CellEditor celleditor) {
		Text text = (Text) celleditor.getControl();
		Point pref = text.computeSize(-1, -1);
		IFigure label = labelFigure.getLabelFigure();
		Rectangle rect = null;
		if (label instanceof Label) {
			rect = ((Label) label).getTextBounds().getCopy();
		} else {
			rect = label.getBounds().getCopy();
		}
		label.translateToAbsolute(rect);
		text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1);
	}

	public ILabelFigure getLabelFigure() {
		return labelFigure;
	}

}
