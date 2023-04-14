package Homework22;

class Wheel implements Spinnable{
    @Override
    public void spin() {
        System.out.println("Spinning the "+this.getClass().getSimpleName());
    }
}
