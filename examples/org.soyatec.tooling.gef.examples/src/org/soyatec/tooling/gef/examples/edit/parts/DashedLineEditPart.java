package org.soyatec.tooling.gef.examples.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;
import org.soyatec.tooling.di.Connector;

public class DashedLineEditPart extends ConnectionEditPart {

	public DashedLineEditPart(Connector model) {
		super(model);
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection polyline = (PolylineConnection) super.createFigure();
		polyline.setLineStyle(SWT.LINE_DASH);
		polyline.setAntialias(SWT.ON);

		final PolylineDecoration dec = new PolylineDecoration();
		final PointList pl = new PointList();
		pl.addPoint(-2, 2);
		pl.addPoint(0, 0);
		pl.addPoint(-2, -2);
		dec.setTemplate(pl);
		dec.setScale(7, 3);
		dec.setAntialias(SWT.ON);
		polyline.setTargetDecoration(dec);

		return polyline;
	}

}
