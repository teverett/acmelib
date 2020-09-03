package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class ReferenceListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();

	@Override
	public void enterReference(acmeParser.ReferenceContext ctx) {
		if (null != ctx.identifier()) {
			for (final IdentifierContext identifierContext : ctx.identifier()) {
				final IdentifierListener identifierListener = new IdentifierListener();
				identifierListener.enterIdentifier(identifierContext);
				names.add(identifierListener.identifier);
			}
		}
		if (null != ctx.setReference()) {
			for (final SetReferenceContext setReferenceContext : ctx.setReference()) {
				final SetReferenceListener setReferenceListener = new SetReferenceListener();
				setReferenceListener.enterSetReference(setReferenceContext);
			}
		}
		if (null != ctx.actualParams()) {
			final ActualParamsListener actualParamsListener = new ActualParamsListener();
			actualParamsListener.enterActualParams(ctx.actualParams());
		}
	}
}
