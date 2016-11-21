package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.examples.shapes.DashedLine;
import org.soyatec.tooling.gef.examples.shapes.Ellipse;
import org.soyatec.tooling.gef.examples.shapes.Rectangle;
import org.soyatec.tooling.gef.examples.shapes.SolidLine;

public class ShapesEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(final EditPart context, final Object model) {
		if (model instanceof Diagram) {
			return new GraphDiagramEditPart((Diagram) model);
		} else if (model instanceof GradientShape) {
			final EObject element = ((GradientShape) model).getElement();
			if (element instanceof Rectangle) {
				return new RectangleEditPart((GradientShape) model);
			}
		} else if (model instanceof Shape) {
			final EObject element = ((Shape) model).getElement();
			if (element instanceof Ellipse) {
				return new EllipseEditPart((Shape) model);
			}
		} else if (model instanceof Connector) {
			final EObject element = ((Connector) model).getElement();
			if (element instanceof SolidLine) {
				return new SolidLineEditPart((Connector) model);
			} else if (element instanceof DashedLine) {
				return new DashedLineEditPart((Connector) model);
			}
		}
		return null;
	}

}
