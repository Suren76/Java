package Homework14;

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(getCommonDivisor(new int[]{44, 8, 16, 64}));
    }

    static int getCommonDivisor(int[] array) {
        int commonDivisor = 1;

        for (int i = 2; i <= min(array); i++) {
            boolean isDividing = true;

            for (int n: array) {
                if (!(n%i == 0)) {
                    isDividing = false;
                    break;
                }
            }

            if (isDividing) commonDivisor = i;
        }

        return commonDivisor;
    }

    static int min(int[] list){
        int minNumber = abs(list[0]);

        for (int n :list) {
            if (abs(n) < minNumber){
                minNumber = abs(n);
            }
        }

        return minNumber;
    }

    static int abs(int n) {
        return n<0? n*-1: n;
    }
}
