package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class BooleanExpressionListener extends AbstractListener {
	@Override
	public void enterBooleanExpression(acmeParser.BooleanExpressionContext ctx) {
		if (null != ctx.orExpression()) {
			for (final OrExpressionContext orExpressionContext : ctx.orExpression()) {
				final OrExpressionListener orExpressionListener = new OrExpressionListener();
				orExpressionListener.enterOrExpression(orExpressionContext);
			}
		}
	}
}
