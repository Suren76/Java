package homework5;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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
    void testTablesByCssSelector(){
        driver.get(BASEURL);

        WebElement table = driver.findElement(By.cssSelector("table#table2 tbody"));
        List<WebElement> tablesList = table.findElements(By.tagName("tr"));

        for (WebElement item: tablesList) {
            System.out.println(item.findElement(By.className("email")).getText());
        }

        WebElement fieldOfTable = null;
        for (WebElement item: tablesList) {
            if (item.findElement(By.className("email")).getText().equals("jsmith@gmail.com")){
                fieldOfTable = item;
                fieldOfTable = fieldOfTable.findElement(By.cssSelector("td[class='action'] a:nth-child(2)"));
            }
        }

        // առանց xpath exception ա տամ
        assert fieldOfTable != null;
        fieldOfTable.findElement(By.xpath("//../a[2]")).click();

    }
}
