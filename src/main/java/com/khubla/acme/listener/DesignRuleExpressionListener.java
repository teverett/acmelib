package com.khubla.acme.listener;

import com.khubla.acme.*;

public class DesignRuleExpressionListener extends AbstractListener {
	@Override
	public void enterDesignRuleExpression(acmeParser.DesignRuleExpressionContext ctx) {
		if (null != ctx.quantifiedExpression()) {
			final QuantifiedExpressionListener quantifiedExpressionListener = new QuantifiedExpressionListener();
			quantifiedExpressionListener.enterQuantifiedExpression(ctx.quantifiedExpression());
		} else if (null != ctx.booleanExpression()) {
			final BooleanExpressionListener booleanExpressionListener = new BooleanExpressionListener();
			booleanExpressionListener.enterBooleanExpression(ctx.booleanExpression());
		}
	}
}
