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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.UIElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.UIElementImpl#getElement <em>Element
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.UIElementImpl#getOutgoingLines <em>
 * Outgoing Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.UIElementImpl#getIncomingLines <em>
 * Incoming Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.UIElementImpl#getCommentLinks <em>
 * Comment Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIElementImpl extends UIObjectImpl implements UIElement {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UIElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.UI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiPackage.UI_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.UI_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getOutgoingLines() {
		if (outgoingLines == null) {
			outgoingLines = new BasicFeatureMap(this,
					DiPackage.UI_ELEMENT__OUTGOING_LINES);
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
					DiPackage.UI_ELEMENT__INCOMING_LINES);
		}
		return incomingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getOutgoingLines().list(
				DiPackage.Literals.UI_ELEMENT__COMMENT_LINKS);
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
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
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
		case DiPackage.UI_ELEMENT__OUTGOING_LINES:
			return ((InternalEList<?>) getOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.UI_ELEMENT__INCOMING_LINES:
			return ((InternalEList<?>) getIncomingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
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
		case DiPackage.UI_ELEMENT__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
		case DiPackage.UI_ELEMENT__OUTGOING_LINES:
			if (coreType)
				return getOutgoingLines();
			return ((FeatureMap.Internal) getOutgoingLines()).getWrapper();
		case DiPackage.UI_ELEMENT__INCOMING_LINES:
			if (coreType)
				return getIncomingLines();
			return ((FeatureMap.Internal) getIncomingLines()).getWrapper();
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
			return getCommentLinks();
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
		case DiPackage.UI_ELEMENT__ELEMENT:
			setElement((EObject) newValue);
			return;
		case DiPackage.UI_ELEMENT__OUTGOING_LINES:
			((FeatureMap.Internal) getOutgoingLines()).set(newValue);
			return;
		case DiPackage.UI_ELEMENT__INCOMING_LINES:
			((FeatureMap.Internal) getIncomingLines()).set(newValue);
			return;
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
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
		case DiPackage.UI_ELEMENT__ELEMENT:
			setElement((EObject) null);
			return;
		case DiPackage.UI_ELEMENT__OUTGOING_LINES:
			getOutgoingLines().clear();
			return;
		case DiPackage.UI_ELEMENT__INCOMING_LINES:
			getIncomingLines().clear();
			return;
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
			getCommentLinks().clear();
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
		case DiPackage.UI_ELEMENT__ELEMENT:
			return element != null;
		case DiPackage.UI_ELEMENT__OUTGOING_LINES:
			return outgoingLines != null && !outgoingLines.isEmpty();
		case DiPackage.UI_ELEMENT__INCOMING_LINES:
			return incomingLines != null && !incomingLines.isEmpty();
		case DiPackage.UI_ELEMENT__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
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
		result.append(" (outgoingLines: ");
		result.append(outgoingLines);
		result.append(", incomingLines: ");
		result.append(incomingLines);
		result.append(')');
		return result.toString();
	}

} // UIElementImpl
