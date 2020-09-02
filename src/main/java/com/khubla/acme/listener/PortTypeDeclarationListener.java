package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterAcmePortTypeDeclaration(AcmePortTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.identifier()) {
			IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			type.setName(identifierListener.identifier);
		}
		/*
		 * body
		 */
		if (null != ctx.acmePortBody()) {
			PortBodyListener portBodyListener = new PortBodyListener();
			portBodyListener.enterAcmePortBody(ctx.acmePortBody());
		}
		/*
		 * ref
		 */
		if (null != ctx.acmePortTypeRef()) {
			for (AcmePortTypeRefContext acmePortTypeRefContext : ctx.acmePortTypeRef()) {
				PortTypeRefListener portTypeRefListener = new PortTypeRefListener();
				portTypeRefListener.enterAcmePortTypeRef(acmePortTypeRefContext);
			}
		}
	}
}
