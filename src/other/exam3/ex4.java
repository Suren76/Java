package other.exam3;

class ex4 {
    public static void main(String[] args) {
        Ae4 a = new Ae4();
        final Ae4 b = a;
//        b.x = 1500;

        System.out.println(a.x);
    }
}
class Ae4 {
    final long x = 0;

}
