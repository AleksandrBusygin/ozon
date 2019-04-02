package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.ShoppingPage;
import util.Init;

public class ShoppingSteps {

    ShoppingPage shoppingPage = new ShoppingPage();

    @When("в корзину добавлен первый продукт, id которого \"(.+)\"")
    public void stepAddFirstProduct(String id){
        shoppingPage.scrollToElement(shoppingPage.getProduct(id));
        shoppingPage.addProduct(id);
    }

    @When("в корзину добавлен второй продукт, id которого \"(.+)\"")
    public void stepAddSecondProduct(String id){
        shoppingPage.scrollToElement(shoppingPage.getProduct(id));
        shoppingPage.addProduct(id);
    }

    @When("в корзину добавлен третий продукт, id которого \"(.+)\"")
    public void stepAddThirdProduct(String id){
        shoppingPage.scrollToElement(shoppingPage.getProduct(id));
        shoppingPage.addProduct(id);
    }

    @When("в корзину добавлен четвертый продукт, id которого \"(.+)\"")
    public void stepAddFourthProduct(String id){
        shoppingPage.scrollToElement(shoppingPage.getProduct(id));
        shoppingPage.addProduct(id);
    }

    @When("в корзину добавлен пятый продукт, id которого \"(.+)\"")
    public void stepAddFifthProduct(String id){
        shoppingPage.scrollToElement(shoppingPage.getProduct(id));
        shoppingPage.addProduct(id);
    }

    @Then("переход в корзину")
    public void goToBasket(){
        shoppingPage.click(shoppingPage.basket);
    }

}
