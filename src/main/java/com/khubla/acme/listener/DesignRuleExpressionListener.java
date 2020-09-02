package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class DesignRuleExpressionListener extends AbstractListener {
	@Override
	public void enterDesignRuleExpression(acmeParser.DesignRuleExpressionContext ctx) {
		if (null != ctx.aSTDRImpliesExpression()) {
			for (final ASTDRImpliesExpressionContext aSTDRImpliesExpressionContext : ctx.aSTDRImpliesExpression()) {
				final ImpliesExpressionListener impliesExpressionListener = new ImpliesExpressionListener();
				impliesExpressionListener.enterASTDRImpliesExpression(aSTDRImpliesExpressionContext);
			}
		}
	}
}
