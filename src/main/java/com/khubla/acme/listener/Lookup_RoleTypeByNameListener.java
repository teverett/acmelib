package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class Lookup_RoleTypeByNameListener extends AbstractListener {
	public List<Role> roles = new ArrayList<Role>();

	@Override
	public void enterLookup_RoleTypeByName(acmeParser.Lookup_RoleTypeByNameContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				roles.add(new Role(terminalNode.getText()));
			}
		}
	}
}
