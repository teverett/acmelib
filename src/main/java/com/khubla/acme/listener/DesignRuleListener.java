package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class DesignRuleListener extends AbstractListener {
	@Override
	public void enterDesignRule(DesignRuleContext ctx) {
		if (null != ctx.acmePropertyBlock()) {
			final PropertyBlockListener propertyBlockListener = new PropertyBlockListener();
			propertyBlockListener.enterAcmePropertyBlock(ctx.acmePropertyBlock());
		}
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
	}
}
