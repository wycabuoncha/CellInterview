package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Constants;
import utils.Utils;

public class HomePage extends Page {
	/*----------LOCATORS------------------
	 * Populary
	 * 
	 * 
	 * 
	 */
	
	private By bestSellersBy = By.xpath("//a[text()=\"Best Sellers\"]") ;
	private By popularBy  = By.xpath("//a[text()=\"Popular\"]");
	
	
    By signIn = By.linkText("Sign in");
    public WebElement getclickSignInLink() {
        return Utils.waitForElementPresence(driver, signIn, 30);
    }
    
    public String getHomePageTitle() {
		Utils.waitForTitle(driver, Constants.WAIT_INTERVAL, Constants.HomeTitle);
		return driver.getTitle();
	}
    
   

}
