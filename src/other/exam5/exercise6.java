package other.exam5;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class exercise6 {
    public static void main(String[] args) {
        String[] array = "January, February, March, April, May, June, July, August, September, October, November, December".split(", ");
        LinkedHashMap<Integer,String> result = new LinkedHashMap<>();

        System.out.println(getMonthNumber("June"));
        System.out.println(Arrays.toString(array));


        for (String item: array){
            result.put(getMonthNumber(item), item);
        }

        System.out.println(result);
    }

    static int getMonthNumber(String month){
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
        }
        return -1;
    }
}
