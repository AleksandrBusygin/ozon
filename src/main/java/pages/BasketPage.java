package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//div[@data-v-7723c718]//child::div[@class=\"main split-item\"]//a[@data-test-id=\"cart-item-title\"]")
    public List<WebElement> productList;
    // список товаров в корзине

    @FindBy(xpath = "//button[@data-test-id=\"cart-delete-selected-btn\"]")
    public WebElement deleteGoodsButton;
    // копка удаления в корзине

    @FindBy(xpath = "//button[@data-test-id=\"checkcart-confirm-modal-confirm-button\"]")
    public WebElement acceptToDelete;
    // согласие на удаление из корзины

    @FindBy(xpath = "//span[@data-test-id=\"header-my-ozon-user\"]")
    public WebElement userButton;
    // значек мой озон после авторизации

    @FindBy(xpath = "//span[@data-test-id=\"header-my-ozon-logout\"]")
    public WebElement logOut;
    // выход

    @FindBy(xpath = "//h1[contains(text(),'Корзина пуста')]")
    public WebElement basketIsEmpty;
    // надпись пустая корзина

    public boolean productExist(String id){
        for (WebElement item: productList){
            scrollToElement(item);
            if (isElementPresent(item) && item.getText().equals(getVariable(id))){
                return true;
            }
        }
        return false;
    }
//    getAttribute("data-v-a834bb0e href")
}
