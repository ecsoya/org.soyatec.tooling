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
package org.soyatec.tooling.richtext.editors;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichText;
import org.eclipse.epf.richtext.RichTextToolBar;
import org.eclipse.epf.richtext.actions.AddCodeAction;
import org.eclipse.epf.richtext.actions.AddColumnAction;
import org.eclipse.epf.richtext.actions.AddLineAction;
import org.eclipse.epf.richtext.actions.AddLinkAction;
import org.eclipse.epf.richtext.actions.AddOrderedListAction;
import org.eclipse.epf.richtext.actions.AddRowAction;
import org.eclipse.epf.richtext.actions.AddTableAction;
import org.eclipse.epf.richtext.actions.AddUnorderedListAction;
import org.eclipse.epf.richtext.actions.BoldAction;
import org.eclipse.epf.richtext.actions.FontNameAction;
import org.eclipse.epf.richtext.actions.FontSizeAction;
import org.eclipse.epf.richtext.actions.FontStyleAction;
import org.eclipse.epf.richtext.actions.IndentAction;
import org.eclipse.epf.richtext.actions.ItalicAction;
import org.eclipse.epf.richtext.actions.JustifyCenterAction;
import org.eclipse.epf.richtext.actions.JustifyFullAction;
import org.eclipse.epf.richtext.actions.JustifyLeftAction;
import org.eclipse.epf.richtext.actions.JustifyRightAction;
import org.eclipse.epf.richtext.actions.OutdentAction;
import org.eclipse.epf.richtext.actions.SubscriptAction;
import org.eclipse.epf.richtext.actions.SuperscriptAction;
import org.eclipse.epf.richtext.actions.UnderlineAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.soyatec.tooling.richtext.Activator;
import org.soyatec.tooling.richtext.actions.AddImageActionEx;
import org.soyatec.tooling.richtext.actions.BackgroundAction;
import org.soyatec.tooling.richtext.actions.BlockTagActionEx;
import org.soyatec.tooling.richtext.actions.ForegroundAction;
import org.soyatec.tooling.richtext.utils.FileUtils;

public class HTMLEditor extends EditorPart {

    private ViewForm partControl;
    private RichTextToolBar toolBar;
    private IRichText richText;

    private IFile file;
    private boolean isDirty;

