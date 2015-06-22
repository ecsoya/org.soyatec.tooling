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

	public static final String GRP_QUICK = "group.quickAccess";
	public static final String GRP_NEW = "group.new";
	public static final String GRP_OPEN = "group.open";
	public static final String GRP_EDIT = "group.edit";
	public static final String GRP_REFACTOR = "group.refactor";
	public static final String GRP_IMPORT = "group.import";
	public static final String GRP_REFRESH = "group.refresh";
	public static final String GRP_ADDITIONS = "group.additions";
	public static final String GRP_PROPERTIES = "group.properties";

	private IViewPart part;
	private IActionBars actionBars;
	private final ActionRegistry actionRegistry;

	private final List<BaseSelectionListenerAction> selectionActions;

	public ViewActionBarContributor(IViewPart part) {
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

	protected void addAction(IAction action) {
		getActionRegistry().registerAction(action);
		if (action instanceof BaseSelectionListenerAction) {
			selectionActions.add((BaseSelectionListenerAction) action);
		}
	}

	protected IAction getAction(String key) {
		return getActionRegistry().getAction(key);
	}

	public IViewPart getPart() {
		return part;
	}

	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	final public void contributeActionBars(IActionBars actionBars) {
		this.actionBars = actionBars;
		if (actionBars == null) {
			return;
		}
		buildRetargetActions(actionBars);
		contributeToolBar(actionBars.getToolBarManager());
		contributeMenu(actionBars.getMenuManager());

		actionBars.updateActionBars();
	}

	protected void buildRetargetActions(IActionBars actionBars) {

	}

	protected void contributeToolBar(IToolBarManager toolBarManager) {
	}

	protected void contributeMenu(IMenuManager menuManager) {

	}

	public void setSelectionProvider(ISelectionProvider selectionProvider) {
		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(this);
		}
		for (BaseSelectionListenerAction actionListener : selectionActions) {
			selectionProvider.addSelectionChangedListener(actionListener);
		}
	}

	public void selectionChanged(final SelectionChangedEvent event) {
		SafeRunner.run(new ISafeRunnable() {

			public void run() throws Exception {
				for (BaseSelectionListenerAction action : selectionActions) {
					action.selectionChanged(event);
				}
			}

			public void handleException(Throwable exception) {

			}
		});

		if (actionBars != null) {
			actionBars.updateActionBars();
		}
	}

	public void createContextMenu(IMenuManager manager) {
		if (actionBars != null) {
			actionBars.updateActionBars();
		}
		addStandardGroups(manager);
	}

	public void dispose() {
		actionRegistry.dispose();
	}

	public static void addStandardGroups(IMenuManager manager) {
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