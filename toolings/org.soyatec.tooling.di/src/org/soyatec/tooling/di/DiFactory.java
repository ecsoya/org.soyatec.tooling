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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.di.DiPackage
 * @generated
 */
public interface DiFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DiFactory eINSTANCE = org.soyatec.tooling.di.impl.DiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Shape</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Shape</em>'.
	 * @generated
	 */
	Shape createShape();

	/**
	 * Returns a new object of class '<em>Gradient Shape</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Gradient Shape</em>'.
	 * @generated
	 */
	GradientShape createGradientShape();

	/**
	 * Returns a new object of class '<em>Connector</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Comment</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Comment Link</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Comment Link</em>'.
	 * @generated
	 */
	CommentLink createCommentLink();

	/**
	 * Returns a new object of class '<em>Grid</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Grid</em>'.
	 * @generated
	 */
	Grid createGrid();

	/**
	 * Returns a new object of class '<em>Ruler</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ruler</em>'.
	 * @generated
	 */
	Ruler createRuler();

	/**
	 * Returns a new object of class '<em>Guide</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Guide</em>'.
	 * @generated
	 */
	Guide createGuide();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiPackage getDiPackage();

} // DiFactory
