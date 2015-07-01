/**
 */
package org.soyatec.tooling.exml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.soyatec.tooling.exml.EXAttribute;
import org.soyatec.tooling.exml.EXDocument;
import org.soyatec.tooling.exml.EXElement;
import org.soyatec.tooling.exml.EXMLFactory;
import org.soyatec.tooling.exml.EXMLPackage;
import org.soyatec.tooling.exml.EXNode;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EXMLPackageImpl extends EPackageImpl implements EXMLPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.soyatec.tooling.exml.EXMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EXMLPackageImpl() {
		super(eNS_URI, EXMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link EXMLPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EXMLPackage init() {
		if (isInited)
			return (EXMLPackage) EPackage.Registry.INSTANCE
					.getEPackage(EXMLPackage.eNS_URI);

		// Obtain or create and register package
		EXMLPackageImpl theMLPackage = (EXMLPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EXMLPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new EXMLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMLPackage.createPackageContents();

		// Initialize created meta-data
		theMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EXMLPackage.eNS_URI, theMLPackage);
		return theMLPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getDocument_Element() {
		return (EReference) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getElement_Elements() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getElement_Attributes() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getElement__GetAttribute__String() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getElement__GetElements__String() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Value() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNode_Name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EXMLFactory getMLFactory() {
		return (EXMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__ELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__ELEMENTS);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE__STRING);
		createEOperation(elementEClass, ELEMENT___GET_ELEMENTS__STRING);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentEClass.getESuperTypes().add(this.getNode());
		elementEClass.getESuperTypes().add(this.getNode());
		attributeEClass.getESuperTypes().add(this.getNode());
		nodeEClass.getESuperTypes().add(
				theXMLTypePackage.getXMLTypeDocumentRoot());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, EXDocument.class, "Document", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Element(), this.getElement(), null,
				"element", null, 0, 1, EXDocument.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, EXElement.class, "Element", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Elements(), this.getElement(), null,
				"elements", null, 0, -1, EXElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), null,
				"attributes", null, 0, -1, EXElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getElement__GetAttribute__String(),
				this.getAttribute(), "getAttribute", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getElement__GetElements__String(),
				this.getElement(), "getElements", 0, -1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(attributeEClass, EXAttribute.class, "Attribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, EXAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, EXNode.class, "Node", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null,
				1, 1, EXNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(documentEClass, source, new String[] { "kind", "mixed" });
		addAnnotation(elementEClass, source, new String[] { "kind", "mixed" });
		addAnnotation(nodeEClass, source, new String[] { "kind", "mixed" });
	}

} // EXMLPackageImpl
