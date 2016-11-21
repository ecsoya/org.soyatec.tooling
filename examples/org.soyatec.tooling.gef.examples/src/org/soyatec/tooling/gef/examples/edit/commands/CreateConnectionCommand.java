package org.soyatec.tooling.gef.examples.edit.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.gef.examples.shapes.Connection;
import org.soyatec.tooling.gef.examples.shapes.Graph;

public class CreateConnectionCommand extends Command {

	private EditPart sourceEditPart;

	private EditPart targetEditPart;

	private String sourceAnchor;
	private String targetAnchor;

	private final Connector connector;

	public CreateConnectionCommand(final Connector connector) {
		this.connector = connector;
	}

	@Override
	public boolean canExecute() {
		if (sourceEditPart == null || targetEditPart == null) {
			return false;
		}
		final Object source = sourceEditPart.getModel();
		final Object target = targetEditPart.getModel();
		if (source == null || target == null || !(source instanceof Shape)
				|| !(target instanceof Shape)) {
			return false;
		}
		final EObject sourceElement = ((Shape) source).getElement();
		final EObject targetElement = ((Shape) target).getElement();
		if (sourceElement == null && targetElement == null) {
			return false;
		}
		return true;
	}

	public void execute() {
		final Shape source = (Shape) sourceEditPart.getModel();
		final Shape target = (Shape) targetEditPart.getModel();

		if (sourceAnchor != null) {
			connector.setSourceAnchor(sourceAnchor);
		}
		if (targetAnchor != null) {
			connector.setTargetAnchor(targetAnchor);
		}
		connector.setSource(source);
		connector.setTarget(target);

		final Connection element = (Connection) connector.getElement();
		if (element != null) {
			((Graph) source.getElement().eContainer()).getConnections().add(
					element);
		}

		((Diagram) source.eContainer()).getLines().add(connector);
	}

	@Override
	public void undo() {
		final Shape source = (Shape) sourceEditPart.getModel();
		connector.setSource(null);
		connector.setTarget(null);
		((Diagram) source.eContainer()).getLines().remove(connector);

		final Connection element = (Connection) connector.getElement();
		if (element != null) {
			((Graph) source.getElement().eContainer()).getConnections().remove(
					element);
		}
	}

	public EditPart getSourceEditPart() {
		return sourceEditPart;
	}

	public void setSourceEditPart(final EditPart sourceEditPart) {
		this.sourceEditPart = sourceEditPart;
	}

	public EditPart getTargetEditPart() {
		return targetEditPart;
	}

	public void setTargetEditPart(final EditPart targetEditPart) {
		this.targetEditPart = targetEditPart;
	}

	public String getSourceAnchor() {
		return sourceAnchor;
	}

	public void setSourceAnchor(final String sourceAnchor) {
		this.sourceAnchor = sourceAnchor;
	}

	public String getTargetAnchor() {
		return targetAnchor;
	}

	public void setTargetAnchor(final String targetAnchor) {
		this.targetAnchor = targetAnchor;
	}

}
