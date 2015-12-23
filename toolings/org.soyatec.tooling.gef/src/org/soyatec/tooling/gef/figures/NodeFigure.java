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

import java.util.Hashtable;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.soyatec.tooling.gef.anchor.BaseConnectionAnchor;

public class NodeFigure extends Figure {

    public static final String DEFAULT_TERMINAL = ""; //$NON-NLS-1$

    private final Hashtable<String, ConnectionAnchor> connectionAnchors = new Hashtable<String, ConnectionAnchor>(
            7);

    private final IFigure primaryFigure;

    public NodeFigure(final IFigure primaryFigure) {
        Assert.isNotNull(primaryFigure);
        this.primaryFigure = primaryFigure;
        setLayoutManager(new StackLayout());
        add(primaryFigure);
    }

    public ConnectionAnchor getSourceConnectionAnchor(final Point location) {
        return getConnectionAnchor(location);
    }

    public ConnectionAnchor getTargetConnectionAnchor(final Point location) {
        return getConnectionAnchor(location);
    }

    public ConnectionAnchor getConnectionAnchor(String terminal) {
        if (terminal == null) {
            terminal = DEFAULT_TERMINAL;
        }
        ConnectionAnchor connectionAnchor = connectionAnchors.get(terminal);
        if (connectionAnchor != null) {
            return connectionAnchor;
        }
        connectionAnchor = createAnchor(terminal);
        if (connectionAnchor != null) {
            connectionAnchors.put(terminal, connectionAnchor);
        }
        return connectionAnchor;
    }

    public IFigure getPrimaryFigure() {
        return primaryFigure;
    }

    private ConnectionAnchor getConnectionAnchor(final Point location) {
        final String terminal = locationToTerminal(location);
        return getConnectionAnchor(terminal);
    }

    protected ConnectionAnchor createAnchor(final String terminal) {
        ConnectionAnchor anchor = null;
        if (primaryFigure instanceof IAnchorFigure) {
            anchor = ((IAnchorFigure) primaryFigure).createAnchor(terminal);
        }
        if (anchor == null) {
            anchor = new BaseConnectionAnchor(primaryFigure, terminal);
        }
        return anchor;
    }

    protected String locationToTerminal(final Point location) {
        if (primaryFigure instanceof IAnchorFigure) {
            final String terminal = ((IAnchorFigure) primaryFigure)
                    .getTerminal(location);
            if (terminal != null) {
                return terminal;
            }
        }
        final Point p = getLocation(location.getCopy());
        primaryFigure.translateToRelative(p);
        final Rectangle r = primaryFigure.getBounds();
        final PrecisionPoint pp = new PrecisionPoint();
        pp.setPreciseX((p.x - r.x) * 1d / r.width);
        pp.setPreciseY((p.y - r.y) * 1d / r.height);
        return BaseConnectionAnchor.composeTerminalString(pp);
    }

    private Point getLocation(final Point reference) {
        final Rectangle r = Rectangle.SINGLETON;
        r.setBounds(primaryFigure.getBounds());
        r.translate(-1, -1);
        r.resize(1, 1);

        primaryFigure.translateToAbsolute(r);
        float centerX = r.x + 0.5f * r.width;
        float centerY = r.y + 0.5f * r.height;

        if (r.isEmpty()
                || (reference.x == (int) centerX && reference.y == (int) centerY)) {
            return new Point((int) centerX, (int) centerY); // This avoids
                                                            // divide-by-zero
        }

        float dx = reference.x - centerX;
        float dy = reference.y - centerY;

        // r.width, r.height, dx, and dy are guaranteed to be non-zero.
        final float scale = 0.5f / Math.max(Math.abs(dx) / r.width,
                Math.abs(dy) / r.height);

        dx *= scale;
        dy *= scale;
        centerX += dx;
        centerY += dy;

        return new Point(Math.round(centerX), Math.round(centerY));
    }

    public boolean containsPoint(final int x, final int y) {
        return primaryFigure.containsPoint(x, y);
    }
}
