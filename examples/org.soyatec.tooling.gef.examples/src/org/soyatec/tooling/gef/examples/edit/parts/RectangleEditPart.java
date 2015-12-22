package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.gef.editparts.GradientShapeEditPart;
import org.soyatec.tooling.gef.examples.edit.figures.GradientRectangleFigure;
import org.soyatec.tooling.gef.examples.edit.policies.ConnectionCreationEditPolicy;
import org.soyatec.tooling.gef.examples.edit.policies.ShapeDirectEditPolicy;
import org.soyatec.tooling.gef.examples.shapes.Shape;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public class RectangleEditPart extends GradientShapeEditPart<GradientShape> {

	public RectangleEditPart(GradientShape model) {
		super(model);
	}

	@Override
	protected IFigure createPrimaryFigure() {
		return new GradientRectangleFigure();
	}

	@Override
	protected ILabelFigure getDirectEditLabel() {
		return (ILabelFigure) getPrimaryFigure();
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new ConnectionCreationEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new ShapeDirectEditPolicy());
	}

	@Override
	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		if (ShapesPackage.eINSTANCE.getShape_Label() == event.getFeature()) {
			refreshLabel();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
	}

	private void refreshLabel() {
		ILabelFigure figure = (ILabelFigure) getPrimaryFigure();
		String label = ((Shape) getElement()).getLabel();
		if (label == null) {
			label = "Rectangle";
		}
		figure.setText(label);
	}

}
