package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import pages.ShoppingPage;
import util.Init;

public class ShoppingSteps {

    ShoppingPage shoppingPage = new ShoppingPage();

    @When("в корзину добавлен первый продукт с наименованием \"(.+)\"")
    public void stepAddFirstProduct(String productName){
        JavascriptExecutor jse = (JavascriptExecutor) Init.getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен второй продукт с наименованием \"(.+)\"")
    public void stepAddSecondProduct(String productName){
        JavascriptExecutor jse = (JavascriptExecutor) Init.getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен третий продукт с наименованием \"(.+)\"")
    public void stepAddThirdProduct(String productName){
        JavascriptExecutor jse = (JavascriptExecutor) Init.getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен четвертый продукт с наименованием \"(.+)\"")
    public void stepAddFourthProduct(String productName){
        JavascriptExecutor jse = (JavascriptExecutor) Init.getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");
        shoppingPage.addProduct(productName);
    }

    @When("в корзину добавлен пятый продукт с наименованием \"(.+)\"")
    public void stepAddFifthProduct(String productName){
        JavascriptExecutor jse = (JavascriptExecutor) Init.getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");
        shoppingPage.addProduct(productName);
    }

    @Then("переход в корзину")
    public void goToBasket(){
        shoppingPage.click(shoppingPage.basket);
    }

}
