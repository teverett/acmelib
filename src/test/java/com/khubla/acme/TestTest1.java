package com.khubla.acme;

import static org.junit.Assert.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestTest1 {
	@Test
	public void test11() {
		try {
			final Design design = ACMEReader.parseDesign(TestTest1.class.getResourceAsStream("/cmu/test1.acmetest"));
			assertNotNull(design);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
