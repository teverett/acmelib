package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;

public class RoleTypeRefListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();

	@Override
	public void enterAcmeRoleTypeRef(AcmeRoleTypeRefContext ctx) {
		if (null != ctx.identifier()) {
			for (final IdentifierContext identifierContext : ctx.identifier()) {
				final IdentifierListener identifierListener = new IdentifierListener();
				identifierListener.enterIdentifier(identifierContext);
				names.add(identifierListener.identifier);
			}
		}
	}
}
