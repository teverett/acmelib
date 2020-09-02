package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.acmeParser.*;

public class InstanceRefListener extends AbstractListener {
	public List<String> identifier = new ArrayList<String>();

	@Override
	public void enterAcmeInstanceRef(AcmeInstanceRefContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				identifier.add(terminalNode.getText());
			}
		}
	}
}
