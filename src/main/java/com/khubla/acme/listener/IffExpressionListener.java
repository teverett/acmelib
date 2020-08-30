package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class IffExpressionListener extends AbstractListener {
	@Override
	public void enterIffExpression(acmeParser.IffExpressionContext ctx) {
		if (null != ctx.equalityExpression()) {
			for (final EqualityExpressionContext equalityExpressionContext : ctx.equalityExpression()) {
				final EqualityExpressionListener equalityExpressionListener = new EqualityExpressionListener();
				equalityExpressionListener.enterEqualityExpression(equalityExpressionContext);
			}
		}
	}
}
