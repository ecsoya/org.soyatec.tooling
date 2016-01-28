package org.soyatec.tooling.gef.figures;

import org.eclipse.draw2d.geometry.PointList;

/**
 * @author jschofie
 * 
 *         This interface is used by the Polygon Connection Anchor to obtain the
 *         list of points that form a polygon.
 */
public interface IPolygonAnchorableFigure extends IAnchorFigure {

	/**
	 * This method allows the implementing class to return a list of points that
	 * represent the polygon to be connected to.
	 * 
	 * @return a list of points forming the polygon
	 */
	public PointList getPolygonPoints();
}
