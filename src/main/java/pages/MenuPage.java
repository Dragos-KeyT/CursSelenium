package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		
		this.driver = driver;
	}
	//driver.findElement(By.linkText("BOOKS"))
	public By shopLink = By.linkText("BOOKS");
	//diver.findElement(shopLink);
	public By contactLink =  By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	
}
