package com.khubla.acme;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.khubla.acme.domain.*;
import com.khubla.acme.domain.System;

public class TestExample1 {
	@Test
	public void testExample1() {
		try {
			final Design design = ACMEReader.parseDesign(TestExample1.class.getResourceAsStream("/example1.txt"));
			assertNotNull(design);
			/*
			 * systems
			 */
			final Map<String, System> systems = design.getSystems();
			assertNotNull(systems);
			assertTrue(systems.size() == 1);
			/*
			 * system
			 */
			final System system = systems.values().iterator().next();
			assertNotNull(system);
			assertTrue(system.getName().compareTo("simple_cs") == 0);
			/*
			 * components
			 */
			final Map<String, Component> components = system.getComponents();
			assertNotNull(components);
			assertTrue(components.size() == 2);
			final Iterator<Component> componentsIterator = components.values().iterator();
			/*
			 * component1
			 */
			final Component component1 = componentsIterator.next();
			assertNotNull(component1);
			assertTrue(component1.getName().compareTo("server") == 0);
			final Map<String, Port> ports1 = component1.getPorts();
			assertNotNull(ports1);
			assertTrue(ports1.size() == 1);
			final Port port1 = ports1.values().iterator().next();
			assertNotNull(port1);
			assertTrue(port1.getName().compareTo("receive-request") == 0);
			/*
			 * component2
			 */
			final Component component2 = componentsIterator.next();
			assertNotNull(component2);
			assertTrue(component2.getName().compareTo("client") == 0);
			final Map<String, Port> ports2 = component2.getPorts();
			assertNotNull(ports2);
			assertTrue(ports2.size() == 1);
			final Port port2 = ports2.values().iterator().next();
			assertNotNull(port2);
			assertTrue(port2.getName().compareTo("send-request") == 0);
			/*
			 * connectors
			 */
			final Map<String, Connector> connectors = system.getConnectors();
			assertNotNull(connectors);
			assertTrue(connectors.size() == 1);
			/*
			 * connector
			 */
			final Connector connector1 = connectors.values().iterator().next();
			assertNotNull(connector1);
			assertTrue(connector1.getName().compareTo("rpc") == 0);
			final List<Role> roles = connector1.getRoles();
			assertNotNull(roles);
			assertTrue(roles.size() == 2);
			/*
			 * attachments
			 */
			assertNotNull(system.getAttachments());
			final List<Attachment> attachments = system.getAttachments().getAttachments();
			assertNotNull(attachments);
			assertTrue(attachments.size() == 2);
			/*
			 * 1
			 */
			assertTrue(attachments.get(0).getFromComponent().compareTo("client") == 0);
			assertTrue(attachments.get(0).getFromPort().compareTo("send-request") == 0);
			assertTrue(attachments.get(0).getToConnector().compareTo("rpc") == 0);
			assertTrue(attachments.get(0).getToRole().compareTo("caller") == 0);
			/*
			 * 2
			 */
			assertTrue(attachments.get(1).getFromComponent().compareTo("server") == 0);
			assertTrue(attachments.get(1).getFromPort().compareTo("receive-request") == 0);
			assertTrue(attachments.get(1).getToConnector().compareTo("rpc") == 0);
			assertTrue(attachments.get(1).getToRole().compareTo("callee") == 0);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
