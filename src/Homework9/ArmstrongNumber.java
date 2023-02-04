package Homework9;

public class ArmstrongNumber {
    public static void main(String[] args){
        int[] values = {435, 153, 548834,-153};

        for (int value: values) System.out.println(getArmstrongNumber(value));
    }

    static boolean getArmstrongNumber(int number){
        if (number<0) return false;

        int count = 0;
        int sumOfNumbers = 0;

        for (int tempNumber = number; tempNumber!=0; count++,tempNumber /= 10);

        for (int i = 0, tempNumber = number; i < count; i++,tempNumber /= 10) {
            sumOfNumbers += square(tempNumber%10,count);
        }

        return number == sumOfNumbers;
    }

    static int square(int a, int b) {
        int square = 1;
        for (int i = b; i > 0; i--) {
            square = a * square;
        }
        return square;
    }
}
