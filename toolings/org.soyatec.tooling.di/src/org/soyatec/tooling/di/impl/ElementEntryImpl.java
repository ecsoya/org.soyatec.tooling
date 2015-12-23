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
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.View;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.ElementEntryImpl#getTypedKey <em>Key
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ElementEntryImpl#getTypedValue <em>
 * Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementEntryImpl extends MinimalEObjectImpl.Container implements
        BasicEMap.Entry<View, Alignment> {
    /**
     * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected View key;

    /**
     * The default value of the '{@link #getTypedValue() <em>Value</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected static final Alignment VALUE_EDEFAULT = Alignment.LEFT;

    /**
     * The cached value of the '{@link #getTypedValue() <em>Value</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected Alignment value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ElementEntryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiPackage.Literals.ELEMENT_ENTRY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public View getTypedKey() {
        if (key != null && key.eIsProxy()) {
            final InternalEObject oldKey = (InternalEObject) key;
            key = (View) eResolveProxy(oldKey);
            if (key != oldKey) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DiPackage.ELEMENT_ENTRY__KEY, oldKey, key));
                }
            }
        }
        return key;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public View basicGetTypedKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTypedKey(final View newKey) {
        final View oldKey = key;
        key = newKey;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DiPackage.ELEMENT_ENTRY__KEY, oldKey, key));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Alignment getTypedValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTypedValue(final Alignment newValue) {
        final Alignment oldValue = value;
        value = newValue == null ? VALUE_EDEFAULT : newValue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DiPackage.ELEMENT_ENTRY__VALUE, oldValue, value));
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
        case DiPackage.ELEMENT_ENTRY__KEY:
            if (resolve) {
                return getTypedKey();
            }
            return basicGetTypedKey();
        case DiPackage.ELEMENT_ENTRY__VALUE:
            return getTypedValue();
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
        case DiPackage.ELEMENT_ENTRY__KEY:
            setTypedKey((View) newValue);
            return;
        case DiPackage.ELEMENT_ENTRY__VALUE:
            setTypedValue((Alignment) newValue);
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
        case DiPackage.ELEMENT_ENTRY__KEY:
            setTypedKey((View) null);
            return;
        case DiPackage.ELEMENT_ENTRY__VALUE:
            setTypedValue(VALUE_EDEFAULT);
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
        case DiPackage.ELEMENT_ENTRY__KEY:
            return key != null;
        case DiPackage.ELEMENT_ENTRY__VALUE:
            return value != VALUE_EDEFAULT;
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
        result.append(" (value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected int hash = -1;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public int getHash() {
        if (hash == -1) {
            final Object theKey = getKey();
            hash = (theKey == null ? 0 : theKey.hashCode());
        }
        return hash;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setHash(final int hash) {
        this.hash = hash;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public View getKey() {
        return getTypedKey();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void setKey(final View key) {
        setTypedKey(key);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Alignment getValue() {
        return getTypedValue();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Alignment setValue(final Alignment value) {
        final Alignment oldValue = getValue();
        setTypedValue(value);
        return oldValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EMap<View, Alignment> getEMap() {
        final EObject container = eContainer();
        return container == null ? null : (EMap<View, Alignment>) container
                .eGet(eContainmentFeature());
    }

} // ElementEntryImpl
