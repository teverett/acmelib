package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class BindingsMapDeclarationListener extends AbstractListener {
	public Bindings bindings;

	@Override
	public void enterAcmeBindingsMapDeclaration(AcmeBindingsMapDeclarationContext ctx) {
		if (null != ctx.acmeBindingDeclaration()) {
			for (final AcmeBindingDeclarationContext acmeBindingDeclarationContext : ctx.acmeBindingDeclaration()) {
				final BindingDeclarationListener bindingDeclarationListener = new BindingDeclarationListener();
				bindingDeclarationListener.enterAcmeBindingDeclaration(acmeBindingDeclarationContext);
			}
		}
	}
}
