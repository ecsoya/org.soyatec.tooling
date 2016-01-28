package org.soyatec.tooling.gef.utils;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Class implementing a list of <code>PrecisionPoint</code> similarly to
 * <code>PointList</code> class.
 * 
 * @author aboyko
 * 
 */
public class PrecisionPointList extends PointList {

	private double[] points = new double[0];
	private PrecisionRectangle bounds;
	private int size = 0;

	static final long serialVersionUID = 1;

	/**
	 * Constructs an empty PrecisionPointList.
	 */
	public PrecisionPointList() {
	}

	/**
	 * Constructs a PointList with the given points.
	 * 
	 * @param points
	 *            double array where two consecutive double form the coordinates
	 *            of a point
	 */
	public PrecisionPointList(final double points[]) {
		this.points = points;
		this.size = points.length / 2;
	}

	/**
	 * Constructs a PrecisionPointList with initial capacity <i>size</i>, but no
	 * points.
	 * 
	 * @param size
	 *            Number of points to hold.
	 */
	public PrecisionPointList(final int size) {
		points = new double[size * 2];
	}

	public PrecisionPointList(final PointList pointList) {
		this();
		addAll(pointList);
	}

	/**
	 * Appends all of the given points to this PrecisionPointList.
	 * 
	 * @param source
	 *            the source PrecisionPointlist
	 */
	public void addAll(final PrecisionPointList source) {
		ensureCapacity(size + source.size);
		System.arraycopy(source.points, 0, points, size * 2, source.size * 2);
		size += source.size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.geometry.PointList#addAll(org.eclipse.draw2d.geometry
	 * .PointList)
	 */
	public void addAll(final PointList source) {
		if (source instanceof PrecisionPointList) {
			addAll((PrecisionPointList) source);
		}
		ensureCapacity(size + source.size());
		for (int i = 0; i < source.size(); i++) {
			addPoint(source.getPoint(i));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.geometry.PointList#addPoint(org.eclipse.draw2d.geometry
	 * .Point)
	 */
	public void addPoint(final Point p) {
		if (p instanceof PrecisionPoint) {
			final PrecisionPoint precisionPt = (PrecisionPoint) p;
			addPrecisionPoint(precisionPt.preciseX, precisionPt.preciseY);
		} else {
			addPrecisionPoint(p.preciseX(), p.preciseY());
		}
	}

	/**
	 * Adds the input point values to this PointList.
	 * 
	 * @param x
	 *            X value of a point to add
	 * @param y
	 *            Y value of a point to add
	 */
	public void addPrecisionPoint(final double x, final double y) {
		bounds = null;
		final int index = size * 2;
		ensureCapacity(size + 1);
		points[index] = x;
		points[index + 1] = y;
		size++;
	}

	private void ensureCapacity(int newSize) {
		newSize *= 2;
		if (points.length < newSize) {
			final double old[] = points;
			points = new double[Math.max(newSize, size * 4)];
			System.arraycopy(old, 0, points, 0, size * 2);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#getBounds()
	 */
	public Rectangle getBounds() {
		if (bounds != null) {
			return bounds;
		}
		bounds = new PrecisionRectangle();
		if (size > 0) {
			bounds.setLocation(getPoint(0));
			for (int i = 0; i < size; i++) {
				final PrecisionPoint p = (PrecisionPoint) getPoint(i);
				bounds.union(p);
			}
		}
		return bounds;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#getCopy()
	 */
	public PrecisionPointList getCopy() {
		final PrecisionPointList result = new PrecisionPointList(size);
		System.arraycopy(points, 0, result.points, 0, size * 2);
		result.size = size;
		result.bounds = null;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#getLastPoint()
	 */
	public Point getLastPoint() {
		return getPoint(size - 1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#getMidpoint()
	 */
	public Point getMidpoint() {
		if (size() % 2 == 0) {
			return getPoint(size() / 2 - 1).getTranslated(getPoint(size() / 2))
					.scale(0.5f);
		}
		return getPoint(size() / 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#getPoint(int)
	 */
	public Point getPoint(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + //$NON-NLS-1$
					", Size: " + size); //$NON-NLS-1$
		}
		index *= 2;
		return new PrecisionPoint(points[index], points[index + 1]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.geometry.PointList#getPoint(org.eclipse.draw2d.geometry
	 * .Point, int)
	 */
	public Point getPoint(final Point p, int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + //$NON-NLS-1$
					", Size: " + size); //$NON-NLS-1$
		}
		index *= 2;
		if (p instanceof PrecisionPoint) {
			final PrecisionPoint preciseP = (PrecisionPoint) p;
			preciseP.preciseX = points[index];
			preciseP.preciseY = points[index + 1];
			preciseP.updateInts();
		} else {
			p.x = (int) Math.floor(points[index] + 0.000000001);
			p.y = (int) Math.floor(points[index + 1] + 0.000000001);
		}
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.geometry.PointList#insertPoint(org.eclipse.draw2d.
	 * geometry.Point, int)
	 */
	public void insertPoint(final Point p, int index) {
		if (bounds != null && !bounds.contains(p)) {
			bounds = null;
		}
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + //$NON-NLS-1$
					", Size: " + size); //$NON-NLS-1$
		}
		index *= 2;

		final int length = points.length;
		final double old[] = points;
		points = new double[length + 2];
		System.arraycopy(old, 0, points, 0, index);
		System.arraycopy(old, index, points, index + 2, length - index);

		if (p instanceof PrecisionPoint) {
			final PrecisionPoint precisionPt = (PrecisionPoint) p;
			points[index] = precisionPt.preciseX;
			points[index + 1] = precisionPt.preciseY;
		} else {
			points[index] = p.x;
			points[index + 1] = p.y;
		}
		size++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#performScale(double)
	 */
	public void performScale(final double factor) {
		for (int i = 0; i < points.length; i++) {
			points[i] = points[i] * factor;
		}
		bounds = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#performTranslate(int, int)
	 */
	public void performTranslate(final int dx, final int dy) {
		for (int i = 0; i < size * 2; i += 2) {
			points[i] += dx;
			points[i + 1] += dy;
		}
		if (bounds != null) {
			bounds.translate(dx, dy);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#removeAllPoints()
	 */
	public void removeAllPoints() {
		bounds = null;
		size = 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#removePoint(int)
	 */
	public Point removePoint(int index) {
		bounds = null;
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + //$NON-NLS-1$
					", Size: " + size); //$NON-NLS-1$
		}

		index *= 2;
		final PrecisionPoint pt = new PrecisionPoint(points[index],
				points[index + 1]);
		if (index != size * 2 - 2) {
			System.arraycopy(points, index + 2, points, index, size * 2 - index
					- 2);
		}
		size--;
		return pt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#reverse()
	 */
	public void reverse() {
		double temp;
		for (int i = 0, j = size * 2 - 2; i < size; i += 2, j -= 2) {
			temp = points[i];
			points[i] = points[j];
			points[j] = temp;
			temp = points[i + 1];
			points[i + 1] = points[j + 1];
			points[j + 1] = temp;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.draw2d.geometry.PointList#setPoint(org.eclipse.draw2d.geometry
	 * .Point, int)
	 */
	public void setPoint(final Point pt, final int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + //$NON-NLS-1$
					", Size: " + size); //$NON-NLS-1$
		}
		if (bounds != null && !bounds.contains(pt)) {
			bounds = null;
		}
		if (pt instanceof PrecisionPoint) {
			final PrecisionPoint precisionPt = (PrecisionPoint) pt;
			points[index * 2] = precisionPt.preciseX;
			points[index * 2 + 1] = precisionPt.preciseY;
		} else {
			points[index * 2] = pt.x;
			points[index * 2 + 1] = pt.y;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#setSize(int)
	 */
	public void setSize(final int newSize) {
		if (points.length > newSize * 2) {
			size = newSize;
			return;
		}
		final double[] newArray = new double[newSize * 2];
		System.arraycopy(points, 0, newArray, 0, points.length);
		points = newArray;
		size = newSize;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#size()
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns the contents of this PrecisionPointList as a double array. The
	 * returned array is by reference. Any changes made to the array will also
	 * be changing the original PrecisionPointList.
	 * 
	 * @return the integer array of points by reference
	 */
	public double[] toDoubleArray() {
		if (points.length != size * 2) {
			final double[] old = points;
			points = new double[size * 2];
			System.arraycopy(old, 0, points, 0, size * 2);
		}
		return points;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#toIntArray()
	 */
	public int[] toIntArray() {
		final int[] intArray = new int[size * 2];
		for (int i = 0; i < size(); i++) {
			final Point p = getPoint(i);
			final int idx = 2 * i;
			intArray[idx] = p.x;
			intArray[idx + 1] = p.y;
		}
		return intArray;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#translate(int, int)
	 */
	public void translate(final int x, final int y) {
		if (x == 0 && y == 0) {
			return;
		}
		if (bounds != null) {
			bounds.translate(x, y);
		}
		for (int i = 0; i < size * 2; i += 2) {
			points[i] += x;
			points[i + 1] += y;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.geometry.PointList#transpose()
	 */
	public void transpose() {
		double temp;
		if (bounds != null) {
			bounds.transpose();
		}
		for (int i = 0; i < size * 2; i += 2) {
			temp = points[i];
			points[i] = points[i + 1];
			points[i + 1] = temp;
		}
	}

}
