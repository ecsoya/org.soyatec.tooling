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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.View;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Guide</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.GuideImpl#getRuler <em>Ruler</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GuideImpl#getPosition <em>Position
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.GuideImpl#getElementMap <em>Element
 * Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuideImpl extends MinimalEObjectImpl.Container implements Guide {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementMap() <em>Element Map</em>}'
	 * map. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getElementMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<View, Alignment> elementMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected GuideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.GUIDE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Ruler getRuler() {
		if (eContainerFeatureID() != DiPackage.GUIDE__RULER) {
			return null;
		}
		return (Ruler) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetRuler(final Ruler newRuler,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRuler,
				DiPackage.GUIDE__RULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setRuler(final Ruler newRuler) {
		if (newRuler != eInternalContainer()
				|| (eContainerFeatureID() != DiPackage.GUIDE__RULER && newRuler != null)) {
			if (EcoreUtil.isAncestor(this, newRuler)) {
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newRuler != null) {
				msgs = ((InternalEObject) newRuler).eInverseAdd(this,
						DiPackage.RULER__GUIDES, Ruler.class, msgs);
			}
			msgs = basicSetRuler(newRuler, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GUIDE__RULER, newRuler, newRuler));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setPosition(final int newPosition) {
		final int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.GUIDE__POSITION, oldPosition, position));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EMap<View, Alignment> getElementMap() {
		if (elementMap == null) {
			elementMap = new EcoreEMap<View, Alignment>(
					DiPackage.Literals.ELEMENT_ENTRY, ElementEntryImpl.class,
					this, DiPackage.GUIDE__ELEMENT_MAP);
		}
		return elementMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd,
			final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.GUIDE__RULER:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetRuler((Ruler) otherEnd, msgs);
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
		case DiPackage.GUIDE__RULER:
			return basicSetRuler(null, msgs);
		case DiPackage.GUIDE__ELEMENT_MAP:
			return ((InternalEList<?>) getElementMap()).basicRemove(otherEnd,
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DiPackage.GUIDE__RULER:
			return eInternalContainer().eInverseRemove(this,
					DiPackage.RULER__GUIDES, Ruler.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
		case DiPackage.GUIDE__RULER:
			return getRuler();
		case DiPackage.GUIDE__POSITION:
			return getPosition();
		case DiPackage.GUIDE__ELEMENT_MAP:
			if (coreType) {
				return getElementMap();
			} else {
				return getElementMap().map();
			}
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
		case DiPackage.GUIDE__RULER:
			setRuler((Ruler) newValue);
			return;
		case DiPackage.GUIDE__POSITION:
			setPosition((Integer) newValue);
			return;
		case DiPackage.GUIDE__ELEMENT_MAP:
			((EStructuralFeature.Setting) getElementMap()).set(newValue);
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
		case DiPackage.GUIDE__RULER:
			setRuler((Ruler) null);
			return;
		case DiPackage.GUIDE__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case DiPackage.GUIDE__ELEMENT_MAP:
			getElementMap().clear();
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
		case DiPackage.GUIDE__RULER:
			return getRuler() != null;
		case DiPackage.GUIDE__POSITION:
			return position != POSITION_EDEFAULT;
		case DiPackage.GUIDE__ELEMENT_MAP:
			return elementMap != null && !elementMap.isEmpty();
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} // GuideImpl
