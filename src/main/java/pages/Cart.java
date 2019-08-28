package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.Utils;

import java.util.BitSet;
import java.util.List;

public class Cart extends  Page{
    private By byCartTabLocator = By.xpath("//b[contains(text(), \"Cart\")]/..");

    //get cart tab

    //get cart being empty

    //get cart products

    //get cart products qty


    public List<WebElement> getCartProductQty()
    {
       return driver.findElements(By.xpath("//dt"));
    }

    public WebElement getCartTab() {
        return Utils.waitForElementPresence(driver, byCartTabLocator , Constants.WAIT_INTERVAL);
    }

    public WebElement getCartProductDeleteX(int i) {
        return Utils.waitToBeClickable(driver, By.xpath("//dt[" + i + "]//a[@class=\"ajax_cart_block_remove_link\"]"), Constants.WAIT_INTERVAL);
    }

    public WebElement getCartProductQty(int i) {
        return Utils.waitForElementPresence(driver, By.xpath("//dt[" + i +   "]"), Constants.WAIT_INTERVAL);
    }

    public WebElement getShippingCost() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"cart-prices\"]//span[contains(.,\"$2.00\")]"), Constants.WAIT_INTERVAL);
    }

    public WebElement getCartTotalPrice() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"cart-prices\"]//span[contains(.,\"$2.00\")]"), Constants.WAIT_INTERVAL);
    }

    //get cart product price

    //get cart product delete X

    //get cart shipping free

    //get cart shipping cost

    //get cart total price

    //get cart tab for checkout

    //get cart producrs qtys
}
