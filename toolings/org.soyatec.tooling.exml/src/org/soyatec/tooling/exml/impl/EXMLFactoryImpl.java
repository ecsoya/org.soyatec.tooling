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
package org.soyatec.tooling.exml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.soyatec.tooling.exml.EXAttribute;
import org.soyatec.tooling.exml.EXDocument;
import org.soyatec.tooling.exml.EXElement;
import org.soyatec.tooling.exml.EXMLFactory;
import org.soyatec.tooling.exml.EXMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EXMLFactoryImpl extends EFactoryImpl implements EXMLFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EXMLFactory init() {
		try {
			final EXMLFactory theMLFactory = (EXMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(EXMLPackage.eNS_URI);
			if (theMLFactory != null) {
				return theMLFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EXMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EXMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EXMLPackage.DOCUMENT:
			return createDocument();
		case EXMLPackage.ELEMENT:
			return createElement();
		case EXMLPackage.ATTRIBUTE:
			return createAttribute();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXDocument createDocument() {
		final EXDocumentImpl document = new EXDocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXElement createElement() {
		final EXElementImpl element = new EXElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXAttribute createAttribute() {
		final EXAttributeImpl attribute = new EXAttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXMLPackage getMLPackage() {
		return (EXMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EXMLPackage getPackage() {
		return EXMLPackage.eINSTANCE;
	}

} // EXMLFactoryImpl
