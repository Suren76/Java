package homework8.expandtesting;

import BaseTest.BaseTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseTestExpandtesting extends BaseTest {
    final static String BASEURL = "https://practice.expandtesting.com";

    protected int getPrice(String entryDate, String entryTime, String exitDate, String exitTime){
        return (int) ((getDateDelta(entryDate,exitDate)*24)+(getTimeDelta(entryTime, exitTime)*2));
    }

    protected int getDateDelta(DateSplit date1, DateSplit date2){
        int days = 0;

        if ( !(date1.day == date2.day) ) {
            days += date2.day - date1.day;
        }
        if ( !(date1.month == date2.month)  ) {
            if ( (date2.month - date1.month) > 1) {
                for (int i = 0; i < (date2.month - date1.month); i++) {
                    days += getMonthDaysCount(date2.month-i);
                }
            }
        }
        if ( !(date1.year == date2.year) ) {
            days += (date2.year-date1.year)*365 ;
        }

        return days;
    }

    protected int getDateDelta(String date1, String date2){
        DateSplit s1 = new DateSplit(date1, "yyyy:MM:dd");
        DateSplit s2 = new DateSplit(date2, "yyyy:MM:dd");
        return getDateDelta(s1, s2);
    }

    protected double getTimeDelta(String time1, String time2){
        return Integer.parseInt(time2.split(":")[0])-Integer.parseInt(time1.split(":")[0])+(Integer.parseInt(time2.split(":")[1])-Integer.parseInt(time1.split(":")[1])>=30?0.5:0);
    }

    private int getMonthDaysCount(int monthNumber){
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return  31;
            case 4:
            case 6:
            case 9:
            case 11:
                return  30;
            case 2:
                return 28;
        }
        return 50000;
    }

}

class DateSplit{
    int day;
    int month;
    int year;

    DateSplit(String date){
       this(date, "yyyy:MM:dd");
    }

    DateSplit(String date, String format){
        ArrayList<String> s = new ArrayList<>(List.of(format.split(":")));
        String[] dateSplited = date.split("-");

        this.day = Integer.parseInt(dateSplited[s.indexOf("dd")]);
        this.month = Integer.parseInt(dateSplited[s.indexOf("MM")]);
        this.year = Integer.parseInt(dateSplited[s.indexOf("yyyy")]);

    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "DateSplit{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
