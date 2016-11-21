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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.ConnectorImpl#getTarget <em>Target
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ConnectorImpl#getSource <em>Source
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ConnectorImpl#getReverseElement <em>
 * Reverse Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConnectorImpl extends LineImpl implements Connector {
	/**
	 * The cached value of the '{@link #getReverseElement()
	 * <em>Reverse Element</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReverseElement()
	 * @generated
	 * @ordered
	 */
	protected EObject reverseElement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getTarget() {
		final Node target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Node) eResolveProxy((InternalEObject) target)
				: target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node) getTargetNode().get(DiPackage.Literals.CONNECTOR__TARGET,
				false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTarget(final Node newTarget) {
		((FeatureMap.Internal) getTargetNode()).set(
				DiPackage.Literals.CONNECTOR__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getSource() {
		final Node source = basicGetSource();
		return source != null && source.eIsProxy() ? (Node) eResolveProxy((InternalEObject) source)
				: source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetSource() {
		return (Node) getSourceNode().get(DiPackage.Literals.CONNECTOR__SOURCE,
				false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(final Node newSource) {
		((FeatureMap.Internal) getSourceNode()).set(
				DiPackage.Literals.CONNECTOR__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getReverseElement() {
		if (reverseElement != null && reverseElement.eIsProxy()) {
			final InternalEObject oldReverseElement = (InternalEObject) reverseElement;
			reverseElement = eResolveProxy(oldReverseElement);
			if (reverseElement != oldReverseElement) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiPackage.CONNECTOR__REVERSE_ELEMENT,
							oldReverseElement, reverseElement));
				}
			}
		}
		return reverseElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetReverseElement() {
		return reverseElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReverseElement(final EObject newReverseElement) {
		final EObject oldReverseElement = reverseElement;
		reverseElement = newReverseElement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.CONNECTOR__REVERSE_ELEMENT, oldReverseElement,
					reverseElement));
		}
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
		case DiPackage.CONNECTOR__TARGET:
			final Node target = basicGetTarget();
			if (target != null) {
				msgs = ((InternalEObject) target).eInverseRemove(this,
						DiPackage.NODE__INCOMING_LINES, Node.class, msgs);
			}
			return basicSetTarget((Node) otherEnd, msgs);
		case DiPackage.CONNECTOR__SOURCE:
			final Node source = basicGetSource();
			if (source != null) {
				msgs = ((InternalEObject) source).eInverseRemove(this,
						DiPackage.NODE__OUTGOING_LINES, Node.class, msgs);
			}
			return basicSetSource((Node) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	private NotificationChain basicSetSource(final Node newSource,
			NotificationChain msgs) {
		final Node oldSource = basicGetSource();
		setSource(newSource);
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DiPackage.CONNECTOR__SOURCE, oldSource,
					newSource);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	private NotificationChain basicSetTarget(final Node newTarget,
			NotificationChain msgs) {
		final Node oldTarget = basicGetTarget();
		setTarget(newTarget);
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DiPackage.CONNECTOR__TARGET, oldTarget,
					newTarget);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
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
		case DiPackage.CONNECTOR__TARGET:
			return basicSetTarget(null, msgs);
		case DiPackage.CONNECTOR__SOURCE:
			return basicSetSource(null, msgs);
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
		case DiPackage.CONNECTOR__TARGET:
			if (resolve) {
				return getTarget();
			}
			return basicGetTarget();
		case DiPackage.CONNECTOR__SOURCE:
			if (resolve) {
				return getSource();
			}
			return basicGetSource();
		case DiPackage.CONNECTOR__REVERSE_ELEMENT:
			if (resolve) {
				return getReverseElement();
			}
			return basicGetReverseElement();
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
		case DiPackage.CONNECTOR__TARGET:
			setTarget((Node) newValue);
			return;
		case DiPackage.CONNECTOR__SOURCE:
			setSource((Node) newValue);
			return;
		case DiPackage.CONNECTOR__REVERSE_ELEMENT:
			setReverseElement((EObject) newValue);
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
		case DiPackage.CONNECTOR__TARGET:
			setTarget((Node) null);
			return;
		case DiPackage.CONNECTOR__SOURCE:
			setSource((Node) null);
			return;
		case DiPackage.CONNECTOR__REVERSE_ELEMENT:
			setReverseElement((EObject) null);
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
		case DiPackage.CONNECTOR__TARGET:
			return basicGetTarget() != null;
		case DiPackage.CONNECTOR__SOURCE:
			return basicGetSource() != null;
		case DiPackage.CONNECTOR__REVERSE_ELEMENT:
			return reverseElement != null;
		}
		return super.eIsSet(featureID);
	}

} // ConnectorImpl
