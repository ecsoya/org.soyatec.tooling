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
package org.soyatec.tooling.views.properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class FormPropertySheetPage implements IPropertySheetPage {

	private Control control;
	private FormToolkit factory;

	private IPropertyTabProvider tabProvider;

	public FormPropertySheetPage(IPropertyTabProvider tabProvider) {
		Assert.isNotNull(tabProvider,
				"IPropertyTabProvider instance can not be null.");
		this.tabProvider = tabProvider;
	}

	final public void createControl(Composite parent) {
		factory = new FormToolkit(parent.getDisplay());
		Form form = factory.createForm(parent);
		Composite body = form.getBody();
		GridLayout layout = new GridLayout();
		body.setLayout(layout);

		IPropertyTab[] propertyTabs = tabProvider.getPropertyTabs();
		if (propertyTabs != null) {
			for (IPropertyTab tab : propertyTabs) {
				int style = Section.TWISTIE;
				if (tab.isExpanded()) {
					style |= Section.EXPANDED;
				}
				if (tab.getName() != null) {
					style |= Section.TITLE_BAR;
				}
				if (tab.getDescription() != null) {
					style |= Section.DESCRIPTION;
				}
				Section section = factory.createSection(body, style);
				if (tab.getName() != null) {
					section.setText(tab.getName());
				}
				if (tab.getDescription() != null) {
					section.setDescription(tab.getDescription());
				}
				Control control = tab.createControl(factory, section);
				if (control != null && !control.isDisposed()) {
					section.setClient(control);
				}
				ToolBarManager tbm = tab.getToolBarManager();
				if (tbm != null) {
					ToolBar toolbar = tbm.createControl(section);
					if (toolbar != null) {
						section.setTextClient(toolbar);
					}
				}
				section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			}
		}

		control = form;
	}

	public void dispose() {
		IPropertyTab[] propertyTabs = tabProvider.getPropertyTabs();
		if (propertyTabs != null) {
			for (IPropertyTab tab : propertyTabs) {
				tab.dispose();
			}
		}
		factory.dispose();
	}

	public Control getControl() {
		return control;
	}

	public void setActionBars(IActionBars actionBars) {
	}

	public void setFocus() {
		if (control != null && !control.isDisposed()) {
			control.setFocus();
		}
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		IPropertyTab[] propertyTabs = tabProvider.getPropertyTabs();
		if (propertyTabs != null) {
			for (IPropertyTab tab : propertyTabs) {
				tab.selectionChanged(part, selection);
			}
		}
	}

}
