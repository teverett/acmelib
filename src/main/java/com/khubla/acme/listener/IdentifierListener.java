package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class IdentifierListener extends AbstractListener {
	public String identifier;

	@Override
	public void enterIdentifier(IdentifierContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			identifier = ctx.IDENTIFIER().getText();
		}
	}
}
