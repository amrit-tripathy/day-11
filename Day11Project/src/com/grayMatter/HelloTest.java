package com.grayMatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testSayHello() {
		String expected ="Hello...";
		HelloClass hc = new HelloClass();
		String actual = hc.sayHello();
		
		assertEquals(expected, actual);
		
		
	}
	@Test
	public void testAdd() {
		HelloClass hc = new HelloClass();
		assertEquals(5, hc.testAdd(2, 3));
	}
	

}
