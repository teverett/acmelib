package com.khubla.acme.listener;

import com.khubla.acme.*;

public class SequenceExpressionListener extends AbstractListener {
	@Override
	public void enterSequenceExpression(acmeParser.SequenceExpressionContext ctx) {
		if (null != ctx.pathExpression()) {
			final PathExpressionListener pathExpressionListener = new PathExpressionListener();
			pathExpressionListener.enterPathExpression(ctx.pathExpression());
		}
	}
}
