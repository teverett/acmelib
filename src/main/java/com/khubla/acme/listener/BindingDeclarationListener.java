package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class BindingDeclarationListener extends AbstractListener {
	public Binding binding;

	@Override
	public void enterAcmeBindingDeclaration(AcmeBindingDeclarationContext ctx) {
		/*
		 * ref
		 */
		if (null != ctx.acmeInstanceRef()) {
			for (AcmeInstanceRefContext acmeInstanceRefContext : ctx.acmeInstanceRef()) {
				InstanceRefListener instanceRefListener = new InstanceRefListener();
				instanceRefListener.enterAcmeInstanceRef(acmeInstanceRefContext);
			}
		}
		/*
		 * prop
		 */
		if (null != ctx.acmePropertyDeclaration()) {
			PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
			propertyDeclarationListener.enterAcmePropertyDeclaration(ctx.acmePropertyDeclaration());
		}
		/*
		 * prop block
		 */
		if (null != ctx.acmePropertyBlock()) {
			PropertyBlockListener propertyBlockListener = new PropertyBlockListener();
			propertyBlockListener.enterAcmePropertyBlock(ctx.acmePropertyBlock());
		}
	}
}
