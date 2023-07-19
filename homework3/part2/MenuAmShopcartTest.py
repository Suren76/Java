from time import sleep
from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By


class MenuAmShopcartTest:
    __driver = Chrome()
    BASEURL = "https://menu.am/"

    def menu_am_shop_cart_open_test(self):
        self.__driver.get(self.BASEURL)

        self.__driver.find_element(By.XPATH, "/html/body/div[2]/div[3]/div/div[3]/div/button").click()

        self.__driver.find_element(By.XPATH, "//*[@id=\"__next\"]/div/header/div[1]/div/div[3]/div/div[3]/div[1]/button").click()
        sleep(1)

