/**
 */
package org.soyatec.tooling.gef.examples.shapes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.soyatec.tooling.gef.examples.shapes.DashedLine;
import org.soyatec.tooling.gef.examples.shapes.Ellipse;
import org.soyatec.tooling.gef.examples.shapes.Graph;
import org.soyatec.tooling.gef.examples.shapes.Rectangle;
import org.soyatec.tooling.gef.examples.shapes.ShapesFactory;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.examples.shapes.SolidLine;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ShapesFactoryImpl extends EFactoryImpl implements ShapesFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ShapesFactory init() {
		try {
			final ShapesFactory theShapesFactory = (ShapesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ShapesPackage.eNS_URI);
			if (theShapesFactory != null) {
				return theShapesFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShapesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ShapesFactoryImpl() {
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
		case ShapesPackage.GRAPH:
			return createGraph();
		case ShapesPackage.ELLIPSE:
			return createEllipse();
		case ShapesPackage.RECTANGLE:
			return createRectangle();
		case ShapesPackage.SOLID_LINE:
			return createSolidLine();
		case ShapesPackage.DASHED_LINE:
			return createDashedLine();
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
	public Graph createGraph() {
		final GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ellipse createEllipse() {
		final EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Rectangle createRectangle() {
		final RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SolidLine createSolidLine() {
		final SolidLineImpl solidLine = new SolidLineImpl();
		return solidLine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DashedLine createDashedLine() {
		final DashedLineImpl dashedLine = new DashedLineImpl();
		return dashedLine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ShapesPackage getShapesPackage() {
		return (ShapesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShapesPackage getPackage() {
		return ShapesPackage.eINSTANCE;
	}

} // ShapesFactoryImpl
