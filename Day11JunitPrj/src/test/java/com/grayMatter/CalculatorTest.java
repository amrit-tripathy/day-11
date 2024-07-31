package com.grayMatter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;

public class CalculatorTest {
	Calculator cal = new Calculator();
	
	//here we are testing from src/test/java using assert methods on junit
	@Test
	public void testCalcadd() {
		assertEquals(5,cal.add(2, 3));
	}
	@Test
	public void testCalcsub() {
		assertEquals(-1,cal.sub(2, 3));
	}
	@Test
	public void testCalcmul() {
		assertEquals(6,cal.mul(2, 3));
	}
	@Test
	public void testCalcdiv() {
		assertEquals(5,cal.div(10, 2));
	}
	@Test
	public void testIsEven() {
		assertTrue(cal.isEven(2));
	}
	@Test
	public void testKey() {
		int arr[]= {2,3,4};
		assertEquals(0,cal.findKey(arr, 2));
	}
	@Test
	@Category(MarkerInterface.class)
	public void testArrayEquals() {
		int arr[]= {1,2,3,4};
		int arr1[]={1,2,3,4};
		assertArrayEquals(arr, arr1);
	}
	@Test
	
	public void testcheckstr() {
		assertNotNull( Calculator.checkstr(null));
	}
	@Before
	public void printeforeLog() {   //before every test case this test will be generated
		System.out.println("before every test case");
	}
	@After
	public void printLogAfterEachMethod() {
		System.out.println("after every test");
	}
	
	@BeforeClass
	public static void printBeforeClass() {
		System.out.println("Before class execution");
	}
	@AfterClass
	public static void printAfterClass() {
		System.out.println("After class execution");
	}
	@Test
	public void testCheckStudent() {
		Student expStudent =  new Student("amrit",123,22);
		
		assertEquals(expStudent, Calculator.createStudent());
		
	}
	@Test
	public void  testConnection() throws ClassNotFoundException, SQLException {
		
		Dbconnection dc = new Dbconnection();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/grayMatterdb","root","Amrit18#");
		assertEquals(con, dc.getConnection("jdbc:mysql://localhost:3306/grayMatterdb","root","Amrit18#"));
	}

	
}
