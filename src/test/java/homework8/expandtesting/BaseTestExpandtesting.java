package homework8.expandtesting;

import BaseTest.BaseTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTestExpandtesting extends BaseTest {
    final static String BASE_URL = "https://practice.expandtesting.com";

    protected int getPrice(String entryDate, String entryTime, String exitDate, String exitTime) {
        return getPrice(entryDate, entryTime, exitDate, exitTime, "yyyy-MM-dd HH:mm");
    }

    protected int getPrice(String entryDate, String entryTime, String exitDate, String exitTime, String format) {
        return getPrice(entryDate + " " + entryTime, exitDate + " " + exitTime, format);
    }

    protected int getPrice(String entryDate, String exitDate, String format) {
        double delta = getTimeDelta(entryDate, exitDate, format);
        System.out.println(delta);
        int days = (int) (delta / 60 / 24);
        int halfHours = (int) ((delta - days * 24 * 60) / 30);
        return days * 24 + halfHours;
    }

    private double getTimeDelta(String time1, String time2, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date1, date2;
        try {
            date1 = dateFormat.parse(time1);
            date2 = dateFormat.parse(time2);
            return getTimeDelta(date1, date2);
        } catch (ParseException e) {
            throw new InvalidInput(e.getMessage());
        }
    }

    private int getTimeDelta(Date time1, Date time2) {
        double delta = time2.getTime() - time1.getTime();
        return (int) delta / 1000 / 60;
    }
}

class InvalidInput extends RuntimeException {
    public InvalidInput(String message) {
        super(message);
    }
}