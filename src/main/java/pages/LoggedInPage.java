package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;
import utils.Utils;

public class LoggedInPage extends Page{
    private WebDriver driver;
    private By logout = By.linkText("Sign out");

    public WebElement logout() {
        return Utils.waitForElementPresence(driver, logout, 30);
    }
}
