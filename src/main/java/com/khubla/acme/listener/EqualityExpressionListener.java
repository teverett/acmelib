package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class EqualityExpressionListener extends AbstractListener {
	@Override
	public void enterEqualityExpression(acmeParser.EqualityExpressionContext ctx) {
		if (null != ctx.relationalExpression()) {
			for (final RelationalExpressionContext relationalExpressionContext : ctx.relationalExpression()) {
				final RelationalExpressionListener relationalExpressionListener = new RelationalExpressionListener();
				relationalExpressionListener.enterRelationalExpression(relationalExpressionContext);
			}
		}
	}
}
