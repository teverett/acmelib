package com.khubla.acme.listener;

import com.khubla.acme.*;

public class SetExpressionListener extends AbstractListener {
	@Override
	public void enterSetExpression(acmeParser.SetExpressionContext ctx) {
		if (null != ctx.literalSet()) {
			final LiteralSetListener literalSetListener = new LiteralSetListener();
			literalSetListener.enterLiteralSet(ctx.literalSet());
		}
		if (null != ctx.pathExpression()) {
			final PathExpressionListener pathExpressionListener = new PathExpressionListener();
			pathExpressionListener.enterPathExpression(ctx.pathExpression());
		}
		if (null != ctx.setConstructor()) {
			final SetConstructorListener setConstructorListener = new SetConstructorListener();
			setConstructorListener.enterSetConstructor(ctx.setConstructor());
		}
	}
}
