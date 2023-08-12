from time import sleep

from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from homework8.expandtesting.BaseTestExpandtesting import BaseTestExpandtesting


class TestExpandtesting(BaseTestExpandtesting):

    def test_selected_date(self):
        self.driver.get(self.BASE_URL + "/webpark")

        entry_date = self.driver.find_element(By.ID, "entryDate")
        entry_time = self.driver.find_element(By.ID, "entryTime")
        exit_date = self.driver.find_element(By.ID, "exitDate")
        exit_time = self.driver.find_element(By.ID, "exitTime")

        entry_date.clear()
        entry_date.send_keys("2023-08-14")
        entry_time.clear()
        entry_time.send_keys("02:00")
        exit_date.clear()
        exit_date.send_keys("2023-08-16")
        exit_time.clear()
        exit_time.send_keys("05:00")

        self.driver.find_element(By.ID, "calculateCost").click()

        result = WebDriverWait(self.driver, 5).until(EC.presence_of_element_located((By.ID, "resultValue"))).text.split(".00€")[0]

        assert int(result) == int(self.price("2023-08-14 02:00", "2023-08-16 05:00"))


