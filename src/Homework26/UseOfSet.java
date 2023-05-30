package Homework26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UseOfSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(5);
        list.add(1);
        list.add(155);
        list.add(159);
        list.add(5);
        list.add(1);

        List<Integer> filteredList = new ArrayList<>(new HashSet<>(list));

        System.out.println(list);
        System.out.println(filteredList);


    }
}
