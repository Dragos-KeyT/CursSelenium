package curs4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectors extends BaseTest{
	
	
	//@Test
	public void testCssSelectors() {
		//  #menu_user --> gaseste orice element care are ID(#) egal cu 'menu_user'
		// ul#menu_user --> gaseste orice element de tip UL care are ID (#) egal
		// cu menu_user
		// ul[id='menu_user']
		WebElement loginMenu =  driver.findElement(By.cssSelector("#menu_user"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", loginMenu);
		
		//. --> class
		WebElement logo =  driver.findElement(By.cssSelector(".logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", logo);

		//<h3 class="sc_title sc_title_underline sc_align_center inverse " 
		//style="text-align:center;color:#ffffff;">
		//<em>Stay In Touch</em>&nbsp; with Our Updates
		//</h3>
		
		WebElement updateText = driver.findElement(By.cssSelector("h3[style='text-align:center;color:#ffffff;']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", updateText);

		
		WebElement inspireText = driver.findElement(By.cssSelector("div[class ='column-1_2 sc_column_item sc_column_item_2 even'] h3.sc_title_underline"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", inspireText);
		
	}
	
	//@Test
	public void testCssSelectors2() {
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//Logical AND
		//input[id='log'][name='log'][placeholder='Login or Email']  
		WebElement username = driver.findElement(By.cssSelector("input[id='log'][name='log'][placeholder='Login or Email']  "));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", username);
		username.sendKeys("TestCeva");
		
		//OR
		WebElement password = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", password);
		password.sendKeys("testceva");
		
		//direct child
		WebElement rememberMe = driver.findElement(By.cssSelector("div[class='popup_form_field remember_field']>input"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", rememberMe);
		rememberMe.click();
		
		//nephew
		WebElement loginButton = driver.findElement(By.cssSelector("form[class='popup_form login_form'] input[class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", loginButton);
		loginButton.click();
			
	}
	
	
	//@Test
	public void testCssSelectors3() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		// * --> contains
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", bookTitle);
	    //~ --> contains word
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", bookTitle2);
		// ^ --> starts-with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='stor']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:red; border:4px solid red')", bookTitle3);
		// $ --> ends-with
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='story']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red')", bookTitle4);
		
	}
	
	//@Test
	public void testCssSelector4() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//first-of-type
		WebElement newReleases = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red')", newReleases);
		//nth-of-type
		WebElement comingSoon = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(2)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red')", comingSoon);
		//nth-of-type
		WebElement bestSellers = driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(3)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:grey; border:4px solid red')", bestSellers);
		//last-of-type
		WebElement awardWinners =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:last-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", awardWinners);
	}
	
	@Test
	public void testCssSelector5() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		WebElement selectedMenuEntry = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:brown; border:4px solid red')", selectedMenuEntry);

		//NOT
		List<WebElement> menuEntries =  driver.findElements(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected='true'])"));
		
		for(WebElement element : menuEntries) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border:4px solid red')", element);

		}
		
	}
	
	
  /*
   * CSS :
   * li[class*='sc_tabs_title']:nth-of-type(2)  --> aleg element nr 2
   * Xpath:
   * (//li[contains(@class, 'sc_tabs_title')])[2]  --> aleg element nr 2
   * 
   * 
   */
}
