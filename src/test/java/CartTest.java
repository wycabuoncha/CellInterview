import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest  extends BaseTest {
	@Test(priority = 1)
    public void continueToShoppingSummary() {
    	action.moveToElement(cart.getCartTab()).perform();
    	action.moveToElement(cart.getCartTabCheckoutBtn()).perform();
    	action.click(cart.getCartTabCheckoutBtn()).build().perform();
    	//action.moveToElement(cart.getCartTabCheckoutBtn()).perform();
    	//action.click(cart.getCartTabCheckoutBtn()).build().perform();
    	//Assert.assertTrue(summary.getCartSummaryTable().isDisplayed());
    	
    	
    }

}
