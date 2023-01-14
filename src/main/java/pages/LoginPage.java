package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // Elements of LoginPage

    @FindBy(xpath = "//span [@id = 'menu-button']")
    WebElement hamburgerMenu;
    @FindBy(xpath = "//span [@class = 'login-label'] ")
    WebElement getLoginField;

    @FindBy(xpath = "//input [@type = 'email']")
    WebElement userNameField;

    @FindBy(xpath = "//input [@id = 'login-form-pass']")
    WebElement passwordField;

    @FindBy(xpath = "//input [@id = 'btn_login-form_prijava']")
    WebElement LoginButton;

    ChromeDriver driver = null;
    private String name;
    private String password;

    //Constructor
    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        driver.get(Strings.BASE_PAGE);

    }
//   This method clicks on Hamburger Menu on main page
        public void setHamburgerMenu()  {

            hamburgerMenu.click();
        }
//    This method clicks on Login field on main page
        public void setGetLoginField () {

            getLoginField.click();
        }
//     This method clicks and enter Username
        public void enterUserNameField (String name)
        {
            userNameField.click();
            userNameField.sendKeys(name);
        }
//      This method clicks and enter password
        public void enterPassword (String password)
        {
            passwordField.click();
            passwordField.sendKeys(password);
        }
//      This method get user Logged in
        public void clickLoginButton () {

            LoginButton.click();


        }

    /**
     * @param name
     * @param password
     */
        public void logInUser(String name, String password){
            setHamburgerMenu();
            setGetLoginField();
            enterUserNameField(name);
            enterPassword(password);
            clickLoginButton();
            assert driver.getCurrentUrl().equals(Strings.BASE_PAGE) : "User is on the Home Page";

        }

    }


