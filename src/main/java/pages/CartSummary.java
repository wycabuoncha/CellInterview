package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Constants;
import utils.Utils;

public class CartSummary extends Page {

/*
 * ----------------------------------------------------------------------
 * 						TO DO  LIST
 * ----------------------------------------------------------------------
 *  1. get cart summary table 
 *  2. get proceed to checkout button 
 *  3. get cart total products
 *  4. get cart total shipping cost
 *  5. get cart total before tax
 *  6. get cart tax total
 *  7. get cart total price
 *  8. get cart delete button/icon
 *  9. get cart add product(+)
 *  10. get cart reduce product
 *  11. get cart quantity update
 *  get cart unity price
 *  
 *  
 * 
 */
	
	public WebElement getCartSummaryTable() {
		
		return Utils.waitForElementPresence(driver, By.id("cart_summary"), 30);
	}

	public WebElement getCartCheckoutBtn() {
		String xpathString = ".//p[@class=\"cart_navigation clearfix\"]/a[1]/span";
		return Utils.waitToBeClickable(driver, By.xpath(xpathString), Constants.WAIT_INTERVAL);
	}
	
	

}
