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

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Guide</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Guide#getRuler <em>Ruler</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Guide#getPosition <em>Position</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Guide#getElementMap <em>Element Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getGuide()
 * @model
 * @generated
 */
public interface Guide extends EObject {
    /**
     * Returns the value of the '<em><b>Ruler</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.soyatec.tooling.di.Ruler#getGuides <em>Guides</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ruler</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ruler</em>' container reference.
     * @see #setRuler(Ruler)
     * @see org.soyatec.tooling.di.DiPackage#getGuide_Ruler()
     * @see org.soyatec.tooling.di.Ruler#getGuides
     * @model opposite="guides" transient="false"
     * @generated
     */
    Ruler getRuler();

    /**
     * Sets the value of the '{@link org.soyatec.tooling.di.Guide#getRuler
     * <em>Ruler</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Ruler</em>' container reference.
     * @see #getRuler()
     * @generated
     */
    void setRuler(Ruler value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Position</em>' attribute.
     * @see #setPosition(int)
     * @see org.soyatec.tooling.di.DiPackage#getGuide_Position()
     * @model
     * @generated
     */
    int getPosition();

    /**
     * Sets the value of the '{@link org.soyatec.tooling.di.Guide#getPosition
     * <em>Position</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Position</em>' attribute.
     * @see #getPosition()
     * @generated
     */
    void setPosition(int value);

    /**
     * Returns the value of the '<em><b>Element Map</b></em>' map. The key is of
     * type {@link org.soyatec.tooling.di.View}, and the value is of type
     * {@link org.soyatec.tooling.di.Alignment}, <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Map</em>' map isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Element Map</em>' map.
     * @see org.soyatec.tooling.di.DiPackage#getGuide_ElementMap()
     * @model mapType=
     *        "org.soyatec.tooling.di.ElementEntry<org.soyatec.tooling.di.View, org.soyatec.tooling.di.Alignment>"
     * @generated
     */
    EMap<View, Alignment> getElementMap();

} // Guide
