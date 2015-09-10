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

import java.util.Map;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.LineStyle;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.RulerUnit;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.di.UIElement;
import org.soyatec.tooling.di.UINode;
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
	private EClass uiNodeEClass = null;

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
	private EClass gridEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rulerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass guideEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum rulerUnitEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum alignmentEEnum = null;

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
	public EClass getUINode() {
		return uiNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUINode_OutgoingLines() {
		return (EAttribute) uiNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUINode_IncomingLines() {
		return (EAttribute) uiNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUINode_CommentLinks() {
		return (EReference) uiNodeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDiagram_Rulers() {
		return (EAttribute) diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagram_HorizontalRuler() {
		return (EReference) diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagram_VerticalRuler() {
		return (EReference) diagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagram_Grid() {
		return (EReference) diagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagram_SnapToGrid() {
		return (EAttribute) diagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagram_SnapToGeometry() {
		return (EAttribute) diagramEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getLine_Style() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLine_LineDash() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(7);
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
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGrid_Color() {
		return (EAttribute) gridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGrid_Spacing() {
		return (EAttribute) gridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGrid_Style() {
		return (EAttribute) gridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRuler() {
		return rulerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRuler_Unit() {
		return (EAttribute) rulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRuler_Guides() {
		return (EReference) rulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGuide() {
		return guideEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGuide_Ruler() {
		return (EReference) guideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGuide_Position() {
		return (EAttribute) guideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGuide_ElementMap() {
		return (EReference) guideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElementEntry() {
		return elementEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getElementEntry_Key() {
		return (EReference) elementEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getElementEntry_Value() {
		return (EAttribute) elementEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getLineStyle() {
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getRulerUnit() {
		return rulerUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getAlignment() {
		return alignmentEEnum;
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

		uiNodeEClass = createEClass(UI_NODE);
		createEAttribute(uiNodeEClass, UI_NODE__OUTGOING_LINES);
		createEAttribute(uiNodeEClass, UI_NODE__INCOMING_LINES);
		createEReference(uiNodeEClass, UI_NODE__COMMENT_LINKS);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__LINES);
		createEAttribute(diagramEClass, DIAGRAM__SHAPES);
		createEReference(diagramEClass, DIAGRAM__COMMENTS);
		createEReference(diagramEClass, DIAGRAM__COMMENT_LINKS);
		createEAttribute(diagramEClass, DIAGRAM__RULERS);
		createEReference(diagramEClass, DIAGRAM__HORIZONTAL_RULER);
		createEReference(diagramEClass, DIAGRAM__VERTICAL_RULER);
		createEReference(diagramEClass, DIAGRAM__GRID);
		createEAttribute(diagramEClass, DIAGRAM__SNAP_TO_GRID);
		createEAttribute(diagramEClass, DIAGRAM__SNAP_TO_GEOMETRY);

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
		createEAttribute(lineEClass, LINE__STYLE);
		createEAttribute(lineEClass, LINE__LINE_DASH);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__INPUTS);

		commentLinkEClass = createEClass(COMMENT_LINK);
		createEReference(commentLinkEClass, COMMENT_LINK__SOURCE);
		createEReference(commentLinkEClass, COMMENT_LINK__TARGET);

		gridEClass = createEClass(GRID);
		createEAttribute(gridEClass, GRID__COLOR);
		createEAttribute(gridEClass, GRID__SPACING);
		createEAttribute(gridEClass, GRID__STYLE);

		rulerEClass = createEClass(RULER);
		createEAttribute(rulerEClass, RULER__UNIT);
		createEReference(rulerEClass, RULER__GUIDES);

		guideEClass = createEClass(GUIDE);
		createEReference(guideEClass, GUIDE__RULER);
		createEAttribute(guideEClass, GUIDE__POSITION);
		createEReference(guideEClass, GUIDE__ELEMENT_MAP);

		elementEntryEClass = createEClass(ELEMENT_ENTRY);
		createEReference(elementEntryEClass, ELEMENT_ENTRY__KEY);
		createEAttribute(elementEntryEClass, ELEMENT_ENTRY__VALUE);

		// Create enums
		lineStyleEEnum = createEEnum(LINE_STYLE);
		rulerUnitEEnum = createEEnum(RULER_UNIT);
		alignmentEEnum = createEEnum(ALIGNMENT);

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
		uiNodeEClass.getESuperTypes().add(this.getUIElement());
		diagramEClass.getESuperTypes().add(this.getUIElement());
		shapeEClass.getESuperTypes().add(this.getUINode());
		gradientShapeEClass.getESuperTypes().add(this.getShape());
		lineEClass.getESuperTypes().add(this.getUINode());
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

		initEClass(uiNodeEClass, UINode.class, "UINode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUINode_OutgoingLines(),
				ecorePackage.getEFeatureMapEntry(), "outgoingLines", null, 0,
				-1, UINode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUINode_IncomingLines(),
				ecorePackage.getEFeatureMapEntry(), "incomingLines", null, 0,
				-1, UINode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUINode_CommentLinks(), this.getCommentLink(),
				this.getCommentLink_Source(), "commentLinks", null, 0, -1,
				UINode.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT,
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
		initEAttribute(getDiagram_Rulers(), ecorePackage.getEFeatureMapEntry(),
				"rulers", null, 0, -1, Diagram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_HorizontalRuler(), this.getRuler(), null,
				"horizontalRuler", null, 0, 1, Diagram.class, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_VerticalRuler(), this.getRuler(), null,
				"verticalRuler", null, 0, 1, Diagram.class, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Grid(), this.getGrid(), null, "grid", null,
				0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_SnapToGrid(), ecorePackage.getEBoolean(),
				"snapToGrid", null, 0, 1, Diagram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_SnapToGeometry(), ecorePackage.getEBoolean(),
				"snapToGeometry", null, 0, 1, Diagram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT,
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
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE,
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
		initEAttribute(getLine_Style(), this.getLineStyle(), "style", "SOLID",
				0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_LineDash(), ecorePackage.getEInt(), "lineDash",
				null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_Inputs(), this.getCommentLink(),
				this.getCommentLink_Target(), "inputs", null, 0, -1,
				Comment.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commentLinkEClass, CommentLink.class, "CommentLink",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentLink_Source(), this.getUINode(),
				this.getUINode_CommentLinks(), "source", null, 0, 1,
				CommentLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCommentLink_Target(), this.getComment(),
				this.getComment_Inputs(), "target", null, 0, 1,
				CommentLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrid_Color(), ecorePackage.getEInt(), "color", null,
				0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrid_Spacing(), ecorePackage.getEInt(), "spacing",
				null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGrid_Style(), this.getLineStyle(), "style", null, 0,
				1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulerEClass, Ruler.class, "Ruler", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuler_Unit(), this.getRulerUnit(), "unit", "INCHES",
				0, 1, Ruler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuler_Guides(), this.getGuide(),
				this.getGuide_Ruler(), "guides", null, 0, -1, Ruler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(guideEClass, Guide.class, "Guide", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuide_Ruler(), this.getRuler(),
				this.getRuler_Guides(), "ruler", null, 0, 1, Guide.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGuide_Position(), ecorePackage.getEInt(), "position",
				null, 0, 1, Guide.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGuide_ElementMap(), this.getElementEntry(), null,
				"elementMap", null, 0, -1, Guide.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEntryEClass, Map.Entry.class, "ElementEntry",
				!IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementEntry_Key(), this.getUIElement(), null, "key",
				null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementEntry_Value(), this.getAlignment(), "value",
				null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
		addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASH);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOTDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.LINE_CUSTOM);

		initEEnum(rulerUnitEEnum, RulerUnit.class, "RulerUnit");
		addEEnumLiteral(rulerUnitEEnum, RulerUnit.INCHES);
		addEEnumLiteral(rulerUnitEEnum, RulerUnit.CENTIMETERS);
		addEEnumLiteral(rulerUnitEEnum, RulerUnit.PIXELS);

		initEEnum(alignmentEEnum, Alignment.class, "Alignment");
		addEEnumLiteral(alignmentEEnum, Alignment.LEFT);
		addEEnumLiteral(alignmentEEnum, Alignment.CENTER);
		addEEnumLiteral(alignmentEEnum, Alignment.RIGHT);
		addEEnumLiteral(alignmentEEnum, Alignment.TOP);
		addEEnumLiteral(alignmentEEnum, Alignment.BOTTOM);

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
		addAnnotation(getUINode_OutgoingLines(), source, new String[] { "kind",
				"group" });
		addAnnotation(getUINode_IncomingLines(), source, new String[] { "kind",
				"group" });
		addAnnotation(getUINode_CommentLinks(), source, new String[] { "group",
				"#outgoingLines" });
		addAnnotation(getDiagram_Lines(), source, new String[] { "kind",
				"group" });
		addAnnotation(getDiagram_Shapes(), source, new String[] { "kind",
				"group" });
		addAnnotation(getDiagram_Comments(), source, new String[] { "group",
				"#shapes" });
		addAnnotation(getDiagram_CommentLinks(), source, new String[] {
				"group", "#lines" });
		addAnnotation(getDiagram_Rulers(), source, new String[] { "kind",
				"group" });
		addAnnotation(getDiagram_HorizontalRuler(), source, new String[] {
				"group", "#rulers" });
		addAnnotation(getDiagram_VerticalRuler(), source, new String[] {
				"group", "#rulers" });
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
