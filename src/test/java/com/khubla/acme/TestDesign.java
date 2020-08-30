package com.khubla.acme;

import static org.junit.Assert.*;

import org.junit.*;

import com.khubla.acme.domain.*;

public class TestDesign {
	@Test
	public void testExample1() {
		try {
			Design design = ACMEReader.parseDesign(TestDesign.class.getResourceAsStream("/example1.txt"));
			assertNotNull(design);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
