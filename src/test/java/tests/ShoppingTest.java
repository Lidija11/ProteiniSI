package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.*;

import java.util.List;

public class ShoppingTest {

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
     * 9.Click on search button
     * 10.Click on second product
     * 11.Click on increase quantity (+)
     * 12.Click on final checkout button
     *
     *
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 9. Verify that user is on the page with list of products
     * 11.Verify that user is on product page
     * 12.Verify that user successfully added two items to cart
     */


    @Test

    public void addTwoItemtoCart() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);

            BasePage basePage = new BasePage(driver);
            basePage.setSearchField("Energija");
            basePage.clickListButton();


            List<WebElement> listOfItems = driver.findElementsByXPath("//div [@id = 'product_list']");

            WebElement secondItem;

            secondItem = listOfItems.get(0);
            secondItem.click();

            ProductsPage productsPage = new ProductsPage(driver);
            productsPage.addTwoProducts();
            productsPage.clickAddToCartfinal();

        }
        finally{
//                driver.quit();

            }

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
     * 9.Click on search button
     * 10.Click on second product
     * 11.Click on increase quantity (+)
     * 12.Click on final checkout button
     * 13.Click on shopping cart icon shown in header of the page
     *
     *
     * Expected result:
     * 6. Verify that user is successfully logged in
     * 9. Verify that user is on the page with list of products
     * 11.Verify that user is on product page
     * 12.Verify that user successfully added two items to cart
     * 13.Verify that user successfully added two items to cart and end up on first step of checkout page
     */


    @Test
    public void checkShoppingcart(){
        ChromeDriver driver = new ChromeDriver();

        try {LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);

            BasePage basePage = new BasePage(driver);
            basePage.setSearchField("Energija");
            basePage.clickListButton();


            List<WebElement> listOfItems = driver.findElementsByXPath("//div [@id = 'product_list']");

            WebElement secondItem;

            secondItem = listOfItems.get(0);
            secondItem.click();

            ProductsPage productsPage = new ProductsPage(driver);
            productsPage.addTwoProducts();
            productsPage.clickAddToCartfinal();
            productsPage.setCheckItemsinCart();

            CheckoutPageStepOne checkoutPageStepOne = new CheckoutPageStepOne(driver);
            checkoutPageStepOne.setShoppingCartIcon();



        }finally {
//            driver.quit();
        }
    }
}