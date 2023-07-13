package homework3;

import BaseTest.BaseTestClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class MenuAmShopCartTest extends BaseTestClass {
    String BASEURL = "https://menu.am/";

    @Test
    void openShopCart() throws InterruptedException {
        driver.get(BASEURL);
        driver.findElement(new By.ByXPath("/html/body/div[2]/div[3]/div/div[3]/div/button")).click();

        driver.findElement(new  By.ByXPath("//*[@id=\"__next\"]/div/header/div[1]/div/div[3]/div/div[3]/div[1]/button")).click();
        sleep(2*1000);
    }
}
