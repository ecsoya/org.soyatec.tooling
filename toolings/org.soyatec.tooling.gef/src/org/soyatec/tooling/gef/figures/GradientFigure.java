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
package org.soyatec.tooling.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

public class GradientFigure extends Figure implements IGradientFigure {

    private boolean usingGradient;

    private int orientation;

    private Color gradientColor;

    public GradientFigure() {
        setUsingGradient(true);
        setGradientOrientation(SWT.VERTICAL);
    }

    public boolean isUsingGradient() {
        return usingGradient;
    }

    public void setUsingGradient(final boolean value) {
        final boolean oldValue = this.usingGradient;
        this.usingGradient = value;
        if (oldValue != value) {
            repaint();
        }
    }

    protected void paintFigure(final Graphics graphics) {
        super.paintFigure(graphics);
        paintBackground(graphics, getBounds());
    }

    protected void paintBackground(final Graphics graphics,
            final Rectangle rectangle) {
        if (isUsingGradient()) {
            final boolean isVertical = SWT.VERTICAL == orientation;
            graphics.setBackgroundColor(getBackgroundColor());
            graphics.setForegroundColor(getGradientColor());
            graphics.fillGradient(rectangle, isVertical);
        } else {
            graphics.setBackgroundColor(getBackgroundColor());
            graphics.setForegroundColor(getForegroundColor());
            graphics.fillRectangle(rectangle);
        }
    }

    public int getGradientOrientation() {
        return orientation;
    }

    public void setGradientOrientation(final int orientation) {
        final int oldValue = this.orientation;
        this.orientation = orientation;
        if (oldValue != orientation) {
            repaint();
        }
    }

    public Color getGradientColor() {
        if (gradientColor == null) {
            gradientColor = ColorConstants.white;
        }
        return gradientColor;
    }

    public void setGradientColor(final Color color) {
        final Color oldValue = this.gradientColor;
        this.gradientColor = color;
        if (oldValue != null && !oldValue.equals(color)) {
            repaint();
        }
    }

}
