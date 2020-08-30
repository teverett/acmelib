package com.khubla.acme.listener;

import com.khubla.acme.*;

public class UnaryExpressionListener extends AbstractListener {
	@Override
	public void enterUnaryExpression(acmeParser.UnaryExpressionContext ctx) {
		if (null != ctx.unaryExpression()) {
			final UnaryExpressionListener unaryExpressionListener = new UnaryExpressionListener();
			unaryExpressionListener.enterUnaryExpression(ctx.unaryExpression());
		}
		if (null != ctx.primitiveExpression()) {
			final PrimitiveExpressionListener primitiveExpressionListener = new PrimitiveExpressionListener();
			primitiveExpressionListener.enterPrimitiveExpression(ctx.primitiveExpression());
		}
	}
}
