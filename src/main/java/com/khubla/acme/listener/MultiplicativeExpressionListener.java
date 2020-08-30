package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class MultiplicativeExpressionListener extends AbstractListener {
	@Override
	public void enterMultiplicativeExpression(acmeParser.MultiplicativeExpressionContext ctx) {
		if (null != ctx.unaryExpression()) {
			for (final UnaryExpressionContext unaryExpressionContext : ctx.unaryExpression()) {
				final UnaryExpressionListener unaryExpressionListener = new UnaryExpressionListener();
				unaryExpressionListener.enterUnaryExpression(unaryExpressionContext);
			}
		}
	}
}
