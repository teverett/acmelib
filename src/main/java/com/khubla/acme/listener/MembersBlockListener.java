package com.khubla.acme.listener;

import com.khubla.acme.*;

public class MembersBlockListener extends AbstractListener {
	public String name;

	@Override
	public void enterMembersBlock(acmeParser.MembersBlockContext ctx) {
		throw new RuntimeException("Not Implemented");
	}
}
