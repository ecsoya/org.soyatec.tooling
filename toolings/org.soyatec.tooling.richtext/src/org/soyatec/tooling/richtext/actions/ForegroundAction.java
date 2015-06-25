package org.soyatec.tooling.richtext.actions;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextCommand;
import org.soyatec.tooling.richtext.Activator;

public class ForegroundAction extends ColorAction {

	public ForegroundAction(IRichText richText) {
		super(richText);
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "icons/textForeground.ico"));
		setToolTipText("Text Foreground");
	}

	protected String getCommandName() {
		return RichTextCommand.FORGROUND_COLOR;
	}

}
