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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class ShapeComponentEditPolicy extends ComponentEditPolicy {

	protected Command createDeleteCommand(final GroupRequest deleteRequest) {
		@SuppressWarnings("rawtypes")
		final List editParts = deleteRequest.getEditParts();
		final EditingDomain ed = EditingDomainUtils.getEditingDomain(getHost());
		final Set<EObject> deletingObjects = new HashSet<EObject>();
		for (final Object object : editParts) {
			final Object model = ((EditPart) object).getModel();
			if (model instanceof Shape) {
				final Shape shape = (Shape) model;
				deletingObjects.add(shape);
				final ValueListIterator<Object> incomings = shape
						.getAllIncomingLines().valueListIterator();
				while (incomings.hasNext()) {
					deletingObjects.add((EObject) incomings.next());
				}
				final ValueListIterator<Object> outgoings = shape
						.getAllOutgoingLines().valueListIterator();
				while (outgoings.hasNext()) {
					deletingObjects.add((EObject) outgoings.next());
				}
			}
		}
		return new CommandWrap2GEF(DeleteCommand.create(ed, deletingObjects));
	}
}
