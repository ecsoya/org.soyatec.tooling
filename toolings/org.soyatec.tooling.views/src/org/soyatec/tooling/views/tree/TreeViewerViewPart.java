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

	public void init(final IViewSite site) throws PartInitException {
		super.init(site);
		final IActionBars actionBars = site.getActionBars();
		final ViewActionBarContributor actionContributor = getActionContributor();
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

	public void selectReveal(final ISelection selection) {
		if (treeViewer == null || treeViewer.getControl() == null
				|| treeViewer.getControl().isDisposed()) {
			return;
		}
		treeViewer.setSelection(convertSelection(selection), true);
	}

	protected ISelection convertSelection(final ISelection selection) {
		return selection;
	}

	final public void createPartControl(final Composite parent) {
		treeViewer = new TreeViewer(parent, getTreeStyle());

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(final DoubleClickEvent event) {
				final IStructuredSelection selection = (IStructuredSelection) treeViewer
						.getSelection();
				final Object element = selection.getFirstElement();
				treeViewer.setExpandedState(element,
						!treeViewer.getExpandedState(element));
				perfromOpen(selection);
			}
		});

		configureTreeViewer();

		getSite().setSelectionProvider(treeViewer);
		final ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.setSelectionProvider(treeViewer);
		}
		registerContextMenu();
	}

	protected void perfromOpen(final IStructuredSelection selection) {

	}

	private void registerContextMenu() {
		final MenuManager manager = new MenuManager("#Menu"); //$NON-NLS-1$
		final MenuManager standardMenu = new MenuManager("#Standard"); //$NON-NLS-1$
		final ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.createContextMenu(standardMenu);
		}
		manager.setRemoveAllWhenShown(true);
		manager.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(final IMenuManager manager) {
				final IContributionItem[] items = standardMenu.getItems();
				for (final IContributionItem item : items) {
					manager.add(item);
				}
				createDynamicMenus(manager);
			}
		});
		final Control control = treeViewer.getControl();
		final Menu menu = manager.createContextMenu(control);
		control.setMenu(menu);

		// We do NOT want others to contribute menus.
		// getSite().registerContextMenu(IConstants.VIEW_NAVIGATOR + "#Menu",
		// manager, treeViewer);
	}

	protected void createDynamicMenus(final IMenuManager manager) {
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

	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
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
