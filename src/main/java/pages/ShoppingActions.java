package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.Utils;

public class ShoppingActions  extends Page {

    private By byAddToCartBtn = By.xpath("//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]");
    private By byContinueShopping = By.xpath("//span[@title=\"Continue shopping\"]");

    public WebElement getAddToCartBtn() {
        return Utils.waitForElementPresence(driver, byAddToCartBtn, Constants.WAIT_INTERVAL);
    }

    public WebElement getContinueShopingBtn() {
        return Utils.waitToBeClickable(driver, byContinueShopping, Constants.WAIT_INTERVAL);
    }

    //get add t ocart button

    //get added to cart modal

    //get contiunue shopping button

    //get proceed to checkout button

    // get successfully addde messagee
}
