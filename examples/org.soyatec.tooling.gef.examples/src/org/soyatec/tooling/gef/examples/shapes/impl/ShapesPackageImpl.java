/**
 */
package org.soyatec.tooling.gef.examples.shapes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.soyatec.tooling.gef.examples.shapes.Connection;
import org.soyatec.tooling.gef.examples.shapes.DashedLine;
import org.soyatec.tooling.gef.examples.shapes.Ellipse;
import org.soyatec.tooling.gef.examples.shapes.Graph;
import org.soyatec.tooling.gef.examples.shapes.Rectangle;
import org.soyatec.tooling.gef.examples.shapes.Shape;
import org.soyatec.tooling.gef.examples.shapes.ShapesFactory;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.examples.shapes.SolidLine;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ShapesPackageImpl extends EPackageImpl implements ShapesPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass graphEClass = null;

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
    private EClass ellipseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass rectangleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass connectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass solidLineEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass dashedLineEClass = null;

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
     * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ShapesPackageImpl() {
        super(eNS_URI, ShapesFactory.eINSTANCE);
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
     * This method is used to initialize {@link ShapesPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ShapesPackage init() {
        if (isInited)
            return (ShapesPackage) EPackage.Registry.INSTANCE
                    .getEPackage(ShapesPackage.eNS_URI);

        // Obtain or create and register package
        ShapesPackageImpl theShapesPackage = (ShapesPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new ShapesPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theShapesPackage.createPackageContents();

        // Initialize created meta-data
        theShapesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theShapesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, theShapesPackage);
        return theShapesPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getGraph() {
        return graphEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getGraph_Shapes() {
        return (EReference) graphEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getGraph_Connections() {
        return (EReference) graphEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getShape_Label() {
        return (EAttribute) shapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getEllipse() {
        return ellipseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getRectangle() {
        return rectangleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getConnection() {
        return connectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getConnection_Label() {
        return (EAttribute) connectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getSolidLine() {
        return solidLineEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getDashedLine() {
        return dashedLineEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ShapesFactory getShapesFactory() {
        return (ShapesFactory) getEFactoryInstance();
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
        graphEClass = createEClass(GRAPH);
        createEReference(graphEClass, GRAPH__SHAPES);
        createEReference(graphEClass, GRAPH__CONNECTIONS);

        shapeEClass = createEClass(SHAPE);
        createEAttribute(shapeEClass, SHAPE__LABEL);

        ellipseEClass = createEClass(ELLIPSE);

        rectangleEClass = createEClass(RECTANGLE);

        connectionEClass = createEClass(CONNECTION);
        createEAttribute(connectionEClass, CONNECTION__LABEL);

        solidLineEClass = createEClass(SOLID_LINE);

        dashedLineEClass = createEClass(DASHED_LINE);
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
        ellipseEClass.getESuperTypes().add(this.getShape());
        rectangleEClass.getESuperTypes().add(this.getShape());
        solidLineEClass.getESuperTypes().add(this.getConnection());
        dashedLineEClass.getESuperTypes().add(this.getConnection());

        // Initialize classes, features, and operations; add parameters
        initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGraph_Shapes(), this.getShape(), null, "shapes",
                null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGraph_Connections(), this.getConnection(), null,
                "connections", null, 0, -1, Graph.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getShape_Label(), ecorePackage.getEString(), "label",
                null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(connectionEClass, Connection.class, "Connection",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnection_Label(), ecorePackage.getEString(),
                "label", null, 0, 1, Connection.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(solidLineEClass, SolidLine.class, "SolidLine", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dashedLineEClass, DashedLine.class, "DashedLine",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} // ShapesPackageImpl
