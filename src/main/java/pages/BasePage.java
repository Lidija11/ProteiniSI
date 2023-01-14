package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    // Elements of Base Page

    @FindBy(xpath = "//div [@id = 'cart-icon']")
    WebElement shoppingCartLink;

    @FindBy(xpath ="//a [@class = 'logo']" )
            WebElement companyLogo;

    @FindBy(xpath ="//input [@id = 'search-input']" )
            WebElement searchField;

    @FindBy(xpath ="//button [@class = 'search-submit']" )
    WebElement searchListButton;

    @FindBy(xpath ="//a [@class = 'button button-instagram']" )
    WebElement instagramButtonLink;

    @FindBy(xpath ="//a [@class = 'button button-youtube']" )
    WebElement youtubeButtonLink;

    @FindBy(xpath ="//a [@class = 'button button-facebook']" )
    WebElement facebookButtonLink;

    ChromeDriver driver = null;

// Constructor
    public BasePage (ChromeDriver driver) {
        print("this is a base page");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(Strings.BASE_PAGE);
    }

    // This method clicks on Shopping cart link on base page
        public void clickShoppingCartIcon() {
        print("clickShoppingCartIcon");
        shoppingCartLink.click();
        }
    // This method clicks on Company Logo on base page
        public void setCompanyLogo(){
        companyLogo.click();
        }
    // This method clicks on Search Field on base page and enters wanted search word
        public void setSearchField(String name) {
            searchField.click();
            searchField.sendKeys(name);
        }
    // This method clicks on Search Field button on base page
        public void clickListButton(){
                searchListButton.click();
            }
    // This method clicks on Instagram button on base page in footer
        public void instagramButton(){
        instagramButtonLink.click();
        }
    // This method clicks on Youtube button on base page in footer
        public void setYoutubeButtonLink(){
        youtubeButtonLink.click();
    }
    // This method clicks on Facebook button on base page in footer
        public void setFacebookButtonLink(){
        facebookButtonLink.click();
    }

    // This method print that user is on Base page
        public static void print(String s) {
            System.out.println(s);
        }

}
