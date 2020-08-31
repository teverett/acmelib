package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class GroupTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterGroupTypeDeclaration(acmeParser.GroupTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.IDENTIFIER()) {
			type.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_GroupDescription()) {
			final Parse_GroupDescriptionListener parse_GroupDescriptionListener = new Parse_GroupDescriptionListener();
			parse_GroupDescriptionListener.enterParse_GroupDescription(ctx.parse_GroupDescription());
		}
	}
}
