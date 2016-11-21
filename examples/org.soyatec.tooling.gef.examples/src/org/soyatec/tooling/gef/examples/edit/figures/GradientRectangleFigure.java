package org.soyatec.tooling.gef.examples.edit.figures;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.soyatec.tooling.gef.figures.GradientFigure;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public class GradientRectangleFigure extends GradientFigure implements
		ILabelFigure {

	private final Label label;

	public GradientRectangleFigure() {
		setBorder(new LineBorder());
		setLayoutManager(new BorderLayout());

		label = new Label();
		add(label, BorderLayout.CENTER);
	}

	@Override
	public void setText(final String newText) {
		label.setText(newText);
	}

	@Override
	public String getText() {
		return label.getText();
	}

	@Override
	public void setImage(final Image newImage) {
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

	@Override
	public Color getGradientColor() {
		return ColorConstants.blue;
	}
}