package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortTypeDeclarationListener extends AbstractListener {
	public PortType type;

	@Override
	public void enterAcmePortTypeDeclaration(AcmePortTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new PortType();
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			type.setName(identifierListener.identifier);
		}
		/*
		 * body
		 */
		if (null != ctx.acmePortBody()) {
			final PortBodyListener portBodyListener = new PortBodyListener();
			portBodyListener.enterAcmePortBody(ctx.acmePortBody());
		}
		/*
		 * ref
		 */
		if (null != ctx.acmePortTypeRef()) {
			for (final AcmePortTypeRefContext acmePortTypeRefContext : ctx.acmePortTypeRef()) {
				final PortTypeRefListener portTypeRefListener = new PortTypeRefListener();
				portTypeRefListener.enterAcmePortTypeRef(acmePortTypeRefContext);
			}
		}
	}
}
