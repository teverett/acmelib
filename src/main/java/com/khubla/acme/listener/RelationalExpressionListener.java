package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class RelationalExpressionListener extends AbstractListener {
	@Override
	public void enterDRRelationalExpression(DRRelationalExpressionContext ctx) {
		if (null != ctx.dRAdditiveExpression()) {
			for (final DRAdditiveExpressionContext dRAdditiveExpressionContext : ctx.dRAdditiveExpression()) {
				final AdditiveExpressionListener additiveExpressionListener = new AdditiveExpressionListener();
				additiveExpressionListener.enterDRAdditiveExpression(dRAdditiveExpressionContext);
			}
		}
	}
}
