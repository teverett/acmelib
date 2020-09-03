package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class DesignRuleListener extends AbstractListener {
	@Override
	public void enterDesignRule(DesignRuleContext ctx) {
		if (null != ctx.acmePropertyBlock()) {
			PropertyBlockListener propertyBlockListener = new PropertyBlockListener();
			propertyBlockListener.enterAcmePropertyBlock(ctx.acmePropertyBlock());
		}
		if (null != ctx.designRuleExpression()) {
			DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
	}
}
