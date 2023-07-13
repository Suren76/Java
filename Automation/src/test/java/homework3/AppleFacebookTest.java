package homework3;


import BaseTest.BaseTestClass;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppleFacebookTest extends BaseTestClass {

    @BeforeMethod
    void openNewTab(){
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Test
    void openFacebook(){
        driver.get("https://www.facebook.com");
    }

    @Test
    void openApple(){
        driver.get("https://www.apple.com");
    }
}
