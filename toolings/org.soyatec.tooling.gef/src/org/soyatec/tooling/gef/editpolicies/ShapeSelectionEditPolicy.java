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
package org.soyatec.tooling.gef.editpolicies;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;
import org.soyatec.tooling.gef.editparts.ShapeEditPart;
import org.soyatec.tooling.gef.figures.IShapeStyle;

public class ShapeSelectionEditPolicy extends SelectionEditPolicy {

	public static final String ROLE = ShapeSelectionEditPolicy.class.getName();

	protected ShapeEditPart<?> getShapeEditPart() {
		final EditPart host = getHost();
		if (host instanceof ShapeEditPart<?>) {
			return (ShapeEditPart<?>) host;
		}
		return null;
	}

	protected void hideSelection() {
		final ShapeEditPart<?> shapeEditPart = getShapeEditPart();
		if (shapeEditPart == null) {
			return;
		}

		final IFigure primaryFigure = shapeEditPart.getPrimaryFigure();
		if (primaryFigure instanceof IShapeStyle) {
			((IShapeStyle) primaryFigure).setLineWidth(1);
		}
		shapeEditPart.refreshForeground();
	}

	protected void showSelection() {
		final ShapeEditPart<?> shapeEditPart = getShapeEditPart();
		if (shapeEditPart == null) {
			return;
		}

		final IFigure primaryFigure = shapeEditPart.getPrimaryFigure();
		if (primaryFigure instanceof IShapeStyle) {
			((IShapeStyle) primaryFigure).setLineWidth(2);
		}
		primaryFigure.setForegroundColor(ColorConstants.blue);
	}

}
