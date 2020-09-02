package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PortTypeRefListener extends AbstractListener {
	@Override
	public void enterDRNegateExpression(DRNegateExpressionContext ctx) {
		throw new RuntimeException("Not Implemented");
	}
}
