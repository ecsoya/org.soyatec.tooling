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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Comment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Comment#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Shape {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list. The
	 * list contents are of type {@link org.soyatec.tooling.di.CommentLink}. It
	 * is bidirectional and its opposite is '
	 * {@link org.soyatec.tooling.di.CommentLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getComment_Inputs()
	 * @see org.soyatec.tooling.di.CommentLink#getTarget
	 * @model opposite="target" transient="true" volatile="true"
	 *        extendedMetaData="group='#incomingLines'"
	 * @generated
	 */
	EList<CommentLink> getInputs();

} // Comment
