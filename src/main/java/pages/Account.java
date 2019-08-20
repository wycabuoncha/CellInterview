package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.Utils;

public class Account extends Page {
    private By logoutLink = By.linkText("Sign out");

    public WebElement getAccountLogout() {
        return Utils.waitForElementPresence(driver, logoutLink, Constants.WAIT_INTERVAL);
    }
}
