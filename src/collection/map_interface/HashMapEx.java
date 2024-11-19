package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "one");
        map1.put(3465, "two");
        map1.put(6787, "three");
        map1.put(8909, "four");
        map1.put(5555, "four");
        map1.put(1012, null);
        map1.put(null, "fifi");
        map1.putIfAbsent(5555, "rgdfgdfgdfg");
        System.out.println(map1);
//        System.out.println(map1.get(1000));
//        map1.remove(1000);
//        System.out.println(map1);
        System.out.println(map1.containsValue("one"));
        System.out.println(map1.containsKey(1012));
        System.out.println(map1.keySet());
        System.out.println(map1.values());



    }
}
