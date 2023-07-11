package learning.homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class StartBrowser {
    ChromeDriverService service;
    WebDriver driver;

    void setupBeforeClass() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/home/suren/Driver/114/chromedriver"))
                .usingAnyFreePort()
                .build();

        service.start();
    }

    void setupChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver( options);
    }

    void setup() throws IOException {
//        setupBeforeClass();
        setupChromeDriver();

    }

    public void goToVersion() {
        this.driver.get("chrome://version");
    }

    public void close() throws InterruptedException {
        sleep(2*1000);
        this.driver.close();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/home/suren/Driver/114/chromedriver");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("chrome://version");

        StartBrowser b = new StartBrowser();
        b.setup();
        b.goToVersion();
        b.close();
    }
}
