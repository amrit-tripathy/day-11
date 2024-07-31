package com.grayMatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	@Category(MarkerInterface.class)
	public void testPrintName() {
		assertEquals("Amrit", App.printName("Amrit"));
		
		
	}
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
