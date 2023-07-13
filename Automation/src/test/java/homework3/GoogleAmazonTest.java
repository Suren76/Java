package homework3;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class GoogleAmazonTest extends BaseTestClass {
    @Test
    void openGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    void openAmazon(){
        driver.get("https://www.amazon.com");
    }
}
