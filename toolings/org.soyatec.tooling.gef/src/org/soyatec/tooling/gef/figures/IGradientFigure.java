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

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

public interface IGradientFigure extends IFigure {

    boolean isUsingGradient();

    void setUsingGradient(boolean value);

    /**
     * SWT.VERTICAL or SWT.HORIZONTAL
     */
    int getGradientOrientation();

    void setGradientOrientation(int orientation);

    Color getGradientColor();

    void setGradientColor(Color color);
}
