package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//div[@class='content search-content']//div[@id]")
    public List <WebElement> productsCollection;


    public void addProduct(String id){
        String name = getProduct(id).findElement(By.xpath(".//div[@data-test-id=\"tile-name\"]")).getText();
        setVariable(id,name);
        getProduct(id).findElement(By.xpath(".//button")).click();
    }

    public WebElement getProduct(String id){
        for(WebElement item: productsCollection){
            if(item.getAttribute("id").equalsIgnoreCase(id)){
                return item;
            }
        }
        Assert.fail("Такой товар не найден");
        return null;
    }

    @FindBy(xpath = "//*[@data-test-id=\"header-cart\"]")
    public WebElement basket;
}
