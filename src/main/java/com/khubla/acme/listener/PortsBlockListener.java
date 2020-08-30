package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PortsBlockListener extends AbstractListener {
	public Map<String, Port> ports = new HashMap<String, Port>();

	// TODO
	@Override
	public void enterPortsBlock(acmeParser.PortsBlockContext ctx) {
		/*
		 * names
		 */
		final List<String> names = new ArrayList<String>();
		if (null != ctx.IDENTIFIER()) {
			for (final TerminalNode terminalNode : ctx.IDENTIFIER()) {
				names.add(terminalNode.getText());
			}
		}
		/*
		 * types
		 */
		if (null != ctx.lookup_PortTypeByName()) {
			for (final Lookup_PortTypeByNameContext lookup_PortTypeByNameContext : ctx.lookup_PortTypeByName()) {
				final Lookup_PortTypeByNameListener lookup_PortTypeByNameListener = new Lookup_PortTypeByNameListener();
				lookup_PortTypeByNameListener.enterLookup_PortTypeByName(lookup_PortTypeByNameContext);
			}
		}
		/*
		 * desc
		 */
		if (null != ctx.parse_PortDescription()) {
			for (final Parse_PortDescriptionContext Parse_PortDescriptionContext : ctx.parse_PortDescription()) {
				final Port port = new Port();
				final Parse_PortDescriptionListener parse_PortDescriptionListener = new Parse_PortDescriptionListener(port);
				parse_PortDescriptionListener.enterParse_PortDescription(Parse_PortDescriptionContext);
			}
		}
	}
}
