package com.khubla.acme;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestClientAndServerFam {
	@Test
	public void test11() {
		try {
			/*
			 * unit
			 */
			final Unit unit = ACMEReader.parseUnit(TestClientAndServerFam.class.getResourceAsStream("/cmu/ClientAndServerFam.acmetest"));
			assertNotNull(unit);
			/*
			 * families
			 */
			final Map<String, Family> families = unit.getFamiles();
			assertNotNull(families);
			assertTrue(families.size() == 1);
			/*
			 * family
			 */
			final Family family = families.values().iterator().next();
			assertNotNull(family);
			assertTrue(family.getName().compareTo("ClientAndServerFam") == 0);
			/*
			 * port types
			 */
			final Map<String, PortType> portTypes = family.getPortTypes();
			assertNotNull(portTypes);
			assertTrue(portTypes.size() == 2);
			testPortTypes(portTypes);
			/*
			 * role types
			 */
			final Map<String, RoleType> roleTypes = family.getRoleTypes();
			assertNotNull(roleTypes);
			assertTrue(roleTypes.size() == 2);
			/*
			 * component types
			 */
			final Map<String, ComponentType> componentTypes = family.getComponentTypes();
			assertNotNull(componentTypes);
			assertTrue(componentTypes.size() == 2);
			/*
			 * connector types
			 */
			final Map<String, ConnectorType> connectorTypes = family.getConnectorTypes();
			assertNotNull(connectorTypes);
			assertTrue(connectorTypes.size() == 1);
			/*
			 * design rules
			 */
			final List<DesignRule> designRules = family.getDesignRules();
			assertNotNull(designRules);
			assertTrue(designRules.size() == 3);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	private void testPortTypes(final Map<String, PortType> portTypes) {
		Iterator<PortType> iter = portTypes.values().iterator();
		PortType portType1 = iter.next();
		assertNotNull(portType1);
		assertTrue(portType1.getDesignRules().size() == 1);
	}
}
