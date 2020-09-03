package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeFloatListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeFloat(AcmePropertyTypeFloatContext ctx) {
		type = ctx.FLOAT().getText();
	}
}
