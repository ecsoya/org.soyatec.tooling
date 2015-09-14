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
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;
import org.soyatec.tooling.di.Shape;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getOutgoingLines <em>
 * Outgoing Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getIncomingLines <em>
 * Incoming Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ShapeImpl#getCommentLinks <em>Comment
 * Links</em>}</li>
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
	 * The cached value of the '{@link #getOutgoingLines()
	 * <em>Outgoing Lines</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap outgoingLines;

	/**
	 * The cached value of the '{@link #getIncomingLines()
	 * <em>Incoming Lines</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIncomingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap incomingLines;

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
	public FeatureMap getOutgoingLines() {
		if (outgoingLines == null) {
			outgoingLines = new BasicFeatureMap(this,
					DiPackage.SHAPE__OUTGOING_LINES);
		}
		return outgoingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getIncomingLines() {
		if (incomingLines == null) {
			incomingLines = new BasicFeatureMap(this,
					DiPackage.SHAPE__INCOMING_LINES);
		}
		return incomingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getOutgoingLines().list(DiPackage.Literals.NODE__COMMENT_LINKS);
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
		case DiPackage.SHAPE__OUTGOING_LINES:
			return ((InternalEList<?>) getOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.SHAPE__INCOMING_LINES:
			return ((InternalEList<?>) getIncomingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.SHAPE__COMMENT_LINKS:
			return ((InternalEList<?>) getCommentLinks()).basicRemove(otherEnd,
					msgs);
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
		case DiPackage.SHAPE__OUTGOING_LINES:
			if (coreType)
				return getOutgoingLines();
			return ((FeatureMap.Internal) getOutgoingLines()).getWrapper();
		case DiPackage.SHAPE__INCOMING_LINES:
			if (coreType)
				return getIncomingLines();
			return ((FeatureMap.Internal) getIncomingLines()).getWrapper();
		case DiPackage.SHAPE__COMMENT_LINKS:
			return getCommentLinks();
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
		case DiPackage.SHAPE__OUTGOING_LINES:
			((FeatureMap.Internal) getOutgoingLines()).set(newValue);
			return;
		case DiPackage.SHAPE__INCOMING_LINES:
			((FeatureMap.Internal) getIncomingLines()).set(newValue);
			return;
		case DiPackage.SHAPE__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
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
		case DiPackage.SHAPE__OUTGOING_LINES:
			getOutgoingLines().clear();
			return;
		case DiPackage.SHAPE__INCOMING_LINES:
			getIncomingLines().clear();
			return;
		case DiPackage.SHAPE__COMMENT_LINKS:
			getCommentLinks().clear();
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
		case DiPackage.SHAPE__OUTGOING_LINES:
			return outgoingLines != null && !outgoingLines.isEmpty();
		case DiPackage.SHAPE__INCOMING_LINES:
			return incomingLines != null && !incomingLines.isEmpty();
		case DiPackage.SHAPE__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
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
			case DiPackage.SHAPE__OUTGOING_LINES:
				return DiPackage.NODE__OUTGOING_LINES;
			case DiPackage.SHAPE__INCOMING_LINES:
				return DiPackage.NODE__INCOMING_LINES;
			case DiPackage.SHAPE__COMMENT_LINKS:
				return DiPackage.NODE__COMMENT_LINKS;
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
			case DiPackage.NODE__OUTGOING_LINES:
				return DiPackage.SHAPE__OUTGOING_LINES;
			case DiPackage.NODE__INCOMING_LINES:
				return DiPackage.SHAPE__INCOMING_LINES;
			case DiPackage.NODE__COMMENT_LINKS:
				return DiPackage.SHAPE__COMMENT_LINKS;
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
		result.append(" (outgoingLines: ");
		result.append(outgoingLines);
		result.append(", incomingLines: ");
		result.append(incomingLines);
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
