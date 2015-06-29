/*******************************************************************************
 * Copyright (c) 2015 Soyatec and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.soyatec.tooling.gef.toolbar.editor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditDomain;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.soyatec.tooling.gef.toolbar.Activator;

/**
 * @author Ecsoya (jin.liu@soyatec.com)
 */
public class ToolBarPalette extends Composite {

	private static final String DATA_DROP_DOWN = "ToolBarPalette_DropDown";
	private static final int WIDTH_DROP_DOWN = 25;

	private ToolBar toolBar;
	private ToolBar settingsToolBar;

	private EditDomain domain;
	private PaletteRoot paletteRoot;

	// Settings
	private boolean iconsOnly = true;
	private boolean useLargeIcons = false;

	// Settings menu
	private Menu settingsMenu;
	private MenuItem iconsOnlyItem;
	private MenuItem useLargeIconsItem;

	private final Map<ImageDescriptor, Image> imageMap;
	private Image image;

	private PropertyChangeListener paletteListListener;

	public ToolBarPalette(Composite parent, int style) {
		super(parent, style);
		imageMap = new HashMap<ImageDescriptor, Image>(1);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 1;
		layout.marginHeight = 1;
		_setLayout(layout);

		toolBar = new ToolBar(this, SWT.HORIZONTAL | SWT.FLAT);
		toolBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		settingsToolBar = new ToolBar(this, SWT.HORIZONTAL | SWT.FLAT);
		new ToolItem(settingsToolBar, SWT.SEPARATOR);
		final ToolItem settingsItem = new ToolItem(settingsToolBar,
				SWT.DROP_DOWN);
		ImageDescriptor desc = Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "icons/setting.png");
		image = desc.createImage(getDisplay());
		settingsItem.setImage(image);
		settingsItem.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.detail == SWT.ARROW) {
					Menu menu = getSettingsMenu();
					if (menu != null) {
						Rectangle rect = settingsItem.getBounds();
						Point pt = new Point(rect.x, rect.y + rect.height);
						pt = settingsToolBar.toDisplay(pt);
						menu.setLocation(pt.x, pt.y);
						menu.setVisible(true);
					}
				} else {
					showSettingsDialog();
				}
			}
		});

		addListener(SWT.Resize, new Listener() {

			public void handleEvent(Event event) {
				updatePalette();
			}
		});
	}

	protected void layoutToolBar() {
		packToolBar();
		getParent().layout();
		getParent().getParent().layout();
	}

	private void packToolBar() {
		Point parentSize = getSize();
		if (parentSize.x == 0 || parentSize.y == 0) {
			return;
		}
		if (toolBar == null || toolBar.isDisposed()) {
			return;
		}
		@SuppressWarnings("unchecked")
		List<PaletteEntry> entries = (List<PaletteEntry>) toolBar.getData();
		if (entries == null || entries.isEmpty()) {
			return;
		}
		toolBar.pack();
		Point size = toolBar.getSize();
		Point extraSize = settingsToolBar.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		if (size.x > (parentSize.x - extraSize.x - 5)) {
			int visibleWidth = parentSize.x - extraSize.x - 5;
			ToolItem lastVisibleItem = toolBar.getItem(new Point(visibleWidth,
					size.y / 2));
			if (lastVisibleItem == null) {
				return;
			}
			Rectangle lastVisibleItemRect = lastVisibleItem.getBounds();
			int lastVisibleItemIndex = toolBar.indexOf(lastVisibleItem);
			if ((lastVisibleItemRect.x + lastVisibleItemRect.width) > visibleWidth) {
				lastVisibleItemIndex--;
			}
			if (lastVisibleItemIndex >= entries.size()) {
				return;// Never happen
			}

			// If the drop down was created, and a new item comes show.
			for (int i = lastVisibleItemIndex; i >= 0; i--) {
				ToolItem item = toolBar.getItem(i);
				if (Boolean.TRUE.equals(item.getData(DATA_DROP_DOWN))) {
					lastVisibleItemIndex = i;
					lastVisibleItem = item;
					break;
				}
			}

			if (Boolean.TRUE.equals(lastVisibleItem.getData(DATA_DROP_DOWN))) {

				int index = lastVisibleItemIndex;
				final Menu menu = new Menu(getShell(), SWT.POP_UP);
				for (int i = index; i < entries.size(); i++) {
					PaletteEntry paletteEntry = entries.get(i);
					createMenuItem(menu, paletteEntry);
				}
				lastVisibleItem.setData(menu);

				ToolItem[] items = toolBar.getItems();
				for (int i = index; i < items.length; i++) {
					disposeItem(items[i]);
				}
			} else {
				int index = lastVisibleItemIndex;

				final Menu menu = new Menu(getShell(), SWT.POP_UP);
				for (int i = index; i < entries.size(); i++) {
					PaletteEntry paletteEntry = entries.get(i);
					createMenuItem(menu, paletteEntry);
				}
				ToolItem[] items = toolBar.getItems();
				for (int i = index; i < items.length; i++) {
					disposeItem(items[i]);
				}
				final ToolItem dropDown = new ToolItem(toolBar, SWT.SEPARATOR,
						index);
				dropDown.setData(DATA_DROP_DOWN, Boolean.TRUE);
				dropDown.setData(menu);
				Button button = new Button(toolBar, SWT.ARROW | SWT.DOWN);
				dropDown.setControl(button);
				dropDown.setWidth(WIDTH_DROP_DOWN);
				button.addListener(SWT.Selection, new Listener() {

					public void handleEvent(Event event) {
						Menu menu = (Menu) dropDown.getData();
						if (menu == null || menu.isDisposed()) {
							return;
						}
						Rectangle rect = dropDown.getBounds();
						Point pt = new Point(rect.x, rect.y + rect.height);
						pt = toolBar.toDisplay(pt);
						menu.setLocation(pt.x, pt.y);
						menu.setVisible(true);
					}
				});
			}

		}
		toolBar.pack();
	}

	protected Menu getSettingsMenu() {
		if (settingsMenu == null || settingsMenu.isDisposed()) {
			settingsMenu = new Menu(getShell(), SWT.POP_UP);

			iconsOnlyItem = new MenuItem(settingsMenu, SWT.CHECK);
			iconsOnlyItem.setText("Icons only");
			iconsOnlyItem.setSelection(iconsOnly);
			iconsOnlyItem.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					iconsOnly = iconsOnlyItem.getSelection();
					updatePalette();
				}
			});

			useLargeIconsItem = new MenuItem(settingsMenu, SWT.CHECK);
			useLargeIconsItem.setText("Large icons");
			useLargeIconsItem.setSelection(useLargeIcons);
			useLargeIconsItem.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					useLargeIcons = useLargeIconsItem.getSelection();
					updatePalette();
				}
			});

		}
		return settingsMenu;
	}

	protected void showSettingsDialog() {

	}

	public void _setLayout(Layout layout) {
		super.setLayout(layout);
	}

	public void setLayout(Layout layout) {
	}

	public void init(EditDomain domain, PaletteRoot paletteRoot) {
		this.domain = domain;
		this.paletteRoot = paletteRoot;
		if (domain != null) {
			domain.setPaletteRoot(paletteRoot);
		}
		if (toolBar == null || toolBar.isDisposed()) {
			return;
		}
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();
		collectPaletteItems(entries, paletteRoot);
		toolBar.setData(entries);

		listenPaletteContainers(paletteRoot);
		updatePalette();
	}

	private PropertyChangeListener getPaletteListListener() {
		if (paletteListListener == null) {
			paletteListListener = new PropertyChangeListener() {

				public void propertyChange(PropertyChangeEvent evt) {
					if (PaletteContainer.PROPERTY_CHILDREN.equals(evt
							.getPropertyName())) {
						if (paletteRoot == null || toolBar == null
								|| toolBar.isDisposed()) {
							return;
						}
						final List<PaletteEntry> newPaletteEntries = new ArrayList<PaletteEntry>();
						collectPaletteItems(newPaletteEntries, paletteRoot);
						toolBar.getDisplay().asyncExec(new Runnable() {

							public void run() {
								toolBar.setData(newPaletteEntries);
								updatePalette();
							}
						});
					}
				}
			};
		}
		return paletteListListener;
	}

	private void listenPaletteContainers(PaletteEntry entry) {
		if (entry == null) {
			return;
		}
		if (entry instanceof PaletteContainer) {
			((PaletteContainer) entry)
					.addPropertyChangeListener(getPaletteListListener());
			@SuppressWarnings("rawtypes")
			List children = ((PaletteContainer) entry).getChildren();
			for (Object object : children) {
				listenPaletteContainers((PaletteEntry) object);
			}
		}
	}

	private void unlistenPaletteContainers(PaletteEntry entry) {
		if (entry == null) {
			return;
		}
		if (entry instanceof PaletteContainer) {
			((PaletteContainer) entry)
					.removePropertyChangeListener(getPaletteListListener());
			@SuppressWarnings("rawtypes")
			List children = ((PaletteContainer) entry).getChildren();
			for (Object object : children) {
				unlistenPaletteContainers((PaletteEntry) object);
			}
		}
	}

	private void updatePalette() {
		if (toolBar == null || toolBar.isDisposed()) {
			return;
		}
		@SuppressWarnings("unchecked")
		List<PaletteEntry> entries = (List<PaletteEntry>) toolBar.getData();
		ToolItem[] items = toolBar.getItems();

		if (entries == null || entries.isEmpty()) {
			for (ToolItem toolItem : items) {
				disposeItem(toolItem);
			}
		} else {
			for (int i = 0; i < entries.size(); i++) {
				PaletteEntry entry = entries.get(i);
				ToolItem item = null;
				if (i < toolBar.getItemCount()) {
					item = toolBar.getItem(i);
					if (!entry.equals(item.getData())) {
						disposeItem(item);
						item = null;
					} else {
						item = updatePaletteItem(item, entry);
					}
				}
				if (item != null) {
					continue;
				}
				item = createPaletteItem(entry, i);
			}
			for (int i = entries.size(); i < items.length; i++) {
				disposeItem(items[i]);
			}
		}
		layoutToolBar();
	}

	private void disposeItem(ToolItem item) {
		if (item == null || item.isDisposed()) {
			return;
		}
		Control ctr = item.getControl();
		if (ctr != null) {
			ctr.dispose();
		}
		item.dispose();
	}

	private void createMenuItem(final Menu menu, PaletteEntry entry) {
		Object type = entry.getType();
		int style = PaletteSeparator.PALETTE_TYPE_SEPARATOR.equals(type) ? SWT.SEPARATOR
				: SWT.RADIO;
		MenuItem menuItem = new MenuItem(menu, style);
		menuItem.setData(entry);
		menuItem.setImage(getImage(entry.getSmallIcon()));
		menuItem.setText(getText(entry.getDescription()));
		if (!PaletteSeparator.PALETTE_TYPE_SEPARATOR.equals(type)) {
			menuItem.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					MenuItem widget = (MenuItem) event.widget;
					if (widget.getSelection()) {
						setActiveEntry((PaletteEntry) widget.getData());
						ToolItem[] items = toolBar.getItems();
						for (ToolItem toolItem : items) {
							toolItem.setSelection(false);
						}

						MenuItem[] mis = menu.getItems();
						for (MenuItem i : mis) {
							if (i != widget) {
								i.setSelection(false);
							}
						}
					}
				}
			});
		}
	}

	protected void setActiveEntry(PaletteEntry entry) {
		if (domain == null) {
			return;
		}
		if (entry instanceof ToolEntry) {
			domain.setActiveTool(((ToolEntry) entry).createTool());
		}
	}

	private ToolItem createPaletteItem(PaletteEntry entry, int index) {
		Object type = entry.getType();
		int style = PaletteSeparator.PALETTE_TYPE_SEPARATOR.equals(type) ? SWT.SEPARATOR
				: SWT.RADIO;
		ToolItem item = new ToolItem(toolBar, style, index);

		updatePaletteItem(item, entry);

		if (!PaletteSeparator.PALETTE_TYPE_SEPARATOR.equals(type)) {
			item.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					ToolItem widget = (ToolItem) event.widget;
					if (widget.getSelection()) {
						setActiveEntry((PaletteEntry) widget.getData());
						ToolItem[] items = toolBar.getItems();
						for (ToolItem toolItem : items) {
							if (widget == toolItem) {
								continue;
							}
							toolItem.setSelection(false);
							if (Boolean.TRUE.equals(toolItem
									.getData(DATA_DROP_DOWN))) {
								Object data = toolItem.getData();
								if (data instanceof Menu) {
									MenuItem[] menuItems = ((Menu) data)
											.getItems();
									for (MenuItem menuItem : menuItems) {
										menuItem.setSelection(false);
									}
								}
							}
						}
					}
				}
			});

			entry.addPropertyChangeListener(new PropertyChangeListener() {

				public void propertyChange(PropertyChangeEvent arg0) {

				}
			});
		}

		return item;
	}

	private String getText(String label) {
		if (label == null) {
			return "";
		}
		return label;
	}

	private ToolItem updatePaletteItem(ToolItem item, PaletteEntry entry) {
		if (item == null || item.isDisposed() || entry == null) {
			return null;
		}
		if (useLargeIcons) {
			item.setImage(getImage(entry.getLargeIcon()));
		} else {
			item.setImage(getImage(entry.getSmallIcon()));
		}
		if (!iconsOnly) {
			item.setText(getText(entry.getLabel()));
		} else {
			item.setText("");
		}
		item.setToolTipText(getText(entry.getDescription()));
		item.setData(entry);
		item.setEnabled(entry.isVisible());

		if (entry == paletteRoot.getDefaultEntry()) {
			item.setSelection(true);
		}
		return item;
	}

	private void collectPaletteItems(List<PaletteEntry> entries,
			PaletteEntry entry) {
		if (entry == null) {
			return;
		}
		if (entry instanceof PaletteContainer) {
			PaletteContainer container = (PaletteContainer) entry;
			List<?> children = container.getChildren();
			List<PaletteEntry> newEntries = new ArrayList<PaletteEntry>();
			for (Object child : children) {
				collectPaletteItems(newEntries, (PaletteEntry) child);
			}
			if (!newEntries.isEmpty()) {
				if (!entries.isEmpty()) {
					entries.add(new PaletteSeparator());
				}
				entries.addAll(newEntries);
			}
		} else {
			entries.add(entry);
		}
	}

	private Image getImage(ImageDescriptor desc) {
		if (desc == null) {
			return null;
		}
		Image image = imageMap.get(desc);
		if (image == null || image.isDisposed()) {
			image = desc.createImage(true, getDisplay());
			imageMap.put(desc, image);
		}
		return image;
	}

	public void dispose() {
		unlistenPaletteContainers(paletteRoot);
		super.dispose();
		Collection<Image> values = imageMap.values();
		for (Image image : values) {
			image.dispose();
		}
		imageMap.clear();
		if (image != null) {
			image.dispose();
		}
	}

	public void loadDefaultTool() {
		if (paletteRoot == null || paletteRoot.getDefaultEntry() == null) {
			return;
		}
		if (toolBar == null || toolBar.isDisposed()) {
			return;
		}
		final PaletteEntry defaultEntry = paletteRoot.getDefaultEntry();
		toolBar.getDisplay().asyncExec(new Runnable() {

			public void run() {
				ToolItem[] items = toolBar.getItems();
				for (ToolItem toolItem : items) {
					Object data = toolItem.getData();
					if (defaultEntry.equals(data)) {
						toolItem.setSelection(true);
					} else if (Boolean.TRUE.equals(toolItem
							.getData(DATA_DROP_DOWN))) {
						if (data instanceof Menu) {
							MenuItem[] menuItems = ((Menu) data).getItems();
							for (MenuItem menuItem : menuItems) {
								if (defaultEntry.equals(menuItem.getData())) {
									menuItem.setSelection(true);
								} else {
									menuItem.setSelection(false);
								}
							}
						}
					} else {
						toolItem.setSelection(false);
					}
				}
			}
		});
	}

}
