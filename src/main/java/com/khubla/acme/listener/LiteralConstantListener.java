package com.khubla.acme.listener;

import com.khubla.acme.*;

public class LiteralConstantListener extends AbstractListener {
	public String value;

	@Override
	public void enterLiteralConstant(acmeParser.LiteralConstantContext ctx) {
		value = ctx.getText();
	}
}
