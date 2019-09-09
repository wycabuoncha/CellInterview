package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Constants;
import utils.Utils;

public class MyAccount extends Page{
 private By logoutSelector = By.className("logout");

//logout
 //logged in user names 
 //My account
	
	
	public WebElement getLogoutLink() {
		return Utils.waitForElementPresence(driver, logoutSelector , Constants.WAIT_INTERVAL);
	}
}
