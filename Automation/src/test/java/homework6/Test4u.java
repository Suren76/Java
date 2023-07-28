package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test4u extends BaseTestClass4U {

    @Test
    void testAddItemToShopcart() throws InterruptedException {
        driver.get(BASEURL);

        int countOfItems = getShopcartItemsCount();

        WebElement elem = driver.findElement(By.xpath("//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_basket']"));
        click(elem);

        int nowCountOfItems = getShopcartItemsCount();
        Assert.assertEquals(countOfItems + 1, nowCountOfItems);
    }

    @Test
    void testCheckAddedItemOfShopcart() throws InterruptedException {
        WebElement itemDescription = driver.findElement(By.xpath("//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_descr']"));

        Assert.assertTrue(checkItemExistsInShopcart(itemDescription));
    }


}
