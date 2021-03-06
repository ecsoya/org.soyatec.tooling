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

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class FormPropertySheetPage implements IPropertySheetPage {

	private ScrolledForm control;
	private FormToolkit factory;

	private final IPropertyTabProvider tabProvider;

	private final List<IPropertyTab> shownTabs;

	private boolean manualRefresh;

	public FormPropertySheetPage(final IPropertyTabProvider tabProvider) {
		Assert.isNotNull(tabProvider,
				"IPropertyTabProvider instance can not be null."); //$NON-NLS-1$
		this.tabProvider = tabProvider;
		shownTabs = new ArrayList<IPropertyTab>();
	}

	final public void createControl(final Composite parent) {
		factory = new FormToolkit(parent.getDisplay());
		final ScrolledForm form = factory.createScrolledForm(parent);
		final Composite body = form.getBody();
		final GridLayout layout = new GridLayout();
		body.setLayout(layout);

		final IPropertyTab[] propertyTabs = tabProvider.getPropertyTabs();
		if (propertyTabs != null) {
			for (final IPropertyTab tab : propertyTabs) {
				int style = ExpandableComposite.TWISTIE;
				if (tab.isExpanded()) {
					style |= ExpandableComposite.EXPANDED;
				}
				if (tab.getName() != null) {
					style |= ExpandableComposite.TITLE_BAR;
				}
				if (tab.getDescription() != null) {
					style |= Section.DESCRIPTION;
				}
				final Section section = factory.createSection(body, style);
				if (tab.getName() != null) {
					section.setText(tab.getName());
				}
				if (tab.getDescription() != null) {
					section.setDescription(tab.getDescription());
				}
				final Control control = tab.createControl(factory, section);
				if (control != null && !control.isDisposed()) {
					section.setClient(control);
				}
				final ToolBarManager tbm = tab.getToolBarManager();
				if (tbm != null) {
					final ToolBar toolbar = tbm.createControl(section);
					if (toolbar != null) {
						section.setTextClient(toolbar);
					}
				}
				final GridData layoutData = new GridData(
						GridData.FILL_HORIZONTAL);
				layoutData.exclude = true;
				section.setVisible(false);
				section.setLayoutData(layoutData);
				section.setData(tab);
			}
		}

		control = form;
	}

	public void dispose() {
		final IPropertyTab[] propertyTabs = tabProvider.getPropertyTabs();
		if (propertyTabs != null) {
			for (final IPropertyTab tab : propertyTabs) {
				tab.dispose();
			}
		}
		factory.dispose();

		shownTabs.clear();
	}

	public Control getControl() {
		return control;
	}

	public void setActionBars(final IActionBars actionBars) {
	}

	public void setFocus() {
		if (control != null && !control.isDisposed()) {
			control.setFocus();
		}
	}

	public void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
		if (control == null || control.isDisposed()) {
			return;
		}
		control.getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				final IPropertyTab[] propertyTabs = tabProvider
						.getPropertyTabs();
				if (propertyTabs != null) {
					for (final IPropertyTab tab : propertyTabs) {
						if (!tab.isVisibleFor(part, selection)) {
							hideTab(tab);
						} else {
							tab.selectionChanged(part, selection);
							showTab(tab);
						}
					}
				}
			}
		});
	}

	private void showTab(final IPropertyTab tab) {
		if (control == null || control.isDisposed() || tab == null) {
			return;
		}
		if (!shownTabs.contains(tab)) {
			shownTabs.add(tab);
		}
		tab.setManualRefresh(isManualRefresh());
		final Composite body = control.getBody();
		final Control[] children = body.getChildren();
		for (final Control control : children) {
			if (tab.equals(control.getData())) {
				if (control.isVisible()) {
					continue;
				}
				final GridData layoutData = (GridData) control.getLayoutData();
				layoutData.exclude = false;
				control.setVisible(true);

				if (control instanceof Section) {
					final Section section = (Section) control;
					if (tab.getName() != null) {
						section.setText(tab.getName());
					}
					if (tab.getDescription() != null) {
						section.setDescription(tab.getDescription());
					}
					section.setExpanded(tab.isExpanded());
				}
				break;
			}
		}
		body.layout();
	}

	private void hideTab(final IPropertyTab tab) {
		if (control == null || control.isDisposed() || tab == null) {
			return;
		}
		shownTabs.remove(tab);
		final Composite body = control.getBody();
		final Control[] children = body.getChildren();
		for (final Control control : children) {
			if (tab.equals(control.getData())) {
				final GridData layoutData = (GridData) control.getLayoutData();
				layoutData.exclude = true;
				control.setVisible(false);
				break;
			}
		}
		body.layout();
	}

	public boolean isManualRefresh() {
		return manualRefresh;
	}

	public void setManualRefresh(final boolean manualRefresh) {
		this.manualRefresh = manualRefresh;
		for (final IPropertyTab tab : shownTabs) {
			tab.setManualRefresh(manualRefresh);
		}
	}

	public void refresh(final boolean force) {
		if (force || isManualRefresh()) {
			if (shownTabs.isEmpty() || control == null || control.isDisposed()) {
				return;
			}
			control.getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					for (final IPropertyTab tab : shownTabs) {
						tab.refresh();
					}
				}
			});
		}
	}
}
