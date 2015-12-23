package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.editparts.ShapeEditPart;
import org.soyatec.tooling.gef.examples.edit.figures.EllipseFigure;
import org.soyatec.tooling.gef.examples.edit.policies.ConnectionCreationEditPolicy;
import org.soyatec.tooling.gef.examples.edit.policies.ShapeDirectEditPolicy;
import org.soyatec.tooling.gef.examples.shapes.Ellipse;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public class EllipseEditPart extends ShapeEditPart<Shape> {

    public EllipseEditPart(Shape model) {
        super(model);
    }

    @Override
    protected IFigure createPrimaryFigure() {
        return new EllipseFigure();
    }

    @Override
    protected void refreshVisuals() {
        super.refreshVisuals();
        refreshLabel();
    }

    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
                new ConnectionCreationEditPolicy());
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
                new ShapeDirectEditPolicy());
    }

    protected void handleNotifyChanged(Notification event) {
        super.handleNotifyChanged(event);
        if (ShapesPackage.eINSTANCE.getShape_Label() == event.getFeature()) {
            refreshLabel();
        }
    }

    private void refreshLabel() {
        ILabelFigure figure = (ILabelFigure) getPrimaryFigure();
        String label = ((Ellipse) getElement()).getLabel();
        if (label == null) {
            label = "Ellipse";
        }
        figure.setText(label);
    }

    @Override
    protected ILabelFigure getDirectEditLabel() {
        return (ILabelFigure) getPrimaryFigure();
    }
}
