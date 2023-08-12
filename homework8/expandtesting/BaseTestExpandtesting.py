import datetime

import pytest
from selenium import webdriver


@pytest.mark.usefixtures("chrome_driver")
class BaseTestExpandtesting:
    driver: webdriver.Chrome
    BASE_URL = "https://practice.expandtesting.com"

    def price(self, time1: str | datetime.datetime, time2: str | datetime.datetime, date_format: str = None):
        if date_format is None:
            date_format = "yyyy-MM-dd HH:mm"
        delta = self.__time_delta(time1, time2)
        return delta.days*24+(delta.seconds/60)//30

    def __time_delta(self, time1: str, time2: str, date_format: str = None):
        if not (date_format is None):
            datetime_format = {date_format.split(" ")[0].split("-")[index]: index for index in range(3)}
            time1_temp = time1.split(" ")[0].split(".")
            time1 = time1_temp[datetime_format["yyyy"]]+"."+time1_temp[datetime_format["MM"]]+"."+time1_temp[datetime_format["dd"]] + " " + time1.split(" ")[1]

            time2_temp = time2.split(" ")[0].split(".")
            time2 = time2_temp[datetime_format["yyyy"]]+"."+time2_temp[datetime_format["MM"]]+"."+time2_temp[datetime_format["dd"]] + " " + time2.split(" ")[1]

        time1 = time1.split(" ")[0].split("-") + time1.split(" ")[1].split(":")
        time1 = [int(t) for t in time1]
        time1 = datetime.datetime(*time1)
        time2 = time2.split(" ")[0].split("-") + time2.split(" ")[1].split(":")
        time2 = [int(t) for t in time2]
        time2 = datetime.datetime(*time2)

        return time2-time1

