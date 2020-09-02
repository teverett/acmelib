package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class StringLiteralListener extends AbstractListener {
	public String string;

	@Override
	public void enterStringLiteral(StringLiteralContext ctx) {
		this.string = ctx.STRING_LITERAL().getText();
	}
}
