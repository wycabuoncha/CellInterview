
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;


public class BaseTest {

    static WebDriver webDriver;
    static Page basePage;
    static CreateAccountFormPage createAccount;
    static CreateAccount_SignInPage createAccount_SignIn;
    static LoggedInPage loggedInpage;
    static CreateAccount_SignInPage createAccount_signIn;
    static HomePage homePage;
    static By css = By.cssSelector("css=.logo");
    static Account account;
    static ClothesPages clothes;
    static Actions action;


    private static final String APP_URL = "http://automationpractice.com/index.php";



    @BeforeClass
    public static void launchApplication(){
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.get(APP_URL);
        webDriver.manage().window().maximize();
         account = new Account();
        basePage = new Page();
        createAccount_SignIn = new CreateAccount_SignInPage();
        homePage = new HomePage();
        createAccount = new CreateAccountFormPage();
        basePage.setWebDriver(webDriver);
        loggedInpage = new LoggedInPage();
        clothes = new ClothesPages();
        action = new Actions(webDriver);

    }


    @AfterClass
    public static void close_All()
    {
        //logout
        // account.getAccountLogout().click();
        //quit the browser
        webDriver.quit();
    }

    private static void setChromeDriverProperty(){
        WebDriverManager.chromedriver().setup();
    }

}