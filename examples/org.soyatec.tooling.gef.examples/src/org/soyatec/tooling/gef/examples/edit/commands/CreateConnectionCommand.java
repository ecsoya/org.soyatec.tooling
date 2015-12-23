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

    private Connector connector;

    public CreateConnectionCommand(Connector connector) {
        this.connector = connector;
    }

    @Override
    public boolean canExecute() {
        if (sourceEditPart == null || targetEditPart == null) {
            return false;
        }
        Object source = sourceEditPart.getModel();
        Object target = targetEditPart.getModel();
        if (source == null || target == null || !(source instanceof Shape)
                || !(target instanceof Shape)) {
            return false;
        }
        EObject sourceElement = ((Shape) source).getElement();
        EObject targetElement = ((Shape) target).getElement();
        if (sourceElement == null && targetElement == null) {
            return false;
        }
        return true;
    }

    public void execute() {
        Shape source = (Shape) sourceEditPart.getModel();
        Shape target = (Shape) targetEditPart.getModel();

        if (sourceAnchor != null) {
            connector.setSourceAnchor(sourceAnchor);
        }
        if (targetAnchor != null) {
            connector.setTargetAnchor(targetAnchor);
        }
        connector.setSource(source);
        connector.setTarget(target);

        Connection element = (Connection) connector.getElement();
        if (element != null) {
            ((Graph) source.getElement().eContainer()).getConnections().add(
                    element);
        }

        ((Diagram) source.eContainer()).getLines().add(connector);
    }

    @Override
    public void undo() {
        Shape source = (Shape) sourceEditPart.getModel();
        connector.setSource(null);
        connector.setTarget(null);
        ((Diagram) source.eContainer()).getLines().remove(connector);

        Connection element = (Connection) connector.getElement();
        if (element != null) {
            ((Graph) source.getElement().eContainer()).getConnections().remove(
                    element);
        }
    }

    public EditPart getSourceEditPart() {
        return sourceEditPart;
    }

    public void setSourceEditPart(EditPart sourceEditPart) {
        this.sourceEditPart = sourceEditPart;
    }

    public EditPart getTargetEditPart() {
        return targetEditPart;
    }

    public void setTargetEditPart(EditPart targetEditPart) {
        this.targetEditPart = targetEditPart;
    }

    public String getSourceAnchor() {
        return sourceAnchor;
    }

    public void setSourceAnchor(String sourceAnchor) {
        this.sourceAnchor = sourceAnchor;
    }

    public String getTargetAnchor() {
        return targetAnchor;
    }

    public void setTargetAnchor(String targetAnchor) {
        this.targetAnchor = targetAnchor;
    }

}
