package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class ImpliesExpressionListener extends AbstractListener {
	@Override
	public void enterImpliesExpression(acmeParser.ImpliesExpressionContext ctx) {
		if (null != ctx.iffExpression()) {
			for (final IffExpressionContext iffExpressionContext : ctx.iffExpression()) {
				final IffExpressionListener iffExpressionListener = new IffExpressionListener();
				iffExpressionListener.enterIffExpression(iffExpressionContext);
			}
		}
	}
}
