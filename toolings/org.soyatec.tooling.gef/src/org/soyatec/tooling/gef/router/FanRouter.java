package org.soyatec.tooling.gef.router;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Ray;

/**
 * This class exists only as a workaround to Bugzilla Bug 37342:
 * FanRouter.handleCollision incorrect for PointList where start and end point
 * are the same.
 * 
 * @author chmahone
 */
public class FanRouter extends org.eclipse.draw2d.FanRouter {

	static final int SEPARATION = 15;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.ConnectionRouter#route(org.eclipse.draw2d.Connection)
	 */
	public void route(final Connection conn) {
		routeBendpoints(conn);
	}

	/**
	 * routeBendpoints Method that performs the actual routing of the
	 * Connection. Clients will override this instead of route which is final.
	 * 
	 * @param conn
	 *            Connection to be routed.
	 */
	private void routeBendpoints(final Connection conn) {
		if (!isFeedback(conn)) {
			setSeparation(SEPARATION);
		} else {
			setSeparation(SEPARATION);
		}

		super.route(conn);
	}

	private boolean isFeedback(final Connection conn) {
		final Dimension dim = new Dimension(100, 100);
		final Dimension dimCheck = dim.getCopy();
		conn.translateToRelative(dimCheck);
		return dim.equals(dimCheck);
	}

	/**
	 * This is a workaround to Bugzilla Bug 37342: FanRouter.handleCollision
	 * incorrect for PointList where start and end point are the same. If there
	 * are only two points and they are both the same, then do nothing.
	 * 
	 * Also overridden to handle integer overflow issue with the Ray::Length
	 * method when fed HiMetric values that are large. Ray length has to be
	 * manually calculated instead.
	 * 
	 * @see org.eclipse.draw2d.AutomaticRouter#handleCollision(org.eclipse.draw2d.geometry.PointList,
	 *      int)
	 */
	protected void handleCollision(final PointList points, final int index) {
		if (points.size() == 2
				&& points.getFirstPoint().equals(points.getLastPoint())) {
			return;
		}

		final Point start = points.getFirstPoint();
		final Point end = points.getLastPoint();

		if (start.equals(end)) {
			return;
		}

		final Point midPoint = new Point((end.x + start.x) / 2,
				(end.y + start.y) / 2);
		final int position = end.getPosition(start);
		Ray ray;
		if (position == PositionConstants.SOUTH
				|| position == PositionConstants.EAST) {
			ray = new Ray(start, end);
		} else {
			ray = new Ray(end, start);
		}
		final double length = Math.sqrt(((double) ray.x * (double) ray.x)
				+ ((double) ray.y * (double) ray.y));

		final double xSeparation = getSeparation() * ray.x / length;
		final double ySeparation = getSeparation() * ray.y / length;

		Point bendPoint;

		if (index % 2 == 0) {
			bendPoint = new Point(
					midPoint.x + (index / 2) * (-1 * ySeparation), midPoint.y
							+ (index / 2) * xSeparation);
		} else {
			bendPoint = new Point(midPoint.x + (index / 2) * ySeparation,
					midPoint.y + (index / 2) * (-1 * xSeparation));
		}
		if (!bendPoint.equals(midPoint)) {
			points.insertPoint(bendPoint, 1);
		}
	}

	/**
	 * @return Returns the connection router to which the routing is delegated.
	 */
	public ConnectionRouter getRouter() {
		return next();
	}
}
