package steps;

import cucumber.api.java.en.When;
import pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("проходит авторизация на сайте с имеющимся логином \"(.+)\" и паролем \"(.+)\"")
    public void authorization(String login, String password){
        mainPage.click(mainPage.basket);
        mainPage.click(mainPage.checkIn);
        mainPage.click(mainPage.mailEntrance);
        mainPage.fillField(mainPage.mailInput, login);
        mainPage.fillField(mainPage.passwordInput, password);
        mainPage.click(mainPage.entranceButton);
    }

    @When("выполняется поиск товаров, соответсвующих заданному запросу \"(.+)\"")
    public void searchItem(String item){
        mainPage.waitPageLoaded();
        mainPage.fillField(mainPage.searchInput, item);
        mainPage.click(mainPage.searchButton);
    }

}
