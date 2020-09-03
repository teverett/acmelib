package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeStringListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeString(AcmePropertyTypeStringContext ctx) {
		type = ctx.STRING().getText();
	}
}
