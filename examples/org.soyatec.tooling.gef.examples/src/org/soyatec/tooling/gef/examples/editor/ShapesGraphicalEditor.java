package org.soyatec.tooling.gef.examples.editor;

import java.io.IOException;
import java.util.Collections;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.soyatec.tooling.di.Diagram;
import org.soyatec.tooling.gef.commands.CombinedCommandStack;
import org.soyatec.tooling.gef.examples.Activator;
import org.soyatec.tooling.gef.examples.edit.parts.ShapesEditPartFactory;
import org.soyatec.tooling.gef.examples.shapes.provider.ShapesItemProviderAdapterFactory;
import org.soyatec.tooling.gef.toolbar.editor.GraphicalEditorWithToolBarPalette;

public class ShapesGraphicalEditor extends GraphicalEditorWithToolBarPalette
        implements CommandStackListener {

    private Diagram diagram;

    private ComposedAdapterFactory factory;
    private CombinedCommandStack commandStack;
    private EditingDomain editingDomain;

    public ShapesGraphicalEditor() {
        commandStack = new CombinedCommandStack();
        editingDomain = new AdapterFactoryEditingDomain(getFactory(),
                commandStack);
        setEditDomain(new ShapesEditDomain(this, editingDomain));
        commandStack.addCommandStackListener(this);
    }

    private ComposedAdapterFactory getFactory() {
        if (factory == null) {
            factory = new ComposedAdapterFactory();
            factory = new ComposedAdapterFactory(
                    ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

            factory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
            factory.addAdapterFactory(new ShapesItemProviderAdapterFactory());
            factory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        }
        return factory;
    }

    @Override
    public void init(IEditorSite site, IEditorInput input)
            throws PartInitException {
        super.init(site, input);
        if (input instanceof IFileEditorInput) {
            IFile file = ((IFileEditorInput) input).getFile();
            ResourceSet resourceSet = null;
            if (editingDomain != null) {
                resourceSet = editingDomain.getResourceSet();
            } else {
                resourceSet = new ResourceSetImpl();
            }
            Resource resource = resourceSet.getResource(URI
                    .createPlatformResourceURI(file.getFullPath().toString(),
                            true), true);
            EList<EObject> contents = resource.getContents();
            for (EObject eObject : contents) {
                if (eObject instanceof Diagram) {
                    diagram = (Diagram) eObject;
                }
            }
        }
    }

    @Override
    protected PaletteRoot createPaletteRoot() {
        return ShapesPalette.create();
    }

    @Override
    protected void initializeGraphicalViewer() {
        getGraphicalViewer().setEditPartFactory(new ShapesEditPartFactory());
        if (diagram != null) {
            getGraphicalViewer().setContents(diagram);
        }
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        if (diagram != null) {
            try {
                diagram.eResource().save(Collections.emptyMap());
            } catch (IOException e) {
                Activator.log(e);
            }
        }
        getModelCommandStack().saveIsDone();
    }

    protected CombinedCommandStack getModelCommandStack() {
        return commandStack;
    }

    public void dispose() {
        getModelCommandStack().removeCommandStackListener(this);
        super.dispose();
    }

    @Override
    public void commandStackChanged(final EventObject event) {
        super.commandStackChanged(event);
        firePropertyChange(PROP_DIRTY);
    }

    @Override
    public boolean isDirty() {
        return getModelCommandStack().isSaveNeeded();
    }
}
