package org.soyatec.tooling.gef.editpolicies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.commands.CommandFactory;
import org.soyatec.tooling.gef.commands.CommandWrap2GEF;
import org.soyatec.tooling.gef.utils.EditingDomainUtils;

public class DiagramXYLayoutEditPolicy extends XYLayoutEditPolicy {

	public static final Dimension SIZE_COMMENT_DEFAULT = new Dimension(100, 80);

	protected Command getCreateCommand(CreateRequest request) {
		final Object newObjectType = request.getNewObjectType();
		final Object newObject = request.getNewObject();
		final Rectangle rect = (Rectangle) getConstraintFor(request);
		final Diagram diagram = (Diagram) getHost().getModel();
		if (DiPackage.eINSTANCE.getComment() == newObjectType) {
			Comment comment = null;
			if (newObject instanceof Comment) {
				comment = (Comment) newObject;
			} else {
				comment = DiFactory.eINSTANCE.createComment();
			}
			Rectangle bounds = rect.getCopy();
			if (bounds.isEmpty()) {
				bounds.setSize(SIZE_COMMENT_DEFAULT);
			}
			comment.setBounds(bounds);
			return CommandFactory.add(diagram,
					DiPackage.eINSTANCE.getDiagram_Comments(), comment);
		}
		return null;
	}

	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		Object model = child.getModel();
		Object type = request.getType();
		if (model instanceof Shape) {
			Rectangle r = (Rectangle) constraint;

			org.eclipse.emf.common.command.Command cmd = SetCommand.create(
					EditingDomainUtils.getEditingDomain(getHost()), model,
					DiPackage.Literals.SHAPE__BOUNDS, r);
			if (cmd instanceof AbstractCommand) {
				String label = REQ_MOVE_CHILDREN.equals(type) ? "Move"
						: "Resize";
				((AbstractCommand) cmd).setLabel(label);
			}
			return new CommandWrap2GEF(cmd);
		}
		return super.createChangeConstraintCommand(request, child, constraint);
	}
}