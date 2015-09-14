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
package org.soyatec.tooling.di;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Gradient Shape</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.GradientShape#isUsingGradient <em>Using
 * Gradient</em>}</li>
 * <li>{@link org.soyatec.tooling.di.GradientShape#getGradientColor <em>Gradient
 * Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.GradientShape#isVerticalGradient <em>
 * Vertical Gradient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getGradientShape()
 * @model
 * @generated
 */
public interface GradientShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Using Gradient</b></em>' attribute. The
	 * default value is <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Gradient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Using Gradient</em>' attribute.
	 * @see #setUsingGradient(boolean)
	 * @see org.soyatec.tooling.di.DiPackage#getGradientShape_UsingGradient()
	 * @model default="true"
	 * @generated
	 */
	boolean isUsingGradient();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.GradientShape#isUsingGradient
	 * <em>Using Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Using Gradient</em>' attribute.
	 * @see #isUsingGradient()
	 * @generated
	 */
	void setUsingGradient(boolean value);

	/**
	 * Returns the value of the '<em><b>Gradient Color</b></em>' attribute. The
	 * default value is <code>"16777215"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gradient Color</em>' attribute.
	 * @see #setGradientColor(int)
	 * @see org.soyatec.tooling.di.DiPackage#getGradientShape_GradientColor()
	 * @model default="16777215"
	 * @generated
	 */
	int getGradientColor();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.GradientShape#getGradientColor
	 * <em>Gradient Color</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Gradient Color</em>' attribute.
	 * @see #getGradientColor()
	 * @generated
	 */
	void setGradientColor(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Gradient</b></em>' attribute.
	 * The default value is <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Gradient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vertical Gradient</em>' attribute.
	 * @see #setVerticalGradient(boolean)
	 * @see org.soyatec.tooling.di.DiPackage#getGradientShape_VerticalGradient()
	 * @model default="true"
	 * @generated
	 */
	boolean isVerticalGradient();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.GradientShape#isVerticalGradient
	 * <em>Vertical Gradient</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Vertical Gradient</em>' attribute.
	 * @see #isVerticalGradient()
	 * @generated
	 */
	void setVerticalGradient(boolean value);

} // GradientShape
