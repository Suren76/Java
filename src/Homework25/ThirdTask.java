package Homework25;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


class ListNegative<E> extends ArrayList<E> implements List<E> {
    private List<E> list;

    ListNegative(List<E> list){
        this.list = list;
    }

    List<E> getNegative(){
        List<E> numbersList = new ArrayList<>();

        for (int length = 0; length < list.size() ; length++) {
            if (list.get(length) instanceof Number) {
                numbersList.add(list.get(length));

                if (!((int) list.get(length) > 0)) {
                    return numbersList;
                }
            }

            if (list.get(length) instanceof String stringToNumber) {
                if (stringToNumber.toUpperCase().equals(stringToNumber.toLowerCase())) {
                    numbersList.add((E) (Integer) Integer.parseInt(stringToNumber));

                    if (!( Integer.parseInt(stringToNumber) > 0)) {
                        return numbersList;
                    }
                }
            }

            if (list.get(length) instanceof Character charToNumber) {
                if (Character.toUpperCase(charToNumber) == (Character.toLowerCase(charToNumber))) {
                    numbersList.add((E) (Integer) Character.getNumericValue(charToNumber));

                    if (!(Character.getNumericValue(charToNumber) > 0)) {
                        return numbersList;
                    }
                }
            }

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
//        stringList.add("-5");
        stringList.add("12");
        stringList.add("56");
        stringList.add("h8");


        List<Object> objectList = new ArrayList<>();
        objectList.add("12");
        objectList.add(56);
        objectList.add("8");
        objectList.add('5');
        objectList.add("12");
        objectList.add(56);
        objectList.add("h8");
        objectList.add(-5);
        objectList.add(56);


        ListNegative<Integer> intToNegativeList = new ListNegative<>(intList);
        System.out.println(intToNegativeList.getNegative());

        ListNegative<String> stringToNegativeList = new ListNegative<>(stringList);
        System.out.println(stringToNegativeList.getNegative());

        ListNegative<Object> objectToNegativeList = new ListNegative<>(objectList);
        System.out.println(objectToNegativeList.getNegative());

        System.out.println();

    }
}
