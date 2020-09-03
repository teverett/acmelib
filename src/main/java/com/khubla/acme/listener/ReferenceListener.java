package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class ReferenceListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();

	@Override
	public void enterReference(acmeParser.ReferenceContext ctx) {
		if (null != ctx.identifier()) {
			for (IdentifierContext identifierContext : ctx.identifier()) {
				IdentifierListener identifierListener = new IdentifierListener();
				identifierListener.enterIdentifier(identifierContext);
				names.add(identifierListener.identifier);
			}
		}
		if (null != ctx.setReference()) {
			for (SetReferenceContext setReferenceContext : ctx.setReference()) {
				SetReferenceListener setReferenceListener = new SetReferenceListener();
				setReferenceListener.enterSetReference(setReferenceContext);
			}
		}
		if (null != ctx.actualParams()) {
			ActualParamsListener actualParamsListener = new ActualParamsListener();
			actualParamsListener.enterActualParams(ctx.actualParams());
		}
	}
}
