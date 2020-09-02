package com.khubla.acme.listener;

import com.khubla.acme.acmeParser.*;

public class MembersBlockListener extends AbstractListener {
	public String name;

	@Override
	public void enterAcmeMembersBlock(AcmeMembersBlockContext ctx) {
		throw new RuntimeException("Not Implemented");
	}
}
