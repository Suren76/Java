from time import sleep
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec


@pytest.mark.usefixtures("chrome_driver")
class TestSaucedemo:
    driver: webdriver.Chrome
    BASEURL = "https://www.saucedemo.com/"

    def login(self, username, expected_result):
        self.driver.get(self.BASEURL)

        login_form = self.driver.find_element(By.CLASS_NAME, "login-box")

        login_field = login_form.find_element(By.ID, "user-name")
        password_field = login_form.find_element(By.ID, "password")

        login_field.send_keys(username)
        password_field.send_keys("secret_sauce")

        login_form.find_element(By.ID, "login-button").click()

        assert self.driver.current_url == expected_result

    def test_login(self):

        usernames = [["standard_user", self.BASEURL+"inventory.html"],
                     ["locked_out_user", self.BASEURL+""],
                     ["problem_user", self.BASEURL+"inventory.html"],
                     ["performance_glitch_user", self.BASEURL+"inventory.html"]]

        for item in usernames:
            self.login(item[0], item[1])

        # {"standard_user", BASEURL + "inventory.html"},
        # {"locked_out_user", BASEURL},
        # {"problem_user", BASEURL + "inventory.html"},
        # {"performance_glitch_user", BASEURL + "inventory.html"}

    def logout(self):
        # if (!driver.getCurrentUrl().equals(BASEURL)){
        # new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector("#logout_sidebar_link")));
        if self.driver.current_url == self.BASEURL:
            self.driver.find_element(By.ID, "react-burger-menu-btn")
            # sleep(1)
            WebDriverWait(self.driver, 10).until(ec.element_to_be_clickable((By.ID, "react-burger-menu-btn")))
            # ec.presence_of_all_elements_located((By.ID, "react-burger-menu-btn"))
            self.driver.find_element(By.ID, "logout_sidebar_link").click()
            print("ok")
        else:
            print("nothing")