    public void doSave(final IProgressMonitor monitor) {
        if (richText.getModified() && file != null) {
            final String text = richText.getText();
            final Properties properties = new Properties();
            properties.put(RuntimeConstants.RESOURCE_LOADER, "class, file");
            properties.put("class.resource.loader.class",
                    VelocityResourceLoader.class.getName());
            Velocity.init(properties);
            final Template template = Velocity.getTemplate("template.vm");
            final VelocityContext context = new VelocityContext();
            context.put("content", text);
            final StringWriter writer = new StringWriter();
            template.merge(context, writer);
            final String newValue = new String(writer.getBuffer());
            try {
                FileUtils.saveFromString(file, newValue, monitor);
            } catch (final Exception e) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                                "Save file content"));
            }
        }
        isDirty = false;
        firePropertyChange(PROP_DIRTY);
    }

    public void doSaveAs() {

    }

    public void init(final IEditorSite site, final IEditorInput input)
            throws PartInitException {
        setSite(site);
        setInput(input);
        if (input instanceof IFileEditorInput) {
            file = ((IFileEditorInput) input).getFile();
        }
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isSaveAsAllowed() {
        return false;
    }

    public void createPartControl(final Composite parent) {
        partControl = new ViewForm(parent, SWT.NONE);
        final Composite content = new Composite(partControl, SWT.NONE);
        content.setLayout(new FillLayout());
        richText = new RichText(content, SWT.NONE);
        partControl.setContent(content);

        final CoolBar coolBar = new CoolBar(partControl, SWT.HORIZONTAL
                | SWT.FLAT);
        toolBar = new RichTextToolBar(coolBar, SWT.FLAT, richText);
        final ToolBar normalItems = toolBar.getToolbarMgr().getControl();
        final ToolBar comboItems = toolBar.getToolbarMgrCombo().getControl();
        final CoolItem item1 = new CoolItem(coolBar, SWT.NONE);
        item1.setControl(comboItems);
        item1.setMinimumSize(comboItems.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        final CoolItem item2 = new CoolItem(coolBar, SWT.NONE);
        item2.setMinimumSize(normalItems.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        item2.setControl(normalItems);
        coolBar.setWrapIndices(new int[] { 1 });
        partControl.setTopLeft(coolBar);

        partControl.addListener(SWT.Resize, new Listener() {

            public void handleEvent(final Event event) {
                final CoolItem[] coolItems = coolBar.getItems();
                final Point parentSize = partControl.getSize();
                for (final CoolItem coolItem : coolItems) {
                    final Control control = coolItem.getControl();
                    final Point size = control.computeSize(parentSize.x - 4,
                            SWT.DEFAULT);
                    final Point coolSize = coolItem.computeSize(size.x, size.y);
                    coolItem.setMinimumSize(size);
                    coolItem.setPreferredSize(coolSize);
                    coolItem.setSize(coolSize);
                }
                coolBar.getParent().layout();
            }
        });

        configureActions();
        configureRichText();

    }

    protected IRichText getRichText() {
        return richText;
    }

    protected RichTextToolBar getToolBar() {
        return toolBar;
    }

    protected void configureRichText() {
        if (richText == null || richText.isDisposed()) {
            return;
        }
        richText.addModifyListener(new ModifyListener() {

            public void modifyText(final ModifyEvent e) {
                isDirty = true;
                firePropertyChange(PROP_DIRTY);
            }
        });

        if (file != null && file.exists()) {
            richText.setText(getText(file));
        }
    }

    protected String getText(final IFile file) {
        try {
            return FileUtils.readAsString(file);
        } catch (final Exception e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                            "Load file content"));
            return null;
        }
    }

    protected void configureActions() {
        final IRichText richText = getRichText();
        toolBar.addAction(new BoldAction(richText));
        toolBar.addAction(new ItalicAction(richText));
        toolBar.addAction(new UnderlineAction(richText));
        toolBar.addAction(new ForegroundAction(richText));
        toolBar.addAction(new BackgroundAction(richText));
        toolBar.addAction(new SubscriptAction(richText));
        toolBar.addAction(new SuperscriptAction(richText));
        toolBar.addSeparator();
        toolBar.addAction(new AddOrderedListAction(richText));
        toolBar.addAction(new AddUnorderedListAction(richText));
        toolBar.addAction(new JustifyLeftAction(richText));
        toolBar.addAction(new JustifyCenterAction(richText));
        toolBar.addAction(new JustifyRightAction(richText));
        toolBar.addAction(new JustifyFullAction(richText));
        toolBar.addSeparator();
        toolBar.addAction(new IndentAction(richText));
        toolBar.addAction(new OutdentAction(richText));
        toolBar.addSeparator();

        // toolBar.addAction(new TidyActionGroup(richText));
        // toolBar.addSeparator();
        toolBar.addAction(new AddTableAction(richText));
        final AddColumnAction addColumnAction = new AddColumnAction(richText);
        addColumnAction.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                        "icons/addColumn.gif"));
        addColumnAction.setToolTipText("Add column");
        toolBar.addAction(addColumnAction);
        final AddRowAction addRowAction = new AddRowAction(richText);
        addRowAction.setImageDescriptor(AbstractUIPlugin
                .imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                        "icons/addRow.gif"));
        addRowAction.setToolTipText("Add row.");
        toolBar.addAction(addRowAction);
        toolBar.addSeparator();
        toolBar.addAction(new AddLinkAction(richText));
        toolBar.addAction(new AddImageActionEx(richText, file));
        toolBar.addAction(new AddCodeAction(richText));
        toolBar.addSeparator();
        toolBar.addAction(new AddLineAction(richText));

        toolBar.addAction(new BlockTagActionEx(richText));
        toolBar.addAction(new FontNameAction(richText));
        toolBar.addAction(new FontSizeAction(richText));
        toolBar.addAction(new FontStyleAction(richText));
    }

    public void setFocus() {
        partControl.setFocus();
    }

}
