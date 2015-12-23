/**
 */
package org.soyatec.tooling.gef.examples.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.gef.examples.shapes.Shape#getLabel <em>Label
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends EObject {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.soyatec.tooling.gef.examples.shapes.ShapesPackage#getShape_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '
     * {@link org.soyatec.tooling.gef.examples.shapes.Shape#getLabel
     * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // Shape
