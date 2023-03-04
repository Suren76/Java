package other.exam3;

class B {
    public static void main(String[] args) {
        A x = new A();
        x.setB(50);
        x.increaseB(-5);
        System.out.println(x.getB());
    }
}

class A {
    private String a;

    private int b;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        if (b >= 0 && b <= 100) {
            System.out.printf("Bad number %s .%n", b);
        } else {
            this.b = b;
        }
    }

    public void increaseB(int i) {
        b += i;
    }
    public int getB() {
        return b;
    }

}
