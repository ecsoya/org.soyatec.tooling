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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.UIElement#getElement <em>Element</em>}</li>
 * <li>{@link org.soyatec.tooling.di.UIElement#getOutgoingLines <em>Outgoing
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.UIElement#getIncomingLines <em>Incoming
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.UIElement#getCommentLinks <em>Comment Links
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getUIElement()
 * @model
 * @generated
 */
public interface UIElement extends UIObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see org.soyatec.tooling.di.DiPackage#getUIElement_Element()
	 * @model
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.UIElement#getElement <em>Element</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Lines</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outgoing Lines</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getUIElement_OutgoingLines()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getOutgoingLines();

	/**
	 * Returns the value of the '<em><b>Incoming Lines</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Incoming Lines</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Incoming Lines</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getUIElement_IncomingLines()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getIncomingLines();

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
	 * @see org.soyatec.tooling.di.DiPackage#getUIElement_CommentLinks()
	 * @see org.soyatec.tooling.di.CommentLink#getSource
	 * @model opposite="source" transient="true" volatile="true"
	 *        extendedMetaData="group='#outgoingLines'"
	 * @generated
	 */
	EList<CommentLink> getCommentLinks();

} // UIElement
