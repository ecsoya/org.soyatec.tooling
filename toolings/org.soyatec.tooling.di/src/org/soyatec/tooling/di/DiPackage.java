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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.soyatec.tooling.di.DiFactory
 * @model kind="package"
 * @generated
 */
public interface DiPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "di";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.soyatec.org/2015/DiagramInterchangeSpecification";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "di";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DiPackage eINSTANCE = org.soyatec.tooling.di.impl.DiPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.UIObjectImpl <em>UI Object</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.UIObjectImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUIObject()
	 * @generated
	 */
	int UI_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT__ID = 1;

	/**
	 * The number of structural features of the '<em>UI Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UI Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.UIElementImpl <em>UI Element</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.UIElementImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUIElement()
	 * @generated
	 */
	int UI_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__LABEL = UI_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ID = UI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ELEMENT = UI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_FEATURE_COUNT = UI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_OPERATION_COUNT = UI_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.UINodeImpl <em>UI Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.UINodeImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUINode()
	 * @generated
	 */
	int UI_NODE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__LABEL = UI_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__ELEMENT = UI_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__OUTGOING_LINES = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__INCOMING_LINES = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE__COMMENT_LINKS = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>UI Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_NODE_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.DiagramImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LABEL = UI_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENT = UI_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LINES = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHAPES = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COMMENTS = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COMMENT_LINKS = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rulers</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__RULERS = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontal Ruler</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__HORIZONTAL_RULER = UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vertical Ruler</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VERTICAL_RULER = UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__GRID = UI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Snap To Grid</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SNAP_TO_GRID = UI_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Snap To Geometry</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SNAP_TO_GEOMETRY = UI_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Diagram</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = UI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.impl.ShapeImpl
	 * <em>Shape</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.ShapeImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__LABEL = UI_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = UI_NODE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__ELEMENT = UI_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTGOING_LINES = UI_NODE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__INCOMING_LINES = UI_NODE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__COMMENT_LINKS = UI_NODE__COMMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__BACKGROUND = UI_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOREGROUND = UI_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = UI_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = UI_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = UI_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.GradientShapeImpl
	 * <em>Gradient Shape</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.GradientShapeImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGradientShape()
	 * @generated
	 */
	int GRADIENT_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__ELEMENT = SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__OUTGOING_LINES = SHAPE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__INCOMING_LINES = SHAPE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__COMMENT_LINKS = SHAPE__COMMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__BACKGROUND = SHAPE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__FOREGROUND = SHAPE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Using Gradient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__USING_GRADIENT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gradient Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__GRADIENT_COLOR = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Gradient</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE__VERTICAL_GRADIENT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gradient Shape</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gradient Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.impl.LineImpl
	 * <em>Line</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.LineImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__LABEL = UI_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__ID = UI_NODE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__ELEMENT = UI_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__OUTGOING_LINES = UI_NODE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__INCOMING_LINES = UI_NODE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__COMMENT_LINKS = UI_NODE__COMMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__COLOR = UI_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__WIDTH = UI_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Anchor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_ANCHOR = UI_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Anchor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_ANCHOR = UI_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Shape</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_SHAPE = UI_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Shape</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_SHAPE = UI_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE = UI_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_DASH = UI_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = UI_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = UI_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.CommentImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ELEMENT = SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OUTGOING_LINES = SHAPE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__INCOMING_LINES = SHAPE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT_LINKS = SHAPE__COMMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__BACKGROUND = SHAPE__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__FOREGROUND = SHAPE__FOREGROUND;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__INPUTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.CommentLinkImpl <em>Comment Link</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.CommentLinkImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getCommentLink()
	 * @generated
	 */
	int COMMENT_LINK = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__LABEL = LINE__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__ID = LINE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__ELEMENT = LINE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__OUTGOING_LINES = LINE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__INCOMING_LINES = LINE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Comment Links</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__COMMENT_LINKS = LINE__COMMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__COLOR = LINE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__WIDTH = LINE__WIDTH;

	/**
	 * The feature id for the '<em><b>Source Anchor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__SOURCE_ANCHOR = LINE__SOURCE_ANCHOR;

	/**
	 * The feature id for the '<em><b>Target Anchor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__TARGET_ANCHOR = LINE__TARGET_ANCHOR;

	/**
	 * The feature id for the '<em><b>Source Shape</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__SOURCE_SHAPE = LINE__SOURCE_SHAPE;

	/**
	 * The feature id for the '<em><b>Target Shape</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__TARGET_SHAPE = LINE__TARGET_SHAPE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__STYLE = LINE__STYLE;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__LINE_DASH = LINE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__SOURCE = LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK__TARGET = LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment Link</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment Link</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINK_OPERATION_COUNT = LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.impl.GridImpl
	 * <em>Grid</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.GridImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 9;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRID__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRID__SPACING = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRID__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.impl.RulerImpl
	 * <em>Ruler</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.RulerImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRuler()
	 * @generated
	 */
	int RULER = 10;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RULER__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Guides</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RULER__GUIDES = 1;

	/**
	 * The number of structural features of the '<em>Ruler</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RULER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ruler</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.impl.GuideImpl
	 * <em>Guide</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.impl.GuideImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGuide()
	 * @generated
	 */
	int GUIDE = 11;

	/**
	 * The feature id for the '<em><b>Ruler</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GUIDE__RULER = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GUIDE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Element Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GUIDE__ELEMENT_MAP = 2;

	/**
	 * The number of structural features of the '<em>Guide</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GUIDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Guide</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GUIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.di.impl.ElementEntryImpl
	 * <em>Element Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.soyatec.tooling.di.impl.ElementEntryImpl
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getElementEntry()
	 * @generated
	 */
	int ELEMENT_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Element Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Entry</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.LineStyle
	 * <em>Line Style</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.LineStyle
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 13;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.RulerUnit
	 * <em>Ruler Unit</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.RulerUnit
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRulerUnit()
	 * @generated
	 */
	int RULER_UNIT = 14;

	/**
	 * The meta object id for the '{@link org.soyatec.tooling.di.Alignment
	 * <em>Alignment</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.di.Alignment
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 15;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 16;

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.di.UIObject <em>UI Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UI Object</em>'.
	 * @see org.soyatec.tooling.di.UIObject
	 * @generated
	 */
	EClass getUIObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.UIObject#getLabel <em>Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.soyatec.tooling.di.UIObject#getLabel()
	 * @see #getUIObject()
	 * @generated
	 */
	EAttribute getUIObject_Label();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.UIObject#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.soyatec.tooling.di.UIObject#getId()
	 * @see #getUIObject()
	 * @generated
	 */
	EAttribute getUIObject_Id();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.di.UIElement <em>UI Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UI Element</em>'.
	 * @see org.soyatec.tooling.di.UIElement
	 * @generated
	 */
	EClass getUIElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.soyatec.tooling.di.UIElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.soyatec.tooling.di.UIElement#getElement()
	 * @see #getUIElement()
	 * @generated
	 */
	EReference getUIElement_Element();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.UINode
	 * <em>UI Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UI Node</em>'.
	 * @see org.soyatec.tooling.di.UINode
	 * @generated
	 */
	EClass getUINode();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.UINode#getOutgoingLines
	 * <em>Outgoing Lines</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Outgoing Lines</em>'.
	 * @see org.soyatec.tooling.di.UINode#getOutgoingLines()
	 * @see #getUINode()
	 * @generated
	 */
	EAttribute getUINode_OutgoingLines();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.UINode#getIncomingLines
	 * <em>Incoming Lines</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Incoming Lines</em>'.
	 * @see org.soyatec.tooling.di.UINode#getIncomingLines()
	 * @see #getUINode()
	 * @generated
	 */
	EAttribute getUINode_IncomingLines();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.soyatec.tooling.di.UINode#getCommentLinks
	 * <em>Comment Links</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Comment Links</em>'.
	 * @see org.soyatec.tooling.di.UINode#getCommentLinks()
	 * @see #getUINode()
	 * @generated
	 */
	EReference getUINode_CommentLinks();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Diagram
	 * <em>Diagram</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.soyatec.tooling.di.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Diagram#getLines <em>Lines</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getLines()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Lines();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Diagram#getShapes <em>Shapes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Shapes</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getShapes()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Shapes();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.di.Diagram#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Comments</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getComments()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Comments();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.di.Diagram#getCommentLinks
	 * <em>Comment Links</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Comment Links</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getCommentLinks()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_CommentLinks();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Diagram#getRulers <em>Rulers</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Rulers</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getRulers()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Rulers();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.soyatec.tooling.di.Diagram#getHorizontalRuler
	 * <em>Horizontal Ruler</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Horizontal Ruler</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getHorizontalRuler()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_HorizontalRuler();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.soyatec.tooling.di.Diagram#getVerticalRuler
	 * <em>Vertical Ruler</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Vertical Ruler</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getVerticalRuler()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_VerticalRuler();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.soyatec.tooling.di.Diagram#getGrid <em>Grid</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see org.soyatec.tooling.di.Diagram#getGrid()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Grid();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Diagram#isSnapToGrid <em>Snap To Grid</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Snap To Grid</em>'.
	 * @see org.soyatec.tooling.di.Diagram#isSnapToGrid()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_SnapToGrid();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Diagram#isSnapToGeometry
	 * <em>Snap To Geometry</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Snap To Geometry</em>'.
	 * @see org.soyatec.tooling.di.Diagram#isSnapToGeometry()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_SnapToGeometry();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Shape
	 * <em>Shape</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.soyatec.tooling.di.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Shape#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.soyatec.tooling.di.Shape#getBackground()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Background();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Shape#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see org.soyatec.tooling.di.Shape#getForeground()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Foreground();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Shape#getBounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see org.soyatec.tooling.di.Shape#getBounds()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Bounds();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.di.GradientShape <em>Gradient Shape</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Gradient Shape</em>'.
	 * @see org.soyatec.tooling.di.GradientShape
	 * @generated
	 */
	EClass getGradientShape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.GradientShape#isUsingGradient
	 * <em>Using Gradient</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Using Gradient</em>'.
	 * @see org.soyatec.tooling.di.GradientShape#isUsingGradient()
	 * @see #getGradientShape()
	 * @generated
	 */
	EAttribute getGradientShape_UsingGradient();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.GradientShape#getGradientColor
	 * <em>Gradient Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Gradient Color</em>'.
	 * @see org.soyatec.tooling.di.GradientShape#getGradientColor()
	 * @see #getGradientShape()
	 * @generated
	 */
	EAttribute getGradientShape_GradientColor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.GradientShape#isVerticalGradient
	 * <em>Vertical Gradient</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Vertical Gradient</em>'.
	 * @see org.soyatec.tooling.di.GradientShape#isVerticalGradient()
	 * @see #getGradientShape()
	 * @generated
	 */
	EAttribute getGradientShape_VerticalGradient();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Line
	 * <em>Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.soyatec.tooling.di.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Line#getColor <em>Color</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.soyatec.tooling.di.Line#getColor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Color();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Line#getWidth <em>Width</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.soyatec.tooling.di.Line#getWidth()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Line#getSourceAnchor
	 * <em>Source Anchor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Anchor</em>'.
	 * @see org.soyatec.tooling.di.Line#getSourceAnchor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SourceAnchor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Line#getTargetAnchor
	 * <em>Target Anchor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target Anchor</em>'.
	 * @see org.soyatec.tooling.di.Line#getTargetAnchor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_TargetAnchor();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Line#getSourceShape <em>Source Shape</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Source Shape</em>'.
	 * @see org.soyatec.tooling.di.Line#getSourceShape()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SourceShape();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Line#getTargetShape <em>Target Shape</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Target Shape</em>'.
	 * @see org.soyatec.tooling.di.Line#getTargetShape()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_TargetShape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Line#getStyle <em>Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.soyatec.tooling.di.Line#getStyle()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Style();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.soyatec.tooling.di.Line#getLineDash <em>Line Dash</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Line Dash</em>'.
	 * @see org.soyatec.tooling.di.Line#getLineDash()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_LineDash();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Comment
	 * <em>Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.soyatec.tooling.di.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.soyatec.tooling.di.Comment#getInputs <em>Inputs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.soyatec.tooling.di.Comment#getInputs()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Inputs();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.di.CommentLink <em>Comment Link</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment Link</em>'.
	 * @see org.soyatec.tooling.di.CommentLink
	 * @generated
	 */
	EClass getCommentLink();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.soyatec.tooling.di.CommentLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.soyatec.tooling.di.CommentLink#getSource()
	 * @see #getCommentLink()
	 * @generated
	 */
	EReference getCommentLink_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.soyatec.tooling.di.CommentLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.soyatec.tooling.di.CommentLink#getTarget()
	 * @see #getCommentLink()
	 * @generated
	 */
	EReference getCommentLink_Target();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Grid
	 * <em>Grid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see org.soyatec.tooling.di.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Grid#getColor <em>Color</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.soyatec.tooling.di.Grid#getColor()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Color();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Grid#getSpacing <em>Spacing</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.soyatec.tooling.di.Grid#getSpacing()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Spacing();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Grid#getStyle <em>Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.soyatec.tooling.di.Grid#getStyle()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Style();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Ruler
	 * <em>Ruler</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ruler</em>'.
	 * @see org.soyatec.tooling.di.Ruler
	 * @generated
	 */
	EClass getRuler();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Ruler#getUnit <em>Unit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.soyatec.tooling.di.Ruler#getUnit()
	 * @see #getRuler()
	 * @generated
	 */
	EAttribute getRuler_Unit();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.di.Ruler#getGuides <em>Guides</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Guides</em>'.
	 * @see org.soyatec.tooling.di.Ruler#getGuides()
	 * @see #getRuler()
	 * @generated
	 */
	EReference getRuler_Guides();

	/**
	 * Returns the meta object for class '{@link org.soyatec.tooling.di.Guide
	 * <em>Guide</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Guide</em>'.
	 * @see org.soyatec.tooling.di.Guide
	 * @generated
	 */
	EClass getGuide();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.soyatec.tooling.di.Guide#getRuler <em>Ruler</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Ruler</em>'.
	 * @see org.soyatec.tooling.di.Guide#getRuler()
	 * @see #getGuide()
	 * @generated
	 */
	EReference getGuide_Ruler();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.di.Guide#getPosition <em>Position</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.soyatec.tooling.di.Guide#getPosition()
	 * @see #getGuide()
	 * @generated
	 */
	EAttribute getGuide_Position();

	/**
	 * Returns the meta object for the map '
	 * {@link org.soyatec.tooling.di.Guide#getElementMap <em>Element Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Element Map</em>'.
	 * @see org.soyatec.tooling.di.Guide#getElementMap()
	 * @see #getGuide()
	 * @generated
	 */
	EReference getGuide_ElementMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry
	 * <em>Element Entry</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.soyatec.tooling.di.UIElement" keyRequired="true"
	 *        valueDataType="org.soyatec.tooling.di.Alignment"
	 * @generated
	 */
	EClass getElementEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry
	 * <em>Key</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getElementEntry()
	 * @generated
	 */
	EReference getElementEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getElementEntry()
	 * @generated
	 */
	EAttribute getElementEntry_Value();

	/**
	 * Returns the meta object for enum '
	 * {@link org.soyatec.tooling.di.LineStyle <em>Line Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see org.soyatec.tooling.di.LineStyle
	 * @generated
	 */
	EEnum getLineStyle();

	/**
	 * Returns the meta object for enum '
	 * {@link org.soyatec.tooling.di.RulerUnit <em>Ruler Unit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Ruler Unit</em>'.
	 * @see org.soyatec.tooling.di.RulerUnit
	 * @generated
	 */
	EEnum getRulerUnit();

	/**
	 * Returns the meta object for enum '
	 * {@link org.soyatec.tooling.di.Alignment <em>Alignment</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see org.soyatec.tooling.di.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiFactory getDiFactory();

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
		 * {@link org.soyatec.tooling.di.impl.UIObjectImpl <em>UI Object</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.UIObjectImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUIObject()
		 * @generated
		 */
		EClass UI_OBJECT = eINSTANCE.getUIObject();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UI_OBJECT__LABEL = eINSTANCE.getUIObject_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UI_OBJECT__ID = eINSTANCE.getUIObject_Id();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.UIElementImpl <em>UI Element</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.UIElementImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUIElement()
		 * @generated
		 */
		EClass UI_ELEMENT = eINSTANCE.getUIElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UI_ELEMENT__ELEMENT = eINSTANCE.getUIElement_Element();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.UINodeImpl <em>UI Node</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.UINodeImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getUINode()
		 * @generated
		 */
		EClass UI_NODE = eINSTANCE.getUINode();

		/**
		 * The meta object literal for the '<em><b>Outgoing Lines</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UI_NODE__OUTGOING_LINES = eINSTANCE
				.getUINode_OutgoingLines();

		/**
		 * The meta object literal for the '<em><b>Incoming Lines</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UI_NODE__INCOMING_LINES = eINSTANCE
				.getUINode_IncomingLines();

		/**
		 * The meta object literal for the '<em><b>Comment Links</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UI_NODE__COMMENT_LINKS = eINSTANCE.getUINode_CommentLinks();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.DiagramImpl <em>Diagram</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.DiagramImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__LINES = eINSTANCE.getDiagram_Lines();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__SHAPES = eINSTANCE.getDiagram_Shapes();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM__COMMENTS = eINSTANCE.getDiagram_Comments();

		/**
		 * The meta object literal for the '<em><b>Comment Links</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM__COMMENT_LINKS = eINSTANCE.getDiagram_CommentLinks();

		/**
		 * The meta object literal for the '<em><b>Rulers</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__RULERS = eINSTANCE.getDiagram_Rulers();

		/**
		 * The meta object literal for the '<em><b>Horizontal Ruler</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM__HORIZONTAL_RULER = eINSTANCE
				.getDiagram_HorizontalRuler();

		/**
		 * The meta object literal for the '<em><b>Vertical Ruler</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM__VERTICAL_RULER = eINSTANCE
				.getDiagram_VerticalRuler();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM__GRID = eINSTANCE.getDiagram_Grid();

		/**
		 * The meta object literal for the '<em><b>Snap To Grid</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__SNAP_TO_GRID = eINSTANCE.getDiagram_SnapToGrid();

		/**
		 * The meta object literal for the '<em><b>Snap To Geometry</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__SNAP_TO_GEOMETRY = eINSTANCE
				.getDiagram_SnapToGeometry();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.ShapeImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SHAPE__BACKGROUND = eINSTANCE.getShape_Background();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SHAPE__FOREGROUND = eINSTANCE.getShape_Foreground();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.GradientShapeImpl
		 * <em>Gradient Shape</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.GradientShapeImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGradientShape()
		 * @generated
		 */
		EClass GRADIENT_SHAPE = eINSTANCE.getGradientShape();

		/**
		 * The meta object literal for the '<em><b>Using Gradient</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_SHAPE__USING_GRADIENT = eINSTANCE
				.getGradientShape_UsingGradient();

		/**
		 * The meta object literal for the '<em><b>Gradient Color</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_SHAPE__GRADIENT_COLOR = eINSTANCE
				.getGradientShape_GradientColor();

		/**
		 * The meta object literal for the '<em><b>Vertical Gradient</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_SHAPE__VERTICAL_GRADIENT = eINSTANCE
				.getGradientShape_VerticalGradient();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.LineImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__COLOR = eINSTANCE.getLine_Color();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__WIDTH = eINSTANCE.getLine_Width();

		/**
		 * The meta object literal for the '<em><b>Source Anchor</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__SOURCE_ANCHOR = eINSTANCE.getLine_SourceAnchor();

		/**
		 * The meta object literal for the '<em><b>Target Anchor</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__TARGET_ANCHOR = eINSTANCE.getLine_TargetAnchor();

		/**
		 * The meta object literal for the '<em><b>Source Shape</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__SOURCE_SHAPE = eINSTANCE.getLine_SourceShape();

		/**
		 * The meta object literal for the '<em><b>Target Shape</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__TARGET_SHAPE = eINSTANCE.getLine_TargetShape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__STYLE = eINSTANCE.getLine_Style();

		/**
		 * The meta object literal for the '<em><b>Line Dash</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LINE__LINE_DASH = eINSTANCE.getLine_LineDash();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.CommentImpl <em>Comment</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.CommentImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__INPUTS = eINSTANCE.getComment_Inputs();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.CommentLinkImpl
		 * <em>Comment Link</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.CommentLinkImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getCommentLink()
		 * @generated
		 */
		EClass COMMENT_LINK = eINSTANCE.getCommentLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT_LINK__SOURCE = eINSTANCE.getCommentLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT_LINK__TARGET = eINSTANCE.getCommentLink_Target();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.GridImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRID__COLOR = eINSTANCE.getGrid_Color();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRID__SPACING = eINSTANCE.getGrid_Spacing();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRID__STYLE = eINSTANCE.getGrid_Style();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.RulerImpl <em>Ruler</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.RulerImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRuler()
		 * @generated
		 */
		EClass RULER = eINSTANCE.getRuler();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RULER__UNIT = eINSTANCE.getRuler_Unit();

		/**
		 * The meta object literal for the '<em><b>Guides</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RULER__GUIDES = eINSTANCE.getRuler_Guides();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.GuideImpl <em>Guide</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.GuideImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getGuide()
		 * @generated
		 */
		EClass GUIDE = eINSTANCE.getGuide();

		/**
		 * The meta object literal for the '<em><b>Ruler</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GUIDE__RULER = eINSTANCE.getGuide_Ruler();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GUIDE__POSITION = eINSTANCE.getGuide_Position();

		/**
		 * The meta object literal for the '<em><b>Element Map</b></em>' map
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GUIDE__ELEMENT_MAP = eINSTANCE.getGuide_ElementMap();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.impl.ElementEntryImpl
		 * <em>Element Entry</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.impl.ElementEntryImpl
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getElementEntry()
		 * @generated
		 */
		EClass ELEMENT_ENTRY = eINSTANCE.getElementEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT_ENTRY__KEY = eINSTANCE.getElementEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_ENTRY__VALUE = eINSTANCE.getElementEntry_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.LineStyle
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getLineStyle()
		 * @generated
		 */
		EEnum LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.RulerUnit <em>Ruler Unit</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.RulerUnit
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRulerUnit()
		 * @generated
		 */
		EEnum RULER_UNIT = eINSTANCE.getRulerUnit();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.di.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.di.Alignment
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see org.soyatec.tooling.di.impl.DiPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} // DiPackage
