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
package org.soyatec.tooling.exml.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.exml.util.EXMLResourceImpl
 * @generated
 */
public class EXMLResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EXMLResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Resource createResource(final URI uri) {
		return new EXMLResourceImpl(uri);
	}

} // EXMLResourceFactoryImpl
