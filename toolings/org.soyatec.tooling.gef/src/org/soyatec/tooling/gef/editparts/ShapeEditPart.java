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

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.swt.graphics.Color;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Node;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.editpolicies.ShapeComponentEditPolicy;
import org.soyatec.tooling.gef.figures.NodeFigure;
import org.soyatec.tooling.gef.resources.ResourcesFactory;

public abstract class ShapeEditPart<T extends Shape> extends
		org.soyatec.tooling.gef.editparts.NodeEditPart<Node> implements
		NodeEditPart {

	private IFigure primaryFigure;

	public ShapeEditPart(Shape model) {
		super(model);
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
		refreshBackground();
		refreshForeground();
	}

	@SuppressWarnings("unchecked")
	public T getShapeModel() {
		return (T) getModel();
	}

	public void refreshForeground() {
		int foreground = getShapeModel().getForeground();
		Color color = foreground == -1 ? getDefaultForeground()
				: ResourcesFactory.getColor(foreground);
		setForegroundColor(color);
	}

	protected Color getDefaultForeground() {
		return ColorConstants.black;
	}

	public void refreshBackground() {
		int background = getShapeModel().getBackground();
		Color color = background == -1 ? getDefaultBackgroundColor()
				: ResourcesFactory.getColor(background);
		setBackgroundColor(color);
	}

	protected Color getDefaultBackgroundColor() {
		return ResourcesFactory.getColor(ResourcesFactory.COLOR_SHAPE);
	}

	protected void setForegroundColor(Color color) {
		getPrimaryFigure().setForegroundColor(color);
	}

	protected void setBackgroundColor(Color color) {
		getPrimaryFigure().setBackgroundColor(color);
	}

	protected void refreshBounds() {
		Rectangle rect = getShapeModel().getBounds();
		if (rect != null) {
			setLayoutConstraint(this, getFigure(), rect);
		}
	}

	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		Object feature = event.getFeature();
		if (DiPackage.eINSTANCE.getShape_Bounds() == feature) {
			refreshBounds();
		} else if (DiPackage.eINSTANCE.getShape_Background() == feature) {
			refreshBackground();
		} else if (DiPackage.eINSTANCE.getShape_Foreground() == feature) {
			refreshForeground();
		}
	}

	final protected IFigure createFigure() {
		IFigure primaryFigure = getPrimaryFigure();
		return createNodeFigure(primaryFigure);
	}

	protected NodeFigure createNodeFigure(IFigure primaryFigure) {
		return new NodeFigure(primaryFigure);
	}

	public IFigure getPrimaryFigure() {
		if (primaryFigure == null) {
			primaryFigure = createPrimaryFigure();
		}
		return primaryFigure;
	}

	protected abstract IFigure createPrimaryFigure();

	public NodeFigure getFigure() {
		return (NodeFigure) super.getFigure();
	}

	public IFigure getContentPane() {
		return getFigure().getPrimaryFigure();
	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		String terminal = NodeFigure.DEFAULT_TERMINAL;
		Object model = connection.getModel();
		if (model instanceof Line) {
			terminal = ((Line) model).getSourceAnchor();
		}
		return getFigure().getConnectionAnchor(terminal);
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		String terminal = NodeFigure.DEFAULT_TERMINAL;
		Object model = connection.getModel();
		if (model instanceof Line) {
			terminal = ((Line) model).getTargetAnchor();
		}
		return getFigure().getConnectionAnchor(terminal);
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		Point location = null;
		if (request instanceof DropRequest) {
			location = ((DropRequest) request).getLocation();
		}
		return getFigure().getSourceConnectionAnchor(location);
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		Point location = null;
		if (request instanceof DropRequest) {
			location = ((DropRequest) request).getLocation();
		}
		return getFigure().getTargetConnectionAnchor(location);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new ShapeComponentEditPolicy());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void reorderSourceConnection(ConnectionEditPart connection,
			int index) {
		primRemoveSourceConnection(connection);
		if (sourceConnections == null) {
			sourceConnections = new ArrayList();
		}
		sourceConnections.add(connection);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void reorderTargetConnection(ConnectionEditPart connection,
			int index) {
		primRemoveTargetConnection(connection);
		if (targetConnections == null) {
			targetConnections = new ArrayList();
		}
		targetConnections.add(connection);
		// super.reorderTargetConnection(connection, index);
	}
}
