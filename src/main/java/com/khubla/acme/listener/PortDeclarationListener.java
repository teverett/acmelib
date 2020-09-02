package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortDeclarationListener extends AbstractListener {
	public Port port;

	@Override
	public void enterAcmePortDeclaration(AcmePortDeclarationContext ctx) {
		port = new Port();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			port.setName(identifierListener.identifier);
		}
		/*
		 * type ref
		 */
		if (null != ctx.acmePortTypeRef()) {
			for (final AcmePortTypeRefContext acmePortTypeRefContext : ctx.acmePortTypeRef()) {
				final PortTypeRefListener portTypeRefListener = new PortTypeRefListener();
				portTypeRefListener.enterAcmePortTypeRef(acmePortTypeRefContext);
			}
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
		if (null != ctx.acmePortInstantiatedTypeRef()) {
			for (final AcmePortInstantiatedTypeRefContext acmePortInstantiatedTypeRefContext : ctx.acmePortInstantiatedTypeRef()) {
				final PortInstantiatedTypeRefListener portInstantiatedTypeRefListener = new PortInstantiatedTypeRefListener();
				portInstantiatedTypeRefListener.enterAcmePortInstantiatedTypeRef(acmePortInstantiatedTypeRefContext);
			}
		}
	}
}
