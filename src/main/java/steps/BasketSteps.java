package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BasketPage;
import pages.MainPage;

public class BasketSteps {

    BasketPage basketPage = new BasketPage();
    MainPage mainPage = new MainPage();


    @When("первый товар, id которого \"(.+)\" присутствует в корзине")
    public void stepCheckFirstProduct(String id){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(id));
    }

    @When("второй товар, id которого \"(.+)\" присутствует в корзине")
    public void stepCheckSecondProduct(String id){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(id));
    }

    @When("третий товар, id которого \"(.+)\" присутствует в корзине")
    public void stepCheckThirdProduct(String id){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(id));
    }

    @When("четвертый товар, id которого \"(.+)\" присутствует в корзине")
    public void stepCheckFourthProduct(String id){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(id));
    }

    @When("пятый товар, id которого \"(.+)\" присутствует в корзине")
    public void stepCheckFifthProduct(String id){
        Assert.assertTrue("Продукт [$s] остутствует в корзине",basketPage.productExist(id));
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


    @Then("проверка отсутствия товаров в корзине")
    public void checkBasketIsEmpty() {
        mainPage.waitPageLoaded();
        if (basketPage.basketIsEmpty.getText().equals("Корзина пуста")) {
            return;
        }
        Assert.fail("Корзина содержит товары");
    }

}
