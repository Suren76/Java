import pytest
from selenium import webdriver
from selenium.common import TimeoutException, NoSuchElementException
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec


@pytest.mark.usefixtures("chrome_driver")
class BaseTestAmazon:
    driver: webdriver.Chrome
    BASE_URL = "https://www.amazon.com"

    def choice_field(self, field_name):
        try:
            WebDriverWait(self.driver, 15).until(ec.element_to_be_clickable(self.driver.find_element(By.XPATH, "//header")))
        except TimeoutException as e:
            raise NoSuchElementException(e.msg)

        drop_down_menu = self.driver.find_element(By.XPATH, "//select[@id='searchDropdownBox']")
        select_field = Select(drop_down_menu)
        select_field.select_by_visible_text(field_name)
