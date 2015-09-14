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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Grid</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Grid#getColor <em>Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Grid#getSpacing <em>Spacing</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Grid#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see org.soyatec.tooling.di.DiPackage#getGrid_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Grid#getColor
	 * <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(int)
	 * @see org.soyatec.tooling.di.DiPackage#getGrid_Spacing()
	 * @model
	 * @generated
	 */
	int getSpacing();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Grid#getSpacing
	 * <em>Spacing</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(int value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute. The literals
	 * are from the enumeration {@link org.soyatec.tooling.di.LineStyle}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.soyatec.tooling.di.LineStyle
	 * @see #setStyle(LineStyle)
	 * @see org.soyatec.tooling.di.DiPackage#getGrid_Style()
	 * @model
	 * @generated
	 */
	LineStyle getStyle();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Grid#getStyle
	 * <em>Style</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' attribute.
	 * @see org.soyatec.tooling.di.LineStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(LineStyle value);

} // Grid
