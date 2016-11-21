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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.RulerUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ruler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.RulerImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.RulerImpl#getGuides <em>Guides</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RulerImpl extends MinimalEObjectImpl.Container implements Ruler {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final RulerUnit UNIT_EDEFAULT = RulerUnit.INCHES;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected RulerUnit unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuides() <em>Guides</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGuides()
	 * @generated
	 * @ordered
	 */
	protected EList<Guide> guides;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.RULER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RulerUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnit(final RulerUnit newUnit) {
		final RulerUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.RULER__UNIT, oldUnit, unit));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Guide> getGuides() {
		if (guides == null) {
			guides = new EObjectContainmentWithInverseEList<Guide>(Guide.class,
					this, DiPackage.RULER__GUIDES, DiPackage.GUIDE__RULER);
		}
		return guides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd,
			final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.RULER__GUIDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGuides())
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
	public NotificationChain eInverseRemove(final InternalEObject otherEnd,
			final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.RULER__GUIDES:
			return ((InternalEList<?>) getGuides()).basicRemove(otherEnd, msgs);
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
		case DiPackage.RULER__UNIT:
			return getUnit();
		case DiPackage.RULER__GUIDES:
			return getGuides();
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
		case DiPackage.RULER__UNIT:
			setUnit((RulerUnit) newValue);
			return;
		case DiPackage.RULER__GUIDES:
			getGuides().clear();
			getGuides().addAll((Collection<? extends Guide>) newValue);
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
		case DiPackage.RULER__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case DiPackage.RULER__GUIDES:
			getGuides().clear();
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
		case DiPackage.RULER__UNIT:
			return unit != UNIT_EDEFAULT;
		case DiPackage.RULER__GUIDES:
			return guides != null && !guides.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} // RulerImpl
