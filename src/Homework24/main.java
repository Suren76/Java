package Homework24;

public class main {
    public static void main(String[] args) {
        Box a = new Box(12.6f);
        Box b = new Box<Integer>(12);
        Box c = new Box<Long>(12l);
        Box d = new Box<Float>(10.53f);
        Box e = new Box("54");


        System.out.println(e.sumOf(a, d));
    }
}
