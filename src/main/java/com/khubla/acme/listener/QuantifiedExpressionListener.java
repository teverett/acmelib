package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class QuantifiedExpressionListener extends AbstractListener {
	@Override
	public void enterQuantifiedExpression(acmeParser.QuantifiedExpressionContext ctx) {
		if (null != ctx.variableSetDeclaration()) {
			for (final VariableSetDeclarationContext variableSetDeclarationContext : ctx.variableSetDeclaration()) {
				final VariableSetDeclarationListener variableSetDeclarationListener = new VariableSetDeclarationListener();
				variableSetDeclarationListener.enterVariableSetDeclaration(variableSetDeclarationContext);
			}
		}
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
	}
}
