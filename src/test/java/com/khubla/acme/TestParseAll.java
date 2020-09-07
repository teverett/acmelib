package com.khubla.acme;

import static org.junit.Assert.*;

import java.io.*;
import java.lang.System;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestParseAll {
	private final String[] files = { "LayeredFam.acmetest", "ClientAndServerFam.acmetest", "MDSFam.acmetest", "MDSSystem.acmetest", "PipesAndFiltersFam.acmetest", "PubSubFam.acmetest",
			"SabPerformanceFamily.acmetest", "SharedDataFam.acmetest", "ThreeTieredFam.acmetest", "TieredFam.acmetest", "propertyUnification.acmetest", "test1.acmetest" };

	@Test
	public void testParseAll() {
		try {
			for (final String file : files) {
				System.out.println("Parsing: " + file);
				final InputStream is = TestParseAll.class.getResourceAsStream("/cmu/" + file);
				final Unit unit = ACMEReader.parseUnit(is);
				assertNotNull(unit);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
