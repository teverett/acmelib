package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class AdditiveExpressionListener extends AbstractListener {
	@Override
	public void enterAdditiveExpression(acmeParser.AdditiveExpressionContext ctx) {
		if (null != ctx.multiplicativeExpression()) {
			for (final MultiplicativeExpressionContext multiplicativeExpressionContext : ctx.multiplicativeExpression()) {
				final MultiplicativeExpressionListener multiplicativeExpressionListener = new MultiplicativeExpressionListener();
				multiplicativeExpressionListener.enterMultiplicativeExpression(multiplicativeExpressionContext);
			}
		}
	}
}
