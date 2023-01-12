package Homework6;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args){
        int[] arr1 = {7, 5, 8, 5, 9, 45, 3};
        int[] arr2 = {7, 5, 8, 5, 9, 45, 3};
        int[] array= new int[14];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2==0 && arr2[i]%2==0){
                array[i*2] = arr1[i];
            }
            if (arr2[i]%3==0 && arr1[i]%3==0){
                array[i*2+1] = arr2[i];
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
