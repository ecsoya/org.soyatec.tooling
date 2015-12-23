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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Node#getAllOutgoingLines <em>All Outgoing
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getAllIncomingLines <em>All Incoming
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getCommentLinks <em>Comment Links
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getOutgoingLines <em>Outgoing Lines
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getIncomingLines <em>Incoming Lines
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends View {
    /**
     * Returns the value of the '<em><b>All Outgoing Lines</b></em>' attribute
     * list. The list contents are of type
     * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>All Outgoing Lines</em>' attribute list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>All Outgoing Lines</em>' attribute list.
     * @see org.soyatec.tooling.di.DiPackage#getNode_AllOutgoingLines()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group'"
     * @generated
     */
    FeatureMap getAllOutgoingLines();

    /**
     * Returns the value of the '<em><b>All Incoming Lines</b></em>' attribute
     * list. The list contents are of type
     * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>All Incoming Lines</em>' attribute list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>All Incoming Lines</em>' attribute list.
     * @see org.soyatec.tooling.di.DiPackage#getNode_AllIncomingLines()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group'"
     * @generated
     */
    FeatureMap getAllIncomingLines();

    /**
     * Returns the value of the '<em><b>Comment Links</b></em>' reference list.
     * The list contents are of type {@link org.soyatec.tooling.di.CommentLink}.
     * It is bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.CommentLink#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment Links</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Comment Links</em>' reference list.
     * @see org.soyatec.tooling.di.DiPackage#getNode_CommentLinks()
     * @see org.soyatec.tooling.di.CommentLink#getSource
     * @model opposite="source" transient="true" volatile="true"
     *        extendedMetaData="group='#allOutgoingLines'"
     * @generated
     */
    EList<CommentLink> getCommentLinks();

    /**
     * Returns the value of the '<em><b>Outgoing Lines</b></em>' reference list.
     * The list contents are of type {@link org.soyatec.tooling.di.Connector}.
     * It is bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.Connector#getSource <em>Source</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Lines</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Outgoing Lines</em>' reference list.
     * @see org.soyatec.tooling.di.DiPackage#getNode_OutgoingLines()
     * @see org.soyatec.tooling.di.Connector#getSource
     * @model opposite="source" transient="true" volatile="true"
     *        extendedMetaData="group='#allOutgoingLines'"
     * @generated
     */
    EList<Connector> getOutgoingLines();

    /**
     * Returns the value of the '<em><b>Incoming Lines</b></em>' reference list.
     * The list contents are of type {@link org.soyatec.tooling.di.Connector}.
     * It is bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.Connector#getTarget <em>Target</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Lines</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Incoming Lines</em>' reference list.
     * @see org.soyatec.tooling.di.DiPackage#getNode_IncomingLines()
     * @see org.soyatec.tooling.di.Connector#getTarget
     * @model opposite="target" transient="true" volatile="true"
     *        extendedMetaData="group='#allIncomingLines'"
     * @generated
     */
    EList<Connector> getIncomingLines();

} // Node
