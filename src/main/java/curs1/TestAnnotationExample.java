package curs1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestAnnotationExample {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	//@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	//@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	//@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	//@Test
	private void test4() {
		System.out.println("Test 4");
	}
}
