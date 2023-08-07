package homework8.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDroppable extends BaseTestDemoqa {
    @Test
    void testDragAndDrop() throws InterruptedException {
        driver.get(BASE_URL + "/droppable");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        new Actions(driver).scrollByAmount(0, draggable.getRect().y / 2).dragAndDrop(draggable, droppable).build().perform();

        Assert.assertTrue(new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBe(By.xpath("//div[@id='droppable']/p"), "Dropped!")));
    }
}
