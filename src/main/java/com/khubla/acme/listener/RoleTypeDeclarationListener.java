package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RoleTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterAcmeRoleTypeDeclaration(AcmeRoleTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			type.setName(identifierListener.identifier);
		}
		/*
		 * body
		 */
		if (null != ctx.acmeRoleBody()) {
			final RoleBodyListener roleBodyListener = new RoleBodyListener();
			roleBodyListener.enterAcmeRoleBody(ctx.acmeRoleBody());
		}
		/*
		 * type ref
		 */
		if (null != ctx.acmeRoleTypeRef()) {
			for (final AcmeRoleTypeRefContext acmeRoleTypeRefContext : ctx.acmeRoleTypeRef()) {
				final RoleTypeRefListener roleTypeRefListener = new RoleTypeRefListener();
				roleTypeRefListener.enterAcmeRoleTypeRef(acmeRoleTypeRefContext);
			}
		}
	}
}
