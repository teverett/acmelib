package com.khubla.acme;

import static org.junit.Assert.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestLayeredFam {
	@Test
	public void test11() {
		try {
			final Unit unit = ACMEReader.parseUnit(TestLayeredFam.class.getResourceAsStream("/cmu/LayeredFam.acmetest"));
			assertNotNull(unit);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
