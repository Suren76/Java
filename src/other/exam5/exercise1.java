package other.exam5;

class A<T extends Number>{

}

public class exercise1 {
    public static void main(String[] args) {
        A<Number> a = new A<>();
        A<Integer> b = new A<>();
//        a = b;
    }
}
