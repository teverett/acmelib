package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class PortTypeDeclarationListener extends AbstractListener {
	public Type type;

	@Override
	public void enterPortTypeDeclaration(acmeParser.PortTypeDeclarationContext ctx) {
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
		if (null != ctx.parse_PortDescription()) {
			final Port port = new Port();
			final Parse_PortDescriptionListener parse_PortDescriptionListener = new Parse_PortDescriptionListener(port);
			parse_PortDescriptionListener.enterParse_PortDescription(ctx.parse_PortDescription());
		}
	}
}
