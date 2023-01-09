package Homework5;

import java.util.Scanner;

public class filterNegativeNums {
    public static void main(String[] args) {
        // v1
        System.out.println(new Scanner(System.in).nextInt()*5);
        // v2
        int n  = new Scanner(System.in).nextInt();
        System.out.println(n>=0 && n<=12 ? n==12?0:n*5 : "input error: out of range(0-12)");

    }
}
