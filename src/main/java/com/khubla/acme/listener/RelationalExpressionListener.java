package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class RelationalExpressionListener extends AbstractListener {
	@Override
	public void enterRelationalExpression(acmeParser.RelationalExpressionContext ctx) {
		if (null != ctx.additiveExpression()) {
			for (final AdditiveExpressionContext additiveExpressionContext : ctx.additiveExpression()) {
				final AdditiveExpressionListener additiveExpressionListener = new AdditiveExpressionListener();
				additiveExpressionListener.enterAdditiveExpression(additiveExpressionContext);
			}
		}
	}
}
