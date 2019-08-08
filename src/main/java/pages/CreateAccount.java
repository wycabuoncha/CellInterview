package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class CreateAccount extends Page {

   By byemail =  By.id("email_create");
   By accountBtn = By.cssSelector("#SubmitCreate > span");
   By invalidEmail = By.cssSelector("ol > li");
    public WebElement getCreateAccountForm() {
        return Utils.waitForElementPresence(driver, By.id("create-account_form"), 30);
    }

public void setCreateAccountEmailField(String email){
        Utils.findMyElement(byemail).sendKeys(email);
}

public String fetchTextBoxValue(){
       return Utils.getTextBoxValue(byemail);
}

public WebElement getEmailAddressField(){
        return Utils.waitForElementPresence(driver, byemail, 30);
}

public WebElement getCreatAccountBtn(){
    return Utils.waitForElementPresence(driver,accountBtn,30)  ;
}

    public WebElement getEmailHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-ok\"]//input[@id=\"email\"]"), 30);
    }

    public WebElement getInvalidEmailText(){
        return Utils.waitForElementPresence(driver,invalidEmail,30);
    }

    public RegistrationFormPage goToRegistrationForm(){
        return new RegistrationFormPage();
    }


}
