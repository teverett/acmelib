package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class AdditiveExpressionListener extends AbstractListener {
	@Override
	public void enterDRAdditiveExpression(DRAdditiveExpressionContext ctx) {
		if (null != ctx.dRMultiplicativeExpression()) {
			for (final DRMultiplicativeExpressionContext dRMultiplicativeExpressionContext : ctx.dRMultiplicativeExpression()) {
				final MultiplicativeExpressionListener multiplicativeExpressionListener = new MultiplicativeExpressionListener();
				multiplicativeExpressionListener.enterDRMultiplicativeExpression(dRMultiplicativeExpressionContext);
			}
		}
	}
}
