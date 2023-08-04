package homework7;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


class BaseTestAmazon extends BaseTest {
    final static String BASEURL = "https://www.amazon.com/";

    protected void choiceField(String fieldName) {
        try {
            WebElement s = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header")));
        } catch (TimeoutException e) {
            throw new NoSuchElementException(e.toString());
        }

        WebElement dropdownMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropdownMenu);
        select.selectByVisibleText(fieldName);
    }
}
