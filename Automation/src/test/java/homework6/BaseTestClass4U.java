package homework6;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseTestClass4U extends BaseTest {
    static final String BASEURL = "https://4u.am/en/";
    private WebElement header;

    protected void scrollTo(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("window.scrollBy("+element.getLocation().getX()+","+(element.getLocation().getY()+100)+")", "");
    }

    protected int getShopcartItemsCount(){
//        return driver.findElement(By.xpath("//div[@id=\"productQuantity\"]")).getText().equals("")?0: Integer.parseInt(driver.findElement(By.xpath("//div[@id=\"productQuantity\"]")).getText());
        driver.findElement(By.xpath("//div[@id=\"basketIcon\"]")).click();
        WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"basketCloseButton\"]")));
//        int count = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='basket_content_item']"))).size();
        int count = driver.findElements(By.xpath("//div[@class='basket_content_item']")).size();
//        driver.findElement(By.xpath("//button[@id=\"basketCloseButton\"]")).click();
        closeButton.click();
        return count;
    }

    protected void click(WebElement elem, WebElement header) {
        new Actions(driver).scrollByAmount(0,elem.getRect().y-header.getRect().height).perform();
        elem.click();
    }

    protected void click(WebElement elem) {
        if (header==null) {
            header = driver.findElement(By.xpath("//header"));
        }
        click(elem,header);
    }

    protected boolean checkItemExistsInShopcart(WebElement elem){
        driver.findElement(By.xpath("//div[@id=\"basketIcon\"]")).click();

        WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"basketCloseButton\"]")));
        List<WebElement> shopcartItems = driver.findElements(By.xpath("//div[@class=\"basket_content_item\"]"));
//        closeButton.click();

        for (WebElement item: shopcartItems) {
            if (itemToValue(elem).equals(basketItemToValue(item))) {
                closeButton.click();
                return true;
            }
        }

        closeButton.click();
        return false;
    }

    private Map<String,String> itemToValue(WebElement elem) {
        Map<String, String> itemProperties = new  HashMap<>();
        itemProperties.put("name",elem.findElement(By.xpath(".//p/a")).getText());
        itemProperties.put("price",elem.findElement(By.xpath(".//div/p/span/span")).getText());

        return itemProperties;
    }

    private Map<String,String> basketItemToValue(WebElement elem) {
        Map<String, String> itemProperties = new  HashMap<>();
        itemProperties.put("name",elem.findElement(By.xpath("//div[@class=\"basket_content_item\"][1]//h4")).getText());
        itemProperties.put("price",elem.findElement(By.xpath("//div[@class=\"basket_content_item\"][1]//p/span[1]")).getText());

        return itemProperties;
    }
}
