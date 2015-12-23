package org.soyatec.tooling.gef.examples.edit.figures;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;
import org.soyatec.tooling.gef.figures.IAnchorFigure;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public class EllipseFigure extends org.eclipse.draw2d.Ellipse implements
        IAnchorFigure, ILabelFigure {

    private Label label;

    public EllipseFigure() {
        setLayoutManager(new BorderLayout());

        add(label = new Label(), BorderLayout.CENTER);
    }

    @Override
    public ConnectionAnchor createAnchor(String terminal) {
        return new EllipseAnchor(this);
    }

    @Override
    public String getTerminal(Point location) {
        return "";
    }

    @Override
    public void setText(String newText) {
        label.setText(newText);
    }

    @Override
    public String getText() {
        return label.getText();
    }

    @Override
    public void setImage(Image newImage) {
        label.setIcon(newImage);
    }

    @Override
    public Image getImage() {
        return label.getIcon();
    }

    @Override
    public IFigure getLabelFigure() {
        return label;
    }

}