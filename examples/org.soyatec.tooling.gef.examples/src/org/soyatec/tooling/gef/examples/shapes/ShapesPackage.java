/**
 */
package org.soyatec.tooling.gef.examples.shapes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.soyatec.tooling.gef.examples.shapes.ShapesFactory
 * @model kind="package"
 * @generated
 */
public interface ShapesPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "shapes";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.soyatec.org/2016/Tooling/Examples/Shapes";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ecsoya";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ShapesPackage eINSTANCE = org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.GraphImpl
	 * <em>Graph</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.GraphImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.ShapeImpl
	 * <em>Shape</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapeImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.EllipseImpl
	 * <em>Ellipse</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.EllipseImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LABEL = SHAPE__LABEL;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.RectangleImpl
	 * <em>Rectangle</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.RectangleImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LABEL = SHAPE__LABEL;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.ConnectionImpl
	 * <em>Connection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ConnectionImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.SolidLineImpl
	 * <em>Solid Line</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.SolidLineImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getSolidLine()
	 * @generated
	 */
	int SOLID_LINE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLID_LINE__LABEL = CONNECTION__LABEL;

	/**
	 * The number of structural features of the '<em>Solid Line</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLID_LINE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Solid Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOLID_LINE_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.soyatec.tooling.gef.examples.shapes.impl.DashedLineImpl
	 * <em>Dashed Line</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.DashedLineImpl
	 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getDashedLine()
	 * @generated
	 */
	int DASHED_LINE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DASHED_LINE__LABEL = CONNECTION__LABEL;

	/**
	 * The number of structural features of the '<em>Dashed Line</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DASHED_LINE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dashed Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DASHED_LINE_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Graph#getShapes
	 * <em>Shapes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Shapes</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Graph#getShapes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Shapes();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Graph#getConnections
	 * <em>Connections</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Connections</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Graph#getConnections()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Connections();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Shape#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Shape#getLabel()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Label();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Ellipse <em>Ellipse</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Rectangle
	 * <em>Rectangle</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Connection
	 * <em>Connection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.soyatec.tooling.gef.examples.shapes.Connection#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.Connection#getLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Label();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.SolidLine
	 * <em>Solid Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Solid Line</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.SolidLine
	 * @generated
	 */
	EClass getSolidLine();

	/**
	 * Returns the meta object for class '
	 * {@link org.soyatec.tooling.gef.examples.shapes.DashedLine
	 * <em>Dashed Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dashed Line</em>'.
	 * @see org.soyatec.tooling.gef.examples.shapes.DashedLine
	 * @generated
	 */
	EClass getDashedLine();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapesFactory getShapesFactory();

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
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.GraphImpl
		 * <em>Graph</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.GraphImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH__SHAPES = eINSTANCE.getGraph_Shapes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH__CONNECTIONS = eINSTANCE.getGraph_Connections();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.ShapeImpl
		 * <em>Shape</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapeImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SHAPE__LABEL = eINSTANCE.getShape_Label();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.EllipseImpl
		 * <em>Ellipse</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.EllipseImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.RectangleImpl
		 * <em>Rectangle</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.RectangleImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.ConnectionImpl
		 * <em>Connection</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ConnectionImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONNECTION__LABEL = eINSTANCE.getConnection_Label();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.SolidLineImpl
		 * <em>Solid Line</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.SolidLineImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getSolidLine()
		 * @generated
		 */
		EClass SOLID_LINE = eINSTANCE.getSolidLine();

		/**
		 * The meta object literal for the '
		 * {@link org.soyatec.tooling.gef.examples.shapes.impl.DashedLineImpl
		 * <em>Dashed Line</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.DashedLineImpl
		 * @see org.soyatec.tooling.gef.examples.shapes.impl.ShapesPackageImpl#getDashedLine()
		 * @generated
		 */
		EClass DASHED_LINE = eINSTANCE.getDashedLine();

	}

} // ShapesPackage
