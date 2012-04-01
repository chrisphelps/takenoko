package com.sutemi.takenoko;

import junit.framework.TestCase;

public class CharTest extends TestCase {

	public void testChar()
    {
		assertTrue('A' =='A');
        assertTrue('A'+1 == 'B');
        assertTrue('A'+26 > 'Z');
        assertTrue('A'+25 == 'Z');
//        assertEquals(('A'+26)%26,'B');
    }
	
	public void testString() {
		Character c = new Character('A');
		assertEquals("A", Character.toString(c));
		assertEquals("A", Character.toString('A'));
		assertEquals("B", Character.toString((char)('A' + 1)));
	}
}
