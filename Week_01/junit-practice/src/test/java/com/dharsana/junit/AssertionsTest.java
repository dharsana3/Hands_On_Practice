package com.dharsana.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {
	@Test
	public void testAssertions()
	{
		assertEquals(5, 2 + 3);
		assertTrue(5 > 2);
		assertFalse(5 < 2);
		assertNull(null);
		assertNotNull(new Object());
	}
}