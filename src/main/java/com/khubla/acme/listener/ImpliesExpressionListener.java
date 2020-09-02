package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class ImpliesExpressionListener extends AbstractListener {
	@Override
	public void enterASTDRImpliesExpression(ASTDRImpliesExpressionContext ctx) {
		if (null != ctx.dRIffExpression()) {
			for (final DRIffExpressionContext rRIffExpressionContext : ctx.dRIffExpression()) {
				final IffExpressionListener iffExpressionListener = new IffExpressionListener();
				iffExpressionListener.enterDRIffExpression(rRIffExpressionContext);
			}
		}
	}
}
