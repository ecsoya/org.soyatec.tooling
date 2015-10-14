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
package org.soyatec.tooling.exml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.exml.EXAttribute;
import org.soyatec.tooling.exml.EXElement;
import org.soyatec.tooling.exml.EXMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.impl.EXElementImpl#getElements <em>
 * Elements</em>}</li>
 * <li>{@link org.soyatec.tooling.exml.impl.EXElementImpl#getAttributes <em>
 * Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXElementImpl extends EXNodeImpl implements EXElement {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EXElement> elements;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EXAttribute> attributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EXElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EXMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EXElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<EXElement>(EXElement.class,
					this, EXMLPackage.ELEMENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EXAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<EXAttribute>(
					EXAttribute.class, this, EXMLPackage.ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EXAttribute getAttribute(final String name) {
		if (name != null) {
			final EList<EXAttribute> attributes = getAttributes();
			for (final EXAttribute attr : attributes) {
				if (name.equals(attr.getName())) {
					return attr;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EXElement> getElementsByName(final String name) {
		final BasicEList<EXElement> elements = new BasicEList<EXElement>();
		if (name != null) {
			final EList<EXElement> children = getElements();
			for (final EXElement e : children) {
				if (name.equals(e.getName())) {
					elements.add(e);
				}
			}
		}
		return elements;
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
		case EXMLPackage.ELEMENT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd,
					msgs);
		case EXMLPackage.ELEMENT__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
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
	public Object eGet(final int featureID, final boolean resolve,
			final boolean coreType) {
		switch (featureID) {
		case EXMLPackage.ELEMENT__ELEMENTS:
			return getElements();
		case EXMLPackage.ELEMENT__ATTRIBUTES:
			return getAttributes();
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
		case EXMLPackage.ELEMENT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends EXElement>) newValue);
			return;
		case EXMLPackage.ELEMENT__ATTRIBUTES:
			getAttributes().clear();
			getAttributes()
					.addAll((Collection<? extends EXAttribute>) newValue);
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
		case EXMLPackage.ELEMENT__ELEMENTS:
			getElements().clear();
			return;
		case EXMLPackage.ELEMENT__ATTRIBUTES:
			getAttributes().clear();
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
		case EXMLPackage.ELEMENT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case EXMLPackage.ELEMENT__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case EXMLPackage.ELEMENT___GET_ATTRIBUTE__STRING:
			return getAttribute((String) arguments.get(0));
		case EXMLPackage.ELEMENT___GET_ELEMENTS_BY_NAME__STRING:
			return getElementsByName((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // EXElementImpl
