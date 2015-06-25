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

public class AddImageActionEx extends AddImageAction {

	private IFile file;

	public AddImageActionEx(IRichText richText, IFile file) {
		super(richText);
		this.file = file;
	}

	public void execute(IRichText richText) {
		if (richText != null) {
			AddImageDialog dialog = new AddImageDialog(Display.getCurrent()
					.getActiveShell());
			dialog.open();
			if (dialog.getReturnCode() == Window.OK) {
				String imageURL = dialog.getImage().getURL();
				if (imageURL.length() > 0) {
					boolean isFile = false;
					try {
						isFile = "file".equals(new URL(imageURL).getProtocol());
					} catch (MalformedURLException e) {
					}
					if (file != null && isFile) {
						imageURL = makeRelative(imageURL);
					}
					richText.executeCommand(RichTextCommand.ADD_IMAGE, imageURL);
				}
			}
		}
	}

	private String makeRelative(String imageURL) {
		if (file == null || imageURL == null) {
			return null;
		}
		if (file.exists()) {
			IFolder folder = file.getProject().getFolder("images");
			File image = new File(imageURL.replace("file:/", ""));
			IFile imageFile = folder.getFile(image.getName());
			if (!imageFile.exists()) {
				try {
					if (!folder.exists()) {
						folder.create(true, true, null);
					}
					imageFile.create(new FileInputStream(image), true, null);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			IPath path = imageFile.getProjectRelativePath();
			IPath makeRelativeTo = path.makeRelativeTo(file.getParent()
					.getProjectRelativePath());
			return makeRelativeTo.toString();
		}
		return imageURL;
	}

}
