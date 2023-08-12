from time import sleep

from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from homework8.demoqa.BaseTestDemoqa import BaseTestDemoqa


class TestDroppable(BaseTestDemoqa):

    def test_drag_and_drop(self):
        self.driver.get(self.BASE_URL + "/droppable")

        draggable = self.driver.find_element(By.XPATH, "//div[@id='draggable']")
        droppable = self.driver.find_element(By.XPATH, "//div[@id='droppable']")

        # ActionChains(self.driver, 3).move_to_element(draggable).drag_and_drop(draggable, droppable).perform()
        self.driver.maximize_window()
        ActionChains(self.driver, 3).scroll_by_amount(0, int(draggable.rect["y"]/2)).drag_and_drop(draggable, droppable).perform()
        sleep(3)

        assert WebDriverWait(self.driver, 3).until(EC.text_to_be_present_in_element((By.XPATH, "//div[@id='droppableExample-tabpane-simple']//div[@id='droppable']/p"), "Dropped!"))

