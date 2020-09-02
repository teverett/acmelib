package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyDeclarationListener extends AbstractListener {
	public Property property;

	@Override
	public void enterAcmePropertyDeclaration(AcmePropertyDeclarationContext ctx) {
		if (null != ctx.parse_PropertyDescription()) {
			final Parse_PropertyDescriptionListener parse_PropertyDescriptionListener = new Parse_PropertyDescriptionListener();
			parse_PropertyDescriptionListener.enterParse_PropertyDescription(ctx.parse_PropertyDescription());
			property = parse_PropertyDescriptionListener.property;
		}
	}
}
