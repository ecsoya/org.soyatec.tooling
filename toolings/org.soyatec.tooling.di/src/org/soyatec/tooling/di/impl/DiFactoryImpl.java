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
			DiFactory theDiFactory = (DiFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiPackage.eNS_URI);
			if (theDiFactory != null) {
				return theDiFactory;
			}
		} catch (Exception exception) {
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
	public EObject create(EClass eClass) {
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
	public Object createFromString(EDataType eDataType, String initialValue) {
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
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
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GradientShape createGradientShape() {
		GradientShapeImpl gradientShape = new GradientShapeImpl();
		return gradientShape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CommentLink createCommentLink() {
		CommentLinkImpl commentLink = new CommentLinkImpl();
		return commentLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ruler createRuler() {
		RulerImpl ruler = new RulerImpl();
		return ruler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Guide createGuide() {
		GuideImpl guide = new GuideImpl();
		return guide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<View, Alignment> createElementEntry() {
		ElementEntryImpl elementEntry = new ElementEntryImpl();
		return elementEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LineStyle createLineStyleFromString(EDataType eDataType,
			String initialValue) {
		LineStyle result = LineStyle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RulerUnit createRulerUnitFromString(EDataType eDataType,
			String initialValue) {
		RulerUnit result = RulerUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRulerUnitToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType,
			String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType,
			String initialValue) {
		if (initialValue != null) {
			String[] splits = initialValue.split(",");
			if (splits.length == 4) {
				Rectangle r = new Rectangle();
				try {
					r.x = Integer.parseInt(splits[0].trim());
					r.y = Integer.parseInt(splits[1].trim());
					r.width = Integer.parseInt(splits[2].trim());
					r.height = Integer.parseInt(splits[3].trim());
				} catch (NumberFormatException e) {
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
	public String convertRectangleToString(EDataType eDataType,
			Object instanceValue) {
		Rectangle r = (Rectangle) instanceValue;
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
