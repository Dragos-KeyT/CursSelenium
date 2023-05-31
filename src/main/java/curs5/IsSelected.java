package curs5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelected extends BaseTest {
	
	//isDisplayed()--> orice webelement
	//isSelected() --> doar pe elemente care au type =  checkbox -- radio button
	//isEnabled() --> functioneaza pe elemente de tip input
	

	@Test
	public void isSelectedExample() {
		driver.findElement(By.cssSelector("li>a[href='#popup_login']")).click();
		
		WebElement rememberMe = driver.findElement(By.cssSelector("div[style^='display'] input[type='checkbox']"));
		
		System.out.println(rememberMe.isSelected());
		rememberMe.click();
		System.out.println(rememberMe.isSelected());

		System.out.println("-------------------------------");
		WebElement username =  driver.findElement(By.id("log"));
		username.click();
		
		System.out.println(username.isSelected());
		
	}
	
	
}
