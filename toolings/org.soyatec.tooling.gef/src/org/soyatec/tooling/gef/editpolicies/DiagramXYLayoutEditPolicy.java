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

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.commands.CommandFactory;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.resources.ResourcesFactory;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class DiagramXYLayoutEditPolicy extends XYLayoutEditPolicy {

	public static final Dimension SIZE_COMMENT_DEFAULT = new Dimension(100, 80);

	protected Command getCreateCommand(final CreateRequest request) {
		final Object newObjectType = request.getNewObjectType();
		final Object newObject = request.getNewObject();
		final Rectangle rect = (Rectangle) getConstraintFor(request);
		final Diagram diagram = (Diagram) getHost().getModel();
		if (DiPackage.eINSTANCE.getComment() == newObjectType) {
			Comment comment = null;
			if (newObject instanceof Comment) {
				comment = (Comment) newObject;
			} else {
				comment = DiFactory.eINSTANCE.createComment();
			}
			final Rectangle bounds = rect.getCopy();
			if (bounds.isEmpty()) {
				bounds.setSize(SIZE_COMMENT_DEFAULT);
			}
			comment.setBounds(bounds);
			return CommandFactory.add(diagram,
					DiPackage.eINSTANCE.getDiagram_Comments(), comment);
		} else if (newObject instanceof Shape) {
			final Rectangle bounds = rect.getCopy();
			if (bounds.isEmpty()) {
				bounds.setSize(SIZE_COMMENT_DEFAULT);
			}
			((Shape) newObject).setBounds(bounds);
			return CommandFactory.add(diagram,
					DiPackage.eINSTANCE.getContainer_Children(), newObject);
		}
		return null;
	}

	protected Command createChangeConstraintCommand(
			final ChangeBoundsRequest request, final EditPart child,
			final Object constraint) {
		final Object model = child.getModel();
		final Object type = request.getType();
		if (model instanceof Shape) {
			final Rectangle r = (Rectangle) constraint;

			final org.eclipse.emf.common.command.Command cmd = SetCommand
					.create(EditingDomainUtils.getEditingDomain(getHost()),
							model, DiPackage.Literals.SHAPE__BOUNDS, r);
			if (cmd instanceof AbstractCommand) {
				final String label = REQ_MOVE_CHILDREN.equals(type) ? ResourcesFactory
						.getString("Move") //$NON-NLS-1$
						: ResourcesFactory.getString("Resize"); //$NON-NLS-1$
				((AbstractCommand) cmd).setLabel(label);
			}
			return new CommandWrap2GEF(cmd);
		}
		return super.createChangeConstraintCommand(request, child, constraint);
	}
}
