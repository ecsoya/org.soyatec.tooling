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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.soyatec.tooling.di.UIObject;
import org.soyatec.tooling.gef.direct_edit.TextDirectEditManager;
import org.soyatec.tooling.gef.editpolicies.LabelDirectEditPolicy;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public abstract class UIObjectEditPart<T extends UIObject> extends
		AbstractGraphicalEditPart {

	private Adapter notifier;

	public UIObjectEditPart(T model) {
		setModel(model);
	}

	@SuppressWarnings("unchecked")
	public T getModel() {
		return (T) super.getModel();
	}

	public T getUIObject() {
		return getModel();
	}

	public void activate() {
		super.activate();
		getModel().eAdapters().add(notifier = new AdapterImpl() {
			public void notifyChanged(Notification event) {
				// super.notifyChanged(event);
				if (event.isTouch()) {
					return;
				}
				handleNotifyChanged(event);
			}
		});
	}

	protected void handleNotifyChanged(Notification event) {

	}

	public void deactivate() {
		getModel().eAdapters().remove(notifier);
		super.deactivate();
	}

	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
		installEditPolicy(SnapToHelper.class.getName(),
				new SnapFeedbackPolicy());
	}

	public void performRequest(Request req) {
		super.performRequest(req);
		if (REQ_OPEN.equals(req.getType())) {
			performOpen();
		} else if (REQ_DIRECT_EDIT.equals(req.getType())) {
			performDirectEdit();
		}
	}

	protected void performOpen() {
		performDirectEdit();
	}

	protected void performDirectEdit() {
		ILabelFigure directEditLabel = getDirectEditLabel();
		if (directEditLabel == null) {
			return;
		}
		new TextDirectEditManager(this, directEditLabel).show();
	}

	protected ILabelFigure getDirectEditLabel() {
		return null;
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (SnapToHelper.class == key) {
			return getParent().getAdapter(key);
		}
		return super.getAdapter(key);
	}
}
