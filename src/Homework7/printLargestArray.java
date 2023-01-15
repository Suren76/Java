package Homework7;

import java.util.Arrays;

public class printLargestArray {
    public static void main(String[] args) {
        int[][] array = {
                {5, 6, 7, 3, 21, 5, 7},
                {55, 21, 5, 47, 4},
                {4, 8, 2, 1, 59, 32, 18, 16},
                {65, 8, 55, 21, 5, 7},
                {25, 21, 5, 7, 35, 6, 47, 4},
                {74, 8, 2, 1, 59, 16},
                {25, 21, 5, 7, 35, 6, 47, 4, 58, 37}
        };

        int largestArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length > array[largestArrayIndex].length){
                largestArrayIndex = i;
            }
        }

//        for (int n: array[largestArrayIndex]) {
//            System.out.print(n+" ");
//        }
//        System.out.println();
        System.out.println(Arrays.toString(array[largestArrayIndex]));
    }
}
