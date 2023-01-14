package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;

public class LoginTest {



    public ChromeDriver openChromeDriver () {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.BASE_PAGE);
        return driver;

    }
    /**
     * Login with valid username and password
     *
     * Steps:
     *
     * 1. User navigate to PROTEINI.SI website
     * 2. Click on Hamburger Menu
     * 3. Click on Login field
     * 4.Enter valid username
     * 5.Enter valid pass
     * 6.Click on Login button
     *
     * Expected result:
     * 6. Verify that user is successfully logged in
*/
    @Test
    public void LoginWithValidCreds(){
        ChromeDriver driver = new ChromeDriver();

        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.setHamburgerMenu();
        LoginPage.setGetLoginField();
        LoginPage.enterUserNameField("ilijevskilidija@gmail.com");
        LoginPage.enterPassword("Lidijaironlady11");
        LoginPage.clickLoginButton();


    }
}
