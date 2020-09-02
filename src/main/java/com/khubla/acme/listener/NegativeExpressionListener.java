package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class NegativeExpressionListener extends AbstractListener {
	@Override
	public void enterDRNegativeExpression(DRNegativeExpressionContext ctx) {
		if (null != ctx.dRNegativeExpression()) {
			final NegativeExpressionListener negativeExpressionListener = new NegativeExpressionListener();
			negativeExpressionListener.enterDRNegativeExpression(ctx.dRNegativeExpression());
		} else if (null != ctx.primitiveExpression()) {
			PrimitiveExpressionListener primitiveExpressionListener = new PrimitiveExpressionListener();
			primitiveExpressionListener.enterPrimitiveExpression(ctx.primitiveExpression());
		}
	}
}
