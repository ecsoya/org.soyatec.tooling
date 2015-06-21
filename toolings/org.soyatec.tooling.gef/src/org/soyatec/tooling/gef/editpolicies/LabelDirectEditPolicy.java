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

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.gef.commands.CommandWrapper2GEF;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class LabelDirectEditPolicy extends DirectEditPolicy {

	protected Command getDirectEditCommand(DirectEditRequest request) {
		EditPart host = getHost();
		Object model = host.getModel();
		Object value = request.getCellEditor().getValue();
		org.eclipse.emf.common.command.Command cmd = SetCommand.create(
				EditingDomainUtils.getEditingDomain(host), model,
				DiPackage.eINSTANCE.getUIObject_Label(), value);
		return new CommandWrapper2GEF(cmd);
	}

	protected void showCurrentEditValue(DirectEditRequest request) {

	}

}