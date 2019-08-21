package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.Utils;

public class CreateAccount_SignInPage extends Page {
    private By createAccountForm = By.id("create-account_form");
    private By byemail =  By.id("email_create");
    private By accountBtn = By.cssSelector("#SubmitCreate > span");
    private By formError = By.xpath("//div[@class=\"form-group form-error\"]");
    private By formOk =    By.xpath("//div[@class=\"form-group form-ok\"]");
    private By loginForm;
    private By loginEmailAddres  = By.id("email");
    private By loginPassword = By.id("passwd");
    private By submitBtn = By.cssSelector("#SubmitLogin > span");
    private By authenticationFail = By.xpath("//li[contains(text(), \"Authentication failed.\")]");


    //Check if create account form is displayed
    public WebElement checkIfCreateAccountFormIsDisplayed() {
        return Utils.waitForElementPresence(driver, createAccountForm, 30);
    }

    //get email address field
    public WebElement getEmailAddressField(){
        return Utils.waitForElementPresence(driver, byemail, 30);
    }

    //set email address field
    public void setCreateAccountEmailField(String email){
        Utils.findMyElement(byemail).sendKeys(email);
    }

    //get create account button
    public WebElement getCreatAccountBtn(){
        return Utils.waitForElementPresence(driver,accountBtn,30)  ;
    }



    /****** HIGHLIGHTED ERRORS ******/

    public WebElement getEmailErrorMessage() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid email address.\")]"), 30);
    }


    // get email field displayed red
    public WebElement getEmailFieldHighlightedRed() {
        return Utils.waitForElementPresence(driver, formError, Constants.WAIT_INTERVAL);
    }
    
    //get email field highlighted Green
    public WebElement getEmailFieldHighlightedGreen(){
        return Utils.waitForElementPresence(driver,formOk, Constants.WAIT_INTERVAL);
    }

    //get login form displayed
    public WebElement getLoginFormIsDisplayed() {
        return Utils.waitForElementPresence(driver, loginForm, Constants.WAIT_INTERVAL);
    }

    //get login email displayed
    public WebElement getLoginEmailAddressField() {
        return Utils.waitForElementPresence(driver,loginEmailAddres, Constants.WAIT_INTERVAL);
    }

    //get password field displayed
    public WebElement getPasswordFieldisDisplayed() {
        return Utils.waitForElementPresence(driver,loginPassword, Constants.WAIT_INTERVAL);
    }

    //get submit button displayed
    public WebElement getSubmitButtonIsDisplayed() {
        return Utils.waitForElementPresence(driver, submitBtn, Constants.WAIT_INTERVAL);
    }

    //get Authentication Failed Error
    public WebElement getAuthenticationFailedError(){
        return Utils.waitForElementPresence(driver, authenticationFail, Constants.WAIT_INTERVAL);
    }


    public WebElement getEmailRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"An email address required.\")]"), 30);
    }


    public WebElement getInvalidPasswordError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid password\")]"), 30);
    }

    public WebElement getPasswordRequiredError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Password is required.\")]"), 30);
    }

    public WebElement getEmailInvalidError() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid email address.\")]"), 30);
    }




    /* -------------------------------------------------------
                         SETTERS
      --------------------------------------------------------*/

    //get login email displayed
    public void setLoginEmailAddressField(String email) {
        getLoginEmailAddressField().sendKeys();
    }

    //get password field displayed
    public void setPasswordFieldisDisplayed(String password) {
        getPasswordFieldisDisplayed().sendKeys(password);
    }

    public void getAllFieldsCleared() {
        getLoginEmailAddressField().clear();
        getPasswordFieldisDisplayed().clear();
    }


}
