package org.soyatec.tooling.views;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.soyatec.tooling.views.messages"; //$NON-NLS-1$
	public static String TreeViewerViewPart_LinkWithEditor_Text;
	public static String TreeViewerViewPart_LinkWithEditor_Tip;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
