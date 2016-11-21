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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.EXNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.exml.EXMLPackage#getNode()
 * @model abstract="true" extendedMetaData="kind='mixed'"
 * @generated
 */
public interface EXNode extends XMLTypeDocumentRoot {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.soyatec.tooling.exml.EXMLPackage#getNode_Name()
	 * @model required="true" transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.exml.EXNode#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return super.getComment();'"
	 * @generated
	 */
	EList<String> getComments();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return super.getText();'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return super.getCDATA();'"
	 * @generated
	 */
	EList<String> getCDATA();

} // EXNode
