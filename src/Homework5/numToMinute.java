package Homework5;

import java.util.Arrays;

public class numToMinute {
    public static void main(String[] args){
        double[] arr1 = {5.0, -5.0, 6.0, -5.0, 4.0};
        double[] arr2 = new double[5];
        // v1 --
        System.arraycopy(java.util.Arrays.stream(arr1).filter(item -> item>0.0).toArray(), 0, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
        // v2
        int i = 0;
        double[] arrV2 = new double[5];

        if (arr1[0]>0.0){
            arrV2[i] = arr1[0];
            i++;
        }
        if (arr1[1]>0.0){
            arrV2[i] = arr1[1];
            i++;
        }
        if (arr1[2]>0.0){
            arrV2[i] = arr1[2];
            i++;
        }
        if (arr1[3]>0.0){
            arrV2[i] = arr1[3];
            i++;
        }
        if (arr1[4]>0.0){
            arrV2[i] = arr1[4];
            i++;
        }

        System.out.println(Arrays.toString(arrV2));
    }
}
