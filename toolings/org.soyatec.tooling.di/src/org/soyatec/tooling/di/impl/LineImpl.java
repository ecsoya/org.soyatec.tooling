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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Line;
import org.soyatec.tooling.di.LineStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Line</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getColor <em>Color</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getWidth <em>Width</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getSourceAnchor <em>Source
 * Anchor</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getTargetAnchor <em>Target
 * Anchor</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getSourceNode <em>Source Node
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getTargetNode <em>Target Node
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.LineImpl#getLineDash <em>Line Dash
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LineImpl extends NodeImpl implements Line {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAnchor()
	 * <em>Source Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getSourceAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ANCHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAnchor()
	 * <em>Source Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getSourceAnchor()
	 * @generated
	 * @ordered
	 */
	protected String sourceAnchor = SOURCE_ANCHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetAnchor()
	 * <em>Target Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getTargetAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ANCHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAnchor()
	 * <em>Target Anchor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getTargetAnchor()
	 * @generated
	 * @ordered
	 */
	protected String targetAnchor = TARGET_ANCHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSourceNode()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sourceNode;

	/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap targetNode;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle STYLE_EDEFAULT = LineStyle.SOLID;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineDash() <em>Line Dash</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLineDash()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lineDash;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setColor(final int newColor) {
		final int oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__COLOR, oldColor, color));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setWidth(final int newWidth) {
		final int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__WIDTH, oldWidth, width));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getSourceAnchor() {
		return sourceAnchor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setSourceAnchor(final String newSourceAnchor) {
		final String oldSourceAnchor = sourceAnchor;
		sourceAnchor = newSourceAnchor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__SOURCE_ANCHOR, oldSourceAnchor,
					sourceAnchor));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getTargetAnchor() {
		return targetAnchor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setTargetAnchor(final String newTargetAnchor) {
		final String oldTargetAnchor = targetAnchor;
		targetAnchor = newTargetAnchor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__TARGET_ANCHOR, oldTargetAnchor,
					targetAnchor));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FeatureMap getSourceNode() {
		if (sourceNode == null) {
			sourceNode = new BasicFeatureMap(this, DiPackage.LINE__SOURCE_NODE);
		}
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FeatureMap getTargetNode() {
		if (targetNode == null) {
			targetNode = new BasicFeatureMap(this, DiPackage.LINE__TARGET_NODE);
		}
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LineStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setStyle(final LineStyle newStyle) {
		final LineStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiPackage.LINE__STYLE, oldStyle, style));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<Integer> getLineDash() {
		if (lineDash == null) {
			lineDash = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					DiPackage.LINE__LINE_DASH);
		}
		return lineDash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd,
			final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.LINE__SOURCE_NODE:
			return ((InternalEList<?>) getSourceNode()).basicRemove(otherEnd,
					msgs);
		case DiPackage.LINE__TARGET_NODE:
			return ((InternalEList<?>) getTargetNode()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve,
			final boolean coreType) {
		switch (featureID) {
		case DiPackage.LINE__COLOR:
			return getColor();
		case DiPackage.LINE__WIDTH:
			return getWidth();
		case DiPackage.LINE__SOURCE_ANCHOR:
			return getSourceAnchor();
		case DiPackage.LINE__TARGET_ANCHOR:
			return getTargetAnchor();
		case DiPackage.LINE__SOURCE_NODE:
			if (coreType) {
				return getSourceNode();
			}
			return ((FeatureMap.Internal) getSourceNode()).getWrapper();
		case DiPackage.LINE__TARGET_NODE:
			if (coreType) {
				return getTargetNode();
			}
			return ((FeatureMap.Internal) getTargetNode()).getWrapper();
		case DiPackage.LINE__STYLE:
			return getStyle();
		case DiPackage.LINE__LINE_DASH:
			return getLineDash();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DiPackage.LINE__COLOR:
			setColor((Integer) newValue);
			return;
		case DiPackage.LINE__WIDTH:
			setWidth((Integer) newValue);
			return;
		case DiPackage.LINE__SOURCE_ANCHOR:
			setSourceAnchor((String) newValue);
			return;
		case DiPackage.LINE__TARGET_ANCHOR:
			setTargetAnchor((String) newValue);
			return;
		case DiPackage.LINE__SOURCE_NODE:
			((FeatureMap.Internal) getSourceNode()).set(newValue);
			return;
		case DiPackage.LINE__TARGET_NODE:
			((FeatureMap.Internal) getTargetNode()).set(newValue);
			return;
		case DiPackage.LINE__STYLE:
			setStyle((LineStyle) newValue);
			return;
		case DiPackage.LINE__LINE_DASH:
			getLineDash().clear();
			getLineDash().addAll((Collection<? extends Integer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case DiPackage.LINE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case DiPackage.LINE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case DiPackage.LINE__SOURCE_ANCHOR:
			setSourceAnchor(SOURCE_ANCHOR_EDEFAULT);
			return;
		case DiPackage.LINE__TARGET_ANCHOR:
			setTargetAnchor(TARGET_ANCHOR_EDEFAULT);
			return;
		case DiPackage.LINE__SOURCE_NODE:
			getSourceNode().clear();
			return;
		case DiPackage.LINE__TARGET_NODE:
			getTargetNode().clear();
			return;
		case DiPackage.LINE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case DiPackage.LINE__LINE_DASH:
			getLineDash().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case DiPackage.LINE__COLOR:
			return color != COLOR_EDEFAULT;
		case DiPackage.LINE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case DiPackage.LINE__SOURCE_ANCHOR:
			return SOURCE_ANCHOR_EDEFAULT == null ? sourceAnchor != null
					: !SOURCE_ANCHOR_EDEFAULT.equals(sourceAnchor);
		case DiPackage.LINE__TARGET_ANCHOR:
			return TARGET_ANCHOR_EDEFAULT == null ? targetAnchor != null
					: !TARGET_ANCHOR_EDEFAULT.equals(targetAnchor);
		case DiPackage.LINE__SOURCE_NODE:
			return sourceNode != null && !sourceNode.isEmpty();
		case DiPackage.LINE__TARGET_NODE:
			return targetNode != null && !targetNode.isEmpty();
		case DiPackage.LINE__STYLE:
			return style != STYLE_EDEFAULT;
		case DiPackage.LINE__LINE_DASH:
			return lineDash != null && !lineDash.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", width: ");
		result.append(width);
		result.append(", sourceAnchor: ");
		result.append(sourceAnchor);
		result.append(", targetAnchor: ");
		result.append(targetAnchor);
		result.append(", sourceNode: ");
		result.append(sourceNode);
		result.append(", targetNode: ");
		result.append(targetNode);
		result.append(", style: ");
		result.append(style);
		result.append(", lineDash: ");
		result.append(lineDash);
		result.append(')');
		return result.toString();
	}

} // LineImpl
