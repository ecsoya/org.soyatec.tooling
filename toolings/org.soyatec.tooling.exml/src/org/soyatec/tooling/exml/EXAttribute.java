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
package org.soyatec.tooling.exml;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Attribute</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.EXAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.exml.EXMLPackage#getAttribute()
 * @model
 * @generated
 */
public interface EXAttribute extends EXNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.soyatec.tooling.exml.EXMLPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.exml.EXAttribute#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EXAttribute
