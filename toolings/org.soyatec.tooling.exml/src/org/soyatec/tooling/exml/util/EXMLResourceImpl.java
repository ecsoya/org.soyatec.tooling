/**
 */
package org.soyatec.tooling.exml.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.soyatec.tooling.exml.EXAttribute;
import org.soyatec.tooling.exml.EXElement;
import org.soyatec.tooling.exml.EXMLFactory;
import org.soyatec.tooling.exml.EXMLPackage;
import org.soyatec.tooling.exml.EXNode;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.soyatec.tooling.exml.util.EXMLResourceFactoryImpl
 * @generated
 */
public class EXMLResourceImpl extends XMLResourceImpl {

	private static final String TAB_NAME_KEY = "Node.tagName";

	public EXMLResourceImpl(URI uri) {
		super(uri);
		BasicExtendedMetaData value = new BasicExtendedMetaData() {
			@Override
			public EClass getDocumentRoot(EPackage ePackage) {
				return EXMLPackage.eINSTANCE.getDocument();
			}

			@Override
			public String getName(EStructuralFeature feature) {
				EAnnotation a = feature.getEAnnotation(TAB_NAME_KEY);
				if (a != null) {
					String tagName = a.getDetails().get(TAB_NAME_KEY);
					if (tagName != null) {
						return tagName;
					}
				}
				return super.getName(feature);
			}

			@Override
			public int getFeatureKind(EStructuralFeature eStructuralFeature) {
				if (EXMLPackage.eINSTANCE.getElement_Attributes() == eStructuralFeature) {
					return ATTRIBUTE_FEATURE;
				}
				return super.getFeatureKind(eStructuralFeature);
			}

		};
		getDefaultLoadOptions().put(OPTION_EXTENDED_META_DATA, value);

		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		// Enable comments and CData.
		// getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER,
		// Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
				Boolean.TRUE);

		getDefaultSaveOptions().put(OPTION_EXTENDED_META_DATA, value);
		getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION,
				Boolean.TRUE);
		getDefaultSaveOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		getDefaultSaveOptions().put(XMLResource.OPTION_FORMATTED, Boolean.TRUE);

	}

	@Override
	protected XMLHelper createXMLHelper() {
		XMLHelperImpl helper = new XMLHelperImpl(this) {
			@Override
			public EStructuralFeature getFeature(EClass eClass,
					String namespaceURI, String name, boolean isElement) {
				EStructuralFeature feature = null;
				if (isElement) {
					if (EXMLPackage.eINSTANCE.getDocument() == eClass) {
						feature = EXMLPackage.eINSTANCE.getDocument_Element();
					} else {
						feature = EXMLPackage.eINSTANCE.getElement_Elements();
					}
				} else {
					feature = EXMLPackage.eINSTANCE.getElement_Attributes();
				}
				if (feature != null) {
					Integer featureKind = getFeatureKind(feature);
					feature = EcoreUtil.copy(feature);
					featuresToKinds.put(feature, featureKind);
					EAnnotation a = feature.getEAnnotation(TAB_NAME_KEY);
					if (a == null) {
						a = EcoreFactory.eINSTANCE.createEAnnotation();
						a.setSource(TAB_NAME_KEY);
						a.getDetails().put(TAB_NAME_KEY, name);
						feature.getEAnnotations().add(a);
					}
				}
				return feature;
			}

			@Override
			public void setValue(EObject object, EStructuralFeature feature,
					Object value, int position) {
				if (object instanceof EXNode) {
					String tagName = null;
					EAnnotation a = feature.getEAnnotation(TAB_NAME_KEY);
					if (a != null) {
						tagName = a.getDetails().get(TAB_NAME_KEY);
					}
					String featureName = feature.getName();
					if (tagName != null) {
						if (object instanceof EXElement
								&& EXMLPackage.eINSTANCE
										.getElement_Attributes().getName()
										.equals(featureName)) {
							EXElement element = (EXElement) object;
							EXAttribute attr = element.getAttribute(tagName);
							if (attr == null) {
								attr = EXMLFactory.eINSTANCE.createAttribute();
								attr.setName(tagName);
								element.getAttributes().add(attr);
							}
							attr.setValue((String) value);
							return;
						}
						if (value instanceof EXNode) {
							((EXNode) value).setName(tagName);
						}
					}
					feature = object.eClass()
							.getEStructuralFeature(featureName);
					if (EXMLPackage.eINSTANCE.getElement_Attributes() != feature) {
						super.setValue(object, feature, value, position);
					}
				} else {
					super.setValue(object, feature, value, position);
				}
			}

			@Override
			public int getFeatureKind(EStructuralFeature feature) {
				if (EXMLPackage.eINSTANCE.getElement_Attributes().getName()
						.equals(feature.getName())) {
					return DATATYPE_SINGLE;
				}
				return super.getFeatureKind(feature);
			}

		};
		helper.setNoNamespacePackage(EXMLPackage.eINSTANCE);
		return helper;
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMLSaveImpl(createXMLHelper()) {
			@Override
			protected void saveElement(EObject o, EStructuralFeature f) {
				EAnnotation a = null;
				if (o instanceof EXNode) {
					a = EcoreFactory.eINSTANCE.createEAnnotation();
					a.setSource(TAB_NAME_KEY);
					a.getDetails().put(TAB_NAME_KEY, ((EXNode) o).getName());
					f.getEAnnotations().add(0, a);
				}
				super.saveElement(o, f);
				if (o instanceof EXNode) {
					f.getEAnnotations().remove(o);
				}
			}

			@Override
			protected void processAttributeExtensions(EObject object) {
				if (object instanceof EXElement) {
					EList<EXAttribute> attributes = ((EXElement) object)
							.getAttributes();
					for (EXAttribute attr : attributes) {
						EAttribute feature = EXMLPackage.eINSTANCE
								.getAttribute_Value();
						EAnnotation a = null;
						a = EcoreFactory.eINSTANCE.createEAnnotation();
						a.setSource(TAB_NAME_KEY);
						a.getDetails().put(TAB_NAME_KEY, attr.getName());
						feature.getEAnnotations().add(0, a);
						saveDataTypeSingle(attr, feature);
						feature.getEAnnotations().remove(a);
					}
				}
				super.processAttributeExtensions(object);
			}

			@Override
			protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
				if (EXMLPackage.eINSTANCE.getNode_Name() == f
						|| EXMLPackage.eINSTANCE.getElement_Attributes() == f
				/* || XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__MIXED == f */) {
					return false;
				}
				return super.shouldSaveFeature(o, f);
			}
		};
	}
} // EXMLResourceImpl
