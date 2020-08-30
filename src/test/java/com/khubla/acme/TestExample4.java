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
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
