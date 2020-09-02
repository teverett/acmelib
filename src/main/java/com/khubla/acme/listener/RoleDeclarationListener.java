package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RoleDeclarationListener extends AbstractListener {
	public Role role;

	@Override
	public void enterAcmeRoleDeclaration(AcmeRoleDeclarationContext ctx) {
		role = new Role();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			role.setName(identifierListener.identifier);
		}
		/*
		 * ref
		 */
		if (null != ctx.acmeRoleTypeRef()) {
			for (final AcmeRoleTypeRefContext acmeRoleTypeRefContext : ctx.acmeRoleTypeRef()) {
				final RoleTypeRefListener roleTypeRefListener = new RoleTypeRefListener();
				roleTypeRefListener.enterAcmeRoleTypeRef(acmeRoleTypeRefContext);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.acmeRoleBody()) {
			final RoleBodyListener roleBodyListener = new RoleBodyListener();
			roleBodyListener.enterAcmeRoleBody(ctx.acmeRoleBody());
		}
		/*
		 * instantiated red
		 */
		if (null != ctx.acmeRoleInstantiatedTypeRef()) {
			for (final AcmeRoleInstantiatedTypeRefContext acmeRoleInstantiatedTypeRefContext : ctx.acmeRoleInstantiatedTypeRef()) {
				final RoleInstantiatedTypeRefListener roleInstantiatedTypeRefListener = new RoleInstantiatedTypeRefListener();
				roleInstantiatedTypeRefListener.enterAcmeRoleInstantiatedTypeRef(acmeRoleInstantiatedTypeRefContext);
			}
		}
	}
}
