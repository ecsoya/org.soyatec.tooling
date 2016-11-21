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
	protected Command getDirectEditCommand(final DirectEditRequest request) {
		final View model = (View) getHost().getModel();
		final EObject element = model.getElement();
		if (element instanceof Shape) {
			return CommandFactory.set(element, ShapesPackage.eINSTANCE
					.getShape_Label(), request.getCellEditor().getValue());
		}
		return null;
	}

	@Override
	protected void showCurrentEditValue(final DirectEditRequest request) {

	}

}
