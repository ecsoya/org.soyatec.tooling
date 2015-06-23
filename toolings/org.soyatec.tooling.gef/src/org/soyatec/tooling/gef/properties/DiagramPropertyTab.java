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
package org.soyatec.tooling.gef.properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.soyatec.tooling.di.CommentLink;
import org.soyatec.tooling.di.DiPackage;
import org.soyatec.tooling.di.GradientShape;
import org.soyatec.tooling.di.UIObject;
import org.soyatec.tooling.gef.resources.ResourcesFactory;

/**
 * Form PropertyTab for display diagram elements.
 * 
 * @author Ecsoya
 */
public class DiagramPropertyTab extends CommandPropertyTab implements
		IPropertyChangeListener {

	protected static final EStructuralFeature ES_LABEL = DiPackage.eINSTANCE
			.getUIObject_Label();
	protected static final EStructuralFeature ES_BACKGROUND = DiPackage.eINSTANCE
			.getShape_Background();
	protected static final EStructuralFeature ES_FOREGROUND = DiPackage.eINSTANCE
			.getShape_Foreground();
	protected static final EStructuralFeature ES_GRADIENT_ACTIVED = DiPackage.eINSTANCE
			.getGradientShape_UsingGradient();
	protected static final EStructuralFeature ES_GRADIENT_COLOR = DiPackage.eINSTANCE
			.getGradientShape_GradientColor();
	protected static final EStructuralFeature ES_GRADIENT_VERTICAL = DiPackage.eINSTANCE
			.getGradientShape_VerticalGradient();
	protected static final EStructuralFeature ES_LINE_COLOR = DiPackage.eINSTANCE
			.getLine_Color();
	protected static final EStructuralFeature ES_LINE_WIDTH = DiPackage.eINSTANCE
			.getLine_Width();
	protected static final List<EStructuralFeature> common_features = new ArrayList<EStructuralFeature>();
	static {
		common_features.add(ES_LABEL);
		common_features.add(ES_BACKGROUND);
		common_features.add(ES_FOREGROUND);
		common_features.add(ES_LINE_COLOR);
		common_features.add(ES_LINE_WIDTH);
	}
	private static final List<EStructuralFeature> gradient_features = new ArrayList<EStructuralFeature>();
	static {
		gradient_features.add(ES_GRADIENT_ACTIVED);
		gradient_features.add(ES_GRADIENT_COLOR);
		gradient_features.add(ES_GRADIENT_VERTICAL);
	}

	private Map<EStructuralFeature, FieldEditor> editorMap = new HashMap<EStructuralFeature, FieldEditor>(
			1);
	private Group gradientGroup;
	private Composite control;
	private UIObject model;

	private final PreferenceStore store;

	public DiagramPropertyTab() {
		store = new PreferenceStore();
	}

	public void propertyChange(PropertyChangeEvent event) {
		String property = event.getProperty();
		if (FieldEditor.IS_VALID.equals(property)) {
			// valid
		} else if (model != null) {
			Object source = event.getSource();
			if (!(source instanceof FieldEditor)) {
				return;
			}
			String name = ((FieldEditor) source).getPreferenceName();
			EStructuralFeature feature = model.eClass().getEStructuralFeature(
					name);
			if (feature == null) {
				return;
			}
			Object newValue = event.getNewValue();
			if (ES_GRADIENT_VERTICAL == feature) {
				newValue = "true".equals(newValue);
			}
			if (newValue instanceof RGB) {
				newValue = ResourcesFactory.RGBToInteger((RGB) newValue);
			}
			EditingDomain domain = getEditingDomain();
			if (domain != null) {
				Command command = SetCommand.create(domain, model, feature,
						newValue);
				executeCommand(command);
			}
		}
	}

	public String getName() {
		return "Appearance";
	}

	public String getDescription() {
		return "Appearance settings";
	}

	protected void setInput(Object newInput) {
		super.setInput(newInput);
		model = null;
		if (newInput instanceof UIObject) {
			model = ((UIObject) newInput);
		} else if (newInput instanceof EditPart) {
			Object mm = ((EditPart) newInput).getModel();
			if (mm instanceof UIObject) {
				model = (UIObject) mm;
			}
		}
		prepareStore();
	}

	private void prepareStore() {
		List<EStructuralFeature> all = new ArrayList<EStructuralFeature>(
				common_features);
		all.addAll(gradient_features);
		for (EStructuralFeature sf : all) {
			if (!isFeatureVisible(model, sf)) {
				continue;
			}
			String key = sf.getName();
			Object defaultValue = sf.getDefaultValue();
			EDataType eType = (EDataType) sf.getEType();
			Class<?> instanceType = eType.getInstanceClass();
			boolean eIsSet = model.eIsSet(sf);
			Object value = model.eGet(sf);

			if (ES_BACKGROUND == sf || ES_FOREGROUND == sf
					|| ES_GRADIENT_COLOR == sf || ES_LINE_COLOR == sf) {
				if (ES_BACKGROUND == sf || ES_GRADIENT_COLOR == sf) {
					PreferenceConverter.setDefault(store, key, ResourcesFactory
							.integerToRGB(ResourcesFactory.COLOR_WHITE));
				} else {
					PreferenceConverter.setDefault(store, key, ResourcesFactory
							.integerToRGB(ResourcesFactory.COLOR_BLACK));
				}
				if (eIsSet) {
					PreferenceConverter.setValue(store, key,
							ResourcesFactory.integerToRGB((Integer) value));
				} else {
					if (ES_BACKGROUND == sf || ES_GRADIENT_COLOR == sf) {
						PreferenceConverter
								.setValue(
										store,
										key,
										ResourcesFactory
												.integerToRGB(ResourcesFactory.COLOR_WHITE));
					} else {
						PreferenceConverter
								.setValue(
										store,
										key,
										ResourcesFactory
												.integerToRGB(ResourcesFactory.COLOR_BLACK));
					}
				}
			} else if (String.class == instanceType) {
				store.setDefault(key, defaultValue == null ? ""
						: (String) defaultValue);
				if (eIsSet) {
					store.setValue(key, value == null ? "" : (String) value);
				} else {
					store.setValue(key, defaultValue == null ? ""
							: (String) defaultValue);
				}
			} else if (boolean.class == instanceType) {
				store.setDefault(key, (Boolean) defaultValue);
				if (eIsSet) {
					store.setValue(key, (Boolean) value);
				} else {
					store.setValue(key, (Boolean) defaultValue);
				}
			}
		}

	}

	protected boolean isFeatureVisible(UIObject model, EStructuralFeature sf) {
		if (model == null || sf == null) {
			return false;
		}
		if ((model instanceof CommentLink) && ES_LABEL == sf) {
			return false;
		}
		return model.eClass().getFeatureID(sf) != -1;
	}

	protected void refresh() {
		super.refresh();
		if (control == null || control.isDisposed()) {
			return;
		}
		if (model == null) {
			Control[] children = control.getChildren();
			for (Control child : children) {
				child.setVisible(false);
				Object layoutData = child.getLayoutData();
				if (layoutData instanceof GridData) {
					((GridData) layoutData).exclude = true;
				}
			}
		} else {
			Set<Entry<EStructuralFeature, FieldEditor>> entrySet = editorMap
					.entrySet();
			List<FieldEditor> visibleEditors = new ArrayList<FieldEditor>();
			for (Entry<EStructuralFeature, FieldEditor> entry : entrySet) {
				EStructuralFeature feature = entry.getKey();
				FieldEditor editor = entry.getValue();
				boolean enabled = isFeatureVisible(model, feature);
				editor.setEnabled(enabled, getEditorParent(feature));
				if (enabled) {
					visibleEditors.add(editor);
				}
			}

			Control[] children = control.getChildren();
			for (Control child : children) {
				child.setVisible(child.isEnabled());
				Object layoutData = child.getLayoutData();
				if (layoutData instanceof GridData) {
					((GridData) layoutData).exclude = !child.isVisible();
				}
			}
			gradientGroup.setVisible(model instanceof GradientShape);
			((GridData) gradientGroup.getLayoutData()).exclude = !(model instanceof GradientShape);

			// load values for editors
			for (FieldEditor editor : visibleEditors) {
				editor.load();
			}
		}
		control.layout();
		control.getParent().layout();
		control.getParent().getParent().layout();
	}

	private Composite getEditorParent(EStructuralFeature feature) {
		if (gradient_features.contains(feature)) {
			return gradientGroup;
		}
		return control;
	}

	public Control createControl(FormToolkit factory, Composite parent) {
		control = factory.createComposite(parent, SWT.NONE);
		int numColumns = 2;
		control.setLayout(new GridLayout(numColumns, false));

		for (EStructuralFeature sf : common_features) {
			FieldEditor editor = createFieldEditor(control, sf);
			if (editor != null) {
				editorMap.put(sf, editor);
			}
		}
		gradientGroup = new Group(control, SWT.NONE);
		gradientGroup.setText("Gradient");
		gradientGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, numColumns, 1));
		for (EStructuralFeature sf : gradient_features) {
			FieldEditor editor = createFieldEditor(gradientGroup, sf);
			if (editor != null) {
				editorMap.put(sf, editor);
			}
		}
		gradientGroup.setLayout(new GridLayout(numColumns, false));

		Set<Entry<EStructuralFeature, FieldEditor>> entrySet = editorMap
				.entrySet();
		for (Entry<EStructuralFeature, FieldEditor> entry : entrySet) {
			EStructuralFeature feature = entry.getKey();
			FieldEditor editor = entry.getValue();
			editor.fillIntoGrid(getEditorParent(feature), numColumns);
			editor.setPreferenceStore(store);
			editor.setPropertyChangeListener(this);
		}
		Control[] children = control.getChildren();
		for (Control child : children) {
			factory.adapt(child, true, true);
		}
		// control.layout();
		refresh();
		return control;
	}

	private FieldEditor createFieldEditor(Composite parent,
			EStructuralFeature feature) {
		String name = feature.getName();
		String label = getFeatureLabel(feature);
		if (ES_BACKGROUND == feature || ES_FOREGROUND == feature
				|| ES_GRADIENT_COLOR == feature || ES_LINE_COLOR == feature) {
			return new ColorFieldEditor(name, label, parent);
		} else if (ES_GRADIENT_VERTICAL == feature) {
			return new ComboFieldEditor(name, label, new String[][] {
					{ "Vertical", "true" }, { "Horizontal", "false" } }, parent);
		} else {
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			if (boolean.class == instanceClass) {
				return new BooleanFieldEditor(name, label, parent);
			} else if (int.class == instanceClass) {
				return new SpinnerFieldEditor(name, label, parent, 1, 10, 1, 1);
			}
		}
		return new StringFieldEditor(name, label, StringFieldEditor.UNLIMITED,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, parent);
	}

	private String getFeatureLabel(EStructuralFeature feature) {
		if (ES_LABEL == feature) {
			return "Label";
		} else if (ES_BACKGROUND == feature) {
			return "Background";
		} else if (ES_FOREGROUND == feature) {
			return "Foreground";
		} else if (ES_GRADIENT_ACTIVED == feature) {
			return "Active";
		} else if (ES_GRADIENT_COLOR == feature) {
			return "Gradient color";
		} else if (ES_GRADIENT_VERTICAL == feature) {
			return "Gradient style";
		} else if (ES_LINE_COLOR == feature) {
			return "Line color";
		} else if (ES_LINE_WIDTH == feature) {
			return "Line width";
		}
		return feature.getName();
	}

	public boolean isExpanded() {
		return false;
	}

}
