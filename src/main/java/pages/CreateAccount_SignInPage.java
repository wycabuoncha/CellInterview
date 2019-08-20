package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class CreateAccount_SignInPage extends Page {
    private By createAccountForm = By.id("create-account_form");
    private By byemail =  By.id("email_create");
    private By accountBtn = By.cssSelector("#SubmitCreate > span");


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

    /****** ERRORS ******/

    public WebElement getEmailErrorMessage() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid email address.\")]"), 30);
    }










































}
