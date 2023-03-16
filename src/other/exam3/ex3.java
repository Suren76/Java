package other.exam3;

class Be3 {
    public static void main(String[] args) {
        Ae3 a = new Ae3(10);
        Ae3.f(20);

    }
}
class Ae3 {

    private int x;

    private static int y = 0;

    public Ae3(int x) {
        y++;
        this.x = x;
    }

    public static void f(int i) {
        y++;
//        g(i);
    }
    public void g(int j) {
        System.out.println(j);
    }

}
