package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class LiteralSetListener extends AbstractListener {
	@Override
	public void enterLiteralSet(acmeParser.LiteralSetContext ctx) {
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
		 * const
		 */
		if (null != ctx.literalConstant()) {
			for (final LiteralConstantContext literalConstantContext : ctx.literalConstant()) {
				final LiteralConstantListener literalConstantListener = new LiteralConstantListener();
				literalConstantListener.enterLiteralConstant(literalConstantContext);
			}
		}
	}
}
