package homework3;

import BaseTest.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static java.lang.Thread.sleep;


public class SaucedemoTest extends BaseTestClass {
    static final String BASEURL = "https://www.saucedemo.com/";

    @DataProvider
    public static Object[][] users() {
        return new Object[][]{
                {"standard_user", BASEURL+"inventory.html"},
                {"locked_out_user", BASEURL},
                {"problem_user", BASEURL+"inventory.html"},
                {"performance_glitch_user", BASEURL+"inventory.html"}
        };
    }

    @BeforeMethod
    void goToSite(){
        driver.get(BASEURL);
    }

    @Test(dataProvider = "users")
    void login(String username, String expected) throws InterruptedException {
//        WebElement loginForm = driver.findElement(new By.ByCssSelector("#login_button_container > div"));
        WebElement loginForm = driver.findElement(By.className("login-box"));
//        WebElement loginForm = driver.findElement(new By.ByXPath("//*[@id=\"login_button_container\"]/div"));


        WebElement loginField = loginForm.findElement(new By.ByCssSelector("#user-name"));
        WebElement passwordField = loginForm.findElement(new By.ByCssSelector("#password"));

        loginField.sendKeys(username);
        passwordField.sendKeys("secret_sauce");

        loginForm.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), expected);
        logout();
    }

    void logout() {
        if (!driver.getCurrentUrl().equals(BASEURL)){
            driver.findElement(new By.ByCssSelector("#react-burger-menu-btn")).click();
            // sleep(100);
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector("#logout_sidebar_link")));

            driver.findElement(new By.ByCssSelector("#logout_sidebar_link")).click();
            System.out.println("ok");;
        }
        else {
            System.out.println("nothing");
        }
    }

}
