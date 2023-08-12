from typing import List, Dict, overload

import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.common.actions import action_builder
from selenium.webdriver import ActionChains


@pytest.mark.usefixtures("chrome_driver")
class BaseTestClass4U:
    driver: webdriver.Chrome

    BASE_URL = "https://4u.am/en/"
    header: WebElement
    basket_icon: By = (By.XPATH, "//div[@id='basketIcon']")

    @property
    def shopcart_items_count(self) -> int:
        self.driver.find_element(*self.basket_icon).click()
        close_button: WebElement = WebDriverWait(self.driver, 15).until(ec.element_to_be_clickable((By.XPATH, "//button[@id=\"basketCloseButton\"]")))
        count: int = len(self.driver.find_elements(By.XPATH, "//div[@class='basket_content_item']"))
        close_button.click()
        return count

    def click(self, elem: WebElement, header: WebElement = None):
        if header is None:
            header = self.driver.find_element(By.XPATH, "//header")

        ActionChains(self.driver).scroll_by_amount(0, int(elem.rect["y"] - header.rect["height"])).perform()
        elem.click()

    def check_item_exists_in_shopcart(self, elem: WebElement):
        self.driver.find_element(*self.basket_icon).click()
        close_button: WebElement = WebDriverWait(self.driver, 15).until(ec.element_to_be_clickable((By.XPATH, "//button[@id=\"basketCloseButton\"]")))
        shopcart_items: List[WebElement] = self.driver.find_elements(By.XPATH, "//div[@class=\"basket_content_item\"]")

        for item in shopcart_items:
            if self.item_to_value(elem) == self.basket_item_to_value(item):
                close_button.click()
                return True

        close_button.click()
        return False

    @property
    def basket_items_price(self) -> int:
        self.driver.find_element(*self.basket_icon).click()
        close_button: WebElement = WebDriverWait(self.driver, 15).until(ec.element_to_be_clickable((By.XPATH, "//button[@id=\"basketCloseButton\"]")))

        shopcart_items: List[WebElement] = self.driver.find_elements(By.XPATH, "//div[@class=\"basket_content_item\"]//p/span[1]")
        total_price: int = 0
        for item in shopcart_items:
            total_price += int("".join(item.text.split(",")))

        close_button.click()
        return total_price

    def item_to_value(self, elem: WebElement) -> Dict[str, str]:
        return {
            "name": elem.find_element(By.XPATH, ".//p/a").text,
            "price": elem.find_element(By.XPATH, ".//div/p/span/span").text
        }

    def basket_item_to_value(self, elem: WebElement):
        item_properties: Dict[str, str] = {
            "name": elem.find_element(By.XPATH, ".//h4").text,
            "price": elem.find_element(By.XPATH, ".//p/span[1]").text
        }
        return item_properties

