/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.gef.editpolicies;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.gef.anchor.BaseConnectionAnchor;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.commands.CreateCommentLinkCommand;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class CommentLinkCreationEditPolicy extends GraphicalNodeEditPolicy {

	public CommentLinkCreationEditPolicy() {
	}

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		Object newObjectType = request.getNewObjectType();
		if (DiPackage.eINSTANCE.getCommentLink() == newObjectType) {

			CreateCommentLinkCommand cmd = (CreateCommentLinkCommand) request
					.getStartCommand();
			cmd.setTarget(getHost());

			ConnectionAnchor targetConnectionAnchor = getNodeEditPart()
					.getTargetConnectionAnchor(request);
			if (targetConnectionAnchor instanceof BaseConnectionAnchor) {
				cmd.setTargetAnchor(((BaseConnectionAnchor) targetConnectionAnchor)
						.getTerminal());
			}

			return cmd;
		}
		return null;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		Object newObjectType = request.getNewObjectType();
		if (DiPackage.eINSTANCE.getCommentLink() == newObjectType) {
			CreateCommentLinkCommand cmd = new CreateCommentLinkCommand(
					getDiagram(), (CommentLink) request.getNewObject());
			cmd.setSource(getHost());

			ConnectionAnchor sourceConnectionAnchor = getNodeEditPart()
					.getSourceConnectionAnchor(request);
			if (sourceConnectionAnchor instanceof BaseConnectionAnchor) {
				cmd.setSourceAnchor(((BaseConnectionAnchor) sourceConnectionAnchor)
						.getTerminal());
			}
			request.setStartCommand(cmd);
			return cmd;
		}
		return null;
	}

	protected Diagram getDiagram() {
		Object model = getHost().getModel();
		if (!(model instanceof EObject)) {
			return null;
		}
		EObject eObj = (EObject) model;
		while (eObj != null && !(eObj instanceof Diagram)) {
			eObj = eObj.eContainer();
		}
		return (Diagram) eObj;
	}

	protected NodeEditPart getNodeEditPart() {
		return (NodeEditPart) getHost();
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		ConnectionEditPart conn = request.getConnectionEditPart();
		EditPart target = getHost();
		if (target == conn.getTarget()) {
			ConnectionAnchor anchor = getNodeEditPart()
					.getTargetConnectionAnchor(request);
			if (anchor instanceof BaseConnectionAnchor) {
				String terminal = ((BaseConnectionAnchor) anchor).getTerminal();
				EditingDomain domain = EditingDomainUtils
						.getEditingDomain(target);
				return new CommandWrap2GEF(SetCommand.create(domain,
						conn.getModel(),
						DiPackage.eINSTANCE.getLine_TargetAnchor(), terminal));
			}
		}
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		ConnectionEditPart conn = request.getConnectionEditPart();
		EditPart source = getHost();
		if (source == conn.getSource()) {
			ConnectionAnchor anchor = getNodeEditPart()
					.getSourceConnectionAnchor(request);
			if (anchor instanceof BaseConnectionAnchor) {
				String terminal = ((BaseConnectionAnchor) anchor).getTerminal();
				EditingDomain domain = EditingDomainUtils
						.getEditingDomain(source);
				return new CommandWrap2GEF(SetCommand.create(domain,
						conn.getModel(),
						DiPackage.eINSTANCE.getLine_SourceAnchor(), terminal));
			}
		}
		return null;
	}

}
