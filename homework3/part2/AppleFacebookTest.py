from selenium.webdriver import Chrome


class GoogleAmazonTest:
    __driver = Chrome()

    def open_apple_test(self):
        self.__driver.get("https://www.apple.com")

    def open_facebook_test(self):
        self.__driver.get("https://www.facebook.com")
