package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RoleDeclarationListener extends AbstractListener {
	public Role role;

	@Override
	public void enterRoleDeclaration(acmeParser.RoleDeclarationContext ctx) {
		role = new Role();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			role.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * type
		 */
		if (null != ctx.lookup_RoleTypeByName()) {
			for (final Lookup_RoleTypeByNameContext lookup_RoleTypeByNameContext : ctx.lookup_RoleTypeByName()) {
				final Lookup_RoleTypeByNameListener lookup_RoleTypeByNameListener = new Lookup_RoleTypeByNameListener();
				lookup_RoleTypeByNameListener.enterLookup_RoleTypeByName(lookup_RoleTypeByNameContext);
			}
		}
		/*
		 * Parse_RoleDescriptionListener
		 */
		if (null != ctx.parse_RoleDescription()) {
			final Parse_RoleDescriptionListener parse_RoleDescriptionListener = new Parse_RoleDescriptionListener();
			parse_RoleDescriptionListener.enterParse_RoleDescription(ctx.parse_RoleDescription());
		}
	}
}
