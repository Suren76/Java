import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


@pytest.mark.usefixtures("chrome_driver")
class TestLocatorsUsage:
    driver: webdriver.Chrome
    BASEURL = "https://demoqa.com/"

    def test_locators_usage(self):
        self.driver.get(self.BASEURL+"upload-download")

        search_part: WebElement = self.driver.find_element(By.CSS_SELECTOR(".col-12.mt-4.col-md-6"))
        to_compare: WebElement = self.driver.find_element(By.XPATH("//*[@id=\"downloadButton\"]"))
        current_element: WebElement

        current_element = search_part.find_element(By.ID("downloadButton"))
        assert to_compare == current_element

        current_element = search_part.find_element(By.CLASS_NAME("btn-primary"))
        assert to_compare == current_element

        current_element = search_part.find_element(By.TAG_NAME("a"))
        assert to_compare == current_element

        current_element = search_part.find_element(By.LINK_TEXT("Download"))
        assert to_compare == current_element

        current_element = search_part.find_element(By.PARTIAL_LINK_TEXT("Downl"))
        assert to_compare == current_element

        current_element = self.driver.find_element(By.CSS_SELECTOR("div.col-12.mt-4.col-md-6 a[download='sampleFile.jpeg']"))
        assert to_compare == current_element

