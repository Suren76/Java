package homework6;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestOpenSeleniumDependency48 extends BaseTest {
    String BASEURL = "https://mobilecentre.am";

    @Test
    void testOpeningDependencyVersion() throws InterruptedException {
        driver.get(BASEURL);
        sleep(2*1000);
        WebElement header = driver.findElement(By.xpath("//div[@class=\"header\"]"));
        WebElement elem = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[15]/div[2]/div[4]/a[1]"));
//        new Actions(driver).scrollByAmount(0,elem.getRect().y-500);
//        sleep(5*1000);
        elem.click();
        sleep(3*1000);
    }
}
