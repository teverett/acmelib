package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class RepresentationDeclarationListener extends AbstractListener {
	public Representation representation;

	@Override
	public void enterRepresentationDeclaration(acmeParser.RepresentationDeclarationContext ctx) {
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
		if (null != ctx.systemDeclaration()) {
			final SystemDeclarationListener systemDeclarationListener = new SystemDeclarationListener();
			systemDeclarationListener.enterSystemDeclaration(ctx.systemDeclaration());
			representation.getSystems().put(systemDeclarationListener.system.getName(), systemDeclarationListener.system);
		}
		/*
		 * bindings
		 */
		if (null != ctx.bindingsMapDeclaration()) {
			final BindingsMapDeclarationListener bindingsMapDeclarationListener = new BindingsMapDeclarationListener();
			bindingsMapDeclarationListener.enterBindingsMapDeclaration(ctx.bindingsMapDeclaration());
			representation.setBindings(bindingsMapDeclarationListener.bindings);
		}
	}
}
