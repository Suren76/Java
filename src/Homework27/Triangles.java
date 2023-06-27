package Homework27;

import java.util.ArrayList;
import java.util.HashMap;

class Cords{
    private int x;
    private int y;

    Cords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Triangle<E extends Cords> extends ArrayList<E>{
    private ArrayList<Cords> cords = new ArrayList<>();
    private Triangles color;

    Triangle(E firstCord, E secondCord, E thirdCord) {
        cords.add(firstCord);
        cords.add(secondCord);
        cords.add(thirdCord);
    }

    void setColor(Triangles color) {
        this.color = color;
    }

    String getColor() {
        if (!(color == null)) {
            return color.getColor();
        }

        return null;
    }
}

public class Triangles<K extends String,V extends Triangle<Cords>> extends HashMap<K,V>  {
    private V cords;
    private K color;

    @Override
    public V put(K color, V cords) {
        this.cords = cords;
        this.color = color;
        cords.setColor(this);
        return cords;
    }


    public static void main(String[] args) {
        Triangle<Cords> group = new Triangle<>(new Cords(2,5),new Cords(2,5),new Cords(2,5));
//        Triangles<String,Triangle<Cords>> triangleRed = new Triangles<>("red",group);
    }

    public K getColor() {
        return color;
    }
}
