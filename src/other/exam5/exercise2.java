package other.exam5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class exercise2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("cde");
        list.add("efg");

        List<String> list2 = new ArrayList<>(list);

        list2.add("xyz");

        System.out.println(list2);
        System.out.println(list);

    }
}
