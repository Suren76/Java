package other.exam3;

public class TestClass {
    public static void main(String[] args) {
        int result = div(4, 0);
        System.out.println("Result = " + result);
        int result_2 = div(4, 3);
        System.out.println("Result 2 = " + result_2);
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not permitted");
        }
        return a / b;
    }
}