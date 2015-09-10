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
package org.soyatec.tooling.di.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.di.UIElement;
import org.soyatec.tooling.di.UINode;
import org.soyatec.tooling.di.UIObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.di.DiPackage
 * @generated
 */
public class DiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DiPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DiSwitch() {
		if (modelPackage == null) {
			modelPackage = DiPackage.eINSTANCE;
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
		case DiPackage.UI_OBJECT: {
			UIObject uiObject = (UIObject) theEObject;
			T result = caseUIObject(uiObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.UI_ELEMENT: {
			UIElement uiElement = (UIElement) theEObject;
			T result = caseUIElement(uiElement);
			if (result == null)
				result = caseUIObject(uiElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.UI_NODE: {
			UINode uiNode = (UINode) theEObject;
			T result = caseUINode(uiNode);
			if (result == null)
				result = caseUIElement(uiNode);
			if (result == null)
				result = caseUIObject(uiNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.DIAGRAM: {
			Diagram diagram = (Diagram) theEObject;
			T result = caseDiagram(diagram);
			if (result == null)
				result = caseUIElement(diagram);
			if (result == null)
				result = caseUIObject(diagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.SHAPE: {
			Shape shape = (Shape) theEObject;
			T result = caseShape(shape);
			if (result == null)
				result = caseUINode(shape);
			if (result == null)
				result = caseUIElement(shape);
			if (result == null)
				result = caseUIObject(shape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.GRADIENT_SHAPE: {
			GradientShape gradientShape = (GradientShape) theEObject;
			T result = caseGradientShape(gradientShape);
			if (result == null)
				result = caseShape(gradientShape);
			if (result == null)
				result = caseUINode(gradientShape);
			if (result == null)
				result = caseUIElement(gradientShape);
			if (result == null)
				result = caseUIObject(gradientShape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = caseUINode(line);
			if (result == null)
				result = caseUIElement(line);
			if (result == null)
				result = caseUIObject(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.COMMENT: {
			Comment comment = (Comment) theEObject;
			T result = caseComment(comment);
			if (result == null)
				result = caseShape(comment);
			if (result == null)
				result = caseUINode(comment);
			if (result == null)
				result = caseUIElement(comment);
			if (result == null)
				result = caseUIObject(comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.COMMENT_LINK: {
			CommentLink commentLink = (CommentLink) theEObject;
			T result = caseCommentLink(commentLink);
			if (result == null)
				result = caseLine(commentLink);
			if (result == null)
				result = caseUINode(commentLink);
			if (result == null)
				result = caseUIElement(commentLink);
			if (result == null)
				result = caseUIObject(commentLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.GRID: {
			Grid grid = (Grid) theEObject;
			T result = caseGrid(grid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.RULER: {
			Ruler ruler = (Ruler) theEObject;
			T result = caseRuler(ruler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.GUIDE: {
			Guide guide = (Guide) theEObject;
			T result = caseGuide(guide);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.ELEMENT_ENTRY: {
			@SuppressWarnings("unchecked")
			Map.Entry<UIElement, Alignment> elementEntry = (Map.Entry<UIElement, Alignment>) theEObject;
			T result = caseElementEntry(elementEntry);
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
	 * <em>UI Object</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>UI Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIObject(UIObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>UI Element</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElement(UIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>UI Node</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>UI Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUINode(UINode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Diagram</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
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
	 * <em>Gradient Shape</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Gradient Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradientShape(GradientShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Line</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Comment</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Comment Link</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Comment Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentLink(CommentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Grid</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Ruler</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Ruler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuler(Ruler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Guide</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuide(Guide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Element Entry</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Element Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementEntry(Map.Entry<UIElement, Alignment> object) {
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

} // DiSwitch
