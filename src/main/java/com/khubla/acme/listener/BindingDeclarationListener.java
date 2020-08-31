package com.khubla.acme.listener;

import java.util.*;

import org.antlr.v4.runtime.tree.*;

import com.khubla.acme.*;
import com.khubla.acme.acmeParser.*;
import com.khubla.acme.domain.*;

public class BindingDeclarationListener extends AbstractListener {
	public Binding binding;

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
		binding = new Binding();
		binding.setFromComponent(names.get(0));
		binding.setFromPort(names.get(1));
		binding.setToConnector(names.get(2));
		binding.setToRole(names.get(3));
		/*
		 * property decl
		 */
		if (null != ctx.propertyDeclaration()) {
			for (final PropertyDeclarationContext propertyDeclarationContext : ctx.propertyDeclaration()) {
				final PropertyDeclarationListener propertyDeclarationListener = new PropertyDeclarationListener();
				propertyDeclarationListener.enterPropertyDeclaration(propertyDeclarationContext);
				binding.addProperty(propertyDeclarationListener.property);
			}
		}
		/*
		 * prop block
		 */
		if (null != ctx.propertiesBlock()) {
			for (final PropertiesBlockContext propertiesBlockContext : ctx.propertiesBlock()) {
				final PropertiesBlockListener propertiesBlockListener = new PropertiesBlockListener();
				propertiesBlockListener.enterPropertiesBlock(propertiesBlockContext);
				binding.setProperties(propertiesBlockListener.properties);
			}
		}
	}
}
