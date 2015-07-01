/**
 */
package org.soyatec.tooling.exml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.soyatec.tooling.exml.EXDocument;
import org.soyatec.tooling.exml.EXElement;
import org.soyatec.tooling.exml.EXMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Document</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.impl.EXDocumentImpl#getElement <em>
 * Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXDocumentImpl extends EXNodeImpl implements EXDocument {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EXElement element;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EXDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EXMLPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXElement getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetElement(EXElement newElement,
			NotificationChain msgs) {
		EXElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EXMLPackage.DOCUMENT__ELEMENT,
					oldElement, newElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setElement(EXElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject) element).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EXMLPackage.DOCUMENT__ELEMENT,
						null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject) newElement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EXMLPackage.DOCUMENT__ELEMENT,
						null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EXMLPackage.DOCUMENT__ELEMENT, newElement, newElement));
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
		case EXMLPackage.DOCUMENT__ELEMENT:
			return basicSetElement(null, msgs);
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
		case EXMLPackage.DOCUMENT__ELEMENT:
			return getElement();
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
		case EXMLPackage.DOCUMENT__ELEMENT:
			setElement((EXElement) newValue);
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
		case EXMLPackage.DOCUMENT__ELEMENT:
			setElement((EXElement) null);
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
		case EXMLPackage.DOCUMENT__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

} // EXDocumentImpl
