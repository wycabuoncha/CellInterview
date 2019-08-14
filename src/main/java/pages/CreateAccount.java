package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

public class CreateAccount extends Page {

   private By byemail =  By.id("email_create");
   private By accountBtn = By.cssSelector("#SubmitCreate > span");
   private By invalidEmail = By.cssSelector("ol > li");
   private By customerFirstname = By.id("customer_firstname");
   private By lName = By.id("customer_lastname");
   private By byPwd = By.id("passwd");
   private By byDay = By.id("days");
   private By byMonth = By.id("months");
   private By byYr = By.id("years");
   private By newsletter = By.id("newsletter");
   private By alert = By.id("optin");
   private By company = By.id("company");
   private By address1 = By.id("address1");
   private By address2 = By.id("address2");
   private By city = By.id("city");
   private By country = By.id("id_state");
   private By postcode = By.id("postcode");
   private By other = By.id("other");
   private By alias = By.id("alias");

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


public void dateOfBirth(){
    Select date = new Select(driver.findElement(By.id("days")));
    Select month = new Select(driver.findElement(By.id("months")));
    Select year = new Select(driver.findElement(By.id("years")));
    date.selectByValue("1");
    month.selectByValue("12");
    year.selectByValue("2005");
}
    public WebElement getEmailHighlightedGreen() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"required form-group form-ok\"]//input[@id=\"email\"]"), 30);
    }

    public WebElement getInvalidEmailText(){
        return Utils.waitForElementPresence(driver,invalidEmail,30);
    }



    public RegistrationFormPage goToRegistrationForm(){
        System.out.println("GOing to create account page");
        return new RegistrationFormPage();
    }


    //GETTERS
    public WebElement getCustomerFirstNameField()
    {
        return Utils.waitForElementPresence(driver, customerFirstname, 30);
    }

    public WebElement getCustomerLastNameField()
    {
        return  Utils.waitForElementPresence(driver, lName, 30);
    }

    public WebElement getCustomerPasswordField()
    {
        return Utils.waitForElementPresence(driver, byPwd, 30);
    }

    public Select selectCustomerDateOfBirthDay()
    {
        return new Select(Utils.waitForElementPresence(driver,byDay, 30));
    }

    public Select selectCustomerMonthOfBirth()
    {
        return new Select(Utils.waitForElementPresence(driver,byMonth,30));
    }
    public Select selectCustomerDateOfBirthYear()
    {
        return new Select(Utils.waitForElementPresence(driver,byYr,30));
    }

    public WebElement getNewsletter(){
        return Utils.waitForElementPresence(driver,newsletter,30);
    }

    public WebElement getAlertForSpecialOffer(){
        return Utils.waitForElementPresence(driver,alert,30);
    }

    public WebElement getCompanyName() {
        return Utils.waitForElementPresence(driver,company,30);
    }

    public WebElement getAddress1() {
        return Utils.waitForElementPresence(driver,address1,30);
    }

    public WebElement getAddress2() {
        return Utils.waitForElementPresence(driver,address2,30);
    }

    public WebElement getSelectState(){
        return Utils.waitForElementPresence(driver,country,30);
    }


    public WebElement getCityName() {
        return Utils.waitForElementPresence(driver,city,30);
    }

    public WebElement getZipPostalCode() {
        return Utils.waitForElementPresence(driver,postcode,30);
    }

    public WebElement getCountry() {
        return Utils.waitForElementPresence(driver,country,30);
    }

    public WebElement getAdditionalInformation() {
        return Utils.waitForElementPresence(driver,other,30);
    }

    public WebElement getmyAddressAlias() {
        return Utils.waitForElementPresence(driver,alias,30);
    }



    //SETTERS
    public void setCustomerFirstNameField(String firstName) {
       System.out.println("Entering customer first name ....");
        getCustomerFirstNameField().sendKeys(firstName);
    }
    public void  setCustomerLastNameField(String lastName){
        getCustomerLastNameField().sendKeys(lastName);
    }

    public void setCustomerPasswordField(String pwd){
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



    public void setNewsletter(){
         getNewsletter().click();
    }

    public void setAlertForSpecialOffer(){
         getAlertForSpecialOffer().click();
    }

    public void setCompanyName(String companyName) {
       getCompanyName().sendKeys(companyName);
    }

    public void setAddress1(String address1) {
       getAddress1().sendKeys(address1);
    }
    public void setAddress2(String address2) {
       getAddress2().sendKeys(address2);
    }

    public void selectState(String state) {
        Select myState = new Select(getSelectState());
        myState.selectByValue(state);

    }

    public void setCityName(String cityName) {
        getCityName().sendKeys(cityName);
    }


    public void setZipPostalCode(String zipcode) {
       getZipPostalCode().sendKeys(zipcode);
    }

    public void setCountry(String united_stated) {
        Select myState = new Select(getSelectState());
        myState.selectByValue(united_stated);
    }

    public void setAdditionalInformation(String message) {
       getAdditionalInformation().sendKeys();
    }

    public void setAddressAlias(String addressAlias) {
        getmyAddressAlias().sendKeys(addressAlias);
    }


}
