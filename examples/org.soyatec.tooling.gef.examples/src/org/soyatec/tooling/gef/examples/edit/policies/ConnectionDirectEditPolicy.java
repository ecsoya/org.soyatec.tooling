package org.soyatec.tooling.gef.examples.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.gef.commands.CommandFactory;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;

public class ConnectionDirectEditPolicy extends DirectEditPolicy {

    @Override
    protected Command getDirectEditCommand(DirectEditRequest request) {
        Object model = getHost().getModel();
        if (model instanceof Connector) {
            EObject element = ((Connector) model).getElement();
            return CommandFactory.set(element, ShapesPackage.eINSTANCE
                    .getConnection_Label(), request.getCellEditor().getValue());
        }
        return null;
    }

    @Override
    protected void showCurrentEditValue(DirectEditRequest request) {

    }

}
