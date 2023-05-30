package Homework26;

import java.util.*;

public class SortedCollection {
    public static void main(String[] args) {
        Collection<Integer> list = new PriorityQueue<>();
        list.add(100);
        list.add(465);
        list.add(5);
        list.add(69);
        list.add(465);
        list.add(465);

        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
