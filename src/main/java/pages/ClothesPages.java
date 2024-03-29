package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.Utils;

import java.util.List;

public class ClothesPages extends Page{
    By byDressLocator = By.xpath("(//a[contains(text(),\'Dresses\')])[5]") ;
    private By byWomenLocator = By.xpath("//div[@id=\'block_top_menu\']/ul/li/a");
    private By byTShirtsLocator = By.xpath("//div[@id=\'block_top_menu\']/ul/li[3]/a");
    private By byCasualBtnDressLocator =    By.xpath("(//a[contains(text(),\'Casual Dresses\')])[2]");
    private By byEveningDressesBtnLocator = By.xpath("(//a[contains(text(),\'Evening Dresses\')])[2]");
    private By bySummerDressesBtnLocator =  By.xpath("(//a[contains(text(),\'Summer Dresses\')])[2]");
    private By byCasualDressProductLocator = By.xpath("//div[@id=\'center_column\']/ul/li[1]");
    private By byEveningDressProductLocator = By.xpath("//div[@id=\'center_column\']/ul/li[1]");
    private By dressCount = By.xpath("//*[@id=\"center_column\"]/ul/li");
    //  private By byCasualDressProductLocator = By.xpath("//div[@id=\'center_column\']/ul/li["+ elementLevel + "]")


    public WebElement getDressClothesBtn() {
        return Utils.waitToBeClickable(driver, byDressLocator, Constants.WAIT_INTERVAL);
    }

    public WebElement getWomenClothesBtn(){
        return Utils.waitToBeClickable(driver, byWomenLocator, Constants.WAIT_INTERVAL);
    }

    public WebElement getTShirtsClothesBtn(){
        return Utils.waitToBeClickable(driver, byTShirtsLocator, Constants.WAIT_INTERVAL);
    }

    public WebElement getCasualDressesBtn(){
        return Utils.waitToBeClickable(driver, byCasualBtnDressLocator, Constants.WAIT_INTERVAL);
    }
    
    public WebElement getEveningDressesBtn(){
        return Utils.waitToBeClickable(driver, byEveningDressesBtnLocator, Constants.WAIT_INTERVAL);
    }
    
    public WebElement getSummerDressesBtn(){
        return Utils.waitToBeClickable(driver, bySummerDressesBtnLocator, Constants.WAIT_INTERVAL);
    }


    public WebElement getSummerDressProduct(int elementLevel) {
       return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'center_column\']/ul/li["+ elementLevel + "]"), Constants.WAIT_INTERVAL);
    }



    public WebElement getCasualDressProduct() {
        return Utils.waitForElementPresence(driver,byCasualDressProductLocator,Constants.WAIT_INTERVAL);
    }

    public WebElement getEveningDressProduct() {
        return Utils.waitForElementPresence(driver, byEveningDressProductLocator, Constants.WAIT_INTERVAL);
    }

    public WebElement getEveningDressProduct(int elementLevel) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + elementLevel + "]"), 30);
    }

    public List<WebElement> getDressesCount(){
        return driver.findElements(dressCount);
    }
}
