package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class ActualParamsListener extends AbstractListener {
	@Override
	public void enterActualParams(acmeParser.ActualParamsContext ctx) {
		if (null != ctx.designRuleExpression()) {
			for (DesignRuleExpressionContext designRuleExpressionContext : ctx.designRuleExpression()) {
				DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
				designRuleExpressionListener.enterDesignRuleExpression(designRuleExpressionContext);
			}
		}
	}
}
