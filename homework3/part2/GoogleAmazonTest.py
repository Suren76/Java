from selenium.webdriver import Chrome


class GoogleAmazonTest:
    __driver = Chrome()

    def open_google_test(self):
        self.__driver.get("https://www.google.com")

    def open_amazon_test(self):
        self.__driver.get("https://www.amazon.com")
