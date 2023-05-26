package Homework25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class MyList<E> extends ArrayList<E> implements List<E> {
    private List<E> array;

    MyList(List<E> array) {
        this.array = new ArrayList<>(array);
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
        int indexOfObjCount = membersCount()[new ArrayList<>(getSet()).indexOf(toRemove)];

        for (int i = 0; i < indexOfObjCount; i++) {
            array.remove(toRemove);
        }

        return toRemove;
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
