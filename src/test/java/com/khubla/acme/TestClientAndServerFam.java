package com.khubla.acme;

import static org.junit.Assert.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestClientAndServerFam {
	@Test
	public void test11() {
		try {
			final Unit unit = ACMEReader.parseUnit(TestClientAndServerFam.class.getResourceAsStream("/cmu/ClientAndServerFam.acmetest"));
			assertNotNull(unit);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
