package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.nio.ch.Util;
import utils.Constants;
import utils.Utils;

public class CreateAccountFormPage extends Page {

    //By Web element locators

   private By invalidEmail = By.cssSelector("ol > li");
   private By customerFirstname = By.id("customer_firstname");
   private By lName = By.id("customer_lastname");
   private By byPwd = By.id("passwd");
   private By byDay = By.id("days");
   private By byMonth = By.id("months");
   private By byYr = By.id("years");
   private By newsletter = By.id("newsletter");
   private By alert = By.id("optin");
   private By company = By.name("company");
   private By address1 = By.id("address1");
   private By address2 = By.id("address2");
   private By city = By.id("city");
   private By country = By.id("id_state");
   private By postcode = By.id("postcode");
   private By other = By.id("other");
   private By alias = By.id("alias");
   private By registeredMessage = By.cssSelector("css=ol > li");
   private By submitBtn = By.cssSelector("#submitAccount > span");
   private By homephone = By.id("phone");
   private By mobilePhone  = By.id("phone_mobile");
   private By state1 = By.id("id_state");

    private By sigInForm = By.id("id=login_form");
    private By accountCreationForm = By.id("account-creation_form");


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



    //GETTERS
    public WebElement getAccountCreationForm() {
        return Utils.waitForElementPresence(driver, accountCreationForm, 30);
    }

    public WebElement getCustomerTitleMr() {
        return Utils.waitToBeClickable(driver, By.id("uniform-id_gender1"), 30);
    }

    public WebElement getCustomerTitleMrs() {
        return Utils.waitToBeClickable(driver, By.id("uniform-id_gender2"), 30);
    }

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

    public WebElement getSubmitBtn() {
        return Utils.waitForElementPresence(driver,submitBtn, 30);
    }

    public LoggedInPage submitClick(){
        getSubmitBtn().click();

        return  new LoggedInPage();
    }

    private WebElement getHomePhone() {
       return Utils.waitForElementPresence(driver,homephone, 30);
    }

    private WebElement getMobilePhone() {
        return Utils.waitForElementPresence(driver,mobilePhone, 30);
    }



    //SETTERS


    public void setCustomerTitleMr() {
        this.getCustomerTitleMr().click();
    }

    public void setCustomerTitleMrs() {
        this.getCustomerTitleMrs().click();
    }

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


///////////////////////////////////////
    public Select selectState() {
        WebElement state = Utils.waitForElementPresence(driver, By.id("id_state"), 30);
        return new Select(state);
    }

    public void selectState(String state) {
        Select selectState = this.selectState();
        selectState.selectByValue(state);
    }
    public Select selectCountry() {
        WebElement country = Utils.waitForElementPresence(driver, By.id("id_country"), 30);
        return new Select(country);
    }

    public void selectCountry(String country) {
        Select selectCountry = this.selectCountry();
        selectCountry.selectByVisibleText(country);
    }

    ///////////////////////////////

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



    public void setHomePhone(String homePhone) {
         getHomePhone().sendKeys(homePhone);
    }




    public void setMobilePhone(String mobilePhone) {
        getMobilePhone().sendKeys(mobilePhone);
    }



    public void setAdditionalInformation(String message) {
       getAdditionalInformation().sendKeys(message);
    }

    public void setAddressAlias(String addressAlias) {
        getmyAddressAlias().sendKeys(addressAlias);
    }


    //ERRORs
    public WebElement getEmailBeenRegistered() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"An account using this email\")]"), 30);
    }


    public WebElement successfullyCreatedAccount() {
        return Utils.waitForElementPresence(driver, By.xpath("//p[contains(text(), \"Welcome to your account.\")]"), 30);
    }



}
