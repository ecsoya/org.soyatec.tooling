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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.soyatec.tooling.exml.EXMLPackage
 * @generated
 */
public interface EXMLFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    EXMLFactory eINSTANCE = org.soyatec.tooling.exml.impl.EXMLFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Document</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Document</em>'.
     * @generated
     */
    EXDocument createDocument();

    /**
     * Returns a new object of class '<em>Element</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
    EXElement createElement();

    /**
     * Returns a new object of class '<em>Attribute</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    EXAttribute createAttribute();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    EXMLPackage getMLPackage();

} // EXMLFactory
