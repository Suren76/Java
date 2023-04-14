package Homework22;

class Fun implements Spinnable {
    String direction;

    Fun(String direction) {
        this.direction = direction;
    }

    @Override
    public void spin(){
        System.out.println("Spinning the "+this.getClass().getSimpleName()+" "+this.direction);
    }
}
