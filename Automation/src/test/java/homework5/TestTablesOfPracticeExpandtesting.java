package homework5;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class TestTablesOfPracticeExpandtesting extends BaseTest {
    static final String BASEURL = "https://practice.expandtesting.com/tables";

    @Test
    void testTablesByXpath() throws InterruptedException {
        driver.get(BASEURL);

        List<WebElement> emails = driver.findElements(By.xpath("//tbody//td[3]"));
        for (WebElement item : emails) {
            System.out.println(item.getText());
        }
        driver.findElement(By.xpath("//td[text()='jsmith@gmail.com']/../td[@class='action']/a[2]")).click();
    }

    @Test
    void testTablesByCssSelector() throws InterruptedException {
        driver.get(BASEURL);

        List<WebElement> emails = driver.findElements(By.cssSelector("tbody tr :nth-child(3)"));
        for (WebElement email: emails) {
            System.out.println(email.getText());
        }
        driver.findElement(By.cssSelector("#table2 tbody tr:nth-child(1) td.action a:nth-child(2)")).click();
    }

}
