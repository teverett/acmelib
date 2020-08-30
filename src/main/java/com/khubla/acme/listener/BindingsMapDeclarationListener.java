package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class BindingsMapDeclarationListener extends AbstractListener {
	@Override
	public void enterBindingsMapDeclaration(acmeParser.BindingsMapDeclarationContext ctx) {
		if (null != ctx.bindingDeclaration()) {
			for (final BindingDeclarationContext bindingDeclarationContext : ctx.bindingDeclaration()) {
				final BindingDeclarationListener bindingDeclarationListener = new BindingDeclarationListener();
				bindingDeclarationListener.enterBindingDeclaration(bindingDeclarationContext);
			}
		}
	}
}
