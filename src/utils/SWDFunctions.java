package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SWDFunctions {
	
	
	public WebDriver driver;
	
	public void typeByxpath (String locator, String value) {
		
		driver.findElement (By.xpath(locator)).sendKeys(value);
	}
	
	public void clickByxpath (String locator) {
		driver.findElement (By.xpath(locator)).click();
	}

}
