import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Constants;
import utils.Utils;

public class SignupTests extends BaseTest {

    @Test(priority = 1)
    public void authenticationPage() {
        basePage.clickSignInLink();

        Assert.assertTrue(createAccount.getCreateAccountForm().isDisplayed());
        Assert.assertTrue(createAccount.getEmailAddressField().isDisplayed());
        Assert.assertTrue(createAccount.getCreatAccountBtn().isDisplayed());
    }


    @Test(priority = 2)
    public void Signup_With_Invalid_Email_Address(){
        Assert.assertFalse(Utils.validateEmailAddress(Constants.IN_VALID_EMAIL));
        createAccount.setCreateAccountEmailField(Constants.IN_VALID_EMAIL);
        createAccount.getCreatAccountBtn().click();
        Assert.assertTrue(createAccount.getInvalidEmailText().getText().contains(Constants.IN_VALID_EMAIL_TEXT));

    }


    @Test(priority = 3)
    public void Signup_With_Existing_Email_Address(){
        Assert.assertTrue(Utils.validateEmailAddress(Constants.EXISTING_EMAIL));
        createAccount.setCreateAccountEmailField(Constants.EXISTING_EMAIL);
        createAccount.getCreatAccountBtn().click();
        Assert.assertTrue(createAccount.getInvalidEmailText().getText().contains(Constants.EXISTING_EMAIL_TEXT));
    }

    @Test(priority = 4)
    public void Signup_With_Valid_Email_Address(){
        Assert.assertTrue(Utils.validateEmailAddress(Constants.VALID_EMAIL));
        createAccount.setCreateAccountEmailField(Constants.VALID_EMAIL);
        createAccount.getCreatAccountBtn().click();
        //createAccount.getEmailHighlightedGreen().isDisplayed();
        createAccount.goToRegistrationForm();

    }
    //Filling personal information fields


}