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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class LineEditPolicy extends ConnectionEditPolicy {

	protected Command getDeleteCommand(final GroupRequest request) {
		final EditingDomain editingDomain = EditingDomainUtils
				.getEditingDomain(getHost());
		final List<EObject> deletingObjects = new ArrayList<EObject>();
		final Line model = (Line) getHost().getModel();
		deletingObjects.add(model);
		if (model.getElement() != null) {
			deletingObjects.add(model.getElement());
		}
		if (model instanceof Connector
				&& ((Connector) model).getReverseElement() != null) {
			deletingObjects.add(((Connector) model).getReverseElement());
		}
		return new CommandWrap2GEF(DeleteCommand.create(editingDomain,
				deletingObjects));
	}

}
