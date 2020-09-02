package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class NegateExpressionListener extends AbstractListener {
	@Override
	public void enterDRNegateExpression(DRNegateExpressionContext ctx) {
		if (null != ctx.dRNegateExpression()) {
			NegateExpressionListener negateExpressionListener = new NegateExpressionListener();
			negateExpressionListener.enterDRNegateExpression(ctx.dRNegateExpression());
		} else if (null != ctx.dREqualityExpression()) {
			EqualityExpressionListener equalityExpressionListener = new EqualityExpressionListener();
			equalityExpressionListener.enterDREqualityExpression(ctx.dREqualityExpression());
		}
	}
}
