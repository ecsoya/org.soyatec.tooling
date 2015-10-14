/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Soyatec - initial API and implementation
 *******************************************************************************/
/**
 */
package org.soyatec.tooling.di.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.Ruler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getComments <em>Comments
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getCommentLinks <em>
 * Comment Links</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getRulers <em>Rulers</em>}
 * </li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getHorizontalRuler <em>
 * Horizontal Ruler</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getVerticalRuler <em>
 * Vertical Ruler</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getGrid <em>Grid</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#isSnapToGrid <em>Snap To
 * Grid</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#isSnapToGeometry <em>Snap
 * To Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends ContainerImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getRulers() <em>Rulers</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRulers()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap rulers;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The default value of the '{@link #isSnapToGrid() <em>Snap To Grid</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSnapToGrid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SNAP_TO_GRID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSnapToGrid() <em>Snap To Grid</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSnapToGrid()
	 * @generated
	 * @ordered
	 */
	protected boolean snapToGrid = SNAP_TO_GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSnapToGeometry()
	 * <em>Snap To Geometry</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #isSnapToGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SNAP_TO_GEOMETRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSnapToGeometry()
	 * <em>Snap To Geometry</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #isSnapToGeometry()
	 * @generated
	 * @ordered
	 */
	protected boolean snapToGeometry = SNAP_TO_GEOMETRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<Comment> getComments() {
		return getAllShapes().list(DiPackage.Literals.DIAGRAM__COMMENTS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getAllLines().list(DiPackage.Literals.DIAGRAM__COMMENT_LINKS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FeatureMap getRulers() {
		if (rulers == null) {
			rulers = new BasicFeatureMap(this, DiPackage.DIAGRAM__RULERS);
		}
		return rulers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Ruler getHorizontalRuler() {
		return (Ruler) getRulers().get(
				DiPackage.Literals.DIAGRAM__HORIZONTAL_RULER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetHorizontalRuler(
			final Ruler newHorizontalRuler, final NotificationChain msgs) {
		return ((FeatureMap.Internal) getRulers()).basicAdd(
				DiPackage.Literals.DIAGRAM__HORIZONTAL_RULER,
				newHorizontalRuler, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setHorizontalRuler(final Ruler newHorizontalRuler) {
		((FeatureMap.Internal) getRulers()).set(
				DiPackage.Literals.DIAGRAM__HORIZONTAL_RULER,
				newHorizontalRuler);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Ruler getVerticalRuler() {
		return (Ruler) getRulers().get(
				DiPackage.Literals.DIAGRAM__VERTICAL_RULER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetVerticalRuler(
			final Ruler newVerticalRuler, final NotificationChain msgs) {
		return ((FeatureMap.Internal) getRulers()).basicAdd(
				DiPackage.Literals.DIAGRAM__VERTICAL_RULER, newVerticalRuler,
				msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setVerticalRuler(final Ruler newVerticalRuler) {
		((FeatureMap.Internal) getRulers()).set(
				DiPackage.Literals.DIAGRAM__VERTICAL_RULER, newVerticalRuler);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetGrid(final Grid newGrid,
			NotificationChain msgs) {
		final Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DiPackage.DIAGRAM__GRID, oldGrid, newGrid);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setGrid(final Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null) {
				msgs = ((InternalEObject) grid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiPackage.DIAGRAM__GRID, null,
						msgs);
			}
			if (newGrid != null) {
				msgs = ((InternalEObject) newGrid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiPackage.DIAGRAM__GRID, null,
						msgs);
			}
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.DIAGRAM__GRID, newGrid, newGrid));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isSnapToGrid() {
		return snapToGrid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setSnapToGrid(final boolean newSnapToGrid) {
		final boolean oldSnapToGrid = snapToGrid;
		snapToGrid = newSnapToGrid;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.DIAGRAM__SNAP_TO_GRID, oldSnapToGrid, snapToGrid));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isSnapToGeometry() {
		return snapToGeometry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setSnapToGeometry(final boolean newSnapToGeometry) {
		final boolean oldSnapToGeometry = snapToGeometry;
		snapToGeometry = newSnapToGeometry;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.DIAGRAM__SNAP_TO_GEOMETRY, oldSnapToGeometry,
					snapToGeometry));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd,
			final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.DIAGRAM__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd,
					msgs);
		case DiPackage.DIAGRAM__COMMENT_LINKS:
			return ((InternalEList<?>) getCommentLinks()).basicRemove(otherEnd,
					msgs);
		case DiPackage.DIAGRAM__RULERS:
			return ((InternalEList<?>) getRulers()).basicRemove(otherEnd, msgs);
		case DiPackage.DIAGRAM__HORIZONTAL_RULER:
			return basicSetHorizontalRuler(null, msgs);
		case DiPackage.DIAGRAM__VERTICAL_RULER:
			return basicSetVerticalRuler(null, msgs);
		case DiPackage.DIAGRAM__GRID:
			return basicSetGrid(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve,
			final boolean coreType) {
		switch (featureID) {
		case DiPackage.DIAGRAM__COMMENTS:
			return getComments();
		case DiPackage.DIAGRAM__COMMENT_LINKS:
			return getCommentLinks();
		case DiPackage.DIAGRAM__RULERS:
			if (coreType) {
				return getRulers();
			}
			return ((FeatureMap.Internal) getRulers()).getWrapper();
		case DiPackage.DIAGRAM__HORIZONTAL_RULER:
			return getHorizontalRuler();
		case DiPackage.DIAGRAM__VERTICAL_RULER:
			return getVerticalRuler();
		case DiPackage.DIAGRAM__GRID:
			return getGrid();
		case DiPackage.DIAGRAM__SNAP_TO_GRID:
			return isSnapToGrid();
		case DiPackage.DIAGRAM__SNAP_TO_GEOMETRY:
			return isSnapToGeometry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DiPackage.DIAGRAM__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case DiPackage.DIAGRAM__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
			return;
		case DiPackage.DIAGRAM__RULERS:
			((FeatureMap.Internal) getRulers()).set(newValue);
			return;
		case DiPackage.DIAGRAM__HORIZONTAL_RULER:
			setHorizontalRuler((Ruler) newValue);
			return;
		case DiPackage.DIAGRAM__VERTICAL_RULER:
			setVerticalRuler((Ruler) newValue);
			return;
		case DiPackage.DIAGRAM__GRID:
			setGrid((Grid) newValue);
			return;
		case DiPackage.DIAGRAM__SNAP_TO_GRID:
			setSnapToGrid((Boolean) newValue);
			return;
		case DiPackage.DIAGRAM__SNAP_TO_GEOMETRY:
			setSnapToGeometry((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case DiPackage.DIAGRAM__COMMENTS:
			getComments().clear();
			return;
		case DiPackage.DIAGRAM__COMMENT_LINKS:
			getCommentLinks().clear();
			return;
		case DiPackage.DIAGRAM__RULERS:
			getRulers().clear();
			return;
		case DiPackage.DIAGRAM__HORIZONTAL_RULER:
			setHorizontalRuler((Ruler) null);
			return;
		case DiPackage.DIAGRAM__VERTICAL_RULER:
			setVerticalRuler((Ruler) null);
			return;
		case DiPackage.DIAGRAM__GRID:
			setGrid((Grid) null);
			return;
		case DiPackage.DIAGRAM__SNAP_TO_GRID:
			setSnapToGrid(SNAP_TO_GRID_EDEFAULT);
			return;
		case DiPackage.DIAGRAM__SNAP_TO_GEOMETRY:
			setSnapToGeometry(SNAP_TO_GEOMETRY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case DiPackage.DIAGRAM__COMMENTS:
			return !getComments().isEmpty();
		case DiPackage.DIAGRAM__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
		case DiPackage.DIAGRAM__RULERS:
			return rulers != null && !rulers.isEmpty();
		case DiPackage.DIAGRAM__HORIZONTAL_RULER:
			return getHorizontalRuler() != null;
		case DiPackage.DIAGRAM__VERTICAL_RULER:
			return getVerticalRuler() != null;
		case DiPackage.DIAGRAM__GRID:
			return grid != null;
		case DiPackage.DIAGRAM__SNAP_TO_GRID:
			return snapToGrid != SNAP_TO_GRID_EDEFAULT;
		case DiPackage.DIAGRAM__SNAP_TO_GEOMETRY:
			return snapToGeometry != SNAP_TO_GEOMETRY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rulers: ");
		result.append(rulers);
		result.append(", snapToGrid: ");
		result.append(snapToGrid);
		result.append(", snapToGeometry: ");
		result.append(snapToGeometry);
		result.append(')');
		return result.toString();
	}

} // DiagramImpl
