package Homework8;

public class SquareMethod {
    public static void main(String[] args) {
        float number = square(10,-10);

        if (number == -1) {
            System.out.println("Error code: "+number+", |a| or |b| > 10 must be in range(-10,10)");
        } else if (number == -2) {
            System.out.println("Error code: "+number+", a < 0 must be over 0");
        } else {
            System.out.println(number);
        }
    }

    static float square(int a, int b) {
        if (abs(a)>10 || abs(b)>10) return -1;
        if (a < 0) return -2;

        long square = 1;
        for (int i = abs(b); i > 0; i--) {
            square = a * square;
        }

        if (b<0) return 1.0f/square;
        return square;
    }

    static int abs(int n){
        if (n < 0){
            n = n * -1;
        }
        return n;
    }
}
