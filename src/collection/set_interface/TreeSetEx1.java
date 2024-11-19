package collection.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(10);

        System.out.println(set);
    }
}
