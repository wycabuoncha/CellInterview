import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopWorkflowTest extends BaseTest {



    @Test(priority = 1)
public void clothesBtnAvailable(){
   Assert.assertTrue(clothes.getDressClothesBtn().isDisplayed());
   Assert.assertTrue(clothes.getWomenClothesBtn().isDisplayed());
   Assert.assertTrue(clothes.getTShirtsClothesBtn().isDisplayed());
}

@Test(priority = 2)
public void allDressesSubCategoryDisplayed(){
   action.moveToElement(clothes.getDressClothesBtn()).perform();
   Assert.assertTrue(clothes.getCasualDressesBtn().isDisplayed());
   Assert.assertTrue(clothes.getSummerDressesBtn().isDisplayed());
   Assert.assertTrue(clothes.getEveningDressesBtn().isDisplayed());
}

@Test(priority = 3)
public void getAllSummerDressProductDisplayed(){
    action.moveToElement(clothes.getDressClothesBtn()).perform();
    action.moveToElement(clothes.getSummerDressesBtn()).perform();
    clothes.getSummerDressesBtn().click();
    Assert.assertTrue(clothes.getSummerDressProduct(1).isDisplayed());

    Assert.assertTrue(clothes.getSummerDressProduct(2).isDisplayed());
    Assert.assertTrue(clothes.getSummerDressProduct(3).isDisplayed());
    Assert.assertEquals(clothes.getDressesCount().size(),3);
}

@Test(priority = 4)
public void getAllCasualDressProductDisplayed(){
           action.moveToElement(clothes.getDressClothesBtn()).perform();
           action.moveToElement(clothes.getCasualDressesBtn()).perform();
           clothes.getCasualDressesBtn().click();
           Assert.assertTrue(clothes.getCasualDressProduct().isDisplayed());
}

@Test(priority = 5)
public void getAllEveningDressProductDisplayed(){
        action.moveToElement(clothes.getDressClothesBtn()).perform();
        action.moveToElement(clothes.getEveningDressesBtn()).perform();
        clothes.getEveningDressesBtn().click();
        Assert.assertTrue(clothes.getEveningDressProduct().isDisplayed());
}

}
