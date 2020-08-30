package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RolesBlock2Listener extends AbstractListener {
	public List<Role> roles = new ArrayList<Role>();

	@Override
	public void enterRolesBlock2(acmeParser.RolesBlock2Context ctx) {
		if (null != ctx.lookup_RoleTypeByName()) {
			for (final Lookup_RoleTypeByNameContext lookup_RoleTypeByNameContext : ctx.lookup_RoleTypeByName()) {
				final Lookup_RoleTypeByNameListener lookup_RoleTypeByNameListener = new Lookup_RoleTypeByNameListener();
				lookup_RoleTypeByNameListener.enterLookup_RoleTypeByName(lookup_RoleTypeByNameContext);
				roles.addAll(lookup_RoleTypeByNameListener.roles);
			}
		}
	}
}
