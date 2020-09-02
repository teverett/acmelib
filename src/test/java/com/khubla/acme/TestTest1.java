package com.khubla.acme;

import static org.junit.Assert.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestTest1 {
	@Test
	public void test11() {
		try {
			final Unit unit = ACMEReader.parseUnit(TestTest1.class.getResourceAsStream("/cmu/test1.acmetest"));
			assertNotNull(unit);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
