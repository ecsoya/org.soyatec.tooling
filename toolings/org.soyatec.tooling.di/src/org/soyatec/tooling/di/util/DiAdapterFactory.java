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
package org.soyatec.tooling.di.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.soyatec.tooling.di.Alignment;
import org.soyatec.tooling.di.Comment;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.Connector;
import org.soyatec.tooling.di.Container;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.Grid;
import org.soyatec.tooling.di.Guide;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.Node;
import org.soyatec.tooling.di.Ruler;
import org.soyatec.tooling.di.Shape;
import org.soyatec.tooling.di.View;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 *
 * @see org.soyatec.tooling.di.DiPackage
 * @generated
 */
public class DiAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static DiPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public DiAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DiPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DiSwitch<Adapter> modelSwitch = new DiSwitch<Adapter>() {
        @Override
        public Adapter caseView(final View object) {
            return createViewAdapter();
        }

        @Override
        public Adapter caseNode(final Node object) {
            return createNodeAdapter();
        }

        @Override
        public Adapter caseContainer(final Container object) {
            return createContainerAdapter();
        }

        @Override
        public Adapter caseDiagram(final Diagram object) {
            return createDiagramAdapter();
        }

        @Override
        public Adapter caseShape(final Shape object) {
            return createShapeAdapter();
        }

        @Override
        public Adapter caseGradientShape(final GradientShape object) {
            return createGradientShapeAdapter();
        }

        @Override
        public Adapter caseLine(final Line object) {
            return createLineAdapter();
        }

        @Override
        public Adapter caseConnector(final Connector object) {
            return createConnectorAdapter();
        }

        @Override
        public Adapter caseComment(final Comment object) {
            return createCommentAdapter();
        }

        @Override
        public Adapter caseCommentLink(final CommentLink object) {
            return createCommentLinkAdapter();
        }

        @Override
        public Adapter caseGrid(final Grid object) {
            return createGridAdapter();
        }

        @Override
        public Adapter caseRuler(final Ruler object) {
            return createRulerAdapter();
        }

        @Override
        public Adapter caseGuide(final Guide object) {
            return createGuideAdapter();
        }

        @Override
        public Adapter caseElementEntry(final Map.Entry<View, Alignment> object) {
            return createElementEntryAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.View <em>View</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.View
     * @generated
     */
    public Adapter createViewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Node <em>Node</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Node
     * @generated
     */
    public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Container <em>Container</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Container
     * @generated
     */
    public Adapter createContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Diagram <em>Diagram</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Shape <em>Shape</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Shape
     * @generated
     */
    public Adapter createShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.GradientShape <em>Gradient Shape</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.GradientShape
     * @generated
     */
    public Adapter createGradientShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Line <em>Line</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Line
     * @generated
     */
    public Adapter createLineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Connector <em>Connector</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Comment <em>Comment</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.CommentLink <em>Comment Link</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.CommentLink
     * @generated
     */
    public Adapter createCommentLinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Grid <em>Grid</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Grid
     * @generated
     */
    public Adapter createGridAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Ruler <em>Ruler</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Ruler
     * @generated
     */
    public Adapter createRulerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.soyatec.tooling.di.Guide <em>Guide</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.soyatec.tooling.di.Guide
     * @generated
     */
    public Adapter createGuideAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry
     * <em>Element Entry</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
    public Adapter createElementEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // DiAdapterFactory
