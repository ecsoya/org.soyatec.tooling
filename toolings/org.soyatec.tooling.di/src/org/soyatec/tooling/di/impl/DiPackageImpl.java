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
package org.soyatec.tooling.di.impl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.di.UIElement;
import org.soyatec.tooling.di.UIObject;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DiPackageImpl extends EPackageImpl implements DiPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gradientShapeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass commentLinkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

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
	 * @see org.soyatec.tooling.di.DiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiPackageImpl() {
		super(eNS_URI, DiFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DiPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiPackage init() {
		if (isInited)
			return (DiPackage) EPackage.Registry.INSTANCE
					.getEPackage(DiPackage.eNS_URI);

		// Obtain or create and register package
		DiPackageImpl theDiPackage = (DiPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DiPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiPackage.createPackageContents();

		// Initialize created meta-data
		theDiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiPackage.eNS_URI, theDiPackage);
		return theDiPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIObject() {
		return uiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUIObject_Label() {
		return (EAttribute) uiObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUIObject_Id() {
		return (EAttribute) uiObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIElement() {
		return uiElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIElement_Element() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUIElement_OutgoingLines() {
		return (EAttribute) uiElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUIElement_IncomingLines() {
		return (EAttribute) uiElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIElement_CommentLinks() {
		return (EReference) uiElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagram_Lines() {
		return (EAttribute) diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagram_Shapes() {
		return (EAttribute) diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagram_Comments() {
		return (EReference) diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagram_CommentLinks() {
		return (EReference) diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getShape_Background() {
		return (EAttribute) shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getShape_Foreground() {
		return (EAttribute) shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getShape_Bounds() {
		return (EAttribute) shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGradientShape() {
		return gradientShapeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientShape_UsingGradient() {
		return (EAttribute) gradientShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientShape_GradientColor() {
		return (EAttribute) gradientShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientShape_VerticalGradient() {
		return (EAttribute) gradientShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_Color() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_Width() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_SourceAnchor() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_TargetAnchor() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_SourceShape() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_TargetShape() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getComment_Inputs() {
		return (EReference) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCommentLink() {
		return commentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCommentLink_Source() {
		return (EReference) commentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCommentLink_Target() {
		return (EReference) commentLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiFactory getDiFactory() {
		return (DiFactory) getEFactoryInstance();
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
		uiObjectEClass = createEClass(UI_OBJECT);
		createEAttribute(uiObjectEClass, UI_OBJECT__LABEL);
		createEAttribute(uiObjectEClass, UI_OBJECT__ID);

		uiElementEClass = createEClass(UI_ELEMENT);
		createEReference(uiElementEClass, UI_ELEMENT__ELEMENT);
		createEAttribute(uiElementEClass, UI_ELEMENT__OUTGOING_LINES);
		createEAttribute(uiElementEClass, UI_ELEMENT__INCOMING_LINES);
		createEReference(uiElementEClass, UI_ELEMENT__COMMENT_LINKS);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__LINES);
		createEAttribute(diagramEClass, DIAGRAM__SHAPES);
		createEReference(diagramEClass, DIAGRAM__COMMENTS);
		createEReference(diagramEClass, DIAGRAM__COMMENT_LINKS);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__BACKGROUND);
		createEAttribute(shapeEClass, SHAPE__FOREGROUND);
		createEAttribute(shapeEClass, SHAPE__BOUNDS);

		gradientShapeEClass = createEClass(GRADIENT_SHAPE);
		createEAttribute(gradientShapeEClass, GRADIENT_SHAPE__USING_GRADIENT);
		createEAttribute(gradientShapeEClass, GRADIENT_SHAPE__GRADIENT_COLOR);
		createEAttribute(gradientShapeEClass, GRADIENT_SHAPE__VERTICAL_GRADIENT);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__COLOR);
		createEAttribute(lineEClass, LINE__WIDTH);
		createEAttribute(lineEClass, LINE__SOURCE_ANCHOR);
		createEAttribute(lineEClass, LINE__TARGET_ANCHOR);
		createEAttribute(lineEClass, LINE__SOURCE_SHAPE);
		createEAttribute(lineEClass, LINE__TARGET_SHAPE);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__INPUTS);

		commentLinkEClass = createEClass(COMMENT_LINK);
		createEReference(commentLinkEClass, COMMENT_LINK__SOURCE);
		createEReference(commentLinkEClass, COMMENT_LINK__TARGET);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiElementEClass.getESuperTypes().add(this.getUIObject());
		diagramEClass.getESuperTypes().add(this.getUIObject());
		shapeEClass.getESuperTypes().add(this.getUIElement());
		gradientShapeEClass.getESuperTypes().add(this.getShape());
		lineEClass.getESuperTypes().add(this.getUIElement());
		commentEClass.getESuperTypes().add(this.getShape());
		commentLinkEClass.getESuperTypes().add(this.getLine());

		// Initialize classes, features, and operations; add parameters
		initEClass(uiObjectEClass, UIObject.class, "UIObject", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIObject_Label(), ecorePackage.getEString(), "label",
				null, 0, 1, UIObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUIObject_Id(), ecorePackage.getEString(), "id", null,
				0, 1, UIObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(uiElementEClass, UIElement.class, "UIElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIElement_Element(), ecorePackage.getEObject(), null,
				"element", null, 0, 1, UIElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElement_OutgoingLines(),
				ecorePackage.getEFeatureMapEntry(), "outgoingLines", null, 0,
				-1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUIElement_IncomingLines(),
				ecorePackage.getEFeatureMapEntry(), "incomingLines", null, 0,
				-1, UIElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUIElement_CommentLinks(), this.getCommentLink(),
				this.getCommentLink_Source(), "commentLinks", null, 0, -1,
				UIElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Lines(), ecorePackage.getEFeatureMapEntry(),
				"lines", null, 0, -1, Diagram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Shapes(), ecorePackage.getEFeatureMapEntry(),
				"shapes", null, 0, -1, Diagram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Comments(), this.getComment(), null,
				"comments", null, 0, -1, Diagram.class, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_CommentLinks(), this.getCommentLink(), null,
				"commentLinks", null, 0, -1, Diagram.class, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_Background(), ecorePackage.getEInt(),
				"background", "16777215", 0, 1, Shape.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Foreground(), ecorePackage.getEInt(),
				"foreground", "0", 0, 1, Shape.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Bounds(), this.getRectangle(), "bounds", null,
				0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientShapeEClass, GradientShape.class, "GradientShape",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientShape_UsingGradient(),
				ecorePackage.getEBoolean(), "usingGradient", "true", 0, 1,
				GradientShape.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGradientShape_GradientColor(),
				ecorePackage.getEInt(), "gradientColor", "16777215", 0, 1,
				GradientShape.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGradientShape_VerticalGradient(),
				ecorePackage.getEBoolean(), "verticalGradient", "true", 0, 1,
				GradientShape.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Color(), ecorePackage.getEInt(), "color", "0",
				0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Width(), ecorePackage.getEInt(), "width", "1",
				0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_SourceAnchor(), ecorePackage.getEString(),
				"sourceAnchor", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_TargetAnchor(), ecorePackage.getEString(),
				"targetAnchor", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_SourceShape(),
				ecorePackage.getEFeatureMapEntry(), "sourceShape", null, 0, 1,
				Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_TargetShape(),
				ecorePackage.getEFeatureMapEntry(), "targetShape", null, 0, 1,
				Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_Inputs(), this.getCommentLink(),
				this.getCommentLink_Target(), "inputs", null, 0, -1,
				Comment.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commentLinkEClass, CommentLink.class, "CommentLink",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentLink_Source(), this.getUIElement(),
				this.getUIElement_CommentLinks(), "source", null, 0, 1,
				CommentLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCommentLink_Target(), this.getComment(),
				this.getComment_Inputs(), "target", null, 0, 1,
				CommentLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(getUIElement_OutgoingLines(), source, new String[] {
				"kind", "group" });
		addAnnotation(getUIElement_IncomingLines(), source, new String[] {
				"kind", "group" });
		addAnnotation(getUIElement_CommentLinks(), source, new String[] {
				"group", "#outgoingLines" });
		addAnnotation(getDiagram_Lines(), source, new String[] { "kind",
				"group" });
		addAnnotation(getDiagram_Shapes(), source, new String[] { "kind",
				"group" });
		addAnnotation(getDiagram_Comments(), source, new String[] { "group",
				"#shapes" });
		addAnnotation(getDiagram_CommentLinks(), source, new String[] {
				"group", "#lines" });
		addAnnotation(getLine_SourceShape(), source, new String[] { "kind",
				"group" });
		addAnnotation(getLine_TargetShape(), source, new String[] { "kind",
				"group" });
		addAnnotation(getComment_Inputs(), source, new String[] { "group",
				"#incomingLines" });
		addAnnotation(getCommentLink_Source(), source, new String[] { "group",
				"#sourceShape" });
		addAnnotation(getCommentLink_Target(), source, new String[] { "group",
				"#targetShape" });
	}

} // DiPackageImpl
