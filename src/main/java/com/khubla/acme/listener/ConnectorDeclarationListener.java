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
			IdentifierListener identifierListener = new IdentifierListener();
			identifierListener.enterIdentifier(ctx.identifier());
			connector.setName(identifierListener.identifier);
		}
		/*
		 * ref
		 */
		if (null != ctx.acmeConnectorTypeRef()) {
			for (AcmeConnectorTypeRefContext acmeConnectorTypeRefContext : ctx.acmeConnectorTypeRef()) {
				ConnectorTypeRefListener connectorTypeRefListener = new ConnectorTypeRefListener();
				connectorTypeRefListener.enterAcmeConnectorTypeRef(acmeConnectorTypeRefContext);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.acmeConnectorBody()) {
			ConnectorBodyListener connectorBodyListener = new ConnectorBodyListener();
			connectorBodyListener.enterAcmeConnectorBody(ctx.acmeConnectorBody());
		}
	}
}
