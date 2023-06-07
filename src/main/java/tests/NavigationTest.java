package tests;

import org.testng.annotations.Test;

import pages.MenuPage;
import utils.BaseTest;

public class NavigationTest extends BaseTest{
	
	@Test
	public void navTest() {
		MenuPage menu =  new MenuPage(driver);
		//driver.findElement(By.cssSelector(dawdadadadadada)).click();
		menu.navigateTo(menu.contactLink);
		menu.navigateTo(menu.shopLink);
	}
	
	
}
