package com.khubla.acme.listener;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.System;;

public class SystemDeclarationListener extends AbstractListener {
	public System system;

	@Override
	public void enterSystemDeclaration(acmeParser.SystemDeclarationContext ctx) {
		system = new System();
		/*
		 * name
		 */
		if (null != ctx.IDENTIFIER()) {
			system.setName(ctx.IDENTIFIER().getText());
		}
		/*
		 * names
		 */
		if (null != ctx.lookup_SystemTypeByName()) {
			for (final Lookup_SystemTypeByNameContext lookup_SystemTypeByNameContext : ctx.lookup_SystemTypeByName()) {
				final Lookup_SystemTypeByNameListener lookup_SystemTypeByNameListener = new Lookup_SystemTypeByNameListener();
				lookup_SystemTypeByNameListener.enterLookup_SystemTypeByName(lookup_SystemTypeByNameContext);
				system.getNames().add(lookup_SystemTypeByNameListener.name);
			}
		}
		/*
		 * body
		 */
		if (null != ctx.systemBody()) {
			final SystemBodyListener systemBodyListener = new SystemBodyListener(system);
			systemBodyListener.enterSystemBody(ctx.systemBody());
		}
	}
}
