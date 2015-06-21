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
package org.soyatec.tooling.gef.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.UIElement;

public abstract class UIElementEditPart<T extends UIElement> extends
		UIObjectEditPart<UIElement> {

	public UIElementEditPart(UIElement model) {
		super(model);
	}

	@Override
	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		Object feature = event.getFeature();
		if (DiPackage.eINSTANCE.getUIElement_IncomingLines() == feature) {
			refreshTargetConnections();
		} else if (DiPackage.eINSTANCE.getUIElement_OutgoingLines() == feature) {
			refreshSourceConnections();
		}
	}

	@SuppressWarnings("rawtypes")
	protected List getModelSourceConnections() {
		ValueListIterator<Object> valueListIterator = getUIObject()
				.getOutgoingLines().valueListIterator();
		List<Object> modelSourceConnections = new ArrayList<Object>();
		while (valueListIterator.hasNext()) {
			modelSourceConnections.add(valueListIterator.next());
		}
		return modelSourceConnections;
	}

	@SuppressWarnings("rawtypes")
	protected List getModelTargetConnections() {
		ValueListIterator<Object> valueListIterator = getUIObject()
				.getIncomingLines().valueListIterator();
		List<Object> modelTargetConnections = new ArrayList<Object>();
		while (valueListIterator.hasNext()) {
			modelTargetConnections.add(valueListIterator.next());
		}
		return modelTargetConnections;
	}
}
