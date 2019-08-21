import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import utils.Constants;
import utils.Utils;

public class CreateAccountFormTest extends BaseTest {




    @Test(priority = 1)
   public void homePage(){
       //click login link
      homePage.getclickSignInLink().click();
   }

    @Test(dependsOnMethods = "homePage", priority = 2)
    public void authenticationPage() {
        //check if email field has been displayed
        Assert.assertTrue(createAccount_SignIn.getEmailAddressField().isDisplayed());
        //check if the create account btn has been displayed
        Assert.assertTrue(createAccount_SignIn.getCreatAccountBtn().isDisplayed());
    }

    /*-----------------------------------------------------------------------------
                           TESTS
       -------------------------------------------------------------------------------*/
    // Without email
    @Test(priority = 3)
    public void createAccountWithoutEmail(){
        createAccount_SignIn.setCreateAccountEmailField(Constants.BLANK_EMAIL);
        createAccount_SignIn.getCreatAccountBtn().click();
        Assert.assertTrue(createAccount_SignIn.getEmailErrorMessage().isDisplayed());
    }


    //Wrong email format
    @Test(priority = 4)
    public void createAccountWithInvalidEmailAddress(){
        createAccount_SignIn.setCreateAccountEmailField(Constants.IN_VALID_EMAIL);
        createAccount_SignIn.getCreatAccountBtn().click();

        Assert.assertTrue(createAccount_SignIn.getEmailErrorMessage().isDisplayed());
        Assert.assertTrue(createAccount_SignIn.getEmailFieldHighlightedRed().isDisplayed());
    }

    //Valid email format
    @Test(priority = 5)
    public void createAccountWithValidEmailAddress(){
        createAccount_SignIn.getEmailAddressField().clear();
        createAccount_SignIn.setCreateAccountEmailField(Constants.VALID_EMAIL);
        createAccount_SignIn.getCreatAccountBtn().click();
       //Assert.assertTrue(createAccount.getAccountCreationForm().isDisplayed());
    }


    @Test(priority = 6 )
    public void createAccountFormSuccessfully(){
        System.out.println("Fill in Registration information ...");
        createAccount.setCustomerTitleMr();
        createAccount.setCustomerFirstNameField("Onchari");
        createAccount.setCustomerLastNameField("Agenes");
        createAccount.dateOfBirth();
        createAccount.setCustomerPasswordField("23343546");
        createAccount.setCustomerDateOfBirthDay("12");
        createAccount.setCustomerMonthOfBirth("12");
        createAccount.setCustomerDateOfBirthYear("2005");
        createAccount.setCompanyName("Oxfatech");
        createAccount.setAddress1("Cellulant West End Towers");
        createAccount.setAddress2("Cellulant West End Towers");
        createAccount.setCityName("Nairobi");
        createAccount.selectState("7");
        createAccount.setZipPostalCode("34556");
        createAccount.setCountry("1");
        createAccount.setAdditionalInformation("I will prefer home delivery");
        createAccount.setHomePhone("0710725443");
        createAccount.setMobilePhone("0710725442");
        createAccount.setAddressAlias("Okioma");
        createAccount.submitClick();
        Assert.assertTrue(createAccount.successfullyCreatedAccount().isDisplayed());
    }

    @Test(priority = 7)
    public void logout(){
        account.getAccountLogout().click();
    }



}



