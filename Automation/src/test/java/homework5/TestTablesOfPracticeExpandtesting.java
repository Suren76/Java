package homework5;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class TestTablesOfPracticeExpandtesting extends BaseTest {
    static final String BASEURL = "https://practice.expandtesting.com/tables";

    @Test
    void testTablesByXpath(){
        driver.get(BASEURL);

        WebElement table = driver.findElement(By.xpath("//div[@class='page-layout']//div[@class='row'][2]//table/tbody"));
        List<WebElement> tablesList = table.findElements(By.tagName("tr"));

        for (WebElement item: tablesList) {
            System.out.println(item.findElement(By.className("email")).getText());
        }

        WebElement fieldOfTable = table.findElement(By.xpath("//td[text()=\"jsmith@gmail.com\"]/.."));
        fieldOfTable.findElement(By.xpath("//a[@href=\"#delete\"]")).click();
    }

    @Test
    void testTablesByCssSelector() throws InterruptedException {
        driver.get(BASEURL);

        List<WebElement> emails = driver.findElements(By.cssSelector("tbody tr :nth-child(3)"));
        for (WebElement email: emails) {
            System.out.println(email.getText());
        }

        driver.findElement(By.cssSelector("#table2 tbody tr:nth-child(1) td.action a:nth-child(2)")).findElement(By.xpath("//../a[2]")).click();
        sleep(1000);
    }

}
