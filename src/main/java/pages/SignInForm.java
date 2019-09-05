package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Constants;
import utils.Utils;

/*
 * -----------------------------------------------------------
 * 				To do list
 * -------------------------------------------------------------
 *  1. get sign in form
 *  2. get sign in email field
 *  3. get sign in password field
 *  4. get sign in btn
 *  
 *  5. set sign in email field
 *  6. set sign in password field
 *  
 *     ----ERRORS-----
 *  7. get An email address required error
 *  8. get Invalid email address error
 *  9. get Password is required error
 *  10. get Invalid password error
 *  11. get Authentication failed.
 *  
 *  12. get email highlighted green
 *  13. get email highlighted red
 *  14. get forget password link
 */
public class SignInForm extends Page{

	private By loginFormBy = By.xpath("//form[@id=\"login_form\"]") ;
	

	public WebElement getLoginForm() {
		return Utils.waitForElementPresence(driver, loginFormBy , Constants.WAIT_INTERVAL);
	}
	
	
}
