package Homework22;

class MouseRoller implements Spinnable {
    @Override
    public void spin() {
        System.out.println("Spinning the "+this.getClass().getSimpleName());
    }
}
