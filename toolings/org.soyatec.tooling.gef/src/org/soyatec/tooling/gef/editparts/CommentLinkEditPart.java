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
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;
import org.soyatec.tooling.di.CommentLink;

public class CommentLinkEditPart extends LineEditPart<CommentLink> {

    public CommentLinkEditPart(final CommentLink model) {
        super(model);
    }

    protected IFigure createFigure() {
        final PolylineConnection conn = new PolylineConnection();
        conn.setLineStyle(SWT.LINE_DOT);
        conn.setAntialias(SWT.ON);
        return conn;
    }

}
