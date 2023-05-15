package other.exam4;

public class ex1 {
    public static void main(String[] args) {
        test an = new test(45);
        test2 ani = new test2(49);
        an.sout(ani);
    }

}

class test{
    private int a;
    test(int a){
        this.a = a;
    }

    void sout(Object o){
        test i = (test) o;
        System.out.println(i.a);
    }
}

class test2{
    private int a;
    test2(int a){
        this.a = a;
    }

    void sout(Object o){
        test i = (test) o;
        System.out.println(i);
    }
}
