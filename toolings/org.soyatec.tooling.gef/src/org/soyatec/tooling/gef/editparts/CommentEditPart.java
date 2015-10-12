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

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.swt.graphics.Color;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.gef.editpolicies.CommentLinkCreationEditPolicy;
import org.soyatec.tooling.gef.figures.CommentFigure;
import org.soyatec.tooling.gef.figures.ILabelFigure;
import org.soyatec.tooling.gef.resources.ResourcesFactory;

public class CommentEditPart extends ShapeEditPart<Comment> {

	public CommentEditPart(Comment model) {
		super(model);
	}

	protected IFigure createPrimaryFigure() {
		return new CommentFigure();
	}

	protected Color getDefaultBackgroundColor() {
		return ResourcesFactory.getColor(ResourcesFactory.COLOR_COMMENT);
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
	}

	protected void refreshLabel() {
		CommentFigure primaryFigure = (CommentFigure) getPrimaryFigure();
		Comment model = (Comment) getModel();
		primaryFigure.setText(model.getLabel());
	}

	protected void handleNotifyChanged(Notification event) {
		super.handleNotifyChanged(event);
		if (DiPackage.eINSTANCE.getView_Label() == event.getFeature()) {
			refreshLabel();
		}
	}

	protected ILabelFigure getDirectEditLabel() {
		return (ILabelFigure) getPrimaryFigure();
	}

	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new CommentLinkCreationEditPolicy());
	}
}
