package org.soyatec.tooling.gef.examples.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.CreateRequest;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.View;
import org.soyatec.tooling.gef.commands.CommandFactory;
import org.soyatec.tooling.gef.editpolicies.DiagramXYLayoutEditPolicy;
import org.soyatec.tooling.gef.examples.shapes.Graph;
import org.soyatec.tooling.gef.examples.shapes.Shape;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;

public class GraphLayoutEditPolicy extends DiagramXYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(final CreateRequest request) {
		final Command command = super.getCreateCommand(request);
		if (command == null || !command.canExecute()) {
			return UnexecutableCommand.INSTANCE;
		}
		final Object newObject = request.getNewObject();
		final Diagram diagram = (Diagram) getHost().getModel();
		final EObject eObject = diagram.getElement();
		if (!(eObject instanceof Graph)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Graph graph = (Graph) eObject;
		if (newObject instanceof View) {
			final EObject element = ((View) newObject).getElement();
			if (element instanceof Shape) {
				return command.chain(CommandFactory.add(graph,
						ShapesPackage.eINSTANCE.getGraph_Shapes(), element));
			}
		}
		return command;
	}
}
