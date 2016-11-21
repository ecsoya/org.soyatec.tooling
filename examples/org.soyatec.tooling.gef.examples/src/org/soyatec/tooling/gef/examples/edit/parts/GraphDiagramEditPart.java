package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.gef.editparts.DiagramEditPart;
import org.soyatec.tooling.gef.examples.edit.policies.GraphLayoutEditPolicy;

public class GraphDiagramEditPart extends DiagramEditPart {

	public GraphDiagramEditPart(final Diagram model) {
		super(model);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GraphLayoutEditPolicy());
	}
}
