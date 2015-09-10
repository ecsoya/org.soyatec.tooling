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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>UI Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.UIElement#getElement <em>Element</em>}</li>
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

} // UIElement
