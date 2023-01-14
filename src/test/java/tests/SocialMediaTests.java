package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.Strings;

public class SocialMediaTests {
    public ChromeDriver openChromeDriver () {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.PRE_WORKOUT_PRODUCTS_PAGE);
        return driver;

    }

    /**
     * Check social media links
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
     * 8.Enter name of wanted product "Pre workout"
     * 9.Click on search button
     * 10.Click on company logo
     * 11.Click on Instagram logo link in footer of the page
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 9. Verify that user is on the page with list of products
     * 10.Verify that user is on the base page
     * 11.Verify that user is redirected to Instagram page in new tab
     */

    @Test



       public void instagramLinkCheck() {

        ChromeDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser("ilijevskilidija@gmail.com", "Lidijaironlady11");

            BasePage basePage = new BasePage(driver);
            basePage.setSearchField("pre workout");
            basePage.clickListButton();
            basePage.setCompanyLogo();
            basePage.instagramButton();


        } finally {
//                driver.quit();

        }


    }
    /**
     * Check social media links
     *
     * Steps:
     *
     * 1. User navigate to PROTEINI.SI website
     * 2. Click on Hamburger Menu
     * 3. Click on Login field
     * 4.Enter valid username
     * 5.Enter valid pass
     * 6.Click on Login button
     * 7.Click on company logo
     * 8.Click on Youtube logo link in footer of the page
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 8.Verify that user is redirected to Youtube page in new tab
     */


    @Test

    public void youtubeLinkCheck() {

        ChromeDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser("ilijevskilidija@gmail.com", "Lidijaironlady11");

            BasePage basePage = new BasePage(driver);

            basePage.setCompanyLogo();

            basePage.setYoutubeButtonLink();


        } finally {
//                driver.quit();

        }


    }

    /**
     * Check social media links
     *
     * Steps:
     *
     * 1. User navigate to PROTEINI.SI website
     * 2. Click on Hamburger Menu
     * 3. Click on Login field
     * 4.Enter valid username
     * 5.Enter valid pass
     * 6.Click on Login button
     * 7.Click on company logo
     * 8.Click on Youtube logo link in footer of the page
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 8.Verify that user is redirected to Facebook page in new tab
     */

    @Test

    public void facebookButtonLinkCheck() {

        ChromeDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser("ilijevskilidija@gmail.com", "Lidijaironlady11");

            BasePage basePage = new BasePage(driver);
            basePage.setCompanyLogo();
            basePage.setFacebookButtonLink();


        } finally {
//                driver.quit();

        }
    }
}