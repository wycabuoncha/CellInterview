
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
    public class LoginFormTest  extends BaseTest {


        //all required elements to login are available
        @Test (priority = 1)
        public void check_If_all_Required_Elements_Are_Displayed() {
        	System.out.println("Checking all login required elements have been displayed....");
            homePage.getclickSignInLink().click();
            Assert.assertTrue(loginFormObject.getLoginForm().isDisplayed(), "Login form has not been displayed");
            Assert.assertTrue(loginFormObject.getLoginEmailField().isDisplayed(), "Login email field not displayed");
            Assert.assertTrue(loginFormObject.getLoginPasswordField().isDisplayed(), "Login password field failed to get displayed");
            Assert.assertTrue(loginFormObject.getLoginBtn().isDisplayed(), "Login button not displayed");
        }

        
        //----------attempt to login with correct  credentials -----------------
        @Test(dependsOnMethods = {"check_If_all_Required_Elements_Are_Displayed"}, priority = 2)
        @Parameters({ "correctUsername", "correctPassword" })
        public void login_With_Correct_Credentials(String correctUsername, String correctPassword) {
        	System.out.println("Login with correct credentials...");
        	
        	loginFormObject.getLoginEmailField().clear();
        	loginFormObject.getLoginPasswordField().clear();
        	
        	loginFormObject.setLoginInEmailField(correctUsername);
        	Assert.assertTrue(loginFormObject.getEmailHighlightedGreen().isDisplayed(), "Login field is not highlighted green");
        	
        	loginFormObject.setLoginPasswordField(correctPassword);
        	loginFormObject.getLoginBtn().click(); 	
        	
        	Assert.assertTrue(myAccount.getLogoutLink().isDisplayed(), "Logout lin i not displayed");
        	myAccount.getLogoutLink().click();
        	
        	Assert.assertTrue(loginFormObject.getLoginForm().isDisplayed(), "Login form has not been displayed");
        }
       
        
        //----------------attempt to login with Invalid usernamame, Correct password - onchari, 28328719
        @Test(dependsOnMethods = {"check_If_all_Required_Elements_Are_Displayed"}, priority = 3)
        @Parameters({"invalidUsername","correctPassword"})
        public void login_With_Invalid_Email_Address_Valid_Password(String invalidUsername, String correctPassword) {
        	System.out.println("Login with invalid username, correct password...");
        	
        	loginFormObject.getLoginEmailField().clear();
        	loginFormObject.getLoginPasswordField().clear();
        	
        	loginFormObject.setLoginInEmailField(invalidUsername);
        	Assert.assertTrue(loginFormObject.getEmailHighlightedRed().isDisplayed(), "Login field is not highlighted green");
        	
        	loginFormObject.setLoginPasswordField(correctPassword);
        	loginFormObject.getLoginBtn().click(); 	
        	
            Assert.assertTrue(loginFormObject.getInvalidEmailAddressErrorMessage().isDisplayed(), "Invalid email address error message NOT displayed");
        	
        	
        }
        
        //attempt to login with valid username, invalid password - onchari101@gmail.com, 28328718
        @Test(dependsOnMethods = {"check_If_all_Required_Elements_Are_Displayed"}, priority = 4 )
        @Parameters({ "correctUsername", "inCorrectPassword" })
        public void login_With_Valid_Email_Address_Invalid_Password(String inCorrectPassword, String validUsername) {
        	System.out.println("Attempting to login with valid and correct email, with incorrect password");
        
        	loginFormObject.getLoginEmailField().clear();
        	loginFormObject.getLoginPasswordField().clear();
        	
        	loginFormObject.setLoginInEmailField(validUsername);
        	Assert.assertTrue(loginFormObject.getEmailHighlightedRed().isDisplayed(), "Login field is not highlighted green");
        	
        	loginFormObject.setLoginPasswordField(inCorrectPassword);
        	loginFormObject.getLoginBtn().click(); 	
        	
        	Assert.assertTrue(loginFormObject.getInvalidPasswordErrorMessage().isDisplayed(), "Invalid password message not displayed");
        }
        
        
        //attempt to login with invalid username, invalid password - onchari, 2323333554657575
        //attempt to login with blank username, blank password - "", ""
        //attempt to login with blank username, filled password - "", 28328719
        //attempt to login with filled username , blank password onchari101@gmail.com
        // attempt to login with incorrect username, incorrect password onchari10101@gmail.com, 295586876886
        

         }





