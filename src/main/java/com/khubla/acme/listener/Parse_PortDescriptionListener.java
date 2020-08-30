package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.domain.*;

public class Parse_PortDescriptionListener extends AbstractListener {
	private final Port port;

	public Parse_PortDescriptionListener(Port port) {
		super();
		this.port = port;
	}

	@Override
	public void enterParse_PortDescription(acmeParser.Parse_PortDescriptionContext ctx) {
		throw new RuntimeException("Not Implemented");
	}

	public Port getPort() {
		return port;
	}
}
