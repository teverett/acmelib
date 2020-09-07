package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class PropertyRecordListener extends AbstractListener {
	@Override
	public void enterAcmePropertyRecord(acmeParser.AcmePropertyRecordContext ctx) {
		if (null != ctx.acmePropertyRecordEntry()) {
			for (final AcmePropertyRecordEntryContext acmePropertyRecordEntryContext : ctx.acmePropertyRecordEntry()) {
				final PropertyRecordEntryListener propertyRecordEntryListener = new PropertyRecordEntryListener();
				propertyRecordEntryListener.enterAcmePropertyRecordEntry(acmePropertyRecordEntryContext);
				throw new RuntimeException("Not Implemented");
			}
		}
	}
}
