package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RolesBlock1Listener extends AbstractListener {
	public List<Role> roles = new ArrayList<Role>();

	// TODO
	@Override
	public void enterRolesBlock1(acmeParser.RolesBlock1Context ctx) {
		/*
		 * names
		 */
		final List<String> names = new ArrayList<String>();
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				names.add(terminalNode.getText());
			}
		}
		/*
		 * types
		 */
		if (null != ctx.lookup_RoleTypeByName()) {
			for (final Lookup_RoleTypeByNameContext lookup_RoleTypeByNameContext : ctx.lookup_RoleTypeByName()) {
				final Lookup_RoleTypeByNameListener lookup_RoleTypeByNameListener = new Lookup_RoleTypeByNameListener();
				lookup_RoleTypeByNameListener.enterLookup_RoleTypeByName(lookup_RoleTypeByNameContext);
			}
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_RoleDescription()) {
			for (final Parse_RoleDescriptionContext parse_RoleDescriptionContext : ctx.parse_RoleDescription()) {
				new Role();
				final Parse_RoleDescriptionListener parse_RoleDescriptionListener = new Parse_RoleDescriptionListener();
				parse_RoleDescriptionListener.enterParse_RoleDescription(parse_RoleDescriptionContext);
			}
		}
	}
}
