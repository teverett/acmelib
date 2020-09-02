package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ConnectorTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterAcmeConnectorTypeDeclaration(AcmeConnectorTypeDeclarationContext ctx) {
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
		if (null != ctx.acmeConnectorBody()) {
			final ConnectorBodyListener connectorBodyListener = new ConnectorBodyListener();
			connectorBodyListener.enterAcmeConnectorBody(ctx.acmeConnectorBody());
		}
		/*
		 * ref
		 */
		if (null != ctx.acmeConnectorTypeRef()) {
			for (final AcmeConnectorTypeRefContext acmeConnectorTypeRefContext : ctx.acmeConnectorTypeRef()) {
				final ConnectorTypeRefListener connectorTypeRefListener = new ConnectorTypeRefListener();
				connectorTypeRefListener.enterAcmeConnectorTypeRef(acmeConnectorTypeRefContext);
			}
		}
	}
}
