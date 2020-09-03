package com.khubla.acme.listener;

import com.khubla.acme.*;

public class PrimitiveExpressionListener extends AbstractListener {
	@Override
	public void enterPrimitiveExpression(acmeParser.PrimitiveExpressionContext ctx) {
		if (null != ctx.literalConstant()) {
			final LiteralConstantListener literalConstantListener = new LiteralConstantListener();
			literalConstantListener.enterLiteralConstant(ctx.literalConstant());
		} else if (null != ctx.reference()) {
			final ReferenceListener referenceListener = new ReferenceListener();
			referenceListener.enterReference(ctx.reference());
		} else if (null != ctx.setExpression()) {
			final SetExpressionListener setExpressionListener = new SetExpressionListener();
			setExpressionListener.enterSetExpression(ctx.setExpression());
		} else if (null != ctx.parentheticalExpression()) {
			final ParentheticalExpressionListener parentheticalExpressionListener = new ParentheticalExpressionListener();
			parentheticalExpressionListener.enterParentheticalExpression(ctx.parentheticalExpression());
		} else if (null != ctx.literalConstant()) {
			throw new RuntimeException("Not Implemented");
		} else if (null != ctx.parentheticalExpression()) {
			throw new RuntimeException("Not Implemented");
		} else if (null != ctx.literalSequence()) {
			throw new RuntimeException("Not Implemented");
		} else if (null != ctx.quantifiedExpression()) {
			final QuantifiedExpressionListener quantifiedExpressionListener = new QuantifiedExpressionListener();
			quantifiedExpressionListener.enterQuantifiedExpression(ctx.quantifiedExpression());
		} else if (null != ctx.sequenceExpression()) {
			throw new RuntimeException("Not Implemented");
		}
	}
}
