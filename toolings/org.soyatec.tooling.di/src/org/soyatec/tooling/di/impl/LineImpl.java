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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Line;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Line</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getColor <em>Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getWidth <em>Width</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getSourceAnchor <em>Source
 * Anchor</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getTargetAnchor <em>Target
 * Anchor</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getSourceShape <em>Source
 * Shape</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getTargetShape <em>Target
 * Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LineImpl extends UIElementImpl implements Line {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAnchor()
	 * <em>Source Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ANCHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAnchor()
	 * <em>Source Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSourceAnchor()
	 * @generated
	 * @ordered
	 */
	protected String sourceAnchor = SOURCE_ANCHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetAnchor()
	 * <em>Target Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ANCHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAnchor()
	 * <em>Target Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetAnchor()
	 * @generated
	 * @ordered
	 */
	protected String targetAnchor = TARGET_ANCHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceShape() <em>Source Shape</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceShape()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sourceShape;

	/**
	 * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetShape()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap targetShape;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceAnchor() {
		return sourceAnchor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceAnchor(String newSourceAnchor) {
		String oldSourceAnchor = sourceAnchor;
		sourceAnchor = newSourceAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__SOURCE_ANCHOR, oldSourceAnchor,
					sourceAnchor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTargetAnchor() {
		return targetAnchor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTargetAnchor(String newTargetAnchor) {
		String oldTargetAnchor = targetAnchor;
		targetAnchor = newTargetAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__TARGET_ANCHOR, oldTargetAnchor,
					targetAnchor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getSourceShape() {
		if (sourceShape == null) {
			sourceShape = new BasicFeatureMap(this,
					DiPackage.LINE__SOURCE_SHAPE);
		}
		return sourceShape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getTargetShape() {
		if (targetShape == null) {
			targetShape = new BasicFeatureMap(this,
					DiPackage.LINE__TARGET_SHAPE);
		}
		return targetShape;
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
		case DiPackage.LINE__SOURCE_SHAPE:
			return ((InternalEList<?>) getSourceShape()).basicRemove(otherEnd,
					msgs);
		case DiPackage.LINE__TARGET_SHAPE:
			return ((InternalEList<?>) getTargetShape()).basicRemove(otherEnd,
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
		case DiPackage.LINE__COLOR:
			return getColor();
		case DiPackage.LINE__WIDTH:
			return getWidth();
		case DiPackage.LINE__SOURCE_ANCHOR:
			return getSourceAnchor();
		case DiPackage.LINE__TARGET_ANCHOR:
			return getTargetAnchor();
		case DiPackage.LINE__SOURCE_SHAPE:
			if (coreType)
				return getSourceShape();
			return ((FeatureMap.Internal) getSourceShape()).getWrapper();
		case DiPackage.LINE__TARGET_SHAPE:
			if (coreType)
				return getTargetShape();
			return ((FeatureMap.Internal) getTargetShape()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiPackage.LINE__COLOR:
			setColor((Integer) newValue);
			return;
		case DiPackage.LINE__WIDTH:
			setWidth((Integer) newValue);
			return;
		case DiPackage.LINE__SOURCE_ANCHOR:
			setSourceAnchor((String) newValue);
			return;
		case DiPackage.LINE__TARGET_ANCHOR:
			setTargetAnchor((String) newValue);
			return;
		case DiPackage.LINE__SOURCE_SHAPE:
			((FeatureMap.Internal) getSourceShape()).set(newValue);
			return;
		case DiPackage.LINE__TARGET_SHAPE:
			((FeatureMap.Internal) getTargetShape()).set(newValue);
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
		case DiPackage.LINE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case DiPackage.LINE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case DiPackage.LINE__SOURCE_ANCHOR:
			setSourceAnchor(SOURCE_ANCHOR_EDEFAULT);
			return;
		case DiPackage.LINE__TARGET_ANCHOR:
			setTargetAnchor(TARGET_ANCHOR_EDEFAULT);
			return;
		case DiPackage.LINE__SOURCE_SHAPE:
			getSourceShape().clear();
			return;
		case DiPackage.LINE__TARGET_SHAPE:
			getTargetShape().clear();
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
		case DiPackage.LINE__COLOR:
			return color != COLOR_EDEFAULT;
		case DiPackage.LINE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case DiPackage.LINE__SOURCE_ANCHOR:
			return SOURCE_ANCHOR_EDEFAULT == null ? sourceAnchor != null
					: !SOURCE_ANCHOR_EDEFAULT.equals(sourceAnchor);
		case DiPackage.LINE__TARGET_ANCHOR:
			return TARGET_ANCHOR_EDEFAULT == null ? targetAnchor != null
					: !TARGET_ANCHOR_EDEFAULT.equals(targetAnchor);
		case DiPackage.LINE__SOURCE_SHAPE:
			return sourceShape != null && !sourceShape.isEmpty();
		case DiPackage.LINE__TARGET_SHAPE:
			return targetShape != null && !targetShape.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", width: ");
		result.append(width);
		result.append(", sourceAnchor: ");
		result.append(sourceAnchor);
		result.append(", targetAnchor: ");
		result.append(targetAnchor);
		result.append(", sourceShape: ");
		result.append(sourceShape);
		result.append(", targetShape: ");
		result.append(targetShape);
		result.append(')');
		return result.toString();
	}

} // LineImpl
