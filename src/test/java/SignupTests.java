import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    public void Signup_With_Existing_Email_Address(){
        createAccount.setCreateAccountEmailField(Constants.EXISTING_EMAIL);
        createAccount.getCreatAccountBtn().click();
        Assert.assertEquals(createAccount.getInvalidEmailText().getText(),Constants.EXISTING_EMAIL_TEXT);
    }

    @Test(priority = 3)
    public void Signup_With_Invalid_Email_Address()  {
        createAccount.getEmailAddressField().sendKeys(Keys.DELETE);
        createAccount.setCreateAccountEmailField(Constants.IN_VALID_EMAIL);
        createAccount.getCreatAccountBtn().click();
        System.out.println(createAccount.getEmailAddressField().getText());
        Assert.assertTrue(createAccount.getInvalidEmailText().getText().contains(Constants.IN_VALID_EMAIL_TEXT));
    }

    @Test(priority = 4)
    public void Signup_With_Valid_Email_Address(){
        createAccount.setCreateAccountEmailField(Constants.VALID_EMAIL);
        createAccount.getCreatAccountBtn().click();
        //createAccount.getEmailHighlightedGreen().isDisplayed();
        createAccount.goToRegistrationForm();

    }

    @Test(priority = 5)
    public void Fill_In_Registration_Form(){

    }
    //Filling personal information fields


}