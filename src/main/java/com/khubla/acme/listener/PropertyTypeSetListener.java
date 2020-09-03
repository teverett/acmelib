package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeSetListener extends AbstractListener {
	@Override
	public void enterAcmePropertyTypeSet(AcmePropertyTypeSetContext ctx) {
		if (null != ctx.acmeTypeRef()) {
			final TypeRefListener typeRefListener = new TypeRefListener();
			typeRefListener.enterAcmeTypeRef(ctx.acmeTypeRef());
		}
	}
}
