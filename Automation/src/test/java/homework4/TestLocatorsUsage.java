package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLocatorsUsage extends LocatorUsageBaseClass{
    @Test
    void testLocators() {
        driver.get(BaseUrl+"upload-download");
        WebElement searchPart = driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6"));
        WebElement toCompare = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
        WebElement currentElement;

        currentElement = searchPart.findElement(By.id("downloadButton"));
        Assert.assertEquals(toCompare, currentElement);
        currentElement = searchPart.findElement(By.className("btn-primary"));
        Assert.assertEquals(toCompare, currentElement);
        currentElement = searchPart.findElement(By.tagName("a"));
        Assert.assertEquals(toCompare, currentElement);
        currentElement = searchPart.findElement(By.linkText("Download"));
        Assert.assertEquals(toCompare, currentElement);
        currentElement = searchPart.findElement(By.partialLinkText("Downl"));
        Assert.assertEquals(toCompare, currentElement);
        currentElement = driver.findElement(By.cssSelector("div.col-12.mt-4.col-md-6 a[download='sampleFile.jpeg']"));
        Assert.assertEquals(toCompare, currentElement);
    }
}
