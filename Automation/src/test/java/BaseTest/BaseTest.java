package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static java.lang.Thread.sleep;

abstract class BaseTestClass {
    public WebDriver driver = null;

    @BeforeSuite
    void setup() {
        System.out.println(1);
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    WebDriver configuringBeforeRun(){
        System.out.println(2);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        return driver;
    }

    @AfterClass
    void afterTestEnds() throws InterruptedException {
        System.out.println(3);
        sleep(2*1000);
        driver.close();
    }

    @AfterSuite
    void TheEnd(){
        System.out.println(4);
        driver.quit();
    }
}

public class BaseTest extends BaseTestClass{

}
