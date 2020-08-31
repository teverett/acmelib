package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class RoleTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterRoleTypeDeclaration(acmeParser.RoleTypeDeclarationContext ctx) {
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
		if (null != ctx.parse_RoleDescription()) {
			final Parse_RoleDescriptionListener parse_RoleDescriptionListener = new Parse_RoleDescriptionListener();
			parse_RoleDescriptionListener.enterParse_RoleDescription(ctx.parse_RoleDescription());
		}
	}
}
