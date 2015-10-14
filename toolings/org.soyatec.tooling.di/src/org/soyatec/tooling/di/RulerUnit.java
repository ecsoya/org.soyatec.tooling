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
 * <em><b>Ruler Unit</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 *
 * @see org.soyatec.tooling.di.DiPackage#getRulerUnit()
 * @model
 * @generated
 */
public enum RulerUnit implements Enumerator {
	/**
	 * The '<em><b>INCHES</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #INCHES_VALUE
	 * @generated
	 * @ordered
	 */
	INCHES(0, "INCHES", "INCHES"),

	/**
	 * The '<em><b>CENTIMETERS</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #CENTIMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	CENTIMETERS(1, "CENTIMETERS", "CENTIMETERS"),

	/**
	 * The '<em><b>PIXELS</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PIXELS_VALUE
	 * @generated
	 * @ordered
	 */
	PIXELS(2, "PIXELS", "PIXELS");

	/**
	 * The '<em><b>INCHES</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCHES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #INCHES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCHES_VALUE = 0;

	/**
	 * The '<em><b>CENTIMETERS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTIMETERS</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #CENTIMETERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTIMETERS_VALUE = 1;

	/**
	 * The '<em><b>PIXELS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIXELS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #PIXELS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIXELS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ruler Unit</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final RulerUnit[] VALUES_ARRAY = new RulerUnit[] { INCHES,
			CENTIMETERS, PIXELS, };

	/**
	 * A public read-only list of all the '<em><b>Ruler Unit</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<RulerUnit> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ruler Unit</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static RulerUnit get(final String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final RulerUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruler Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static RulerUnit getByName(final String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final RulerUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruler Unit</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static RulerUnit get(final int value) {
		switch (value) {
		case INCHES_VALUE:
			return INCHES;
		case CENTIMETERS_VALUE:
			return CENTIMETERS;
		case PIXELS_VALUE:
			return PIXELS;
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
	private RulerUnit(final int value, final String name, final String literal) {
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

} // RulerUnit
