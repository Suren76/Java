package homework8.expandtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestExpandtesting extends BaseTestExpandtesting {

    @Test
    void testSelectedData() {
        driver.get(BASEURL + "/webpark");

        Select dropDownMenu = new Select(driver.findElement(By.id("parkingLot")));
        dropDownMenu.selectByVisibleText("Short-Term Parking");


        WebElement entryDate = driver.findElement(By.id("entryDate"));
        WebElement entryTime = driver.findElement(By.id("entryTime"));
        WebElement exitDate = driver.findElement(By.id("exitDate"));
        WebElement exitTime = driver.findElement(By.id("exitTime"));

        entryDate.clear();
        entryDate.sendKeys("2023-08-14");
        entryTime.clear();
        entryTime.sendKeys("02:00");
        exitDate.clear();
        exitDate.sendKeys("2023-08-16");
        exitTime.clear();
        exitTime.sendKeys("05:00");

        driver.findElement(By.id("calculateCost")).click();

        int result = Integer.parseInt(new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultValue"))).getText().split(".00€")[0]);
        Assert.assertEquals(result, getPrice("2023-08-14", "02:00", "2023-08-16", "05:00"));
    }
}
