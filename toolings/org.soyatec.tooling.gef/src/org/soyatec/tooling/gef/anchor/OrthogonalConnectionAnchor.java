package org.soyatec.tooling.gef.anchor;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;

/**
 * The interface allows to specify connection anchor location for a connection
 * routed with Orthogonal connection routers.
 * 
 * IMPORTANT: this interface is not to be implemented by clients, since this is
 * an API under construction
 * 
 * @author aboyko
 * 
 */
public interface OrthogonalConnectionAnchor extends ConnectionAnchor {

	/**
	 * Determines connection anchor point for Orthogonal connection. Generally,
	 * the anchor point would the intersection of perpendicular line drawn from
	 * the <code>orthoReference</code> point to the shape and shape's edge.
	 * 
	 * @param orthoReference
	 *            the reference point
	 * @return The location of the orthogonal connection anchor.
	 */
	public Point getOrthogonalLocation(Point orthoReference);

}
