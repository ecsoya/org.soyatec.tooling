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
package org.soyatec.tooling.views.tree;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.ViewPart;

public abstract class TreeViewerViewPart extends ViewPart implements
		ISetSelectionTarget, IShellProvider {

	protected TreeViewer treeViewer;
	private ViewActionBarContributor actionContributor;

	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		IActionBars actionBars = site.getActionBars();
		ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.contributeActionBars(actionBars);
		}
	}

	public void dispose() {
		if (actionContributor != null) {
			actionContributor.dispose();
		}
		super.dispose();
	}

	private ViewActionBarContributor getActionContributor() {
		if (actionContributor == null) {
			actionContributor = createActionContributor();
		}
		return actionContributor;
	}

	protected ViewActionBarContributor createActionContributor() {
		return null;
	}

	public void selectReveal(ISelection selection) {
		if (treeViewer == null || treeViewer.getControl() == null
				|| treeViewer.getControl().isDisposed()) {
			return;
		}
		treeViewer.setSelection(convertSelection(selection), true);
	}

	protected ISelection convertSelection(ISelection selection) {
		return selection;
	}

	final public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent, getTreeStyle());

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer
						.getSelection();
				final Object element = selection.getFirstElement();
				treeViewer.setExpandedState(element,
						!treeViewer.getExpandedState(element));
				perfromOpen(selection);
			}
		});

		configureTreeViewer();

		getSite().setSelectionProvider(treeViewer);
		ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.setSelectionProvider(treeViewer);
		}
		registerContextMenu();
	}

	protected void perfromOpen(IStructuredSelection selection) {

	}

	private void registerContextMenu() {
		MenuManager manager = new MenuManager("#Menu");
		final MenuManager standardMenu = new MenuManager("#Standard");
		ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.createContextMenu(standardMenu);
		}
		manager.setRemoveAllWhenShown(true);
		manager.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager manager) {
				IContributionItem[] items = standardMenu.getItems();
				for (IContributionItem item : items) {
					manager.add(item);
				}
				createDynamicMenus(manager);
			}
		});
		Control control = treeViewer.getControl();
		Menu menu = manager.createContextMenu(control);
		control.setMenu(menu);

		// We do NOT want others to contribute menus.
		// getSite().registerContextMenu(IConstants.VIEW_NAVIGATOR + "#Menu",
		// manager, treeViewer);
	}

	protected void createDynamicMenus(IMenuManager manager) {
	}

	protected void configureTreeViewer() {

	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	protected int getTreeStyle() {
		return SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL;
	}

	public void setFocus() {
		if (treeViewer == null || treeViewer.getControl() == null
				|| treeViewer.getControl().isDisposed()) {
			return;
		}
		treeViewer.getControl().setFocus();
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (ISetSelectionTarget.class == adapter) {
			return this;
		} else if (StructuredViewer.class == adapter) {
			return getTreeViewer();
		}
		return super.getAdapter(adapter);
	}

	public Shell getShell() {
		return getSite().getShell();
	}
}
