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
package org.soyatec.tooling.gef.utils;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;

public class EditingDomainUtils {

	private EditingDomainUtils() {
	}

	public static EditingDomain getEditingDomain(final EditPart editPart) {
		if (editPart == null) {
			return null;
		}
		final EditPartViewer viewer = editPart.getViewer();
		if (viewer != null) {
			final EditDomain ed = viewer.getEditDomain();
			if (ed instanceof IEditingDomainProvider) {
				return ((IEditingDomainProvider) ed).getEditingDomain();
			}
		}
		if (editPart instanceof IEditingDomainProvider) {
			return ((IEditingDomainProvider) editPart).getEditingDomain();
		}
		return getEditingDomain(editPart.getModel());
	}

	public static EditingDomain getEditingDomain(final Object object) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(object);
	}
}
