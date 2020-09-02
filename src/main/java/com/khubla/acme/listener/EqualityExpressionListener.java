package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class EqualityExpressionListener extends AbstractListener {
	@Override
	public void enterDREqualityExpression(DREqualityExpressionContext ctx) {
		if (null != ctx.dRRelationalExpression()) {
			for (final DRRelationalExpressionContext dRRelationalExpressionContext : ctx.dRRelationalExpression()) {
				final RelationalExpressionListener relationalExpressionListener = new RelationalExpressionListener();
				relationalExpressionListener.enterDRRelationalExpression(dRRelationalExpressionContext);
			}
		}
	}
}
