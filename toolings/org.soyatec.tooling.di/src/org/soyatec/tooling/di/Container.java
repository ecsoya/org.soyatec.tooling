/**
 */
package org.soyatec.tooling.di;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Container#getChildren <em>Children</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Container#getLines <em>Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Container#getAllLines <em>All Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Container#getAllShapes <em>All Shapes</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends View {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type {@link org.soyatec.tooling.di.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getContainer_Children()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#allShapes'"
	 * @generated
	 */
	EList<Shape> getChildren();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference
	 * list. The list contents are of type {@link org.soyatec.tooling.di.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getContainer_Lines()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#allLines'"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>All Lines</b></em>' attribute list. The
	 * list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>All Lines</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All Lines</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getContainer_AllLines()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getAllLines();

	/**
	 * Returns the value of the '<em><b>All Shapes</b></em>' attribute list. The
	 * list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>All Shapes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All Shapes</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getContainer_AllShapes()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getAllShapes();

} // Container
