package other.exam3;

public class ex2 {

    public static void main(String[] args) {
        Ae2 a = new Ae2();
        func(a, -8.8);
        System.out.println(a.x);
    }
    private static void func (Ae2 a, double x) {
        a = new Ae2();
        a.x = x;
    }
}
class Ae2 {
    public double x = 0.9;
}
