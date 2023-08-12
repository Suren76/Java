import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
import webdriver_manager.chrome as chrome


@pytest.fixture(scope="class")
def chrome_driver(request):
    options = webdriver.ChromeOptions()
    # options.add_argument("--start-maximized")
    driver = webdriver.Chrome(service=Service(chrome.ChromeDriverManager().install()), options=options)
    request.cls.driver = driver
    yield
    driver.quit()


@pytest.fixture(scope="class")
def important_value():
    important = True
    return important
