package Homework7;

public class extraHomework_getPrimeNum {
    public static void main(String[] args) {
        int[] array = {5,94,45,15,8,9,29,21,9};// 1,2 are out of the rule
        int count = 0;

        for (int n: array) {
            for (int i = 1; i < n/2; i++) {
                if (n%(i+1) == 0) {
                    System.out.println(n);
                    count++;
                    break;
                }
            }
        }

        if (count==0) System.out.println("There aren't prime numbers");
    }
}
