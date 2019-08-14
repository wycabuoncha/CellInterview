
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.CreateAccount;
import pages.Page;
import pages.RegistrationFormPage;
import utils.Utils;


public class BaseTest {

    private static WebDriver webDriver;
    protected static Page basePage;
    protected static CreateAccount createAccount;
    protected static RegistrationFormPage registrationFormPage;
    static By css = By.cssSelector("css=.logo");

    private static final String APP_URL = "http://automationpractice.com/index.php";

    @BeforeClass
    public static void launchApplication(){
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.get(APP_URL);
        basePage = new Page();
        createAccount = new CreateAccount();
        basePage.setWebDriver(webDriver);
        registrationFormPage = new RegistrationFormPage();

    }


    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();
    }

    private static void setChromeDriverProperty(){
        WebDriverManager.chromedriver().setup();
    }

}