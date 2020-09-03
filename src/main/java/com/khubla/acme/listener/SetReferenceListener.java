package com.khubla.acme.listener;

import com.khubla.acme.*;

public class SetReferenceListener extends AbstractListener {
	public String type;

	@Override
	public void enterSetReference(acmeParser.SetReferenceContext ctx) {
		type = ctx.getText();
	}
}
