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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getAllOutgoingLines <em>All
 * Outgoing Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getAllIncomingLines <em>All
 * Incoming Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getCommentLinks <em>Comment
 * Links</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getOutgoingLines <em>Outgoing
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getIncomingLines <em>Incoming
 * Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends ViewImpl implements Node {
	/**
	 * The cached value of the '{@link #getAllOutgoingLines()
	 * <em>All Outgoing Lines</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAllOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allOutgoingLines;

	/**
	 * The cached value of the '{@link #getAllIncomingLines()
	 * <em>All Incoming Lines</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAllIncomingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allIncomingLines;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FeatureMap getAllOutgoingLines() {
		if (allOutgoingLines == null) {
			allOutgoingLines = new BasicFeatureMap(this,
					DiPackage.NODE__ALL_OUTGOING_LINES);
		}
		return allOutgoingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FeatureMap getAllIncomingLines() {
		if (allIncomingLines == null) {
			allIncomingLines = new BasicFeatureMap(this,
					DiPackage.NODE__ALL_INCOMING_LINES);
		}
		return allIncomingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getAllOutgoingLines().list(
				DiPackage.Literals.NODE__COMMENT_LINKS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<Connector> getOutgoingLines() {
		return getAllOutgoingLines().list(
				DiPackage.Literals.NODE__OUTGOING_LINES);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<Connector> getIncomingLines() {
		return getAllIncomingLines().list(
				DiPackage.Literals.NODE__INCOMING_LINES);
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
		case DiPackage.NODE__COMMENT_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommentLinks())
					.basicAdd(otherEnd, msgs);
		case DiPackage.NODE__OUTGOING_LINES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingLines())
					.basicAdd(otherEnd, msgs);
		case DiPackage.NODE__INCOMING_LINES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingLines())
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
		case DiPackage.NODE__ALL_OUTGOING_LINES:
			return ((InternalEList<?>) getAllOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.NODE__ALL_INCOMING_LINES:
			return ((InternalEList<?>) getAllIncomingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.NODE__COMMENT_LINKS:
			return ((InternalEList<?>) getCommentLinks()).basicRemove(otherEnd,
					msgs);
		case DiPackage.NODE__OUTGOING_LINES:
			return ((InternalEList<?>) getOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.NODE__INCOMING_LINES:
			return ((InternalEList<?>) getIncomingLines()).basicRemove(
					otherEnd, msgs);
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
		case DiPackage.NODE__ALL_OUTGOING_LINES:
			if (coreType) {
				return getAllOutgoingLines();
			}
			return ((FeatureMap.Internal) getAllOutgoingLines()).getWrapper();
		case DiPackage.NODE__ALL_INCOMING_LINES:
			if (coreType) {
				return getAllIncomingLines();
			}
			return ((FeatureMap.Internal) getAllIncomingLines()).getWrapper();
		case DiPackage.NODE__COMMENT_LINKS:
			return getCommentLinks();
		case DiPackage.NODE__OUTGOING_LINES:
			return getOutgoingLines();
		case DiPackage.NODE__INCOMING_LINES:
			return getIncomingLines();
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
		case DiPackage.NODE__ALL_OUTGOING_LINES:
			((FeatureMap.Internal) getAllOutgoingLines()).set(newValue);
			return;
		case DiPackage.NODE__ALL_INCOMING_LINES:
			((FeatureMap.Internal) getAllIncomingLines()).set(newValue);
			return;
		case DiPackage.NODE__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
			return;
		case DiPackage.NODE__OUTGOING_LINES:
			getOutgoingLines().clear();
			getOutgoingLines().addAll(
					(Collection<? extends Connector>) newValue);
			return;
		case DiPackage.NODE__INCOMING_LINES:
			getIncomingLines().clear();
			getIncomingLines().addAll(
					(Collection<? extends Connector>) newValue);
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
		case DiPackage.NODE__ALL_OUTGOING_LINES:
			getAllOutgoingLines().clear();
			return;
		case DiPackage.NODE__ALL_INCOMING_LINES:
			getAllIncomingLines().clear();
			return;
		case DiPackage.NODE__COMMENT_LINKS:
			getCommentLinks().clear();
			return;
		case DiPackage.NODE__OUTGOING_LINES:
			getOutgoingLines().clear();
			return;
		case DiPackage.NODE__INCOMING_LINES:
			getIncomingLines().clear();
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
		case DiPackage.NODE__ALL_OUTGOING_LINES:
			return allOutgoingLines != null && !allOutgoingLines.isEmpty();
		case DiPackage.NODE__ALL_INCOMING_LINES:
			return allIncomingLines != null && !allIncomingLines.isEmpty();
		case DiPackage.NODE__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
		case DiPackage.NODE__OUTGOING_LINES:
			return !getOutgoingLines().isEmpty();
		case DiPackage.NODE__INCOMING_LINES:
			return !getIncomingLines().isEmpty();
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
		result.append(" (allOutgoingLines: ");
		result.append(allOutgoingLines);
		result.append(", allIncomingLines: ");
		result.append(allIncomingLines);
		result.append(')');
		return result.toString();
	}

} // NodeImpl
