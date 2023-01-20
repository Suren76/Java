package Homework7;

public class extraHomework_getPrimeNum {
    public static void main(String[] args) {
        int[] array = {5,94,45,15,8,11,23,9,29,21,51,9,5,41,43};// 1,2 are out of the rule
        int count = 0;

        for (int n: array) {
            for (int i = 2; i <= n/2; i++) {
                if (n%i == 0) {
                    break;
                }
                else if (i == n/2) {
                    System.out.println(n);
                    count++;
                }
            }
        }

        if (count==0) System.out.println("There aren't prime numbers");
    }
}
