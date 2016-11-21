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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Comment Link</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.CommentLink#getSource <em>Source</em>}</li>
 * <li>{@link org.soyatec.tooling.di.CommentLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.di.DiPackage#getCommentLink()
 * @model
 * @generated
 */
public interface CommentLink extends Line {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link org.soyatec.tooling.di.Node#getCommentLinks
	 * <em>Comment Links</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.soyatec.tooling.di.DiPackage#getCommentLink_Source()
	 * @see org.soyatec.tooling.di.Node#getCommentLinks
	 * @model opposite="commentLinks" transient="true" volatile="true"
	 *        extendedMetaData="group='#sourceNode'"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.CommentLink#getSource <em>Source</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link org.soyatec.tooling.di.Comment#getInputs <em>Inputs</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Comment)
	 * @see org.soyatec.tooling.di.DiPackage#getCommentLink_Target()
	 * @see org.soyatec.tooling.di.Comment#getInputs
	 * @model opposite="inputs" transient="true" volatile="true"
	 *        extendedMetaData="group='#targetShape'"
	 * @generated
	 */
	Comment getTarget();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.CommentLink#getTarget <em>Target</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Comment value);

} // CommentLink
