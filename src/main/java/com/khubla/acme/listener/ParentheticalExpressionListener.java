package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ParentheticalExpressionListener extends AbstractListener {
	@Override
	public void enterParentheticalExpression(ParentheticalExpressionContext ctx) {
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
	}
}
