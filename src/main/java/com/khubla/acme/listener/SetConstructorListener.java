package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class SetConstructorListener extends AbstractListener {
	@Override
	public void enterSetConstructor(acmeParser.SetConstructorContext ctx) {
		/*
		 * var set
		 */
		if (null != ctx.variableSetDeclaration()) {
			final VariableSetDeclarationListener variableSetDeclarationListener = new VariableSetDeclarationListener();
			variableSetDeclarationListener.enterVariableSetDeclaration(ctx.variableSetDeclaration());
		}
		/*
		 * DR
		 */
		if (null != ctx.designRuleExpression()) {
			final DesignRuleExpressionListener designRuleExpressionListener = new DesignRuleExpressionListener();
			designRuleExpressionListener.enterDesignRuleExpression(ctx.designRuleExpression());
		}
		/*
		 * ref
		 */
		if (null != ctx.reference()) {
			for (final ReferenceContext referenceContext : ctx.reference()) {
				final ReferenceListener referenceListener = new ReferenceListener();
				referenceListener.enterReference(referenceContext);
			}
		}
		/*
		 * type
		 */
		if (null != ctx.acmeTypeRef()) {
			final TypeRefListener typeRefListener = new TypeRefListener();
			typeRefListener.enterAcmeTypeRef(ctx.acmeTypeRef());
		}
		/*
		 * set expr
		 */
		if (null != ctx.setExpression()) {
			final SetExpressionListener setExpressionListener = new SetExpressionListener();
			setExpressionListener.enterSetExpression(ctx.setExpression());
		}
	}
}
