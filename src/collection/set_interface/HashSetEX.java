package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEX {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Zaur");
        set.add("Dima");
        set.add("Oleg");
        set.add("Marina");
        set.add(null);

        System.out.println(set.contains("Zaur"));

        set.remove(null);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
