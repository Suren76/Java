package Homework25;


import java.util.ArrayList;
import java.util.List;


class ListNegative<E> extends ArrayList<E> implements List<E> {
    private List<E> list;

    ListNegative(List<E> list){
        this.list = list;
    }

    List<E> getNegative(){
        if (list.get(0) instanceof Number ){
            int length = 0;
            for (; length < list.size() && ((int) list.get(length) > 0); length++) {

            }

            return list.subList(0,length);
        }

        return list;
    }

}

public class ThirdTask {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(56);
        intList.add(8);
        intList.add(-5);
        intList.add(12);
        intList.add(56);
        intList.add(8);

        List<String> stringList = new ArrayList<>();
        stringList.add("12");
        stringList.add("56");
        stringList.add("8");
        stringList.add("-5");
        stringList.add("12");
        stringList.add("56");
        stringList.add("h8");


        ListNegative<Integer> intToNegativeList = new ListNegative<>(intList);
        System.out.println(intToNegativeList.getNegative());

        ListNegative<String> stringToNegativeList = new ListNegative<>(stringList);
        System.out.println(stringToNegativeList.getNegative());

    }
}
