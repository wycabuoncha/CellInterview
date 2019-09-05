package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Constants;
import utils.Utils;

/*
 * -----------------------------------------------------------
 * 				To do list
 * -------------------------------------------------------------
 *  1. get sign in form - 
 *  2. get sign in email field - $x("//input[@id='email']") - "//input[@id=\"email\"]"
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

	//get login form
	private By loginFormBy = By.xpath("//form[@id=\"login_form\"]") ;
	private By bySignInEmailSelector = By.xpath("//input[@id=\"email\"]");
	

//--------GETTERS------------------------------
	public WebElement getLoginForm() {
		return Utils.waitForElementPresence(driver, loginFormBy , Constants.WAIT_INTERVAL);
	}


	public WebElement getSignInPasswordField() {
		// TODO Auto-generated method stub
		return null;
	}


	public WebElement getSignInEmailField() {
		return Utils.waitForElementPresence(driver, bySignInEmailSelector , Constants.WAIT_INTERVAL);
	}


	public WebElement getSignBtn() {
		// TODO Auto-generated method stub
		return null;
	}
	
//get email highlighted green
	public WebElement getEmailHighlightedGreen() {
		return null;
	}
	
//get email highlighted red
	public WebElement getEmailHighlightedRed() {
		return null;
	}
	
//get forget password link
	public WebElement getForgetPasswordLink() {
		return null;
	}
	
//-----------SETTERS----------------------------
	public WebElement setSignInPasswordField() {
		// TODO Auto-generated method stub
		return null;
	}


	public WebElement setSignInEmailField() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
//----------------ERRORS-------------------------
//get An email address required error
	public WebElement getEmaiAddressRequiredErrorMessage() {
		return null;
	}
	
//get Invalid email address error
	public WebElement getInvalidEmailAddressErrorMessage() {
		return null;
	}
//get Password is required error
	public WebElement getPasswordIsRequiredErrorMessage() {
		return null;
	}
	
//get Invalid password error
	public WebElement getInvalidPasswordErrorMessage() {
		return null;
	}
	
//get Authentication failed.
	public WebElement getAuthenticationFailedErrorMessage() {
		return null;
	}
	
	
	
	
	
}
