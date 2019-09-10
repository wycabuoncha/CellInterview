package utils;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;
	
	protected abstract void createWebDriver();
	
	
	protected WebDriver getWebDriver() {
		if(null == driver) {
			createWebDriver();
		}
		return driver;
	}
	
	
	public void quitWebDriver() {
		if(null != driver) {
			driver.quit();
		}
		driver = null;
	}
}

//https://www.logigear.com/blog/test-automation/building-a-selenium-framework-from-a-to-z/