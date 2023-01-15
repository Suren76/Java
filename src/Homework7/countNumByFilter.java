package Homework7;

public class countNumByFilter {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 3, 55, 21, 5, 7, 55, 21, 5, 7, 35, 6, 47, 4};
        int count = 0;

        for (int i = 0; i < array.length-1; i++){
            count = array[i] < array[i+1] ? count+1: count;}

        System.out.println(count);
    }
}
