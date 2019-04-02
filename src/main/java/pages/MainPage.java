package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@data-test-id=\"header-cart\"]")
    public WebElement basket;

    @FindBy(xpath = "//a[contains(text(),'войдите')]")
    public WebElement checkIn;

    @FindBy(xpath = "//*[@data-test-id=\"goToEmailLink\"]")
    public WebElement mailEntrance;

    @FindBy(xpath = "//input[@data-test-id=\"emailField\"]")
    public WebElement mailInput;

    @FindBy(xpath = "//input[@data-test-id=\"passwordField\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@data-test-id=\"loginFormSubmitButton\"]")
    public WebElement entranceButton;

    @FindBy(xpath = "//input[@data-test-id=\"header-search-input\"]")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@data-test-id=\"header-search-go\"]")
    public WebElement searchButton;

}
