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
package org.soyatec.tooling.di;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ruler</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Ruler#getUnit <em>Unit</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Ruler#getGuides <em>Guides</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.di.DiPackage#getRuler()
 * @model
 * @generated
 */
public interface Ruler extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. The default
	 * value is <code>"INCHES"</code>. The literals are from the enumeration
	 * {@link org.soyatec.tooling.di.RulerUnit}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.soyatec.tooling.di.RulerUnit
	 * @see #setUnit(RulerUnit)
	 * @see org.soyatec.tooling.di.DiPackage#getRuler_Unit()
	 * @model default="INCHES"
	 * @generated
	 */
	RulerUnit getUnit();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Ruler#getUnit
	 * <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit</em>' attribute.
	 * @see org.soyatec.tooling.di.RulerUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(RulerUnit value);

	/**
	 * Returns the value of the '<em><b>Guides</b></em>' containment reference
	 * list. The list contents are of type {@link org.soyatec.tooling.di.Guide}.
	 * It is bidirectional and its opposite is '
	 * {@link org.soyatec.tooling.di.Guide#getRuler <em>Ruler</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guides</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Guides</em>' containment reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getRuler_Guides()
	 * @see org.soyatec.tooling.di.Guide#getRuler
	 * @model opposite="ruler" containment="true"
	 * @generated
	 */
	EList<Guide> getGuides();

} // Ruler
