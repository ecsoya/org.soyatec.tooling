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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.LineStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Grid</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.GridImpl#getColor <em>Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GridImpl#getSpacing <em>Spacing</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GridImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridImpl extends MinimalEObjectImpl.Container implements Grid {
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
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int SPACING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected int spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle STYLE_EDEFAULT = LineStyle.SOLID;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.GRID;
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
					DiPackage.GRID__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpacing(int newSpacing) {
		int oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GRID__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LineStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStyle(LineStyle newStyle) {
		LineStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GRID__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiPackage.GRID__COLOR:
			return getColor();
		case DiPackage.GRID__SPACING:
			return getSpacing();
		case DiPackage.GRID__STYLE:
			return getStyle();
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
		case DiPackage.GRID__COLOR:
			setColor((Integer) newValue);
			return;
		case DiPackage.GRID__SPACING:
			setSpacing((Integer) newValue);
			return;
		case DiPackage.GRID__STYLE:
			setStyle((LineStyle) newValue);
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
		case DiPackage.GRID__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case DiPackage.GRID__SPACING:
			setSpacing(SPACING_EDEFAULT);
			return;
		case DiPackage.GRID__STYLE:
			setStyle(STYLE_EDEFAULT);
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
		case DiPackage.GRID__COLOR:
			return color != COLOR_EDEFAULT;
		case DiPackage.GRID__SPACING:
			return spacing != SPACING_EDEFAULT;
		case DiPackage.GRID__STYLE:
			return style != STYLE_EDEFAULT;
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
		result.append(", spacing: ");
		result.append(spacing);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} // GridImpl
