/**
 */
package org.soyatec.tooling.gef.examples.shapes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.gef.examples.shapes.Graph#getShapes <em>Shapes
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.gef.examples.shapes.Graph#getConnections <em>
 * Connections</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.soyatec.tooling.gef.examples.shapes.Shape}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Shapes</em>' containment reference list.
	 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#getGraph_Shapes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shape> getShapes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.soyatec.tooling.gef.examples.shapes.Connection}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Connections</em>' containment reference
	 *         list.
	 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#getGraph_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Graph
