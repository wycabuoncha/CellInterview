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
	private By byPasswordselector = By.xpath("//input[@id=\"passwd\"]");
	private By byBtnLoginSelector = By.xpath("//button[@id=\"SubmitLogin\"]");
	private By byEMailOkselector = By.xpath("//div[@class=\"form-group form-ok\"]/input[@id=\"email\"]");
	private By byEmailErrorselectorBy = By.xpath("//div[@class=\"form-group form-error\"]/input[@id=\"email\"]");
	private By passwordForgetLinkBy = By.xpath("//a[@title=\\\"Recover your forgotten password\\\"]\"");
	private By emailAddressRequiredErrorBy = By.xpath("//li[contains(text(),\"An email address required.\")]");
	private By invalidEmailAddressBy = By.xpath("//li[contains(text(),\"Invalid email address.\")]");
	private By passwordIsRequiredBy = By.xpath("//li[contains(text(), \"Password is required.\")]");

//--------GETTERS------------------------------
	public WebElement getLoginForm() {
		return Utils.waitForElementPresence(driver, loginFormBy , Constants.WAIT_INTERVAL);
	}


	public WebElement getSignInEmailField() {
		return Utils.waitForElementPresence(driver, bySignInEmailSelector , Constants.WAIT_INTERVAL);
	}
	
	public WebElement getSignInPasswordField() {
		return Utils.waitForElementPresence(driver, byPasswordselector , Constants.WAIT_INTERVAL);
	}


	public WebElement getSignBtn() {
		// TODO Auto-generated method stub
		return Utils.waitToBeClickable(driver, byBtnLoginSelector, Constants.WAIT_INTERVAL);
	}
	
//get email highlighted green
	public WebElement getEmailHighlightedGreen() {
		return Utils.waitForElementPresence(driver, byEMailOkselector, Constants.WAIT_INTERVAL);
	}
	
//get email highlighted red
	public WebElement getEmailHighlightedRed() {
		return Utils.waitForElementPresence(driver, byEmailErrorselectorBy, Constants.WAIT_INTERVAL);
	}
	
//get forget password link
	public WebElement getForgetPasswordLink() {
		return Utils.waitForElementPresence(driver, passwordForgetLinkBy, Constants.WAIT_INTERVAL);
	}
	
//-----------SETTERS----------------------------
	public void setSignInPasswordField(String password) {
		getSignInPasswordField().clear();
		getSignInPasswordField().sendKeys(password);
	}


	public void setSignInEmailField(String email) {
		getSignInEmailField().clear();
		getSignInEmailField().sendKeys(email);
	}

	
	
	
//----------------ERRORS-------------------------
//get An email address required error
	public WebElement getEmaiAddressRequiredErrorMessage() {
		return Utils.waitForElementPresence(driver, emailAddressRequiredErrorBy, Constants.WAIT_INTERVAL);
	}
	
//get Invalid email address error
	public WebElement getInvalidEmailAddressErrorMessage() {
		return Utils.waitForElementPresence(driver, invalidEmailAddressBy, Constants.WAIT_INTERVAL);
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
