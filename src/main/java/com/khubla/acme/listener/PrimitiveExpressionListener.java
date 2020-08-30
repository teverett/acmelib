package com.khubla.acme.listener;

import com.khubla.acme.*;

public class PrimitiveExpressionListener extends AbstractListener {
	@Override
	public void enterPrimitiveExpression(acmeParser.PrimitiveExpressionContext ctx) {
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
		if (null != ctx.literalConstant()) {
			final LiteralConstantListener literalConstantListener = new LiteralConstantListener();
			literalConstantListener.enterLiteralConstant(ctx.literalConstant());
		}
		if (null != ctx.reference()) {
			final ReferenceListener referenceListener = new ReferenceListener();
			referenceListener.enterReference(ctx.reference());
		}
		if (null != ctx.setExpression()) {
			final SetExpressionListener setExpressionListener = new SetExpressionListener();
			setExpressionListener.enterSetExpression(ctx.setExpression());
		}
	}
}
