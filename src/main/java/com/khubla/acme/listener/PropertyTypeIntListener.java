package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeIntListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeInt(AcmePropertyTypeIntContext ctx) {
		type = ctx.INT().getText();
	}
}
