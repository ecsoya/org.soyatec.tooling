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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.soyatec.tooling.exml.EXMLFactory
 * @model kind="package"
 * @generated
 */
public interface EXMLPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "exml";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.soyatec.org/2015/eXML";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "exml";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	EXMLPackage eINSTANCE = org.soyatec.tooling.exml.impl.EXMLPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.exml.impl.EXDocumentImpl <em>Document</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.soyatec.tooling.exml.impl.EXDocumentImpl
	 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.exml.impl.EXElementImpl <em>Element</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.soyatec.tooling.exml.impl.EXElementImpl
	 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.exml.impl.EXAttributeImpl <em>Attribute</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.soyatec.tooling.exml.impl.EXAttributeImpl
	 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.exml.impl.EXNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.soyatec.tooling.exml.impl.EXNodeImpl
	 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__MIXED = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__MIXED;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__XMLNS_PREFIX_MAP = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__XSI_SCHEMA_LOCATION = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>CDATA</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__CDATA = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__CDATA;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__COMMENT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__COMMENT;

	/**
	 * The feature id for the '<em><b>Processing Instruction</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__PROCESSING_INSTRUCTION = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__TEXT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT_FEATURE_COUNT + 1;

	int XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 * @ordered
	 */
	int NODE___GET_COMMENTS = XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Text</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 * @ordered
	 */
	int NODE___GET_TEXT = XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get CDATA</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 * @ordered
	 */
	int NODE___GET_CDATA = XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MIXED = NODE__MIXED;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__XMLNS_PREFIX_MAP = NODE__XMLNS_PREFIX_MAP;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__XSI_SCHEMA_LOCATION = NODE__XSI_SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>CDATA</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CDATA = NODE__CDATA;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Processing Instruction</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROCESSING_INSTRUCTION = NODE__PROCESSING_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEXT = NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ELEMENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_COMMENTS = NODE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Get Text</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_TEXT = NODE___GET_TEXT;

	/**
	 * The operation id for the '<em>Get CDATA</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_CDATA = NODE___GET_CDATA;

	/**
	 * The number of operations of the '<em>Document</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MIXED = NODE__MIXED;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XMLNS_PREFIX_MAP = NODE__XMLNS_PREFIX_MAP;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XSI_SCHEMA_LOCATION = NODE__XSI_SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>CDATA</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CDATA = NODE__CDATA;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Processing Instruction</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROCESSING_INSTRUCTION = NODE__PROCESSING_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEXT = NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENTS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_COMMENTS = NODE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Get Text</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_TEXT = NODE___GET_TEXT;

	/**
	 * The operation id for the '<em>Get CDATA</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_CDATA = NODE___GET_CDATA;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE__STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Elements By Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ELEMENTS_BY_NAME__STRING = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MIXED = NODE__MIXED;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__XMLNS_PREFIX_MAP = NODE__XMLNS_PREFIX_MAP;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__XSI_SCHEMA_LOCATION = NODE__XSI_SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>CDATA</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CDATA = NODE__CDATA;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Processing Instruction</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PROCESSING_INSTRUCTION = NODE__PROCESSING_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TEXT = NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___GET_COMMENTS = NODE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Get Text</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___GET_TEXT = NODE___GET_TEXT;

	/**
	 * The operation id for the '<em>Get CDATA</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___GET_CDATA = NODE___GET_CDATA;

	/**
	 * The number of operations of the '<em>Attribute</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.exml.EXDocument <em>Document</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.soyatec.tooling.exml.EXDocument
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.soyatec.tooling.exml.EXDocument#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.soyatec.tooling.exml.EXDocument#getElement()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Element();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.exml.EXElement <em>Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.soyatec.tooling.exml.EXElement
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.exml.EXElement#getElements <em>Elements</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '
	 *         <em>Elements</em>'.
	 * @see org.soyatec.tooling.exml.EXElement#getElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Elements();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.exml.EXElement#getAttributes
	 * <em>Attributes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '
	 *         <em>Attributes</em>'.
	 * @see org.soyatec.tooling.exml.EXElement#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the '
	 * {@link org.soyatec.tooling.exml.EXElement#getAttribute(java.lang.String)
	 * <em>Get Attribute</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see org.soyatec.tooling.exml.EXElement#getAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetAttribute__String();

	/**
	 * Returns the meta object for the '
	 * {@link org.soyatec.tooling.exml.EXElement#getElementsByName(java.lang.String)
	 * <em>Get Elements By Name</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Elements By Name</em>'
	 *         operation.
	 * @see org.soyatec.tooling.exml.EXElement#getElementsByName(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetElementsByName__String();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.exml.EXAttribute <em>Attribute</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.soyatec.tooling.exml.EXAttribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.exml.EXAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.soyatec.tooling.exml.EXAttribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.exml.EXNode <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.soyatec.tooling.exml.EXNode
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.exml.EXNode#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.soyatec.tooling.exml.EXNode#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the '
	 * {@link org.soyatec.tooling.exml.EXNode#getComments()
	 * <em>Get Comments</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Comments</em>' operation.
	 * @see org.soyatec.tooling.exml.EXNode#getComments()
	 * @generated
	 */
	EOperation getNode__GetComments();

	/**
	 * Returns the meta object for the '
	 * {@link org.soyatec.tooling.exml.EXNode#getText() <em>Get Text</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see org.soyatec.tooling.exml.EXNode#getText()
	 * @generated
	 */
	EOperation getNode__GetText();

	/**
	 * Returns the meta object for the '
	 * {@link org.soyatec.tooling.exml.EXNode#getCDATA() <em>Get CDATA</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get CDATA</em>' operation.
	 * @see org.soyatec.tooling.exml.EXNode#getCDATA()
	 * @generated
	 */
	EOperation getNode__GetCDATA();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EXMLFactory getMLFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.exml.impl.EXDocumentImpl
		 * <em>Document</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.soyatec.tooling.exml.impl.EXDocumentImpl
		 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT__ELEMENT = eINSTANCE.getDocument_Element();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.exml.impl.EXElementImpl <em>Element</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.soyatec.tooling.exml.impl.EXElementImpl
		 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EReference ELEMENT__ELEMENTS = eINSTANCE.getElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE__STRING = eINSTANCE
				.getElement__GetAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get Elements By Name</b></em>
		 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation ELEMENT___GET_ELEMENTS_BY_NAME__STRING = eINSTANCE
				.getElement__GetElementsByName__String();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.exml.impl.EXAttributeImpl
		 * <em>Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.soyatec.tooling.exml.impl.EXAttributeImpl
		 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.exml.impl.EXNodeImpl <em>Node</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.soyatec.tooling.exml.impl.EXNodeImpl
		 * @see org.soyatec.tooling.exml.impl.EXMLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Get Comments</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation NODE___GET_COMMENTS = eINSTANCE.getNode__GetComments();

		/**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation NODE___GET_TEXT = eINSTANCE.getNode__GetText();

		/**
		 * The meta object literal for the '<em><b>Get CDATA</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation NODE___GET_CDATA = eINSTANCE.getNode__GetCDATA();

	}

} // EXMLPackage
