package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeBooleanListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeBoolean(AcmePropertyTypeBooleanContext ctx) {
		type = ctx.BOOLEAN().getText();
	}
}
