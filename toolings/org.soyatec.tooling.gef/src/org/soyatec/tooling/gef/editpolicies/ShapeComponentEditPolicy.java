/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.gef.editpolicies;

import java.util.ArrayList;
import java.util.List;

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

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		@SuppressWarnings("rawtypes")
		List editParts = deleteRequest.getEditParts();
		final EditingDomain ed = EditingDomainUtils.getEditingDomain(getHost());
		List<EObject> deletingObjects = new ArrayList<EObject>();
		for (Object object : editParts) {
			Object model = ((EditPart) object).getModel();
			if (model instanceof Shape) {
				Shape shape = (Shape) model;
				deletingObjects.add(shape);
				ValueListIterator<Object> incomings = shape.getIncomingLines()
						.valueListIterator();
				while (incomings.hasNext()) {
					deletingObjects.add((EObject) incomings.next());
				}
				ValueListIterator<Object> outgoings = shape.getOutgoingLines()
						.valueListIterator();
				while (outgoings.hasNext()) {
					deletingObjects.add((EObject) outgoings.next());
				}
			}
		}
		return new CommandWrap2GEF(DeleteCommand.create(ed, deletingObjects));
	}
}
