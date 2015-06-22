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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getLines <em>Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getShapes <em>Shapes</em>}
 * </li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getComments <em>Comments
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.DiagramImpl#getCommentLinks <em>
 * Comment Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramImpl extends UIObjectImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lines;

	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shapes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getLines() {
		if (lines == null) {
			lines = new BasicFeatureMap(this, DiPackage.DIAGRAM__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getShapes() {
		if (shapes == null) {
			shapes = new BasicFeatureMap(this, DiPackage.DIAGRAM__SHAPES);
		}
		return shapes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Comment> getComments() {
		return getShapes().list(DiPackage.Literals.DIAGRAM__COMMENTS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getLines().list(DiPackage.Literals.DIAGRAM__COMMENT_LINKS);
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
		case DiPackage.DIAGRAM__LINES:
			return ((InternalEList<?>) getLines()).basicRemove(otherEnd, msgs);
		case DiPackage.DIAGRAM__SHAPES:
			return ((InternalEList<?>) getShapes()).basicRemove(otherEnd, msgs);
		case DiPackage.DIAGRAM__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd,
					msgs);
		case DiPackage.DIAGRAM__COMMENT_LINKS:
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
		case DiPackage.DIAGRAM__LINES:
			if (coreType)
				return getLines();
			return ((FeatureMap.Internal) getLines()).getWrapper();
		case DiPackage.DIAGRAM__SHAPES:
			if (coreType)
				return getShapes();
			return ((FeatureMap.Internal) getShapes()).getWrapper();
		case DiPackage.DIAGRAM__COMMENTS:
			return getComments();
		case DiPackage.DIAGRAM__COMMENT_LINKS:
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
		case DiPackage.DIAGRAM__LINES:
			((FeatureMap.Internal) getLines()).set(newValue);
			return;
		case DiPackage.DIAGRAM__SHAPES:
			((FeatureMap.Internal) getShapes()).set(newValue);
			return;
		case DiPackage.DIAGRAM__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case DiPackage.DIAGRAM__COMMENT_LINKS:
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
		case DiPackage.DIAGRAM__LINES:
			getLines().clear();
			return;
		case DiPackage.DIAGRAM__SHAPES:
			getShapes().clear();
			return;
		case DiPackage.DIAGRAM__COMMENTS:
			getComments().clear();
			return;
		case DiPackage.DIAGRAM__COMMENT_LINKS:
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
		case DiPackage.DIAGRAM__LINES:
			return lines != null && !lines.isEmpty();
		case DiPackage.DIAGRAM__SHAPES:
			return shapes != null && !shapes.isEmpty();
		case DiPackage.DIAGRAM__COMMENTS:
			return !getComments().isEmpty();
		case DiPackage.DIAGRAM__COMMENT_LINKS:
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
		result.append(" (lines: ");
		result.append(lines);
		result.append(", shapes: ");
		result.append(shapes);
		result.append(')');
		return result.toString();
	}

} // DiagramImpl
