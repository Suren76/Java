package homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.testng.internal.annotations.IBeforeClass;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class TestBrowser {
    WebDriver driver;
    ChromeDriverService service;

    @BeforeTest
    void setupBeforeClass() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/home/suren/Driver/114/chromedriver"))
                .usingAnyFreePort()
                .build();

        service.start();
    }

    @BeforeClass
    void setupChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(service, options);
    }

    @Test
    public void goToVersion() {
        driver.get("chrome://version");
    }

    @AfterClass
    public void close() throws InterruptedException {
        sleep(2*1000);
        driver.close();
    }
}
