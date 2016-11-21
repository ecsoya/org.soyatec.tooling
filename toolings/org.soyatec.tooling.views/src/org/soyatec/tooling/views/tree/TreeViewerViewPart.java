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

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.soyatec.tooling.views.Activator;
import org.soyatec.tooling.views.Messages;

public abstract class TreeViewerViewPart extends ViewPart implements
		ISetSelectionTarget, IShellProvider, IPartListener2 {

	protected TreeViewer treeViewer;
	private ViewActionBarContributor actionContributor;

	private Action linkWithEditorAction;

	private boolean linkWithEditor = true;

	public void dispose() {
		if (actionContributor != null) {
			actionContributor.dispose();
		}
		getViewSite().getPage().removePartListener(this);
		super.dispose();
	}

	@Override
	public void init(final IViewSite site) throws PartInitException {
		super.init(site);
		site.getPage().addPartListener(this);
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

		makeActions();

		fillActionBars();
	}

	protected void fillActionBars() {
		final IActionBars actionBars = getViewSite().getActionBars();
		actionBars.getToolBarManager().add(linkWithEditorAction);
		actionBars.getMenuManager().add(linkWithEditorAction);
		final ViewActionBarContributor actionContributor = getActionContributor();
		if (actionContributor != null) {
			actionContributor.contributeActionBars(actionBars);
		}
	}

	protected void makeActions() {
		linkWithEditorAction = new Action(
				Messages.TreeViewerViewPart_LinkWithEditor_Text,
				IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				toggleSelectReveal(isChecked());
			}
		};
		linkWithEditorAction.setImageDescriptor(AbstractUIPlugin
				.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/synced.gif")); //$NON-NLS-1$
		linkWithEditorAction
				.setToolTipText(Messages.TreeViewerViewPart_LinkWithEditor_Tip);
		linkWithEditorAction.setChecked(linkWithEditor);
		final IWorkbenchPage activePage = getActivePage();
		if (activePage != null) {
			editorActivated(activePage.getActiveEditor());
		}
	}

	protected void toggleSelectReveal(final boolean synced) {
		linkWithEditor = synced;
		if (linkWithEditor) {
			final IWorkbenchPage activePage = getActivePage();
			if (activePage != null) {
				editorActivated(activePage.getActiveEditor());
			}
		}
	}

	public boolean isLinkWithEditor() {
		if (linkWithEditorAction != null) {
			return linkWithEditorAction.isChecked();
		}
		return linkWithEditor;
	}

	public void setLinkWithEditor(final boolean linkWithEditor) {
		if (linkWithEditorAction != null) {
			linkWithEditorAction.setChecked(linkWithEditor);
		}
		this.linkWithEditor = linkWithEditor;
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

	@Override
	public void partActivated(final IWorkbenchPartReference partRef) {
		if (linkWithEditor && partRef instanceof IEditorReference) {
			editorActivated(((IEditorReference) partRef).getEditor(true));
		}
	}

	private void editorActivated(final IEditorPart editor) {
		if (editor == null) {
			return;
		}
		final IEditorInput editorInput = editor.getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			final IFile file = ((IFileEditorInput) editorInput).getFile();
			if (file != null) {
				selectReveal(new StructuredSelection(file));
			}
		}
	}

	@Override
	public void partBroughtToTop(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partClosed(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partDeactivated(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partOpened(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partHidden(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partVisible(final IWorkbenchPartReference partRef) {

	}

	@Override
	public void partInputChanged(final IWorkbenchPartReference partRef) {
		if (!linkWithEditor) {
			return;
		}
		final IWorkbenchPage activePage = getActivePage();
		if (partRef instanceof IEditorReference && activePage != null
				&& activePage.getActivePartReference() == partRef) {
			editorActivated(((IEditorReference) partRef).getEditor(true));
		}
	}

	private IWorkbenchPage getActivePage() {
		final IWorkbench workbench = Activator.getDefault().getWorkbench();
		if (workbench == null) {
			return null;
		}
		final IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window == null) {
			return null;
		}
		return window.getActivePage();
	}

}
