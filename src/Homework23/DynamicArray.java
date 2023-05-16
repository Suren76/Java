package Homework23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DynamicArray<E> implements ArrayInterface<E> {
    private E[] array = (E[]) new Object[15];
    private int size = 0;

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        checkOutOfRange(index);

        return array[index];
    }

    @Override
    public void replace(int index, E element) {
        checkOutOfRange(index);

        array[index] = element;
    }

    @Override
    public void add(E element){
        size++;

        if (size > array.length) {
            E[] temp = array;
            array = (E[]) new Object[temp.length + 5];
            arraycopy(temp, 0, array, 0, temp.length);
        }

        array[size-1] = element;
    }

    @Override
    public void add(int index, E element)  {
        checkOutOfRange(index);

        size++;

        if (size > array.length) {
            E[] temp = array;
            array = (E[]) new Object[temp.length + 5];
            arraycopy(temp, 0, array, 0, temp.length);
        }

        System.out.println(1);
        arraycopy(array, index, array, index+1, (size-1)-index);//1

        array[index] = element;
    }

    @Override
    public void remove(int index){
        checkOutOfRange(index);

        arraycopy(array, index+1, array, index, --size-index);
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayToShow());
    }

    private E[] arrayToShow() {
        E[] temp = (E[]) new Object[size];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        return temp;
    }

    private void checkOutOfRange(int index){
        if (index > size-1) {
            throw new IndexOutOfBoundsException("Index out of range: " + size + ", "+index+" > "+size+", diff: "+(index-size));
        }
    }

    private void arraycopy(E[] src,  int  srcPos, E[] dest, int destPos, int length){
        src = src.clone();

        for (int i = 0; i < length; i++) {
            dest[destPos+i] = src[srcPos+i];
        }
    };
}
