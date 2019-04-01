package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.BaseSteps;


import java.util.List;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//div[@class='tile']")
    public List<WebElement> itemCollection;
    //a[@class='full-cover-link']


    public void addProduct(String productName){
        String price = getProduct(productName).findElement(By.xpath(".//div[@class='price-container']")).getText().replaceAll("\\D","");
        BaseSteps.setVariable(productName,price);
        getProduct(productName).findElement(By.xpath(".//button")).click();
        //div[@data-test-id="tile-name"]
    }

    public WebElement getProduct(String productName){
        for(WebElement item: itemCollection){
            if(item.findElement(By.xpath(".//div[@data-test-id=\"tile-name\"]")).getAttribute("tile-name").equalsIgnoreCase(productName)){
                return item;
            }
        }
        Assert.fail("Не найден продукт с наименованием " + productName);
        return null;
    }

    @FindBy(xpath = "//*[@data-test-id=\"header-cart\"]")
    public WebElement basket;
}
