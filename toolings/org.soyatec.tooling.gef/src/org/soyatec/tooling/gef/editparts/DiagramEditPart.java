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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToHelper;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.gef.editpolicies.DiagramXYLayoutEditPolicy;

public abstract class DiagramEditPart extends ViewEditPart<Diagram> {

    public DiagramEditPart(final Diagram model) {
        super(model);
    }

    protected IFigure createFigure() {
        final FreeformLayer layer = new FreeformLayer();
        layer.setLayoutManager(new FreeformLayout());
        layer.setBackgroundColor(ColorConstants.blue);
        return layer;
    }

    @SuppressWarnings("rawtypes")
    protected List getModelChildren() {
        final List<Object> modelChildren = new ArrayList<Object>();
        final ValueListIterator<Object> it = getModel().getAllShapes()
                .valueListIterator();
        while (it.hasNext()) {
            modelChildren.add(it.next());
        }
        return modelChildren;
    }

    protected void handleNotifyChanged(final Notification event) {
        super.handleNotifyChanged(event);
        final Object feature = event.getFeature();
        if (DiPackage.eINSTANCE.getContainer_AllShapes() == feature) {
            refreshChildren();
        } else if (DiPackage.eINSTANCE.getContainer_AllLines() == feature) {
        }
    }

    public Object getAdapter(@SuppressWarnings("rawtypes") final Class key) {
        if (SnapToHelper.class == key) {
            return new SnapToGeometry(this);
        }
        return super.getAdapter(key);
    }

    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.LAYOUT_ROLE,
                new DiagramXYLayoutEditPolicy());
    }
}
