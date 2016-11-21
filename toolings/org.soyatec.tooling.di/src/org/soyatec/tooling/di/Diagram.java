/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Soyatec - initial API and implementation
 *******************************************************************************/
/**
 */
package org.soyatec.tooling.di;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Diagram#getComments <em>Comments</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#getCommentLinks <em>Comment Links
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#getRulers <em>Rulers</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#getHorizontalRuler <em>Horizontal
 * Ruler</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#getVerticalRuler <em>Vertical Ruler
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#getGrid <em>Grid</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Diagram#isSnapToGrid <em>Snap To Grid</em>}
 * </li>
 * <li>{@link org.soyatec.tooling.di.Diagram#isSnapToGeometry <em>Snap To
 * Geometry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.soyatec.tooling.di.DiPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends Container {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.soyatec.tooling.di.Comment}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_Comments()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#allShapes'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Comment Links</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.soyatec.tooling.di.CommentLink}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Links</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment Links</em>' containment reference
	 *         list.
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_CommentLinks()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#allLines'"
	 * @generated
	 */
	EList<CommentLink> getCommentLinks();

	/**
	 * Returns the value of the '<em><b>Rulers</b></em>' attribute list. The
	 * list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Rulers</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rulers</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_Rulers()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getRulers();

	/**
	 * Returns the value of the '<em><b>Horizontal Ruler</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Ruler</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Horizontal Ruler</em>' containment
	 *         reference.
	 * @see #setHorizontalRuler(Ruler)
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_HorizontalRuler()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#rulers'"
	 * @generated
	 */
	Ruler getHorizontalRuler();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Diagram#getHorizontalRuler
	 * <em>Horizontal Ruler</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Horizontal Ruler</em>' containment
	 *            reference.
	 * @see #getHorizontalRuler()
	 * @generated
	 */
	void setHorizontalRuler(Ruler value);

	/**
	 * Returns the value of the '<em><b>Vertical Ruler</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Ruler</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vertical Ruler</em>' containment reference.
	 * @see #setVerticalRuler(Ruler)
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_VerticalRuler()
	 * @model containment="true" transient="true" volatile="true"
	 *        extendedMetaData="group='#rulers'"
	 * @generated
	 */
	Ruler getVerticalRuler();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Diagram#getVerticalRuler
	 * <em>Vertical Ruler</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Vertical Ruler</em>' containment
	 *            reference.
	 * @see #getVerticalRuler()
	 * @generated
	 */
	void setVerticalRuler(Ruler value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_Grid()
	 * @model containment="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Diagram#getGrid
	 * <em>Grid</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Snap To Grid</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snap To Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Snap To Grid</em>' attribute.
	 * @see #setSnapToGrid(boolean)
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_SnapToGrid()
	 * @model
	 * @generated
	 */
	boolean isSnapToGrid();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Diagram#isSnapToGrid <em>Snap To Grid</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Snap To Grid</em>' attribute.
	 * @see #isSnapToGrid()
	 * @generated
	 */
	void setSnapToGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Snap To Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snap To Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Snap To Geometry</em>' attribute.
	 * @see #setSnapToGeometry(boolean)
	 * @see org.soyatec.tooling.di.DiPackage#getDiagram_SnapToGeometry()
	 * @model
	 * @generated
	 */
	boolean isSnapToGeometry();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Diagram#isSnapToGeometry
	 * <em>Snap To Geometry</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Snap To Geometry</em>' attribute.
	 * @see #isSnapToGeometry()
	 * @generated
	 */
	void setSnapToGeometry(boolean value);

} // Diagram
