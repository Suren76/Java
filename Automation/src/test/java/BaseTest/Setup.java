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

abstract class Setup {
    public WebDriver driver;

    @BeforeSuite
    void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    void configuringBeforeRun(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    @AfterClass
    void afterTestEnds() throws InterruptedException {
        sleep(2*1000);
        driver.close();
    }

    @AfterSuite
    void TheEnd(){
        driver.quit();
    }
}
