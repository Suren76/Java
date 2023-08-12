from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec

from BaseTestClass4U import BaseTestClass4U


class Test4u(BaseTestClass4U):

    def test_add_item_to_shopcart(self):
        self.driver.get(self.BASE_URL)

        count_of_items: int = self.shopcart_items_count

        elem = self.driver.find_element(By.XPATH, "//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_basket']")
        self.click(elem)

        actual_count_of_items = self.shopcart_items_count
        assert actual_count_of_items == count_of_items + 1

    def test_check_added_item_of_shopcart(self):
        item_description = self.driver.find_element(By.XPATH, "//div[@id=\"offer1\"]//div[contains(@class,\"swiper-slide\")][2]//div[@class='item_descr']")

        self.driver.find_element(*self.basket_icon).click()
        close_button: WebElement = WebDriverWait(self.driver, 15).until(ec.element_to_be_clickable((By.XPATH, "//button[@id=\"basketCloseButton\"]")))
        total_price: int = int("".join(self.driver.find_element(By.XPATH, "//span[@id='cartTotalPrice']").text.split(",")))

        close_button.click()

        items_price = self.basket_items_price

        assert self.check_item_exists_in_shopcart(item_description)
        assert total_price == items_price
