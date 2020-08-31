package com.khubla.acme;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.khubla.acme.domain.*;
import com.khubla.acme.domain.System;

public class TestExample4 {
	@Test
	public void testExample1() {
		try {
			final Design design = ACMEReader.parseDesign(TestExample4.class.getResourceAsStream("/example4.txt"));
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
			assertTrue(system.getName().compareTo("simpleCS") == 0);
			/*
			 * component
			 */
			assertTrue(system.getComponents().size() == 1);
			final Component component = system.getComponents().values().iterator().next();
			assertNotNull(component);
			assertTrue(component.getPorts().size() == 1);
			assertTrue(component.getRepresentations().size() == 1);
			/*
			 * representation
			 */
			final Representation representation = component.getRepresentations().values().iterator().next();
			assertNotNull(representation);
			assertTrue(representation.getBindings().getBindings().size() == 1);
			assertTrue(representation.getSystems().size() == 1);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
