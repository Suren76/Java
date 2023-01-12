package Homework6;

import java.util.Scanner;

public class findChar {
    public static void main(String[] args) {
        char[] array = {'f', 'g'};
        char toFind = new Scanner(System.in).next().charAt(0);
        int i = 0;

        while (array[i] != toFind){
            i++;
        }

        System.out.println(i);
    }
}
