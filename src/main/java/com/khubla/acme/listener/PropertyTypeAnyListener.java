package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeAnyListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeAny(AcmePropertyTypeAnyContext ctx) {
		type = ctx.ANY().getText();
	}
}
