package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class ConnectorTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterConnectorTypeDeclaration(acmeParser.ConnectorTypeDeclarationContext ctx) {
		/*
		 * name
		 */
		type = new Type();
		if (null != ctx.IDENTIFIER()) {
			type.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_ConnectorDescription()) {
			final Connector connector = new Connector();
			final Parse_ConnectorDescriptionListener parse_ConnectorDescriptionListener = new Parse_ConnectorDescriptionListener(connector);
			parse_ConnectorDescriptionListener.enterParse_ConnectorDescription(ctx.parse_ConnectorDescription());
		}
	}
}
