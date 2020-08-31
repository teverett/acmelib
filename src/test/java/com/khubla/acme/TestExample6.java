package com.khubla.acme;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.khubla.acme.domain.*;
import com.khubla.acme.domain.System;

public class TestExample6 {
	@Test
	public void testExample1() {
		try {
			final Design design = ACMEReader.parseDesign(TestExample6.class.getResourceAsStream("/example6.txt"));
			assertNotNull(design);
			/*
			 * systems
			 */
			final Map<String, System> systems = design.getSystems();
			assertNotNull(systems);
			assertTrue(systems.size() == 0);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
