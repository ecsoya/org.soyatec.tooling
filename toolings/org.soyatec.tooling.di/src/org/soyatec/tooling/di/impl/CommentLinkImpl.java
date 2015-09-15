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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Comment Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.CommentLinkImpl#getSource <em>Source
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.CommentLinkImpl#getTarget <em>Target
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentLinkImpl extends LineImpl implements CommentLink {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CommentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.COMMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getSource() {
		Node source = basicGetSource();
		return source != null && source.eIsProxy() ? (Node) eResolveProxy((InternalEObject) source)
				: source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetSource() {
		return (Node) getSourceNode().get(
				DiPackage.Literals.COMMENT_LINK__SOURCE, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(Node newSource) {
		((FeatureMap.Internal) getSourceNode()).set(
				DiPackage.Literals.COMMENT_LINK__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment getTarget() {
		Comment target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Comment) eResolveProxy((InternalEObject) target)
				: target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment basicGetTarget() {
		return (Comment) getTargetNode().get(
				DiPackage.Literals.COMMENT_LINK__TARGET, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTarget(Comment newTarget) {
		((FeatureMap.Internal) getTargetNode()).set(
				DiPackage.Literals.COMMENT_LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.COMMENT_LINK__SOURCE:
			Node source = basicGetSource();
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						DiPackage.NODE__COMMENT_LINKS, Node.class, msgs);
			return basicSetSource((Node) otherEnd, msgs);
		case DiPackage.COMMENT_LINK__TARGET:
			Comment target = basicGetTarget();
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						DiPackage.COMMENT__INPUTS, Comment.class, msgs);
			return basicSetTarget((Comment) otherEnd, msgs);
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
		case DiPackage.COMMENT_LINK__SOURCE:
			return basicSetSource(null, msgs);
		case DiPackage.COMMENT_LINK__TARGET:
			return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	private NotificationChain basicSetSource(Node newSource,
			NotificationChain msgs) {
		Node oldSource = basicGetSource();
		setSource(newSource);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DiPackage.COMMENT_LINK__SOURCE,
					oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private NotificationChain basicSetTarget(Comment newTarget,
			NotificationChain msgs) {
		Comment oldTarget = basicGetTarget();
		setTarget(newTarget);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DiPackage.COMMENT_LINK__TARGET,
					oldTarget, newTarget);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiPackage.COMMENT_LINK__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case DiPackage.COMMENT_LINK__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case DiPackage.COMMENT_LINK__SOURCE:
			setSource((Node) newValue);
			return;
		case DiPackage.COMMENT_LINK__TARGET:
			setTarget((Comment) newValue);
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
		case DiPackage.COMMENT_LINK__SOURCE:
			setSource((Node) null);
			return;
		case DiPackage.COMMENT_LINK__TARGET:
			setTarget((Comment) null);
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
		case DiPackage.COMMENT_LINK__SOURCE:
			return basicGetSource() != null;
		case DiPackage.COMMENT_LINK__TARGET:
			return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} // CommentLinkImpl
