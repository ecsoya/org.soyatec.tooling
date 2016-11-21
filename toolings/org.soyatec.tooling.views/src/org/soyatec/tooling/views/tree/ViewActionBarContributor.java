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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

public abstract class ViewActionBarContributor implements
		ISelectionChangedListener, IShellProvider {

	public static final String GRP_QUICK = "group.quickAccess"; //$NON-NLS-1$
	public static final String GRP_NEW = "group.new"; //$NON-NLS-1$
	public static final String GRP_OPEN = "group.open"; //$NON-NLS-1$
	public static final String GRP_EDIT = "group.edit"; //$NON-NLS-1$
	public static final String GRP_REFACTOR = "group.refactor"; //$NON-NLS-1$
	public static final String GRP_IMPORT = "group.import"; //$NON-NLS-1$
	public static final String GRP_REFRESH = "group.refresh"; //$NON-NLS-1$
	public static final String GRP_ADDITIONS = "group.additions"; //$NON-NLS-1$
	public static final String GRP_PROPERTIES = "group.properties"; //$NON-NLS-1$

	private final IViewPart part;
	private IActionBars actionBars;
	private final ActionRegistry actionRegistry;

	private final List<BaseSelectionListenerAction> selectionActions;

	public ViewActionBarContributor(final IViewPart part) {
		this.part = part;
		actionRegistry = new ActionRegistry();
		selectionActions = new ArrayList<BaseSelectionListenerAction>();
		buildActions();
	}

	protected void buildActions() {

	}

	public IWorkbenchPage getPage() {
		return part.getViewSite().getPage();
	}

	public Shell getShell() {
		return part.getSite().getShell();
	}

	protected void addAction(final IAction action) {
		getActionRegistry().registerAction(action);
		if (action instanceof BaseSelectionListenerAction) {
			selectionActions.add((BaseSelectionListenerAction) action);
		}
	}

	protected IAction getAction(final String key) {
		return getActionRegistry().getAction(key);
	}

	public IViewPart getPart() {
		return part;
	}

	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	final public void contributeActionBars(final IActionBars actionBars) {
		this.actionBars = actionBars;
		if (actionBars == null) {
			return;
		}
		buildRetargetActions(actionBars);
		contributeToolBar(actionBars.getToolBarManager());
		contributeMenu(actionBars.getMenuManager());

		actionBars.updateActionBars();
	}

	protected void buildRetargetActions(final IActionBars actionBars) {

	}

	protected void contributeToolBar(final IToolBarManager toolBarManager) {
	}

	protected void contributeMenu(final IMenuManager menuManager) {

	}

	public void setSelectionProvider(final ISelectionProvider selectionProvider) {
		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(this);
		}
		for (final BaseSelectionListenerAction actionListener : selectionActions) {
			selectionProvider.addSelectionChangedListener(actionListener);
		}
	}

	public void selectionChanged(final SelectionChangedEvent event) {
		SafeRunner.run(new ISafeRunnable() {

			public void run() throws Exception {
				for (final BaseSelectionListenerAction action : selectionActions) {
					action.selectionChanged(event);
				}
			}

			public void handleException(final Throwable exception) {

			}
		});

		if (actionBars != null) {
			actionBars.updateActionBars();
		}
	}

	public void createContextMenu(final IMenuManager manager) {
		if (actionBars != null) {
			actionBars.updateActionBars();
		}
		addStandardGroups(manager);
	}

	public void dispose() {
		actionRegistry.dispose();
	}

	public static void addStandardGroups(final IMenuManager manager) {
		manager.add(new Separator(GRP_QUICK));
		manager.add(new Separator(GRP_NEW));
		manager.add(new Separator(GRP_OPEN));
		manager.add(new Separator(GRP_EDIT));
		manager.add(new Separator(GRP_REFACTOR));
		manager.add(new Separator(GRP_IMPORT));
		manager.add(new Separator(GRP_REFRESH));
		manager.add(new Separator(GRP_ADDITIONS));
		manager.add(new Separator(GRP_PROPERTIES));
	}

}
