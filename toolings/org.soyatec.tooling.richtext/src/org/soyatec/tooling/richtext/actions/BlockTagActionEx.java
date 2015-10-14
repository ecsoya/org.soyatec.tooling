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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextCommand;
import org.eclipse.epf.richtext.actions.BlockTagAction;
import org.eclipse.epf.richtext.html.BlockTag;

public class BlockTagActionEx extends BlockTagAction {

	private static final BlockTag[] BLOCK_TAGS = new BlockTag[] {
			BlockTag.PARAGRAPH, BlockTag.HEADING_1, BlockTag.HEADING_2,
			BlockTag.HEADING_3, BlockTag.HEADING_4, BlockTag.HEADING_5,
			BlockTag.HEADING_6, BlockTag.ADDRESS, BlockTag.PREFORMATTED_TEXT };

	public BlockTagActionEx(final IRichText richText) {
		super(richText);
		if (richText != null) {
			richText.executeCommand(RichTextCommand.FORMAT_BLOCK,
					BlockTag.PARAGRAPH.getValue());
		}
	}

	public Collection<String> getInput() {
		final Collection<String> returnList = new ArrayList<String>();
		for (final BlockTag bt : BLOCK_TAGS) {
			returnList.add(bt.getName());
		}
		return returnList;
	}

	public void execute(final IRichText richText) {
		if (richText != null) {
			final int index = getCCombo().getSelectionIndex();
			final BlockTag blockTag = BLOCK_TAGS[index];
			richText.executeCommand(RichTextCommand.FORMAT_BLOCK,
					blockTag.getValue());
		}
	}
}
