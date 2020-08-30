package com.khubla.acme.listener;

import com.khubla.acme.*;

public class Lookup_SystemTypeByNameListener extends AbstractListener {
	public String name;

	@Override
	public void enterLookup_SystemTypeByName(acmeParser.Lookup_SystemTypeByNameContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			name = ctx.IDENTIFIER().getText();
		}
	}
}
