package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class AndExpressionListener extends AbstractListener {
	@Override
	public void enterDRAndExpression(DRAndExpressionContext ctx) {
		if (null != ctx.dRNegateExpression()) {
			for (DRNegateExpressionContext dRNegateExpressionContext : ctx.dRNegateExpression()) {
				NegateExpressionListener negateExpressionListener = new NegateExpressionListener();
				negateExpressionListener.enterDRNegateExpression(dRNegateExpressionContext);
			}
		}
	}
}
