/**
 */
package org.soyatec.tooling.di;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.soyatec.tooling.di.Node#getOutgoingLines <em>Outgoing Lines
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getIncomingLines <em>Incoming Lines
 * </em>}</li>
 * <li>{@link org.soyatec.tooling.di.Node#getCommentLinks <em>Comment Links
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soyatec.tooling.di.DiPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends View {
	/**
	 * Returns the value of the '<em><b>Outgoing Lines</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Lines</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outgoing Lines</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getNode_OutgoingLines()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getOutgoingLines();

	/**
	 * Returns the value of the '<em><b>Incoming Lines</b></em>' attribute list.
	 * The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Incoming Lines</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Incoming Lines</em>' attribute list.
	 * @see org.soyatec.tooling.di.DiPackage#getNode_IncomingLines()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getIncomingLines();

	/**
	 * Returns the value of the '<em><b>Comment Links</b></em>' reference list.
	 * The list contents are of type {@link org.soyatec.tooling.di.CommentLink}.
	 * It is bidirectional and its opposite is '
	 * {@link org.soyatec.tooling.di.CommentLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Links</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Comment Links</em>' reference list.
	 * @see org.soyatec.tooling.di.DiPackage#getNode_CommentLinks()
	 * @see org.soyatec.tooling.di.CommentLink#getSource
	 * @model opposite="source" transient="true" volatile="true"
	 *        extendedMetaData="group='#outgoingLines'"
	 * @generated
	 */
	EList<CommentLink> getCommentLinks();

} // Node
