import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Constants;

public class CreateAccountTest extends BaseTest {
    @Test(priority = 1)
    public void authenticationPage() {
        basePage.clickSignInLink();

        Assert.assertTrue(createAccount.getCreateAccountForm().isDisplayed());
        Assert.assertTrue(createAccount.getEmailAddressField().isDisplayed());
        Assert.assertTrue(createAccount.getCreatAccountBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void Signup_With_Valid_Email_Address(){
        createAccount.setCreateAccountEmailField(Constants.VALID_EMAIL);
        createAccount.getCreatAccountBtn().click();
        //createAccount.getEmailHighlightedGreen().isDisplayed();
        createAccount.goToRegistrationForm();

    }

    @Test(priority = 3)
    public void Fill_Personal_Information(){
        createAccount.setCustomerFirstNameField("Onchari");
        createAccount.setCustomerLastNameField("Agenes");
        createAccount.dateOfBirth();toString();
        createAccount.setCustomerPasswordField("23343546");
        createAccount.setCustomerDateOfBirthDay("12");
        createAccount.setCustomerMonthOfBirth("12");
        createAccount.setCustomerDateOfBirthYear("2005");
    }






    @Test(priority = 4)
    public void Fill_Addess_Information(){
      createAccount.setCompanyName("Oxfatech");
      createAccount.setAddress1("Cellulant West End Towers");
      createAccount.setAddress2("Cellulant West End Towers");
      createAccount.setCityName("Nairobi");
      createAccount.selectState("Colorado");
      createAccount.setZipPostalCode("34556");
      createAccount.setCountry("United Stated");
      createAccount.setAdditionalInformation("I will prefer home delivery");
      createAccount.setAddressAlias("Okioma");
    }
}
