package org.soyatec.tooling.gef.commands;

import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.UIElement;

public class CreateCommentLinkCommand extends CreateLineCommand {

	private UIElement commentSource;
	private Comment commentTarget;

	public CreateCommentLinkCommand(Diagram diagram, CommentLink lineObject) {
		super(diagram, lineObject);
	}

	public boolean canExecute() {
		if (source == null || target == null) {
			return false;
		}
		Object sourceModel = source.getModel();
		Object targetModel = target.getModel();
		if (!(sourceModel instanceof UIElement)
				|| !(targetModel instanceof Comment)) {
			return false;
		}
		commentSource = (UIElement) sourceModel;
		commentTarget = (Comment) targetModel;
		return true;
	}

	protected void doCreateLine(Diagram diagram, Line line) {
		CommentLink commentLink = (CommentLink) line;
		if (commentLink == null) {
			commentLink = DiFactory.eINSTANCE.createCommentLink();
		}
		commentLink.setSourceAnchor(sourceAnchor);
		commentLink.setTargetAnchor(targetAnchor);

		commentLink.setSource(commentSource);
		commentLink.setTarget(commentTarget);

		diagram.getCommentLinks().add(commentLink);
	}

	protected void doRemoveLine(Diagram diagram, Line line) {
		if (diagram == null || line == null) {
			return;
		}
		CommentLink commentLink = (CommentLink) line;
		commentLink.setSource(null);
		commentLink.setTarget(null);

		diagram.getCommentLinks().remove(commentLink);
	}

}