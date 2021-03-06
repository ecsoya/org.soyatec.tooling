package org.soyatec.tooling.gef.examples.edit.policies;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.gef.anchor.BaseConnectionAnchor;
import org.soyatec.tooling.gef.examples.edit.commands.CreateConnectionCommand;

public class ConnectionCreationEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			final CreateConnectionRequest request) {
		final Command startCommand = request.getStartCommand();
		if (startCommand instanceof CreateConnectionCommand) {
			final CreateConnectionCommand command = (CreateConnectionCommand) startCommand;
			command.setTargetEditPart(getHost());
			final ConnectionAnchor anchor = getNodeEditPart()
					.getTargetConnectionAnchor(request);
			if (anchor instanceof BaseConnectionAnchor) {
				command.setTargetAnchor(((BaseConnectionAnchor) anchor)
						.getTerminal());
			}
			return command;
		}
		return null;
	}

	@Override
	protected Command getConnectionCreateCommand(
			final CreateConnectionRequest request) {
		final Object newObject = request.getNewObject();
		if (newObject instanceof Connector) {
			final CreateConnectionCommand command = new CreateConnectionCommand(
					(Connector) newObject);
			command.setSourceEditPart(getHost());
			final ConnectionAnchor anchor = getNodeEditPart()
					.getSourceConnectionAnchor(request);
			if (anchor instanceof BaseConnectionAnchor) {
				command.setSourceAnchor(((BaseConnectionAnchor) anchor)
						.getTerminal());
			}

			request.setStartCommand(command);
			return command;
		}
		return null;
	}

	protected NodeEditPart getNodeEditPart() {
		return (NodeEditPart) getHost();
	}

	@Override
	protected Command getReconnectTargetCommand(final ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(final ReconnectRequest request) {
		return null;
	}

}
