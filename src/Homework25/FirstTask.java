package Homework25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FirstTask {
    static Object typeOfClass(Object o){
        return o.getClass();
    }

    public static void main(String[] args) {
        int a = 5;
        Integer b = 6;

        List<Integer> i0 = new ArrayList<>();
        i0.add(12);
        i0.add(55);
        i0.add(111);

        i0.add(a);
        i0.add(b);
        i0.add(b);
        i0.add(b);
        i0.add(a);
        i0.add(a);


        List<Integer> i1 = new ArrayList<>(i0);

        List<Integer> i2 = new LinkedList<>(i0);
        i1.add(121212);










//         TRUE
        System.out.println(i2.equals(i1.subList(0,i1.size()-1)));
        System.out.println(i1.subList(0,i1.size()-1).equals(i2));


//         FALSE
        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i1));



    }
}
