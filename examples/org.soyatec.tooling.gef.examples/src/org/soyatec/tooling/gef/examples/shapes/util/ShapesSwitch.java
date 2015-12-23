/**
 */
package org.soyatec.tooling.gef.examples.shapes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.soyatec.tooling.gef.examples.shapes.Connection;
import org.soyatec.tooling.gef.examples.shapes.DashedLine;
import org.soyatec.tooling.gef.examples.shapes.Ellipse;
import org.soyatec.tooling.gef.examples.shapes.Graph;
import org.soyatec.tooling.gef.examples.shapes.Rectangle;
import org.soyatec.tooling.gef.examples.shapes.Shape;
import org.soyatec.tooling.gef.examples.shapes.ShapesPackage;
import org.soyatec.tooling.gef.examples.shapes.SolidLine;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage
 * @generated
 */
public class ShapesSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ShapesPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ShapesSwitch() {
        if (modelPackage == null) {
            modelPackage = ShapesPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns
     * a non null result; it yields that result. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code>
     *         call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ShapesPackage.GRAPH: {
            Graph graph = (Graph) theEObject;
            T result = caseGraph(graph);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.SHAPE: {
            Shape shape = (Shape) theEObject;
            T result = caseShape(shape);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.ELLIPSE: {
            Ellipse ellipse = (Ellipse) theEObject;
            T result = caseEllipse(ellipse);
            if (result == null)
                result = caseShape(ellipse);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.RECTANGLE: {
            Rectangle rectangle = (Rectangle) theEObject;
            T result = caseRectangle(rectangle);
            if (result == null)
                result = caseShape(rectangle);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.CONNECTION: {
            Connection connection = (Connection) theEObject;
            T result = caseConnection(connection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.SOLID_LINE: {
            SolidLine solidLine = (SolidLine) theEObject;
            T result = caseSolidLine(solidLine);
            if (result == null)
                result = caseConnection(solidLine);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ShapesPackage.DASHED_LINE: {
            DashedLine dashedLine = (DashedLine) theEObject;
            T result = caseDashedLine(dashedLine);
            if (result == null)
                result = caseConnection(dashedLine);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Graph</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Graph</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGraph(Graph object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Shape</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShape(Shape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Ellipse</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Ellipse</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEllipse(Ellipse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Rectangle</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Rectangle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRectangle(Rectangle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Connection</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnection(Connection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Solid Line</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Solid Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolidLine(SolidLine object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Dashed Line</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Dashed Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDashedLine(DashedLine object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch, but this is
     * the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} // ShapesSwitch
