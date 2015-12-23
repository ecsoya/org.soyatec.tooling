/**
 */
package org.soyatec.tooling.gef.examples.shapes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage
 * @generated
 */
public interface ShapesFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    ShapesFactory eINSTANCE = org.soyatec.tooling.gef.examples.shapes.impl.ShapesFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Graph</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Graph</em>'.
     * @generated
     */
    Graph createGraph();

    /**
     * Returns a new object of class '<em>Ellipse</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Ellipse</em>'.
     * @generated
     */
    Ellipse createEllipse();

    /**
     * Returns a new object of class '<em>Rectangle</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Rectangle</em>'.
     * @generated
     */
    Rectangle createRectangle();

    /**
     * Returns a new object of class '<em>Solid Line</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Solid Line</em>'.
     * @generated
     */
    SolidLine createSolidLine();

    /**
     * Returns a new object of class '<em>Dashed Line</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Dashed Line</em>'.
     * @generated
     */
    DashedLine createDashedLine();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    ShapesPackage getShapesPackage();

} // ShapesFactory
