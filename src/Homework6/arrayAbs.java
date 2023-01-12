package Homework6;

import java.util.Arrays;

public class arrayAbs {
    public static void main(String[] args) {
        int[] array = {6, -3, 7, -5, -2, 5, 0};
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i]<0) {
                array[i] = array[i] * -1;
                count = count + 1;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(count);
        System.out.println(array.length-count);
    }
}
