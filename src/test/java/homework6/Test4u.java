package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        driver.findElement(By.xpath("//div[@id=\"basketIcon\"]")).click();
        WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"basketCloseButton\"]")));
        int totalPrice = Integer.parseInt(String.join("", driver.findElement(By.xpath("//span[@id=\"cartTotalPrice\"]")).getText().split(",")));
        int itemsPrice = getBasketItemsPrice();

        Assert.assertTrue(checkItemExistsInShopcart(itemDescription));
        Assert.assertEquals(totalPrice, itemsPrice);

        closeButton.click();
    }

}
