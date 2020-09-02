package com.khubla.acme;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestParseAll {
	private String[] files = { "ClientAndServerFam.acmetest", "LayeredFam.acmetest", "MDSFam.acmetest", "MDSSystem.acmetest", "PipesAndFiltersFam.acmetest", "PubSubFam.acmetest",
			"SabPerformanceFamily.acmetest", "SharedDataFam.acmetest", "ThreeTieredFam.acmetest", "TieredFam.acmetest", "propertyUnification.acmetest", "test1.acmetest" };

	@Test
	@Ignore
	public void testParseAll() {
		try {
			for (String file : files) {
				InputStream is = TestParseAll.class.getResourceAsStream("/cmu/" + file);
				final Design design = ACMEReader.parseDesign(is);
				assertNotNull(design);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
