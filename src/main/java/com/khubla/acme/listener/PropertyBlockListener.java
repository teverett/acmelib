package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyBlockListener extends AbstractListener {
	@Override
	public void enterAcmePropertyBlock(AcmePropertyBlockContext ctx) {
		if (null != ctx.acmePropertyBlockEntry()) {
			for (final AcmePropertyBlockEntryContext acmePropertyBlockEntryContext : ctx.acmePropertyBlockEntry()) {
				final PropertyBlockEntryListener propertyBlockEntryListener = new PropertyBlockEntryListener();
				propertyBlockEntryListener.enterAcmePropertyBlockEntry(acmePropertyBlockEntryContext);
			}
		}
	}
}
