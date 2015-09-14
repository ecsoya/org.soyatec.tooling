/**
 */
package org.soyatec.tooling.di.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getOutgoingLines <em>Outgoing
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getIncomingLines <em>Incoming
 * Lines</em>}</li>
 * <li>{@link org.soyatec.tooling.di.impl.NodeImpl#getCommentLinks <em>Comment
 * Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ViewImpl implements Node {
	/**
	 * The cached value of the '{@link #getOutgoingLines()
	 * <em>Outgoing Lines</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap outgoingLines;

	/**
	 * The cached value of the '{@link #getIncomingLines()
	 * <em>Incoming Lines</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIncomingLines()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap incomingLines;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getOutgoingLines() {
		if (outgoingLines == null) {
			outgoingLines = new BasicFeatureMap(this,
					DiPackage.NODE__OUTGOING_LINES);
		}
		return outgoingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getIncomingLines() {
		if (incomingLines == null) {
			incomingLines = new BasicFeatureMap(this,
					DiPackage.NODE__INCOMING_LINES);
		}
		return incomingLines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CommentLink> getCommentLinks() {
		return getOutgoingLines().list(DiPackage.Literals.NODE__COMMENT_LINKS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.NODE__COMMENT_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommentLinks())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.NODE__OUTGOING_LINES:
			return ((InternalEList<?>) getOutgoingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.NODE__INCOMING_LINES:
			return ((InternalEList<?>) getIncomingLines()).basicRemove(
					otherEnd, msgs);
		case DiPackage.NODE__COMMENT_LINKS:
			return ((InternalEList<?>) getCommentLinks()).basicRemove(otherEnd,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiPackage.NODE__OUTGOING_LINES:
			if (coreType)
				return getOutgoingLines();
			return ((FeatureMap.Internal) getOutgoingLines()).getWrapper();
		case DiPackage.NODE__INCOMING_LINES:
			if (coreType)
				return getIncomingLines();
			return ((FeatureMap.Internal) getIncomingLines()).getWrapper();
		case DiPackage.NODE__COMMENT_LINKS:
			return getCommentLinks();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiPackage.NODE__OUTGOING_LINES:
			((FeatureMap.Internal) getOutgoingLines()).set(newValue);
			return;
		case DiPackage.NODE__INCOMING_LINES:
			((FeatureMap.Internal) getIncomingLines()).set(newValue);
			return;
		case DiPackage.NODE__COMMENT_LINKS:
			getCommentLinks().clear();
			getCommentLinks().addAll(
					(Collection<? extends CommentLink>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiPackage.NODE__OUTGOING_LINES:
			getOutgoingLines().clear();
			return;
		case DiPackage.NODE__INCOMING_LINES:
			getIncomingLines().clear();
			return;
		case DiPackage.NODE__COMMENT_LINKS:
			getCommentLinks().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiPackage.NODE__OUTGOING_LINES:
			return outgoingLines != null && !outgoingLines.isEmpty();
		case DiPackage.NODE__INCOMING_LINES:
			return incomingLines != null && !incomingLines.isEmpty();
		case DiPackage.NODE__COMMENT_LINKS:
			return !getCommentLinks().isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outgoingLines: ");
		result.append(outgoingLines);
		result.append(", incomingLines: ");
		result.append(incomingLines);
		result.append(')');
		return result.toString();
	}

} // NodeImpl
