package com.khubla.acme;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestParseAll {
	private final String[] files = { "ClientAndServerFam.acmetest", "LayeredFam.acmetest", "MDSFam.acmetest", "MDSSystem.acmetest", "PipesAndFiltersFam.acmetest", "PubSubFam.acmetest",
			"SabPerformanceFamily.acmetest", "SharedDataFam.acmetest", "ThreeTieredFam.acmetest", "TieredFam.acmetest", "propertyUnification.acmetest", "test1.acmetest" };

	@Test
	public void testParseAll() {
		try {
			for (final String file : files) {
				final InputStream is = TestParseAll.class.getResourceAsStream("/cmu/" + file);
				final Unit unit = ACMEReader.parseUnit(is);
				assertNotNull(unit);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
