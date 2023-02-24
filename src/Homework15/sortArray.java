package Homework15;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] array = {5, 12, -23, 5, 12, -23, 12, 12, 5};
        int[] numbersCount = {0, 0, 0};

        for (int n: array) {
            if (n == -23) numbersCount[0]++;
            if (n == 5) numbersCount[1]++;
            if (n == 12) numbersCount[2]++;
        }

        for (int i = 0; i < array.length; i++) {
            if (numbersCount[0]-- > 0) array[i] = -23;
            else if (numbersCount[1]-- > 0) array[i] = 5;
            else if (numbersCount[2]-- > 0) array[i] = 12;
        }

        System.out.println(Arrays.toString(array));
    }
}
