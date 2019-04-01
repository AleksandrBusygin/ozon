package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.ShoppingPage;
import util.Init;

public class ShoppingSteps {

    ShoppingPage shoppingPage = new ShoppingPage();

    @When("в корзину добавлен первый продукт с наименованием \"(.+)\"")
    public void stepAddFirstProduct(String productName){
        shoppingPage.scrollToElement(shoppingPage.getProduct(productName));
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен второй продукт с наименованием \"(.+)\"")
    public void stepAddSecondProduct(String productName){
        shoppingPage.scrollToElement(shoppingPage.getProduct(productName));
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен третий продукт с наименованием \"(.+)\"")
    public void stepAddThirdProduct(String productName){
        shoppingPage.scrollToElement(shoppingPage.getProduct(productName));
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен четвертый продукт с наименованием \"(.+)\"")
    public void stepAddFourthProduct(String productName){
        shoppingPage.scrollToElement(shoppingPage.getProduct(productName));
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен пятый продукт с наименованием \"(.+)\"")
    public void stepAddFifthProduct(String productName){
        shoppingPage.scrollToElement(shoppingPage.getProduct(productName));
        shoppingPage.addProduct(productName);
    }

    @Then("переход в корзину")
    public void goToBasket(){
        shoppingPage.click(shoppingPage.basket);
    }

}
