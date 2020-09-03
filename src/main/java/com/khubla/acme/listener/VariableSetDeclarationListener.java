package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class VariableSetDeclarationListener extends AbstractListener {
	@Override
	public void enterVariableSetDeclaration(acmeParser.VariableSetDeclarationContext ctx) {
		/*
		 * type ref
		 */
		if (null != ctx.acmeTypeRef()) {
			final TypeRefListener typeRefListener = new TypeRefListener();
			typeRefListener.enterAcmeTypeRef(ctx.acmeTypeRef());
		}
		/*
		 * distinct
		 */
		if (null != ctx.distinctVariableSetDeclaration()) {
			final DistinctVariableSetDeclarationListener distinctVariableSetDeclarationListener = new DistinctVariableSetDeclarationListener();
			distinctVariableSetDeclarationListener.enterDistinctVariableSetDeclaration(ctx.distinctVariableSetDeclaration());
		}
		/*
		 * ident
		 */
		if (null != ctx.identifier()) {
			for (final IdentifierContext identifierContext : ctx.identifier()) {
				final IdentifierListener identifierListener = new IdentifierListener();
				identifierListener.enterIdentifier(identifierContext);
			}
		}
		/*
		 * set expression
		 */
		if (null != ctx.setExpression()) {
			final SetExpressionListener setExpressionListener = new SetExpressionListener();
			setExpressionListener.enterSetExpression(ctx.setExpression());
		}
		/*
		 * ref
		 */
		if (null != ctx.reference()) {
			final ReferenceListener referenceListener = new ReferenceListener();
			referenceListener.enterReference(ctx.reference());
		}
	}
}
