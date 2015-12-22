package org.soyatec.tooling.gef.examples.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.soyatec.tooling.di.View;
import org.soyatec.tooling.gef.commands.CommandFactory;
import org.soyatec.tooling.gef.examples.shapes.Shape;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;

public class ShapeDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		View model = (View) getHost().getModel();
		EObject element = model.getElement();
		if (element instanceof Shape) {
			return CommandFactory.set(element, ShapesPackage.eINSTANCE
					.getShape_Label(), request.getCellEditor().getValue());
		}
		return null;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {

	}

}
