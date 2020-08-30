package com.khubla.acme.listener;

import com.khubla.acme.*;

public class RepresentationDeclarationListener extends AbstractListener {
	public String name;

	@Override
	public void enterRepresentationDeclaration(acmeParser.RepresentationDeclarationContext ctx) {
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			name = ctx.IDENTIFIER().getText();
		}
		/*
		 * system
		 */
		if (null != ctx.systemDeclaration()) {
			final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
			systemDeclarationListener.enterSystemDeclaration(ctx.systemDeclaration());
		}
		/*
		 * bindings
		 */
		if (null != ctx.bindingsMapDeclaration()) {
			final BindingsMapDeclarationListener bindingsMapDeclarationListener = new BindingsMapDeclarationListener();
			bindingsMapDeclarationListener.enterBindingsMapDeclaration(ctx.bindingsMapDeclaration());
		}
	}
}
