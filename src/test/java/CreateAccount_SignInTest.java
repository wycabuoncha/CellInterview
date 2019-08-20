import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Constants;

public class CreateAccount_SignInTest extends BaseTest{




    @Test(priority = 2)
    public void authenticationPage() {
        //check if email field has been displayed
        Assert.assertTrue(createAccount_SignIn.getEmailAddressField().isDisplayed());
        //check if the create account btn has been displayed
        Assert.assertTrue(createAccount_SignIn.getCreatAccountBtn().isDisplayed());
        //createAccount_SignIn.setCreateAccountEmailField(Constants.VALID_EMAIL);
        createAccount_SignIn.getCreatAccountBtn().click();
    }


}
