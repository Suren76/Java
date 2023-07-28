package homework6;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Test4u extends BaseTestClass4U {

    @Test
    void testAddItemToShopcart() throws InterruptedException {
        driver.get(BASEURL);

        int countOfItems = getShopcartItemsCount();

        WebElement elem = driver.findElement(By.xpath("//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_basket']"));
        click(elem);

        int nowCountOfItems = getShopcartItemsCount();
        Assert.assertEquals(countOfItems+1, nowCountOfItems);
    }

    @Test
    void testCheckAddedItemOfShopcart() throws InterruptedException {
        WebElement itemDescription = driver.findElement(By.xpath("//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_descr']"));

        Assert.assertTrue(checkItemExistsInShopcart(itemDescription));
    }

















    @Test(enabled = false)
    void testWhyNotWorkWithoutScrollAndScrollCorrectly() throws InterruptedException {
        driver.get(BASEURL);
        String xpathOfItemCard = "//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")]";
        int countOfItems = getShopcartItemsCount();
        WebElement header = driver.findElement(By.xpath("//header"));

        driver.manage().window().maximize();

//        WebElement offer1 = driver.findElement(By.xpath("//div[@id=\"offer1\"]"));

        WebElement element = driver.findElement(By.xpath(xpathOfItemCard+"[3]"));
//        WebElement shopcartButton = element.findElement(By.xpath("//div[@class=\"item_basket\"]//a"));
        WebElement shopcartButton = driver.findElement(By.xpath("/html/body/section[3]/div/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[4]/div/div/div/a/span"));
//        System.out.println(element.getRect().y+" "+element.getLocation().getY());
//        new Actions(driver).scrollToElement(element).perform();
        new Actions(driver).scrollByAmount(0,element.getLocation().getY()).perform();

//        new Actions(driver).scrollToElement(driver.findElement(By.xpath("//div[@id=\"offer1\"]"))).perform();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(shopcartButton));
//        sleep(5*1000);
        System.out.println(shopcartButton.getRect().getPoint());
        shopcartButton.click();
//        new Actions(driver).clickAndHold(shopcartButton).perform();
//        sleep(5*1000);
//        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(shopcartButton)).click();
        int nowCountOfItems = getShopcartItemsCount();
        Assert.assertEquals(countOfItems+1, nowCountOfItems);
    }
}
