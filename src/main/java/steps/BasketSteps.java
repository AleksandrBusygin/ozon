package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BasketPage;
import pages.MainPage;

public class BasketSteps {

    BasketPage basketPage = new BasketPage();
    MainPage mainPage = new MainPage();


    @When("первый товар \"(.+)\" присутствует в корзине")
    public void stepCheckFirstProduct(String productName){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(productName));
    }

    @When("второй товар \"(.+)\" присутствует в корзине")
    public void stepCheckSecondProduct(String productName){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(productName));
    }

    @When("третий товар \"(.+)\" присутствует в корзине")
    public void stepCheckThirdProduct(String productName){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(productName));
    }

    @When("четвертый товар \"(.+)\" присутствует в корзине")
    public void stepCheckFourthProduct(String productName){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(productName));
    }

    @When("пятый товар \"(.+)\" присутствует в корзине")
    public void stepCheckFifthProduct(String productName){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(productName));
    }

    @When("итоговая сумма равна \"(.+)\"")
    public void stepCheckTotalAmount(String expectedAmount){
        String actualAmount = basketPage.getTotalAmount();
        Assert.assertEquals("Итогоая сумма равно - [$s]. Ожидалось значение - [$d]",actualAmount,expectedAmount);
    }

    @Then("удаление всех добавленных товаров из корзины")
    public void deleteItems(){
        basketPage.click(basketPage.deleteGoodsButton);
        basketPage.click(basketPage.acceptToDelete);
    }

    @Then("выход авторизованного пользователя")
    public void logOut() {
        basketPage.click(basketPage.userButton);
        basketPage.click(basketPage.logOut);
    }

    @Then("повторный вход на сайт с имеющимся логином \"(.+)\" и паролем \"(.+)\"")
    public void secondAuthorization(String login, String password){
        basketPage.click(basketPage.checkIn);
        mainPage.click(mainPage.mailEntrance);
        mainPage.fillField(mainPage.mailInput, login);
        mainPage.fillField(mainPage.passwordInput, password);
        mainPage.click(mainPage.entranceButton);
    }

    @Then("проверка отсутствия товаров в корзине")
    public void checkBasketIsEmpty() {
        mainPage.waitPageLoaded();
        if (basketPage.basketIsEmpty.getText().equals("Корзина пуста")) {
            return;
        }
        Assert.fail("Корзина содержит товары");
    }

}
