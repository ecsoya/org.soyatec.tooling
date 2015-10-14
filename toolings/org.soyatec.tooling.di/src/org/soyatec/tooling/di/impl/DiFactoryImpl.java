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
package org.soyatec.tooling.di.impl;

import java.util.Map;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.DiFactory;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.LineStyle;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.RulerUnit;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.di.View;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class DiFactoryImpl extends EFactoryImpl implements DiFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public static DiFactory init() {
		try {
			final DiFactory theDiFactory = (DiFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiPackage.eNS_URI);
			if (theDiFactory != null) {
				return theDiFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public DiFactoryImpl() {
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
		case DiPackage.DIAGRAM:
			return createDiagram();
		case DiPackage.SHAPE:
			return createShape();
		case DiPackage.GRADIENT_SHAPE:
			return createGradientShape();
		case DiPackage.CONNECTOR:
			return createConnector();
		case DiPackage.COMMENT:
			return createComment();
		case DiPackage.COMMENT_LINK:
			return createCommentLink();
		case DiPackage.GRID:
			return createGrid();
		case DiPackage.RULER:
			return createRuler();
		case DiPackage.GUIDE:
			return createGuide();
		case DiPackage.ELEMENT_ENTRY:
			return (EObject) createElementEntry();
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
	@Override
	public Object createFromString(final EDataType eDataType,
			final String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DiPackage.LINE_STYLE:
			return createLineStyleFromString(eDataType, initialValue);
		case DiPackage.RULER_UNIT:
			return createRulerUnitFromString(eDataType, initialValue);
		case DiPackage.ALIGNMENT:
			return createAlignmentFromString(eDataType, initialValue);
		case DiPackage.RECTANGLE:
			return createRectangleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(final EDataType eDataType,
			final Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DiPackage.LINE_STYLE:
			return convertLineStyleToString(eDataType, instanceValue);
		case DiPackage.RULER_UNIT:
			return convertRulerUnitToString(eDataType, instanceValue);
		case DiPackage.ALIGNMENT:
			return convertAlignmentToString(eDataType, instanceValue);
		case DiPackage.RECTANGLE:
			return convertRectangleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Diagram createDiagram() {
		final DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Shape createShape() {
		final ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GradientShape createGradientShape() {
		final GradientShapeImpl gradientShape = new GradientShapeImpl();
		return gradientShape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Connector createConnector() {
		final ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Comment createComment() {
		final CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CommentLink createCommentLink() {
		final CommentLinkImpl commentLink = new CommentLinkImpl();
		return commentLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Grid createGrid() {
		final GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Ruler createRuler() {
		final RulerImpl ruler = new RulerImpl();
		return ruler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Guide createGuide() {
		final GuideImpl guide = new GuideImpl();
		return guide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Map.Entry<View, Alignment> createElementEntry() {
		final ElementEntryImpl elementEntry = new ElementEntryImpl();
		return elementEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LineStyle createLineStyleFromString(final EDataType eDataType,
			final String initialValue) {
		final LineStyle result = LineStyle.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertLineStyleToString(final EDataType eDataType,
			final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public RulerUnit createRulerUnitFromString(final EDataType eDataType,
			final String initialValue) {
		final RulerUnit result = RulerUnit.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertRulerUnitToString(final EDataType eDataType,
			final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Alignment createAlignmentFromString(final EDataType eDataType,
			final String initialValue) {
		final Alignment result = Alignment.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertAlignmentToString(final EDataType eDataType,
			final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(final EDataType eDataType,
			final String initialValue) {
		if (initialValue != null) {
			final String[] splits = initialValue.split(",");
			if (splits.length == 4) {
				final Rectangle r = new Rectangle();
				try {
					r.x = Integer.parseInt(splits[0].trim());
					r.y = Integer.parseInt(splits[1].trim());
					r.width = Integer.parseInt(splits[2].trim());
					r.height = Integer.parseInt(splits[3].trim());
				} catch (final NumberFormatException e) {
					e.printStackTrace();
				}
				return r;
			}
		}
		return (Rectangle) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public String convertRectangleToString(final EDataType eDataType,
			final Object instanceValue) {
		final Rectangle r = (Rectangle) instanceValue;
		if (r != null) {
			return r.x + "," + r.y + "," + r.width + "," + r.height;
		}
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DiPackage getDiPackage() {
		return (DiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiPackage getPackage() {
		return DiPackage.eINSTANCE;
	}

} // DiFactoryImpl
