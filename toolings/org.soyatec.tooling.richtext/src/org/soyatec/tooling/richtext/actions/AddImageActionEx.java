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
package org.soyatec.tooling.richtext.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextCommand;
import org.eclipse.epf.richtext.actions.AddImageAction;
import org.eclipse.epf.richtext.dialogs.AddImageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.soyatec.tooling.richtext.Activator;

public class AddImageActionEx extends AddImageAction {

	private final IFile file;

	public AddImageActionEx(final IRichText richText, final IFile file) {
		super(richText);
		this.file = file;
	}

	public void execute(final IRichText richText) {
		if (richText != null) {
			final AddImageDialog dialog = new AddImageDialog(Display
					.getCurrent().getActiveShell());
			dialog.open();
			if (dialog.getReturnCode() == Window.OK) {
				String imageURL = dialog.getImage().getURL();
				boolean isFile = false;
				if (imageURL.length() > 0) {
					try {
						isFile = "file".equals(new URL(imageURL).getProtocol());
					} catch (final MalformedURLException e) {
						isFile = false;
						Activator.log(e);
					}
				}
				if (file != null && isFile) {
					imageURL = makeRelative(imageURL);
				}
				richText.executeCommand(RichTextCommand.ADD_IMAGE, imageURL);
			}
		}
	}

	private String makeRelative(final String imageURL) {
		if (file == null || imageURL == null) {
			return null;
		}
		if (file.exists()) {
			final IFolder folder = file.getProject().getFolder("images");
			final File image = new File(imageURL.replace("file:/", ""));
			final IFile imageFile = folder.getFile(image.getName());
			if (!imageFile.exists()) {
				try {
					if (!folder.exists()) {
						folder.create(true, true, null);
					}
					imageFile.create(new FileInputStream(image), true, null);
				} catch (final FileNotFoundException e) {
					Activator.log(e);
				} catch (final CoreException e) {
					Activator.log(e);
				}
			}
			final IPath path = imageFile.getProjectRelativePath();
			final IPath makeRelativeTo = path.makeRelativeTo(file.getParent()
					.getProjectRelativePath());
			return makeRelativeTo.toString();
		}
		return imageURL;
	}

}
