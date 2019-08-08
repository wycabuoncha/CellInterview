package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {

    protected static WebDriver driver;

    public void setWebDriver(WebDriver driver) {
        Page.driver = driver;
    }

    public SignupLoginPage clickSignInLink() {

        driver.findElement(By.linkText("Sign in")).click();
        return new SignupLoginPage();
    }
}