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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.EXElement#getElements <em>Elements</em>}</li>
 * <li>{@link org.soyatec.tooling.exml.EXElement#getAttributes <em>Attributes
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.exml.EXMLPackage#getElement()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface EXElement extends EXNode {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.soyatec.tooling.exml.EXElement}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.soyatec.tooling.exml.EXMLPackage#getElement_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EXElement> getElements();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.soyatec.tooling.exml.EXAttribute}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attributes</em>' containment reference
	 *         list.
	 * @see org.soyatec.tooling.exml.EXMLPackage#getElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EXAttribute> getAttributes();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='if (name != null) {\r\n\tEList<EXAttribute> attributes = getAttributes();\r\n\tfor (EXAttribute attr : attributes) {\r\n\t\tif (name.equals(attr.getName())) {\r\n\t\t\treturn attr;\r\n\t\t}\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	EXAttribute getAttribute(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false" ordered="false" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='BasicEList<EXElement> elements = new BasicEList<EXElement>();\r\nif (name != null){\r\n\tEList<EXElement> children = getElements();\r\n\tfor (EXElement e : children) {\r\n\t\tif (name.equals(e.getName())) {\r\n\t\t\telements.add(e);\r\n\t\t}\r\n\t}\r\n}\r\nreturn elements;'"
	 * @generated
	 */
	EList<EXElement> getElementsByName(String name);

} // EXElement
