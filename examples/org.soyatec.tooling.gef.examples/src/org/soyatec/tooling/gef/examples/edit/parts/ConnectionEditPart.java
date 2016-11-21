package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.gef.editparts.LineEditPart;
import org.soyatec.tooling.gef.examples.edit.figures.ConnectionFigure;
import org.soyatec.tooling.gef.examples.edit.policies.ConnectionDirectEditPolicy;
import org.soyatec.tooling.gef.examples.shapes.Connection;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public abstract class ConnectionEditPart extends LineEditPart<Connector> {

	public ConnectionEditPart(final Connector model) {
		super(model);
	}

	@Override
	protected IFigure createFigure() {
		return new ConnectionFigure();
	}

	@Override
	protected ILabelFigure getDirectEditLabel() {
		return (ILabelFigure) getFigure();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
	}

	private void refreshLabel() {
		final EObject element = getElement();
		if (element instanceof Connection) {
			String label = ((Connection) element).getLabel();
			if (label == null) {
				label = element.eClass().getName();
			}
			getDirectEditLabel().setText(label);
		}
	}

	@Override
	protected void handleNotifyChanged(final Notification event) {
		super.handleNotifyChanged(event);
		if (ShapesPackage.eINSTANCE.getConnection_Label() == event.getFeature()) {
			refreshLabel();
		}
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new ConnectionDirectEditPolicy());
	}
}
