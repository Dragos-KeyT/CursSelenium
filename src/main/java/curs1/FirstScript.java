package curs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver  =  new ChromeDriver();

	}
	
	@Test
	public void openBrowser() {
		driver.get("https://keybooks.ro/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();

	}
	
	
	
	/*	Before
	 *  metoda setup
	 *  
	 *  @Test
	 *  metoda test  
	 *  assertion
	 *  
	 *  After
	 *  metoda tearDown
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	

}
