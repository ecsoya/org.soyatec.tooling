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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.GradientShape;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Gradient Shape</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.GradientShapeImpl#isUsingGradient <em>
 * Using Gradient</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GradientShapeImpl#getGradientColor
 * <em>Gradient Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GradientShapeImpl#isVerticalGradient
 * <em>Vertical Gradient</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GradientShapeImpl extends ShapeImpl implements GradientShape {
	/**
	 * The default value of the '{@link #isUsingGradient()
	 * <em>Using Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isUsingGradient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USING_GRADIENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUsingGradient()
	 * <em>Using Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isUsingGradient()
	 * @generated
	 * @ordered
	 */
	protected boolean usingGradient = USING_GRADIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientColor()
	 * <em>Gradient Color</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getGradientColor()
	 * @generated
	 * @ordered
	 */
	protected static final int GRADIENT_COLOR_EDEFAULT = 16777215;

	/**
	 * The cached value of the '{@link #getGradientColor()
	 * <em>Gradient Color</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getGradientColor()
	 * @generated
	 * @ordered
	 */
	protected int gradientColor = GRADIENT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalGradient()
	 * <em>Vertical Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isVerticalGradient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_GRADIENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVerticalGradient()
	 * <em>Vertical Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isVerticalGradient()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalGradient = VERTICAL_GRADIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GradientShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.GRADIENT_SHAPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isUsingGradient() {
		return usingGradient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUsingGradient(final boolean newUsingGradient) {
		final boolean oldUsingGradient = usingGradient;
		usingGradient = newUsingGradient;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GRADIENT_SHAPE__USING_GRADIENT, oldUsingGradient,
					usingGradient));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getGradientColor() {
		return gradientColor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGradientColor(final int newGradientColor) {
		final int oldGradientColor = gradientColor;
		gradientColor = newGradientColor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GRADIENT_SHAPE__GRADIENT_COLOR, oldGradientColor,
					gradientColor));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isVerticalGradient() {
		return verticalGradient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVerticalGradient(final boolean newVerticalGradient) {
		final boolean oldVerticalGradient = verticalGradient;
		verticalGradient = newVerticalGradient;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GRADIENT_SHAPE__VERTICAL_GRADIENT,
					oldVerticalGradient, verticalGradient));
		}
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
		case DiPackage.GRADIENT_SHAPE__USING_GRADIENT:
			return isUsingGradient();
		case DiPackage.GRADIENT_SHAPE__GRADIENT_COLOR:
			return getGradientColor();
		case DiPackage.GRADIENT_SHAPE__VERTICAL_GRADIENT:
			return isVerticalGradient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DiPackage.GRADIENT_SHAPE__USING_GRADIENT:
			setUsingGradient((Boolean) newValue);
			return;
		case DiPackage.GRADIENT_SHAPE__GRADIENT_COLOR:
			setGradientColor((Integer) newValue);
			return;
		case DiPackage.GRADIENT_SHAPE__VERTICAL_GRADIENT:
			setVerticalGradient((Boolean) newValue);
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
		case DiPackage.GRADIENT_SHAPE__USING_GRADIENT:
			setUsingGradient(USING_GRADIENT_EDEFAULT);
			return;
		case DiPackage.GRADIENT_SHAPE__GRADIENT_COLOR:
			setGradientColor(GRADIENT_COLOR_EDEFAULT);
			return;
		case DiPackage.GRADIENT_SHAPE__VERTICAL_GRADIENT:
			setVerticalGradient(VERTICAL_GRADIENT_EDEFAULT);
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
		case DiPackage.GRADIENT_SHAPE__USING_GRADIENT:
			return usingGradient != USING_GRADIENT_EDEFAULT;
		case DiPackage.GRADIENT_SHAPE__GRADIENT_COLOR:
			return gradientColor != GRADIENT_COLOR_EDEFAULT;
		case DiPackage.GRADIENT_SHAPE__VERTICAL_GRADIENT:
			return verticalGradient != VERTICAL_GRADIENT_EDEFAULT;
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
		result.append(" (usingGradient: ");
		result.append(usingGradient);
		result.append(", gradientColor: ");
		result.append(gradientColor);
		result.append(", verticalGradient: ");
		result.append(verticalGradient);
		result.append(')');
		return result.toString();
	}

} // GradientShapeImpl
