package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.Strings;

public class SearchTest {
    public ChromeDriver openChromeDriver () {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.PRODUCTS_PAGE_ENERGIJA);
        return driver;

    }
    /**
     * Add two item to shopping cart by clicking on product pic and increasing quantity on product page
     *
     * Steps:
     *
     * 1. User navigate to PROTEINI.SI website
     * 2. Click on Hamburger Menu
     * 3. Click on Login field
     * 4.Enter valid username
     * 5.Enter valid pass
     * 6.Click on Login button
     * 7.Click on search field in header of the page
     * 8.Enter name of wanted product "Energija"
     *
     *
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 8. Verify that user is on the page with list of products
     */
    @Test
    public void searchEnergijaProducts() {
        ChromeDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser("ilijevskilidija@gmail.com", "Lidijaironlady11");
            BasePage basePage = new BasePage(driver);
            basePage.setSearchField("Energija");
            basePage.clickListButton();

        }finally {
//            driver.quit();
        }
    }
}