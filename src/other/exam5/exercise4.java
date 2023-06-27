package other.exam5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class exercise4 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User(15,"",""));
        list.add(new User(15,"a","a"));
        list.add(new User(15,"a","b"));

        System.out.println(customContains(list,new User(15,"a","a")));
    }

    static <T extends User> boolean customContains(List<T> list, T toCompare) {
        for (T item: list) {
            if (toCompare.equals(item)) {
                return true;
            }
        }

        return false;
    }
}
