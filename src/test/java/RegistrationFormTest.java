import org.testng.annotations.Test;

public class RegistrationFormTest extends BaseTest {


    @Test(priority = 1)
    public void fill_FirstName(){
     registrationFormPage.setCustomerFirstNameField("Abeoqwe");

    }
}
