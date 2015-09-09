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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Line</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Line#getColor <em>Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getWidth <em>Width</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getSourceAnchor <em>Source Anchor
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getTargetAnchor <em>Target Anchor
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getSourceShape <em>Source Shape</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getTargetShape <em>Target Shape</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getStyle <em>Style</em>}</li>
 * <li>{@link org.soyatec.tooling.di.Line#getLineDash <em>Line Dash</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends UIElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. The default
	 * value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see org.soyatec.tooling.di.DiPackage#getLine_Color()
	 * @model default="0"
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Line#getColor
	 * <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. The default
	 * value is <code>"1"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.soyatec.tooling.di.DiPackage#getLine_Width()
	 * @model default="1"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Line#getWidth
	 * <em>Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Source Anchor</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Anchor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Anchor</em>' attribute.
	 * @see #setSourceAnchor(String)
	 * @see org.soyatec.tooling.di.DiPackage#getLine_SourceAnchor()
	 * @model
	 * @generated
	 */
	String getSourceAnchor();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Line#getSourceAnchor
	 * <em>Source Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Anchor</em>' attribute.
	 * @see #getSourceAnchor()
	 * @generated
	 */
	void setSourceAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Target Anchor</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Anchor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Anchor</em>' attribute.
	 * @see #setTargetAnchor(String)
	 * @see org.soyatec.tooling.di.DiPackage#getLine_TargetAnchor()
	 * @model
	 * @generated
	 */
	String getTargetAnchor();

	/**
	 * Sets the value of the '
	 * {@link org.soyatec.tooling.di.Line#getTargetAnchor
	 * <em>Target Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Anchor</em>' attribute.
	 * @see #getTargetAnchor()
	 * @generated
	 */
	void setTargetAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Source Shape</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Source Shape</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Shape</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getLine_SourceShape()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getSourceShape();

	/**
	 * Returns the value of the '<em><b>Target Shape</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Target Shape</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Shape</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getLine_TargetShape()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getTargetShape();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute. The default
	 * value is <code>"SOLID"</code>. The literals are from the enumeration
	 * {@link org.soyatec.tooling.di.LineStyle}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.soyatec.tooling.di.LineStyle
	 * @see #setStyle(LineStyle)
	 * @see org.soyatec.tooling.di.DiPackage#getLine_Style()
	 * @model default="SOLID"
	 * @generated
	 */
	LineStyle getStyle();

	/**
	 * Sets the value of the '{@link org.soyatec.tooling.di.Line#getStyle
	 * <em>Style</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' attribute.
	 * @see org.soyatec.tooling.di.LineStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(LineStyle value);

	/**
	 * Returns the value of the '<em><b>Line Dash</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.Integer}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Line Dash</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Line Dash</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getLine_LineDash()
	 * @model
	 * @generated
	 */
	EList<Integer> getLineDash();

} // Line
