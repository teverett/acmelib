package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;
import com.khubla.acme.domain.DesignRule.*;

public class Parse_DesignRuleListener extends AbstractListener {
	public DesignRule designRule;

	@Override
	public void enterParse_DesignRule(acmeParser.Parse_DesignRuleContext ctx) {
		designRule = new DesignRule();
		/*
		 * type
		 */
		if (null != ctx.INVARIANT()) {
			designRule.setDesignRuleType(DesignRuleType.invariant);
		} else {
			designRule.setDesignRuleType(DesignRuleType.heuristic);
		}
		/*
		 * expression
		 */
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
		/*
		 * prop
		 */
		if (null != ctx.parse_PropertyDescription()) {
			for (final Parse_PropertyDescriptionContext parse_PropertyDescriptionContext : ctx.parse_PropertyDescription()) {
				final Parse_PropertyDescriptionListener parse_PropertyDescriptionListener = new Parse_PropertyDescriptionListener();
				parse_PropertyDescriptionListener.enterParse_PropertyDescription(parse_PropertyDescriptionContext);
				designRule.addProperty(parse_PropertyDescriptionListener.property);
			}
		}
	}
}
