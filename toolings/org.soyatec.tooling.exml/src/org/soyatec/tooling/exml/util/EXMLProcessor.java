/**
 */
package org.soyatec.tooling.exml.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.soyatec.tooling.exml.EXMLPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EXMLPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the EXMLResourceFactoryImpl
	 * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EXMLResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EXMLResourceFactoryImpl());
		}
		return registrations;
	}

} // MLXMLProcessor
