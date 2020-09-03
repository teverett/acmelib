package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;

public class PropertyTypeEnumListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();

	@Override
	public void enterAcmePropertyTypeEnum(AcmePropertyTypeEnumContext ctx) {
		if (null != ctx.identifier()) {
			for (final IdentifierContext identifierContext : ctx.identifier()) {
				final IdentifierListener identifierListener = new IdentifierListener();
				identifierListener.enterIdentifier(identifierContext);
				names.add(identifierListener.identifier);
			}
		}
	}
}
