package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class MultiplicativeExpressionListener extends AbstractListener {
	@Override
	public void enterDRMultiplicativeExpression(DRMultiplicativeExpressionContext ctx) {
		if (null != ctx.dRNegativeExpression()) {
			for (final DRNegativeExpressionContext dRNegativeExpressionContext : ctx.dRNegativeExpression()) {
				final NegativeExpressionListener negativeExpressionListener = new NegativeExpressionListener();
				negativeExpressionListener.enterDRNegativeExpression(dRNegativeExpressionContext);
			}
		}
	}
}
