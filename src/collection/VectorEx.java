package collection;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
    }
}
