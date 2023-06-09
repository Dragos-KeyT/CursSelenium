package curs2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	
	//1. Soft assertion
	//2. Hard assertion
	
	//@Test
	public void softAssertion() {
		System.out.println("SoftAssertion incepe aici!");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft assert continua aici!");
		sa.assertEquals("masina", "tractor");
		System.out.println("Soft assert se termina aici!");
		sa.assertAll();
	}
	
	
	@Test
	public void hardAssertion() {
		System.out.println("Hard assert incepe aici!");
		assertTrue(false);
		System.out.println("Hard assert continua aici!");
		assertEquals("text", "nimic");
		System.out.println("Hard assert se termina aici!");

	}

}
