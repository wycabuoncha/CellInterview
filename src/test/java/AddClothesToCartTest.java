import org.testng.Assert;
import org.testng.annotations.Test;

public class AddClothesToCartTest extends BaseTest {


    @Test(priority = 1)
    public void Add_Summer_Dress_To_Cart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getSummerDressesBtn()).perform();
        clothes.getSummerDressesBtn().click();

        Assert.assertTrue(clothes.getSummerDressProduct(1).isDisplayed());
        action.moveToElement(clothes.getSummerDressProduct(1)).build().perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        shoppingCartAction.getAddToCartBtn().click();
        Assert.assertTrue(shoppingCartAction.getContinueShopingBtn().isDisplayed());
        shoppingCartAction.getContinueShopingBtn().click();
        Assert.assertEquals(cart.getCartProductQty().size(), 1);
    }

    
    @Test(priority = 2)
    public void Add_Casual_Dress_To_Cart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getCasualDressesBtn()).perform();
        clothes.getCasualDressesBtn().click();

        action.moveToElement(clothes.getCasualDressProduct()).build().perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        shoppingCartAction.getAddToCartBtn().click();
        Assert.assertTrue(shoppingCartAction.getContinueShopingBtn().isDisplayed());
        shoppingCartAction.getContinueShopingBtn().click();
        Assert.assertEquals(cart.getCartProductQty().size(), 2);
    }
    
    @Test(priority = 3)
    public void Add_Evening_Dress_To_Cart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getEveningDressesBtn()).perform();
        clothes.getEveningDressesBtn().click();

        action.moveToElement(clothes.getEveningDressProduct()).build().perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        shoppingCartAction.getAddToCartBtn().click();
        Assert.assertTrue(shoppingCartAction.getContinueShopingBtn().isDisplayed());
        shoppingCartAction.getContinueShopingBtn().click();
        Assert.assertEquals(cart.getCartProductQty().size(), 3);
    }

    @Test(priority = 4)
    public void deleteItemsFromCart(){
      Assert.assertEquals(cart.getCartProductQty().size(), 3);

      action.moveToElement(cart.getCartTab()).perform();
      action.moveToElement(cart.getCartProductDeleteX(2)).perform();
      action.moveToElement(cart.getCartProductDeleteX(2)).build().perform();
       cart.getCartProductDeleteX(2).click();

      action.moveToElement(clothes.getDressClothesBtn()).perform();
      action.moveToElement(clothes.getEveningDressesBtn()).perform();

      clothes.getEveningDressesBtn().click();
      action.moveToElement(cart.getCartTab()).perform();
       Assert.assertEquals(cart.getCartProductQty().size(),2);
    }


    @Test(priority = 5)
    public void checkingCartProductsQtyAndPrice(){
        Assert.assertEquals(cart.getCartProductQty().size(), 2);
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getEveningDressesBtn()).perform();
        action.moveToElement(clothes.getEveningDressProduct(1)).perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        action.click(shoppingCartAction.getAddToCartBtn()).perform();
        action.click(shoppingCartAction.getContinueShopingBtn()).perform();

        action.moveToElement(cart.getCartTab()).perform();
        action.moveToElement(cart.getCartProductQty(1)).perform();

       // Assert.assertEquals(cart.getCartProductQty(1).getText(), "1 X Printed...Yellow, s$28.98");

        //action.moveToElement(cart.getCartProductQty(2)).perform();
        //Assert.assertEquals(cart.getCartProductQty(2).getText(), "1");

        //action.moveToElement(cart.getShippingCost()).perform();
        //Assert.assertEquals(cart.getShippingCost().getText(), "$2.00");

        //action.moveToElement(cart.getCartTotalPrice()).perform();
        //Assert.assertEquals(cart.getCartTotalPrice(),"$107.97" );

    }
    
    @Test(priority = 6)
    public void continueToShoppingSummary() {
    	action.moveToElement(cart.getCartTab()).perform();
    	action.moveToElement(cart.getCartTabCheckoutBtn()).perform();
    	action.click(cart.getCartTabCheckoutBtn()).build().perform();
    	//action.moveToElement(cart.getCartTabCheckoutBtn()).perform();
    	//action.click(cart.getCartTabCheckoutBtn()).build().perform();
    	Assert.assertTrue(summary.getCartSummaryTable().isDisplayed());
    	
    }
    
    @Test(priority = 7)
    public void check_out_btn() {
    	Assert.assertTrue(summary.getCartCheckoutBtn().isDisplayed(), "Failed to Display  Cart Checkout button");
    	summary.getCartCheckoutBtn().click();
    }   
    
}
