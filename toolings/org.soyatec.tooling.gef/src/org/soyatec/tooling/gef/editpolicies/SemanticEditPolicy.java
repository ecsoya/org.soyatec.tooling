package org.soyatec.tooling.gef.editpolicies;

import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.soyatec.tooling.di.View;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class SemanticEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Semantic EditPolicy";

	public Command getCommand(final Request request) {
		if (REQ_DELETE.equals(request.getType())) {
			return getDeleteCommand((GroupRequest) request);
		}
		return null;
	}

	protected Command getDeleteCommand(final GroupRequest request) {
		return createDeleteCommand(request);
	}

	protected Command createDeleteCommand(final GroupRequest deleteRequest) {
		final EditingDomain ed = EditingDomainUtils.getEditingDomain(getHost());
		final List editParts = deleteRequest.getEditParts();
		final CompoundCommand commands = new CompoundCommand();
		for (final Object object : editParts) {
			final Object model = ((EditPart) object).getModel();
			if (model instanceof View) {
				final EObject element = ((View) model).getElement();
				if (element == null) {
					continue;
				}
				commands.append(DeleteCommand.create(ed, element));
			}
		}
		return new CommandWrap2GEF(commands.unwrap());
	}

	public boolean understandsRequest(final Request req) {
		return REQ_DELETE.equals(req.getType());
	}
}
