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
 * <em><b>Connector</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Connector#getTarget <em>Target</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Connector#getSource <em>Source</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Connector#getReverseElement <em>Reverse
 * Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Line {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.Node#getIncomingLines
     * <em>Incoming Lines</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Node)
     * @see org.soyatec.tooling.di.DiPackage#getConnector_Target()
     * @see org.soyatec.tooling.di.Node#getIncomingLines
     * @model opposite="incomingLines" transient="true" volatile="true"
     *        extendedMetaData="group='#targetNode'"
     * @generated
     */
    Node getTarget();

    /**
     * Sets the value of the '{@link org.soyatec.tooling.di.Connector#getTarget
     * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Node value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.Node#getOutgoingLines
     * <em>Outgoing Lines</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Node)
     * @see org.soyatec.tooling.di.DiPackage#getConnector_Source()
     * @see org.soyatec.tooling.di.Node#getOutgoingLines
     * @model opposite="outgoingLines" transient="true" volatile="true"
     *        extendedMetaData="group='#sourceNode'"
     * @generated
     */
    Node getSource();

    /**
     * Sets the value of the '{@link org.soyatec.tooling.di.Connector#getSource
     * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Node value);

    /**
     * Returns the value of the '<em><b>Reverse Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reverse Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reverse Element</em>' reference.
     * @see #setReverseElement(EObject)
     * @see org.soyatec.tooling.di.DiPackage#getConnector_ReverseElement()
     * @model
     * @generated
     */
    EObject getReverseElement();

    /**
     * Sets the value of the '
     * {@link org.soyatec.tooling.di.Connector#getReverseElement
     * <em>Reverse Element</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Reverse Element</em>' reference.
     * @see #getReverseElement()
     * @generated
     */
    void setReverseElement(EObject value);

} // Connector
