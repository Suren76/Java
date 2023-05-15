package Homework23;

public interface ArrayInterface<T> {
    int size();
    boolean isEmpty();
    T get(int index);
    void replace(int index, T element);
    void add(T element);
    void add(int index, T element);
    void remove(int index);

}
