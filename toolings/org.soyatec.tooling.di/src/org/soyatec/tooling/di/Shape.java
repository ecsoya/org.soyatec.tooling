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

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Shape#getBackground <em>Background</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Shape#getForeground <em>Foreground</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Shape#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.di.DiPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends Container, Node {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute. The
	 * default value is <code>"16777215"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(int)
	 * @see org.soyatec.tooling.di.DiPackage#getShape_Background()
	 * @model default="16777215"
	 * @generated
	 */
	int getBackground();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Shape#getBackground
	 * <em>Background</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(int value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute. The
	 * default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(int)
	 * @see org.soyatec.tooling.di.DiPackage#getShape_Foreground()
	 * @model default="0"
	 * @generated
	 */
	int getForeground();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Shape#getForeground
	 * <em>Foreground</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(int value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' attribute.
	 * @see #setBounds(Rectangle)
	 * @see org.soyatec.tooling.di.DiPackage#getShape_Bounds()
	 * @model dataType="org.soyatec.tooling.di.Rectangle"
	 * @generated
	 */
	Rectangle getBounds();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Shape#getBounds
	 * <em>Bounds</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bounds</em>' attribute.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Rectangle value);

} // Shape
