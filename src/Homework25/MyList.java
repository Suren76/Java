package Homework25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class MyList<E> extends ArrayList<E> implements List<E> {
    private List<E> array;

    MyList(List<E> array) {
        this.array = array;
    }

    private HashSet<E> getSet() {
        return new HashSet<>(array);
    }

    private int[] membersCount() {
        int[] membersCount = new int[getSet().size()];
        for (int i = 0; i < getSet().size(); i++) {
            E toCount = (E) getSet().toArray()[i];
            for (E temp : array) {
                if (toCount == temp) {
                    membersCount[i]++;
                }
            }
        }

        return membersCount;
    }

    public E removeU(int index) {
        E toRemove = array.get(index);

        for (int i = 0; i < membersCount()[0]; i++) {
            array.remove(toRemove);
            System.out.println(array);
            System.out.println(i);
            System.out.println(Arrays.toString(membersCount()));
        }

        return toRemove;
    }


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
        List<MyType> mySol = new MyList<>(fList);

        System.out.println(mySol.remove(0));
        System.out.println(Arrays.toString(mySol.toArray()));

    }
}
