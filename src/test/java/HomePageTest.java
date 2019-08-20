import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void homePage(){
        homePage.getclickSignInLink().click();
    }

}
