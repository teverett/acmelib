package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;

public class Lookup_GroupTypeByNameListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();

	@Override
	public void enterLookup_GroupTypeByName(acmeParser.Lookup_GroupTypeByNameContext ctx) {
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				names.add(terminalNode.getText());
			}
		}
	}
}
