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
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Shape;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.ContainerImpl#getChildren <em>Children
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ContainerImpl#getLines <em>Lines</em>}
 * </li>
 * <li>{@link org.soyatec.tooling.di.impl.ContainerImpl#getAllLines <em>All
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.ContainerImpl#getAllShapes <em>All
 * Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContainerImpl extends ViewImpl implements
		org.soyatec.tooling.di.Container {
	/**
	 * The cached value of the '{@link #getAllLines() <em>All Lines</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allLines;
	/**
	 * The cached value of the '{@link #getAllShapes() <em>All Shapes</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllShapes()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allShapes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Shape> getChildren() {
		return getAllShapes().list(DiPackage.Literals.CONTAINER__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Line> getLines() {
		return getAllLines().list(DiPackage.Literals.CONTAINER__LINES);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAllLines() {
		if (allLines == null) {
			allLines = new BasicFeatureMap(this, DiPackage.CONTAINER__ALL_LINES);
		}
		return allLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAllShapes() {
		if (allShapes == null) {
			allShapes = new BasicFeatureMap(this,
					DiPackage.CONTAINER__ALL_SHAPES);
		}
		return allShapes;
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
		case DiPackage.CONTAINER__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd,
					msgs);
		case DiPackage.CONTAINER__LINES:
			return ((InternalEList<?>) getLines()).basicRemove(otherEnd, msgs);
		case DiPackage.CONTAINER__ALL_LINES:
			return ((InternalEList<?>) getAllLines()).basicRemove(otherEnd,
					msgs);
		case DiPackage.CONTAINER__ALL_SHAPES:
			return ((InternalEList<?>) getAllShapes()).basicRemove(otherEnd,
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
		case DiPackage.CONTAINER__CHILDREN:
			return getChildren();
		case DiPackage.CONTAINER__LINES:
			return getLines();
		case DiPackage.CONTAINER__ALL_LINES:
			if (coreType)
				return getAllLines();
			return ((FeatureMap.Internal) getAllLines()).getWrapper();
		case DiPackage.CONTAINER__ALL_SHAPES:
			if (coreType)
				return getAllShapes();
			return ((FeatureMap.Internal) getAllShapes()).getWrapper();
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
		case DiPackage.CONTAINER__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Shape>) newValue);
			return;
		case DiPackage.CONTAINER__LINES:
			getLines().clear();
			getLines().addAll((Collection<? extends Line>) newValue);
			return;
		case DiPackage.CONTAINER__ALL_LINES:
			((FeatureMap.Internal) getAllLines()).set(newValue);
			return;
		case DiPackage.CONTAINER__ALL_SHAPES:
			((FeatureMap.Internal) getAllShapes()).set(newValue);
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
		case DiPackage.CONTAINER__CHILDREN:
			getChildren().clear();
			return;
		case DiPackage.CONTAINER__LINES:
			getLines().clear();
			return;
		case DiPackage.CONTAINER__ALL_LINES:
			getAllLines().clear();
			return;
		case DiPackage.CONTAINER__ALL_SHAPES:
			getAllShapes().clear();
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
		case DiPackage.CONTAINER__CHILDREN:
			return !getChildren().isEmpty();
		case DiPackage.CONTAINER__LINES:
			return !getLines().isEmpty();
		case DiPackage.CONTAINER__ALL_LINES:
			return allLines != null && !allLines.isEmpty();
		case DiPackage.CONTAINER__ALL_SHAPES:
			return allShapes != null && !allShapes.isEmpty();
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
		result.append(" (allLines: ");
		result.append(allLines);
		result.append(", allShapes: ");
		result.append(allShapes);
		result.append(')');
		return result.toString();
	}

} // ContainerImpl
