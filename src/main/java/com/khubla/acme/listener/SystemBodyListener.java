package com.khubla.acme.listener;

import java.util.*;

import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.System;;

public class SystemBodyListener extends AbstractListener {
	public List<String> names = new ArrayList<String>();
	private final System system;

	public SystemBodyListener(System system) {
		super();
		this.system = system;
	}

	@Override
	public void enterAcmeSystemBody(AcmeSystemBodyContext ctx) {
		/*
		 * names
		 */
		if (null != ctx.lookup_SystemTypeByName()) {
			for (final Lookup_SystemTypeByNameContext lookup_SystemTypeByNameContext : ctx.lookup_SystemTypeByName()) {
				final Lookup_SystemTypeByNameListener lookup_SystemTypeByNameListener = new Lookup_SystemTypeByNameListener();
				lookup_SystemTypeByNameListener.enterLookup_SystemTypeByName(lookup_SystemTypeByNameContext);
				names.add(lookup_SystemTypeByNameListener.name);
			}
		}
		/*
		 * structure
		 */
		if (null != ctx.systemStructure()) {
			for (final SystemStructureContext systemStructureContext : ctx.systemStructure()) {
				final SystemStructureListener systemStructureListener = new SystemStructureListener(system);
				systemStructureListener.enterSystemStructure(systemStructureContext);
			}
		}
	}
}
