/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
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

	public static final String DEFAULT_TERMINAL = "";

	private Hashtable<String, ConnectionAnchor> connectionAnchors = new Hashtable<String, ConnectionAnchor>(
			7);

	private IFigure primaryFigure;

	public NodeFigure(IFigure primaryFigure) {
		Assert.isNotNull(primaryFigure);
		this.primaryFigure = primaryFigure;
		setLayoutManager(new StackLayout());
		add(primaryFigure);
	}

	public ConnectionAnchor getSourceConnectionAnchor(Point location) {
		return getConnectionAnchor(location);
	}

	public ConnectionAnchor getTargetConnectionAnchor(Point location) {
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

	private ConnectionAnchor getConnectionAnchor(Point location) {
		String terminal = locationToTerminal(location);
		return getConnectionAnchor(terminal);
	}

	protected ConnectionAnchor createAnchor(String terminal) {
		ConnectionAnchor anchor = null;
		if (primaryFigure instanceof IAnchorFigure) {
			anchor = ((IAnchorFigure) primaryFigure).createAnchor(terminal);
		}
		if (anchor == null) {
			anchor = new BaseConnectionAnchor(primaryFigure, terminal);
		}
		return anchor;
	}

	protected String locationToTerminal(Point location) {
		if (primaryFigure instanceof IAnchorFigure) {
			String terminal = ((IAnchorFigure) primaryFigure)
					.getTerminal(location);
			if (terminal != null) {
				return terminal;
			}
		}
		Point p = getLocation(location.getCopy());
		primaryFigure.translateToRelative(p);
		Rectangle r = primaryFigure.getBounds();
		PrecisionPoint pp = new PrecisionPoint();
		pp.setPreciseX((p.x - r.x) * 1d / r.width);
		pp.setPreciseY((p.y - r.y) * 1d / r.height);
		return BaseConnectionAnchor.composeTerminalString(pp);
	}

	private Point getLocation(Point reference) {
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(primaryFigure.getBounds());
		r.translate(-1, -1);
		r.resize(1, 1);

		primaryFigure.translateToAbsolute(r);
		float centerX = r.x + 0.5f * r.width;
		float centerY = r.y + 0.5f * r.height;

		if (r.isEmpty()
				|| (reference.x == (int) centerX && reference.y == (int) centerY))
			return new Point((int) centerX, (int) centerY); // This avoids
															// divide-by-zero

		float dx = reference.x - centerX;
		float dy = reference.y - centerY;

		// r.width, r.height, dx, and dy are guaranteed to be non-zero.
		float scale = 0.5f / Math.max(Math.abs(dx) / r.width, Math.abs(dy)
				/ r.height);

		dx *= scale;
		dy *= scale;
		centerX += dx;
		centerY += dy;

		return new Point(Math.round(centerX), Math.round(centerY));
	}

	public boolean containsPoint(int x, int y) {
		return primaryFigure.containsPoint(x, y);
	}
}
