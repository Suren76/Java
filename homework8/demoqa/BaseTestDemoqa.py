import pytest
from selenium import webdriver


@pytest.mark.usefixtures("chrome_driver")
class BaseTestDemoqa:
    driver: webdriver.Chrome
    BASE_URL = "https://demoqa.com"
