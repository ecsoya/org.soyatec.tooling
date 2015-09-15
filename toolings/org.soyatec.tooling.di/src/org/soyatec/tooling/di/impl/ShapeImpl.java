/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
/**
 */
package org.soyatec.tooling.di.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;
import org.soyatec.tooling.di.Shape;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getAllOutgoingLines <em>All
 * Outgoing Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getAllIncomingLines <em>All
 * Incoming Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getCommentLinks <em>Comment
 * Links</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getOutgoingLines <em>
 * Outgoing Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getIncomingLines <em>
 * Incoming Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getBackground <em>Background
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getForeground <em>Foreground
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends ContainerImpl implements Shape {
	/**
	 * The cached value of the '{@link #getAllOutgoingLines()
	 * <em>All Outgoing Lines</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allOutgoingLines;

	/**
	 * The cached value of the '{@link #getAllIncomingLines()
	 * <em>All Incoming Lines</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllIncomingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allIncomingLines;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKGROUND_EDEFAULT = 16777215;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected int background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final int FOREGROUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected int foreground = FOREGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBounds() <em>Bounds</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle BOUNDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Rectangle bounds = BOUNDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAllOutgoingLines() {
		if (allOutgoingLines == null) {
			allOutgoingLines = new BasicFeatureMap(this,
					DiPackage.SHAPE__ALL_OUTGOING_LINES);
		}
		return allOutgoingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAllIncomingLines() {
		if (allIncomingLines == null) {
			allIncomingLines = new BasicFeatureMap(this,
					DiPackage.SHAPE__ALL_INCOMING_LINES);
		}
		return allIncomingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getAllOutgoingLines().list(
				DiPackage.Literals.NODE__COMMENT_LINKS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Connector> getOutgoingLines() {
		return getAllOutgoingLines().list(
				DiPackage.Literals.NODE__OUTGOING_LINES);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Connector> getIncomingLines() {
		return getAllIncomingLines().list(
				DiPackage.Literals.NODE__INCOMING_LINES);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBackground(int newBackground) {
		int oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.SHAPE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setForeground(int newForeground) {
		int oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.SHAPE__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Rectangle getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBounds(Rectangle newBounds) {
		Rectangle oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.SHAPE__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.SHAPE__COMMENT_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommentLinks())
					.basicAdd(otherEnd, msgs);
		case DiPackage.SHAPE__OUTGOING_LINES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingLines())
					.basicAdd(otherEnd, msgs);
		case DiPackage.SHAPE__INCOMING_LINES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingLines())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.SHAPE__ALL_OUTGOING_LINES:
			return ((InternalEList<?>) getAllOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.SHAPE__ALL_INCOMING_LINES:
			return ((InternalEList<?>) getAllIncomingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.SHAPE__COMMENT_LINKS:
			return ((InternalEList<?>) getCommentLinks()).basicRemove(otherEnd,
					msgs);
		case DiPackage.SHAPE__OUTGOING_LINES:
			return ((InternalEList<?>) getOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.SHAPE__INCOMING_LINES:
			return ((InternalEList<?>) getIncomingLines()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiPackage.SHAPE__ALL_OUTGOING_LINES:
			if (coreType)
				return getAllOutgoingLines();
			return ((FeatureMap.Internal) getAllOutgoingLines()).getWrapper();
		case DiPackage.SHAPE__ALL_INCOMING_LINES:
			if (coreType)
				return getAllIncomingLines();
			return ((FeatureMap.Internal) getAllIncomingLines()).getWrapper();
		case DiPackage.SHAPE__COMMENT_LINKS:
			return getCommentLinks();
		case DiPackage.SHAPE__OUTGOING_LINES:
			return getOutgoingLines();
		case DiPackage.SHAPE__INCOMING_LINES:
			return getIncomingLines();
		case DiPackage.SHAPE__BACKGROUND:
			return getBackground();
		case DiPackage.SHAPE__FOREGROUND:
			return getForeground();
		case DiPackage.SHAPE__BOUNDS:
			return getBounds();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiPackage.SHAPE__ALL_OUTGOING_LINES:
			((FeatureMap.Internal) getAllOutgoingLines()).set(newValue);
			return;
		case DiPackage.SHAPE__ALL_INCOMING_LINES:
			((FeatureMap.Internal) getAllIncomingLines()).set(newValue);
			return;
		case DiPackage.SHAPE__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
			return;
		case DiPackage.SHAPE__OUTGOING_LINES:
			getOutgoingLines().clear();
			getOutgoingLines().addAll(
					(Collection<? extends Connector>) newValue);
			return;
		case DiPackage.SHAPE__INCOMING_LINES:
			getIncomingLines().clear();
			getIncomingLines().addAll(
					(Collection<? extends Connector>) newValue);
			return;
		case DiPackage.SHAPE__BACKGROUND:
			setBackground((Integer) newValue);
			return;
		case DiPackage.SHAPE__FOREGROUND:
			setForeground((Integer) newValue);
			return;
		case DiPackage.SHAPE__BOUNDS:
			setBounds((Rectangle) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiPackage.SHAPE__ALL_OUTGOING_LINES:
			getAllOutgoingLines().clear();
			return;
		case DiPackage.SHAPE__ALL_INCOMING_LINES:
			getAllIncomingLines().clear();
			return;
		case DiPackage.SHAPE__COMMENT_LINKS:
			getCommentLinks().clear();
			return;
		case DiPackage.SHAPE__OUTGOING_LINES:
			getOutgoingLines().clear();
			return;
		case DiPackage.SHAPE__INCOMING_LINES:
			getIncomingLines().clear();
			return;
		case DiPackage.SHAPE__BACKGROUND:
			setBackground(BACKGROUND_EDEFAULT);
			return;
		case DiPackage.SHAPE__FOREGROUND:
			setForeground(FOREGROUND_EDEFAULT);
			return;
		case DiPackage.SHAPE__BOUNDS:
			setBounds(BOUNDS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiPackage.SHAPE__ALL_OUTGOING_LINES:
			return allOutgoingLines != null && !allOutgoingLines.isEmpty();
		case DiPackage.SHAPE__ALL_INCOMING_LINES:
			return allIncomingLines != null && !allIncomingLines.isEmpty();
		case DiPackage.SHAPE__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
		case DiPackage.SHAPE__OUTGOING_LINES:
			return !getOutgoingLines().isEmpty();
		case DiPackage.SHAPE__INCOMING_LINES:
			return !getIncomingLines().isEmpty();
		case DiPackage.SHAPE__BACKGROUND:
			return background != BACKGROUND_EDEFAULT;
		case DiPackage.SHAPE__FOREGROUND:
			return foreground != FOREGROUND_EDEFAULT;
		case DiPackage.SHAPE__BOUNDS:
			return BOUNDS_EDEFAULT == null ? bounds != null : !BOUNDS_EDEFAULT
					.equals(bounds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
			case DiPackage.SHAPE__ALL_OUTGOING_LINES:
				return DiPackage.NODE__ALL_OUTGOING_LINES;
			case DiPackage.SHAPE__ALL_INCOMING_LINES:
				return DiPackage.NODE__ALL_INCOMING_LINES;
			case DiPackage.SHAPE__COMMENT_LINKS:
				return DiPackage.NODE__COMMENT_LINKS;
			case DiPackage.SHAPE__OUTGOING_LINES:
				return DiPackage.NODE__OUTGOING_LINES;
			case DiPackage.SHAPE__INCOMING_LINES:
				return DiPackage.NODE__INCOMING_LINES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
			case DiPackage.NODE__ALL_OUTGOING_LINES:
				return DiPackage.SHAPE__ALL_OUTGOING_LINES;
			case DiPackage.NODE__ALL_INCOMING_LINES:
				return DiPackage.SHAPE__ALL_INCOMING_LINES;
			case DiPackage.NODE__COMMENT_LINKS:
				return DiPackage.SHAPE__COMMENT_LINKS;
			case DiPackage.NODE__OUTGOING_LINES:
				return DiPackage.SHAPE__OUTGOING_LINES;
			case DiPackage.NODE__INCOMING_LINES:
				return DiPackage.SHAPE__INCOMING_LINES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allOutgoingLines: ");
		result.append(allOutgoingLines);
		result.append(", allIncomingLines: ");
		result.append(allIncomingLines);
		result.append(", background: ");
		result.append(background);
		result.append(", foreground: ");
		result.append(foreground);
		result.append(", bounds: ");
		result.append(bounds);
		result.append(')');
		return result.toString();
	}

} // ShapeImpl
