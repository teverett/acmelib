package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class DesignRuleListener extends AbstractListener {
	public DesignRule designRule;

	@Override
	public void enterDesignRule(DesignRuleContext ctx) {
		designRule = new DesignRule();
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
