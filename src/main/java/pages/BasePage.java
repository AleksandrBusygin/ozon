package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Init;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage(){ PageFactory.initElements(Init.getDriver(), this); }

    private static HashMap<String,String> variables = new HashMap<String, String>();
    public static String getVariable(String key){
        return variables.get(key);
    }
    public static void setVariable(String key, String value){
        variables.put(key,value);
    }


    public void fillField(WebElement element, String text){
        element.click();
        element.click();
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Init.getDriver();
        Assert.assertNotNull(element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean isElementPresent(WebElement element){
        try{
            Init.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return  element.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public void click(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(Init.getDriver(), 60, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitPageLoaded() {
        WebDriverWait wait = new WebDriverWait(Init.getDriver(), 30);
        wait.ignoring(NoSuchElementException.class).until((ExpectedCondition<Boolean>) driver -> !isPresent(By.xpath("//div[@class='loading block-loader']")));
        wait.ignoring(NoSuchElementException.class).until((ExpectedCondition<Boolean>) driver -> !isPresent(By.xpath("//div[@data-test-id='modal-container']")));
    }


    public boolean isPresent(By locator) {
        try {
            Init.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            return Init.getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            Init.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
    }

}
