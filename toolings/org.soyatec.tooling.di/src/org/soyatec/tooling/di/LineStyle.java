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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Line Style</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see org.soyatec.tooling.di.DiPackage#getLineStyle()
 * @model
 * @generated
 */
public enum LineStyle implements Enumerator {
	/**
	 * The '<em><b>SOLID</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	SOLID(1, "SOLID", "SOLID"),

	/**
	 * The '<em><b>DASH</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DASH_VALUE
	 * @generated
	 * @ordered
	 */
	DASH(2, "DASH", "DASH"),

	/**
	 * The '<em><b>DOT</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DOT_VALUE
	 * @generated
	 * @ordered
	 */
	DOT(3, "DOT", "DOT"),

	/**
	 * The '<em><b>DASHDOT</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DASHDOT_VALUE
	 * @generated
	 * @ordered
	 */
	DASHDOT(4, "DASHDOT", "DASHDOT"),

	/**
	 * The '<em><b>DASHDOTDOT</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DASHDOTDOT_VALUE
	 * @generated
	 * @ordered
	 */
	DASHDOTDOT(5, "DASHDOTDOT", "DASHDOTDOT"),

	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #LINE_CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_CUSTOM(6, "LINE_CUSTOM", "LINE_CUSTOM");

	/**
	 * The '<em><b>SOLID</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SOLID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_VALUE = 1;

	/**
	 * The '<em><b>DASH</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DASH_VALUE = 2;

	/**
	 * The '<em><b>DOT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOT</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOT_VALUE = 3;

	/**
	 * The '<em><b>DASHDOT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DASHDOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DASHDOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DASHDOT_VALUE = 4;

	/**
	 * The '<em><b>DASHDOTDOT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DASHDOTDOT</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DASHDOTDOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DASHDOTDOT_VALUE = 5;

	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE CUSTOM</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #LINE_CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_CUSTOM_VALUE = 6;

	/**
	 * An array of all the '<em><b>Line Style</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final LineStyle[] VALUES_ARRAY = new LineStyle[] { SOLID,
			DASH, DOT, DASHDOT, DASHDOTDOT, LINE_CUSTOM, };

	/**
	 * A public read-only list of all the '<em><b>Line Style</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<LineStyle> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LineStyle get(final String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final LineStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LineStyle getByName(final String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final LineStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Style</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LineStyle get(final int value) {
		switch (value) {
		case SOLID_VALUE:
			return SOLID;
		case DASH_VALUE:
			return DASH;
		case DOT_VALUE:
			return DOT;
		case DASHDOT_VALUE:
			return DASHDOT;
		case DASHDOTDOT_VALUE:
			return DASHDOTDOT;
		case LINE_CUSTOM_VALUE:
			return LINE_CUSTOM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private LineStyle(final int value, final String name, final String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // LineStyle
