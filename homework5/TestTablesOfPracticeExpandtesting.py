import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


@pytest.mark.usefixtures("chrome_driver")
class TestTablesOfPracticeExpandtesting:
    driver: webdriver.Chrome
    BASEURL = "https://practice.expandtesting.com/tables"

    def test_tables_by_xpath(self):
        self.driver.get(self.BASEURL)

        table = self.driver.find_element(By.XPATH, "//div[@class='page-layout']//div[@class='row'][2]//table/tbody")
        tables_list = table.find_elements(By.TAG_NAME, "tr")

        for item in tables_list:
            print(item.find_element(By.CLASS_NAME, "email").text)

        field_of_table = table.find_element(By.XPATH, "//td[text()=\"jsmith@gmail.com\"]/..")
        field_of_table.find_element(By.XPATH, "//a[@href=\"#delete\"]").click()

    def test_tables_by_css_selector(self):
        self.driver.get(self.BASEURL)
        table = self.driver.find_element(By.CSS_SELECTOR, "table#table2 tbody")
        tables_list: list[WebElement] = table.find_elements(By.TAG_NAME, "tr")

        for item in tables_list:
            print(item.find_element(By.CLASS_NAME, "email").text)

        for item in tables_list:
            if item.find_element(By.CLASS_NAME, "email").text == "jsmith@gmail.com":
                global field_of_table
                field_of_table = item
                field_of_table = field_of_table.find_element(By.CSS_SELECTOR, "td[class='action'] a:nth-child(2)")

        field_of_table.find_element(By.XPATH, "//../a[2]").click()
    #         for (WebElement item: tablesList) {
    #             if (item.findElement(By.className("email")).getText().equals("jsmith@gmail.com")){
    #                 fieldOfTable = item;
    #                 fieldOfTable = fieldOfTable.findElement(By.cssSelector("td[class='action'] a:nth-child(2)"));
    #             }
    #         }
    #
    #         // առանց xpath exception ա տամ
    #         assert fieldOfTable != null;
    #         fieldOfTable.findElement(By.xpath("//../a[2]")).click();
    #
    #     }