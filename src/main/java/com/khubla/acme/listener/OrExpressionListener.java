package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class OrExpressionListener extends AbstractListener {
	@Override
	public void enterOrExpression(acmeParser.OrExpressionContext ctx) {
		if (null != ctx.impliesExpression()) {
			for (final ImpliesExpressionContext impliesExpressionContext : ctx.impliesExpression()) {
				final ImpliesExpressionListener impliesExpressionListener = new ImpliesExpressionListener();
				impliesExpressionListener.enterImpliesExpression(impliesExpressionContext);
			}
		}
	}
}
