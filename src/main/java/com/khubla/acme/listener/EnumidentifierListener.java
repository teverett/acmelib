package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class EnumidentifierListener extends AbstractListener {
	public String name;

	@Override
	public void enterDesignRule(DesignRuleContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			name = ctx.IDENTIFIER().getText();
		}
	}
}
