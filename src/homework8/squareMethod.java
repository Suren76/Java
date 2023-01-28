package homework8;

public class squareMethod {
    public static void main(String[] args) {
        int number = square(-2,5);

        if (number == -1) {
            System.out.println("Error code: "+number+", |a| or |b| > 10 must be in range(-10,10)");
        } else if (number == -2) {
            System.out.println("Error code: "+number+", a < 0 must be over 0");
        } else {
            System.out.println(number);
        }
    }

    static int square(int a, int b) {
        if (abs(a)>10 || abs(b)>10) return -1;
        if (a < 0) return -2;

        int square = a;
        for (; b < 0; b--) {
            square = a * square;
        }

        return square;
    }

    static int abs(int n){
        if (n < 0){
            n = n * -1;
        }
        return n;
    }
}
