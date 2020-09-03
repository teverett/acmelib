package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeDoubleListener extends AbstractListener {
	public String type;

	@Override
	public void enterAcmePropertyTypeDouble(AcmePropertyTypeDoubleContext ctx) {
		type = ctx.DOUBLE().getText();
	}
}
