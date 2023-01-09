package Homework5;

import java.util.Arrays;

public class numToMinute {
    public static void main(String[] args){
        double[] arr1 = {5.0, -5.0, 6.0, -5.0, 4.0};
        double[] arrTest2 = new double[5];
        System.arraycopy(java.util.Arrays.stream(arr1).filter(item -> item>0.0).toArray(), 0, arrTest2, 0, 3);
        System.out.println(Arrays.toString(arrTest2));
    }
}
