package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class ConnectorDeclarationListener extends AbstractListener {
	public Connector connector;

	@Override
	public void enterConnectorDeclaration(acmeParser.ConnectorDeclarationContext ctx) {
		connector = new Connector();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			connector.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * types
		 */
		if (null != ctx.lookup_ConnectorTypeByName()) {
			for (final Lookup_ConnectorTypeByNameContext lookup_ConnectorTypeByNameContext : ctx.lookup_ConnectorTypeByName()) {
				final Lookup_ConnectorTypeByNameListener lookup_ConnectorTypeByNameListener = new Lookup_ConnectorTypeByNameListener();
				lookup_ConnectorTypeByNameListener.enterLookup_ConnectorTypeByName(lookup_ConnectorTypeByNameContext);
			}
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_ConnectorDescription()) {
			final Parse_ConnectorDescriptionListener parse_ConnectorDescriptionListener = new Parse_ConnectorDescriptionListener(connector);
			parse_ConnectorDescriptionListener.enterParse_ConnectorDescription(ctx.parse_ConnectorDescription());
		}
	}
}
