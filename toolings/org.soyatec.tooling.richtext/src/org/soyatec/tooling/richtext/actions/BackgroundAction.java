package org.soyatec.tooling.richtext.actions;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextCommand;
import org.soyatec.tooling.richtext.Activator;

public class BackgroundAction extends ColorAction {

	public BackgroundAction(IRichText richText) {
		super(richText);
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "icons/textBackground.ico"));
		setToolTipText("Text Background");
	}

	protected String getCommandName() {
		return RichTextCommand.BACKGROUND_COLOR;
	}

}
