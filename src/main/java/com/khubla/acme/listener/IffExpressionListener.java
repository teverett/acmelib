package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class IffExpressionListener extends AbstractListener {
	@Override
	public void enterDRIffExpression(DRIffExpressionContext ctx) {
		if (null != ctx.dRAndExpression()) {
			for (final DRAndExpressionContext dRAndExpressionContext : ctx.dRAndExpression()) {
				final AndExpressionListener andExpressionListener = new AndExpressionListener();
				andExpressionListener.enterDRAndExpression(dRAndExpressionContext);
			}
		}
	}
}
