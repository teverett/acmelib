package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class RepresentationDeclarationListener extends AbstractListener {
	public Representation representation;

	@Override
	public void enterAcmeRepresentationDeclaration(AcmeRepresentationDeclarationContext ctx) {
		representation = new Representation();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			representation.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * system
		 */
		if (null != ctx.acmeSystemDeclaration()) {
			final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
			systemDeclarationListener.enterAcmeSystemDeclaration(ctx.acmeSystemDeclaration());
		}
		/*
		 * bindings map
		 */
		if (null != ctx.acmeBindingsMapDeclaration()) {
			final BindingsMapDeclarationListener bindingsMapDeclarationListener = new BindingsMapDeclarationListener();
			bindingsMapDeclarationListener.enterAcmeBindingsMapDeclaration(ctx.acmeBindingsMapDeclaration());
		}
	}
}
