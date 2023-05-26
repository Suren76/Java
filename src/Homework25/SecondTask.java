package Homework25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        MyType f1 = new MyType();
        List<MyType> fList = new ArrayList<>();
        fList.add(f1);
        fList.add(f1);
        fList.add(f1);
        fList.add(f1);
        fList.add(new MyType());
        fList.add(new MyType());
        fList.add(new MyType());


        System.out.println(fList);
        fList.removeIf(n -> (n == f1));
        System.out.println(fList);


    }
}
