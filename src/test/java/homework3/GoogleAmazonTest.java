package homework3;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class GoogleAmazonTest extends BaseTest {
    @Test
    void openGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    void openAmazon(){
        driver.get("https://www.amazon.com");
    }
}
