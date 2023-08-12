from homework7.BaseTestAmazon import *


class TestAmazon(BaseTestAmazon):

    def test_open_amazon(self):
        self.driver.get(self.BASE_URL)

        self.choice_field("Books")

        search_field = self.driver.find_element(By.XPATH, "//input[@id='twotabsearchtextbox']")
        search_field.send_keys("Mark Twain")
        self.driver.find_element(By.XPATH, "//input[@id='nav-search-submit-button']").click()

        result_title = self.driver.find_element(By.XPATH, "//div[@cel_widget_id=\"UPPER-RESULT_INFO_BAR-0\"]//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]").text

        item_expected_count = result_title.split(" ")[0].split("-")[1]
        item_actual_count = len(self.driver.find_elements(By.XPATH, "//div[@data-component-type='s-search-result']"))

        assert str(item_actual_count) == str(item_expected_count)

