package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.util.Random;

public class Utils extends Page {

    public static WebElement waitToBeClickable(WebDriver driver, By selector, int waitInterval) {
        return  (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.elementToBeClickable(selector));

    }
    public static WebElement waitForElementPresence(WebDriver driver, By selector, int waitInterval) {
        return  (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.presenceOfElementLocated(selector));

    }




    public static String getTextBoxValue(By by){
        return driver.findElement(by).getAttribute("value");
    }

    public static WebElement findMyElement(By by){
        return driver.findElement(by);
    }

    public static String getSaltString(int emailValidity) {

         String generatedEmail ="";
        switch (emailValidity){
            case 1:
                String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                StringBuilder salt = new StringBuilder();
                Random rnd = new Random();
                while (salt.length() < 10) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                    salt.append(SALTCHARS.charAt(index));
                }
                generatedEmail = salt.toString();

                break;
        }

        return generatedEmail;
    }

}
