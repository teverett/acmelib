package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ConnectorDeclarationListener extends AbstractListener {
	public Connector connector;

	@Override
	public void enterAcmeConnectorDeclaration(AcmeConnectorDeclarationContext ctx) {
		connector = new Connector();
		/*
		 * name
		 */
		if (null != ctx.identifier()) {
			final IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			connector.setName(identifierListener.identifier);
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
		/*
		 * body
		 */
		if (null != ctx.acmeConnectorBody()) {
			final ConnectorBodyListener connectorBodyListener = new ConnectorBodyListener();
			connectorBodyListener.enterAcmeConnectorBody(ctx.acmeConnectorBody());
		}
	}
}
