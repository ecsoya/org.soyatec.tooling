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
package org.soyatec.tooling.gef.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.AccessibleAnchorProvider;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.tools.SelectEditPartTracker;
import org.eclipse.swt.graphics.Color;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.gef.editpolicies.LineEditPolicy;
import org.soyatec.tooling.gef.resources.Resources;

public abstract class LineEditPart<T extends Line> extends
		UIObjectEditPart<Line> implements ConnectionEditPart, LayerConstants {
	private static final ConnectionAnchor DEFAULT_SOURCE_ANCHOR = new XYAnchor(
			new Point(10, 10));
	private static final ConnectionAnchor DEFAULT_TARGET_ANCHOR = new XYAnchor(
			new Point(100, 100));
	private EditPart sourceEditPart, targetEditPart;

	public LineEditPart(Line model) {
		super(model);
	}

	protected void activateFigure() {
		getLayer(CONNECTION_LAYER).add(getFigure());
	}

	public void addNotify() {
		activateFigure();
		super.addNotify();
	}

	protected IFigure createFigure() {
		return new PolylineConnection();
	}

	protected void deactivateFigure() {
		getLayer(CONNECTION_LAYER).remove(getFigure());
		getConnectionFigure().setSourceAnchor(null);
		getConnectionFigure().setTargetAnchor(null);
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == AccessibleAnchorProvider.class)
			return new DefaultAccessibleAnchorProvider();
		return super.getAdapter(adapter);
	}

	public Connection getConnectionFigure() {
		return (Connection) getFigure();
	}

	public DragTracker getDragTracker(Request req) {
		return new SelectEditPartTracker(this);
	}

	public EditPart getSource() {
		return sourceEditPart;
	}

	public EditPart getTarget() {
		return targetEditPart;
	}

	protected ConnectionAnchor getSourceConnectionAnchor() {
		if (getSource() != null) {
			if (getSource() instanceof NodeEditPart) {
				NodeEditPart editPart = (NodeEditPart) getSource();
				return editPart.getSourceConnectionAnchor(this);
			}
			IFigure f = ((GraphicalEditPart) getSource()).getFigure();
			return new ChopboxAnchor(f);
		}
		return DEFAULT_SOURCE_ANCHOR;
	}

	protected ConnectionAnchor getTargetConnectionAnchor() {
		if (getTarget() != null) {
			if (getTarget() instanceof NodeEditPart) {
				NodeEditPart editPart = (NodeEditPart) getTarget();
				return editPart.getTargetConnectionAnchor(this);
			}
			IFigure f = ((GraphicalEditPart) getTarget()).getFigure();
			return new ChopboxAnchor(f);
		}
		return DEFAULT_TARGET_ANCHOR;
	}

	public void refresh() {
		refreshSourceAnchor();
		refreshTargetAnchor();
		super.refresh();
	}

	protected void refreshSourceAnchor() {
		getConnectionFigure().setSourceAnchor(getSourceConnectionAnchor());
	}

	protected void refreshTargetAnchor() {
		getConnectionFigure().setTargetAnchor(getTargetConnectionAnchor());
	}

	public void removeNotify() {
		deactivateFigure();
		super.removeNotify();
	}

	public void setParent(EditPart parent) {
		boolean wasNull = getParent() == null;
		boolean becomingNull = parent == null;
		if (becomingNull && !wasNull)
			removeNotify();
		super.setParent(parent);
		if (wasNull && !becomingNull)
			addNotify();
	}

	public void setSource(EditPart editPart) {
		if (sourceEditPart == editPart)
			return;
		sourceEditPart = editPart;
		if (sourceEditPart != null)
			setParent(sourceEditPart.getRoot());
		else if (getTarget() == null)
			setParent(null);
		if (sourceEditPart != null && targetEditPart != null)
			refresh();
	}

	public void setTarget(EditPart editPart) {
		if (targetEditPart == editPart)
			return;
		targetEditPart = editPart;
		if (editPart != null)
			setParent(editPart.getRoot());
		else if (getSource() == null)
			setParent(null);
		if (sourceEditPart != null && targetEditPart != null)
			refresh();
	}

	public Line getUIObject() {
		return super.getUIObject();
	}

	@SuppressWarnings("unchecked")
	public T getLineModel() {
		return (T) getModel();
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLineColor();
		refreshLineWidth();
	}

	private void refreshLineWidth() {
		int width = getUIObject().getWidth();
		if (width == -1) {
			width = getDefaultLineWidth();
		}
		setLineWidth(width);
	}

	protected int getDefaultLineWidth() {
		return 1;
	}

	protected void setLineWidth(int width) {
		Connection conn = getConnectionFigure();
		if (conn instanceof Polyline) {
			((Polyline) conn).setLineWidth(width);
		}
	}

	private void refreshLineColor() {
		int value = getUIObject().getColor();
		Color color = value == -1 ? getDefaultLineColor() : Resources
				.getColor(value);
		setLineColor(color);
	}

	protected Color getDefaultLineColor() {
		return ColorConstants.black;
	}

	protected void setLineColor(Color color) {
		getConnectionFigure().setForegroundColor(color);
	}

	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		Object feature = event.getFeature();
		if (DiPackage.eINSTANCE.getLine_Color() == feature) {
			refreshLineColor();
		} else if (DiPackage.eINSTANCE.getLine_Width() == feature) {
			refreshLineWidth();
		} else if (DiPackage.eINSTANCE.getLine_SourceAnchor() == feature) {
			refreshSourceAnchor();
		} else if (DiPackage.eINSTANCE.getLine_TargetAnchor() == feature) {
			refreshTargetAnchor();
		}
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new LineEditPolicy());
	}

	protected final class DefaultAccessibleAnchorProvider implements
			AccessibleAnchorProvider {
		/**
		 * This class is internal, but is made protected so that JavaDoc will
		 * see it.
		 */
		DefaultAccessibleAnchorProvider() {
		}

		/**
		 * @see AccessibleAnchorProvider#getSourceAnchorLocations()
		 */
		public List<Point> getSourceAnchorLocations() {
			List<Point> list = new ArrayList<Point>();
			if (getFigure() instanceof Connection) {
				Point p = ((Connection) getFigure()).getPoints().getMidpoint();
				getFigure().translateToAbsolute(p);
				list.add(p);
			}
			return list;
		}

		/**
		 * @see AccessibleAnchorProvider#getTargetAnchorLocations()
		 */
		public List<Point> getTargetAnchorLocations() {
			return getSourceAnchorLocations();
		}
	}
}
