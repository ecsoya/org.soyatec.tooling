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
package org.soyatec.tooling.gef.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.figures.IGradientFigure;
import org.soyatec.tooling.gef.resources.ResourcesFactory;

public abstract class GradientShapeEditPart<T extends GradientShape> extends
		ShapeEditPart<Shape> {

	public GradientShapeEditPart(final GradientShape model) {
		super(model);
	}

	@SuppressWarnings("unchecked")
	public T getGradientShape() {
		return (T) getModel();
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshGradientStyle();
	}

	protected void refreshGradientStyle() {
		final IFigure figure = getPrimaryFigure();
		final T model = getGradientShape();
		if (figure instanceof IGradientFigure) {
			final IGradientFigure gf = (IGradientFigure) figure;
			gf.setUsingGradient(model.isUsingGradient());
			gf.setGradientOrientation(model.isVerticalGradient() ? SWT.VERTICAL
					: SWT.HORIZONTAL);
			final int gradientColor = model.getGradientColor();
			final Color color = gradientColor == -1 ? getDefaultGradientColor()
					: ResourcesFactory.getColor(gradientColor);
			gf.setGradientColor(color);
		}
	}

	protected Color getDefaultGradientColor() {
		return ResourcesFactory.getColor(ResourcesFactory.COLOR_WHITE);
	}

	protected void handleNotifyChanged(final Notification event) {
		super.handleNotifyChanged(event);
		final Object feature = event.getFeature();
		if (DiPackage.eINSTANCE.getGradientShape_UsingGradient() == feature
				|| DiPackage.eINSTANCE.getGradientShape_GradientColor() == feature
				|| DiPackage.eINSTANCE.getGradientShape_VerticalGradient() == feature) {
			refreshGradientStyle();
		}
	}
}
