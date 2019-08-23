import org.testng.Assert;
import org.testng.annotations.Test;

public class AddClothesToCartTest extends BaseTest {

    @Test(priority = 1)
    public void AddSummerDressToCart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getSummerDressesBtn()).perform();
        clothes.getSummerDressesBtn().click();
        Assert.assertTrue(clothes.getSummerDressProduct(1).isDisplayed());
    }


    @Test(priority = 2)
    public void Add_Printed_Summer_Dress1_To_Cart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getSummerDressesBtn()).perform();
        clothes.getSummerDressesBtn().click();

        Assert.assertTrue(clothes.getSummerDressProduct(1).isDisplayed());
        action.moveToElement(clothes.getSummerDressProduct(1)).build().perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        shoppingCartAction.getAddToCartBtn().click();
        Assert.assertTrue(shoppingCartAction.getContinueShopingBtn().isDisplayed());
        shoppingCartAction.getContinueShopingBtn().click();
    }

    @Test(priority = 3)
    public void Add_Casual_Dress_To_Cart(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getCasualDressesBtn()).perform();
        clothes.getCasualDressesBtn().click();

        action.moveToElement(clothes.getCasualDressProduct()).build().perform();
        action.moveToElement(shoppingCartAction.getAddToCartBtn()).perform();
        shoppingCartAction.getAddToCartBtn().click();
        Assert.assertTrue(shoppingCartAction.getContinueShopingBtn().isDisplayed());
        shoppingCartAction.getContinueShopingBtn().click();
    }
}
