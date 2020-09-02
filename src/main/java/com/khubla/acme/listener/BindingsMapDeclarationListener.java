package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class BindingsMapDeclarationListener extends AbstractListener {
	public Bindings bindings;

	@Override
	public void enterAcmeBindingsMapDeclaration(AcmeBindingsMapDeclarationContext ctx) {
		bindings = new Bindings();
		if (null != ctx.bindingDeclaration()) {
			for (final BindingDeclarationContext bindingDeclarationContext : ctx.bindingDeclaration()) {
				final BindingDeclarationListener bindingDeclarationListener = new BindingDeclarationListener();
				bindingDeclarationListener.enterBindingDeclaration(bindingDeclarationContext);
				bindings.getBindings().add(bindingDeclarationListener.binding);
			}
		}
	}
}
