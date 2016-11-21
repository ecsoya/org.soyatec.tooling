package org.soyatec.tooling.gef.examples.edit.figures;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.soyatec.tooling.gef.figures.ILabelFigure;

public class ConnectionFigure extends PolylineConnection implements
		ILabelFigure {

	private final Label label;

	public ConnectionFigure() {
		setAntialias(SWT.ON);
		setLayoutManager(new DelegatingLayout());
		label = new Label("Connection"); //$NON-NLS-1$
		add(label, new LabelLocator(this));
	}

	public void setText(final String newText) {
		label.setText(newText);
	}

	public String getText() {
		return label.getText();
	}

	public void setImage(final Image newImage) {
		label.setIcon(newImage);
	}

	public Image getImage() {
		return label.getIcon();
	}

	public Label getLabel() {
		return label;
	}

	public IFigure getLabelFigure() {
		return label;
	}

	private static class LabelLocator extends ConnectionLocator {

		public LabelLocator(final Connection connection) {
			super(connection, MIDDLE);
		}

		@Override
		public void relocate(final IFigure target) {
			final Dimension prefSize = target.getPreferredSize();
			final Point center = getReferencePoint();
			center.translate(0, -(prefSize.height / 2 + 2));
			target.translateToRelative(center);
			target.setBounds(getNewBounds(prefSize, center));
		}
	}

}
