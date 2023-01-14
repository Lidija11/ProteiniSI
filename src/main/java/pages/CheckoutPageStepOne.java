package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageStepOne {

    // Elements of Checkout Page Step-One

    @FindBy(xpath = "//div [@id = 'cart-icon']")
    WebElement shoppingCartIcon;

    @FindBy(xpath = "//button [@class = 'button-remove']")
    WebElement removeItemFromCart;

    @FindBy(xpath = "//div [@class = 'checkout-section checkout-buy']")
    WebElement checkoutFirstStepButton;


    ChromeDriver driver = null;
    //Constructor
    public CheckoutPageStepOne(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        driver.get(Strings.CART_CHECK);
    }
    // This method clicks on shopping cart and shows items in cart on Checkout Page Step-One
    public void setShoppingCartIcon() {
        shoppingCartIcon.click();
    }
    // This method clicks on (X) remove button in shopping cart on Checkout Page Step-One
    public void setRemoveItemFromCart() {
        removeItemFromCart.click();
    }
    // This method clicks on button continue ("NASTAVI") in shopping cart and continue to next page of checkout
    public void setCheckoutFirstStepButton() {
        checkoutFirstStepButton.click();
    }
    public void checkShoppingCart (){
        shoppingCartIcon.click();
        assert driver.getCurrentUrl().equals(Strings.CART_CHECK) : "User is on the first step in shopping cart";

    }

}