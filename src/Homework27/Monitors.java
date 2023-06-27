package Homework27;


import java.util.*;


class Monitor{
    private int inch;
    private int ppi;


    Monitor(int inch, int ppi){
        this.inch = inch;
        this.ppi = ppi;
    }
}

public class Monitors<K,V> extends HashMap<K,V> {
//    LinkedHashMap<K,V> getSortedMap(int i) {
//        Deque<Entry<K, V>> sortedList = new ArrayDeque<>();
//        for (Entry<K, V> item: this.entrySet()) {
//
//        }
//    }

    public static void main(String[] args) {
        Deque<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(1);
        l.add(9);
        l.add(0);
        l.add(59);
        l.add(91);


        System.out.println(l);

        PriorityQueue<Integer> sl = new PriorityQueue<>(l);
        System.out.println(sl);
        System.out.println(new ArrayList<>(l));
        System.out.println(new LinkedList<>(l));
        System.out.println(new Vector<>(l));
        System.out.println(new Stack<>());

        System.out.println(new HashSet<>(l));
        System.out.println(new LinkedHashSet<>(l));
        System.out.println(new TreeSet<>(l));

        System.out.println(new HashMap<>());
        System.out.println(new ArrayDeque<>());
        System.out.println(new PriorityQueue<>());

        System.out.println(new HashMap<>());
        System.out.println(new LinkedHashMap<>());
        System.out.println(new TreeMap<>());


    }
}
