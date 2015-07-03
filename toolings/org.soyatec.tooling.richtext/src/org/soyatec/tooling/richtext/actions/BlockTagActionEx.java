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

	public BlockTagActionEx(IRichText richText) {
		super(richText);
		if (richText != null) {
			richText.executeCommand(RichTextCommand.FORMAT_BLOCK,
					BlockTag.PARAGRAPH.getValue());
		}
	}

	public Collection<String> getInput() {
		Collection<String> returnList = new ArrayList<String>();
		for (BlockTag bt : BLOCK_TAGS) {
			returnList.add(bt.getName());
		}
		return returnList;
	}

	public void execute(IRichText richText) {
		if (richText != null) {
			int index = getCCombo().getSelectionIndex();
			BlockTag blockTag = BLOCK_TAGS[index];
			richText.executeCommand(RichTextCommand.FORMAT_BLOCK,
					blockTag.getValue());
		}
	}
}