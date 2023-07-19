from time import sleep

import pytest
from selenium.webdriver import Chrome


@pytest.mark.usefixtures("chrome_driver")
class TestStartBrowser:
    driver:Chrome

    def test_go_version(self):
        self.driver.get("chrome://version")
        # sleep(0.00001)




