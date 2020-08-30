package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortDeclarationListener extends AbstractListener {
	public Port port;

	@Override
	public void enterPortDeclaration(acmeParser.PortDeclarationContext ctx) {
		port = new Port();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			port.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * types
		 */
		if (null != ctx.lookup_PortTypeByName()) {
			for (final Lookup_PortTypeByNameContext lookup_PortTypeByNameContext : ctx.lookup_PortTypeByName()) {
				final Lookup_PortTypeByNameListener lookup_PortTypeByNameListener = new Lookup_PortTypeByNameListener();
				lookup_PortTypeByNameListener.enterLookup_PortTypeByName(lookup_PortTypeByNameContext);
			}
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_PortDescription()) {
			final Parse_PortDescriptionListener parse_PortDescriptionListener = new Parse_PortDescriptionListener(port);
			parse_PortDescriptionListener.enterParse_PortDescription(ctx.parse_PortDescription());
		}
	}
}
