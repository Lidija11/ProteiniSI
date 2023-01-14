package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends  BasePage {

    // Elements of Products Page

    @FindBy(xpath = "//a [@data-modal-open = 'add-to-cart']")
    WebElement addToCartOlimpCreatine;

    @FindBy(xpath = "//div [@class = 'rs-select-button']")
    WebElement clickDropMenuButton;

    @FindBy(xpath = "//button [@class = 'increase']")
    WebElement chooseQuantity;

    @FindBy(xpath = "//div [@class = 'column small-12 xlarge-6 button-wrapper-add-to-cart']")
    WebElement addToCartFinal;

    @FindBy(xpath = "//div [@id = 'cart-icon']")
    WebElement checkItemsinCart;

    //Constructor
    public ProductsPage (ChromeDriver driver) {
        super(driver);
        print("This is product page");
        driver.get(Strings.CREATINE_OLIMP);

    }

    // This method is adding wanted product to cart
    public void chooseOlimpCreatine(){
        addToCartOlimpCreatine.click();
    }
    // This method clicks mon drop down menu button
    public void setClickDropMenuButton(){
        clickDropMenuButton.click();
    }
    // This method adds two product to cart by clicking on plus button
    public void addTwoProducts(){
        chooseQuantity.click();

    }
    // This method adds two product to cart and showing 2 Items in shopping cart on product page
    public void clickAddToCartfinal() {

        addToCartFinal.click();
    }
    // This method clicks on shopping cart icon and shows first step of checkout page
    public void setCheckItemsinCart (){
        checkItemsinCart.click();
    }


}



