package homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends BaseTestAmazon {
    @Test
    void testOpenAmazon() throws InterruptedException {
        driver.get(BASEURL);

        choiceField("Books");

        WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchField.sendKeys("Mark Twain");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        String resultTitle = driver.findElement(By.xpath("//div[@cel_widget_id=\"UPPER-RESULT_INFO_BAR-0\"]//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();

        int itemsExpectedCount = Integer.parseInt(resultTitle.split(" ")[0].split("-")[1]);
        int itemActualCount = driver.findElements(By.xpath("//div[@data-component-type=\"s-search-result\"]")).size();

        Assert.assertEquals(itemsExpectedCount, itemActualCount);
    }
}
