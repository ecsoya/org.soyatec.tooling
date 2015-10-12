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
package org.soyatec.tooling.gef.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.eclipse.gef.EditPolicy;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;
import org.soyatec.tooling.gef.editpolicies.CommentLinkCreationEditPolicy;

public abstract class NodeEditPart<T extends Node> extends ViewEditPart<Node> {

	public NodeEditPart(Node model) {
		super(model);
	}

	@Override
	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		Object feature = event.getFeature();
		if (DiPackage.eINSTANCE.getNode_AllIncomingLines() == feature) {
			refreshTargetConnections();
		} else if (DiPackage.eINSTANCE.getNode_AllOutgoingLines() == feature) {
			refreshSourceConnections();
		}
	}

	@SuppressWarnings("rawtypes")
	protected List getModelSourceConnections() {
		ValueListIterator<Object> valueListIterator = getView()
				.getAllOutgoingLines().valueListIterator();
		List<Object> modelSourceConnections = new ArrayList<Object>();
		while (valueListIterator.hasNext()) {
			modelSourceConnections.add(valueListIterator.next());
		}
		return modelSourceConnections;
	}

	@SuppressWarnings("rawtypes")
	protected List getModelTargetConnections() {
		ValueListIterator<Object> valueListIterator = getView()
				.getAllIncomingLines().valueListIterator();
		List<Object> modelTargetConnections = new ArrayList<Object>();
		while (valueListIterator.hasNext()) {
			modelTargetConnections.add(valueListIterator.next());
		}
		return modelTargetConnections;
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CommentLinkCreationEditPolicy());
	}
}
