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
 * <em><b>Document</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.exml.EXDocument#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.exml.EXMLPackage#getDocument()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface EXDocument extends EXNode {
    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Element</em>' containment reference.
     * @see #setElement(EXElement)
     * @see org.soyatec.tooling.exml.EXMLPackage#getDocument_Element()
     * @model containment="true"
     * @generated
     */
    EXElement getElement();

    /**
     * Sets the value of the '
     * {@link org.soyatec.tooling.exml.EXDocument#getElement <em>Element</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Element</em>' containment reference.
     * @see #getElement()
     * @generated
     */
    void setElement(EXElement value);

} // EXDocument
