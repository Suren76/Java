package Homework24;

public class Box<T> {
     private T p;

    Box(T p){
        this.p = p;
    }

    <P extends Number> Number sumOf(Box<P> p1, Box<P> p2) {
        return   ((Number) ( p1.p.longValue() + p2.p.longValue()));
    }

}
