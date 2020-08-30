package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;

public class BindingDeclarationListener extends AbstractListener {
	@Override
	public void enterBindingDeclaration(acmeParser.BindingDeclarationContext ctx) {
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
		 * property decl
		 */
		if (null != ctx.propertyDeclaration()) {
			for (final PropertyDeclarationContext propertyDeclarationContext : ctx.propertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterPropertyDeclaration(propertyDeclarationContext);
			}
		}
		/*
		 * prop block
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
			}
		}
	}
}
