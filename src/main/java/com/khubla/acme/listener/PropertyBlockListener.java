package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class PropertyBlockListener extends AbstractListener {
	public List<Property> properties = new ArrayList<Property>();

	@Override
	public void enterAcmePropertyBlock(AcmePropertyBlockContext ctx) {
		if (null != ctx.acmePropertyBlockEntry()) {
			for (final AcmePropertyBlockEntryContext acmePropertyBlockEntryContext : ctx.acmePropertyBlockEntry()) {
				final PropertyBlockEntryListener propertyBlockEntryListener = new PropertyBlockEntryListener();
				propertyBlockEntryListener.enterAcmePropertyBlockEntry(acmePropertyBlockEntryContext);
				properties.add(propertyBlockEntryListener.property);
			}
		}
	}
}
