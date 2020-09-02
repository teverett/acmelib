package com.khubla.acme.listener;

import com.khubla.acme.*;

public class FilenameListener extends AbstractListener {
	public String name;

	@Override
	public void enterFilename(acmeParser.FilenameContext ctx) {
		throw new RuntimeException("Not Implemented");
	}
}
