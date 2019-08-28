package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class HomePage extends Page {
    By signIn = By.linkText("Sign in");
    public WebElement getclickSignInLink() {
        return Utils.waitForElementPresence(driver, signIn, 30);
    }

}
