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
package org.soyatec.tooling.gef.anchor;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;

/**
 * Connection anchor based on a terminal value.
 * 
 * @author Ecsoya
 */
public class BaseConnectionAnchor extends AbstractConnectionAnchor {
	final private static char TERMINAL_START_CHAR = '(';
	final private static char TERMINAL_DELIMITER_CHAR = ',';
	final private static char TERMINAL_END_CHAR = ')';

	private String terminal;

	public BaseConnectionAnchor(IFigure owner, String terminal) {
		super(owner);
		this.terminal = terminal;
	}

	public String getTerminal() {
		return terminal;
	}

	public Point getLocation(Point reference) {
		Point location = getTerminalRefLocation();
		if (location == null) {
			IFigure owner = getOwner();
			Rectangle r = getBox(owner);
			r.translate(-1, -1);
			r.resize(1, 1);

			float centerX = r.x + 0.5f * r.width;
			float centerY = r.y + 0.5f * r.height;

			if (r.isEmpty()
					|| (reference.x == (int) centerX && reference.y == (int) centerY)) {
				location = new Point((int) centerX, (int) centerY); // This
																	// avoids
				// divide-by-zero
			} else {
				float dx = reference.x - centerX;
				float dy = reference.y - centerY;

				// r.width, r.height, dx, and dy are guaranteed to be non-zero.
				float scale = 0.5f / Math.max(Math.abs(dx) / r.width,
						Math.abs(dy) / r.height);

				dx *= scale;
				dy *= scale;
				centerX += dx;
				centerY += dy;

				location = new Point(Math.round(centerX), Math.round(centerY));
			}
		}
		getOwner().translateToAbsolute(location);
		return location;
	}

	protected Point getTerminalRefLocation() {
		IFigure owner = getOwner();
		if (owner == null) {
			return null;
		}
		PrecisionPoint terminalRef = getTerminalRef();
		if (terminalRef != null) {
			Rectangle rect = getBox(owner);

			return getTerminalRefLocation(terminalRef, rect);
		}
		return null;
	}

	protected Point getTerminalRefLocation(PrecisionPoint terminalRef,
			Rectangle rect) {
		Point location = new Point();
		location.x = (int) (rect.x + rect.width * terminalRef.preciseX());
		location.y = (int) (rect.y + rect.height * terminalRef.preciseY());
		return location;
	}

	protected Rectangle getBox(IFigure owner) {
		Rectangle rect = owner.getBounds().getCopy();
		if (owner instanceof HandleBounds) {
			rect = ((HandleBounds) owner).getHandleBounds().getCopy();
		}
		return rect;
	}

	public Point getReferencePoint() {
		IFigure owner = getOwner();
		if (owner == null) {
			return null;
		} else {
			Rectangle rect = getBox(owner);
			Point refPt = rect.getCenter();
			PrecisionPoint terminalRef = getTerminalRef();
			if (terminalRef != null) {
				refPt = getTerminalRefLocation();
			}
			owner.translateToAbsolute(refPt);
			return refPt;
		}
	}

	protected PrecisionPoint getTerminalRef() {
		if (terminal != null) {
			return parseTerminal(terminal);
		}
		return null;
	}

	public static PrecisionPoint parseTerminal(String terminal) {
		try {
			return new PrecisionPoint(Double.parseDouble(terminal.substring(
					terminal.indexOf(TERMINAL_START_CHAR) + 1,
					terminal.indexOf(TERMINAL_DELIMITER_CHAR))),
					Double.parseDouble(terminal.substring(
							terminal.indexOf(TERMINAL_DELIMITER_CHAR) + 1,
							terminal.indexOf(TERMINAL_END_CHAR))));
		} catch (Exception e) {
			return null;
		}
	}

	public static String composeTerminalString(PrecisionPoint p) {
		StringBuffer s = new StringBuffer(24);
		s.append(TERMINAL_START_CHAR); // 1 char
		s.append(p.preciseX()); // 10 chars
		s.append(TERMINAL_DELIMITER_CHAR); // 1 char
		s.append(p.preciseY()); // 10 chars
		s.append(TERMINAL_END_CHAR); // 1 char
		return s.toString(); // 24 chars max (+1 for safety, i.e. for string
								// termination)
	}
}
