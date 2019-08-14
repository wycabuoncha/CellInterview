package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

public class RegistrationFormPage {

    private  WebDriver driver;
    private By byFname = By.id("customer_firstname");
    private By lName = By.id("customer_lastname");
    private By byPwd = By.id("passwd");
    private By byDay = By.id("days");
    private By byMonth = By.id("months");
    private By byYr = By.id("years");


    public WebElement getAccountCreationForm() {
        return Utils.waitForElementPresence(driver, By.id("account-creation_form"), 30);
    }

    public WebElement getCustomerFirstNameField() {
        return Utils.waitForElementPresence(driver, byFname, 30);
    }

    public WebElement getCustomerLastNameField(){
        return  Utils.waitForElementPresence(driver, lName, 30);
    }

    public WebElement getCustomerPasswordField(){
        return Utils.waitForElementPresence(driver, byPwd, 30);
    }

    public Select selectCustomerDateOfBirthDay() {
       return new Select(Utils.waitForElementPresence(driver,byDay, 30));
    }

    public Select selectCustomerMonthOfBirth(){
        return new Select(Utils.waitForElementPresence(driver,byMonth,30));
    }
    public Select selectCustomerDateOfBirthYear() {
        return new Select(Utils.waitForElementPresence(driver,byYr,30));
    }


    //SETTERS
    public void setCustomerFirstNameField(String firstName) {
        getCustomerFirstNameField().clear();
        getCustomerFirstNameField().sendKeys(firstName);
    }

    public void  setCustomerLastNameField(String lastName){
        getCustomerLastNameField().clear();
        getCustomerLastNameField().sendKeys(lastName);
    }

    public void setCustomerPasswordField(String pwd){
        getCustomerPasswordField().clear();
        getCustomerPasswordField().sendKeys(pwd);
    }

    public void setCustomerDateOfBirthDay(String day){
        selectCustomerDateOfBirthDay().selectByValue(day);
    }

    public void setCustomerMonthOfBirth(String month){
        selectCustomerMonthOfBirth().selectByValue(month);
    }

    public void setCustomerDateOfBirthYear(String year){
        selectCustomerDateOfBirthYear().selectByValue(year);
    }


    public void registration() throws InterruptedException {




        driver.findElement(By.cssSelector("#years > option:nth-child(17)")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("Geonax");
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("7776 Kisii");
        driver.findElement(By.id("address2")).click();
        driver.findElement(By.id("address2")).sendKeys("Uoni Kenya");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Kisumu");
        driver.findElement(By.id("id_state")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'Illinois']")).click();
        }
        driver.findElement(By.cssSelector("#id_state > option:nth-child(15)")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("34543");
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("I will be okay");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("0712334443");
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("0710664345");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).sendKeys("Kemoni");
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        // assertThat(driver.findElement(By.cssSelector(".page-heading")).getText(), is("MY ACCOUNT"));
        //assertThat(driver.findElement(By.cssSelector(".info-account")).getText(), is("Welcome to your account. Here you can manage all of your personal information and orders."));
        //assertThat(driver.findElement(By.linkText("Sign out")).getText(), is("Sign out"));
        //assertThat(driver.findElement(By.cssSelector(".account > span")).getText(), is("Dennis Makori"));
        driver.findElement(By.linkText("Sign out")).click();
        driver.findElement(By.cssSelector(".logo")).click();
    }


}
