package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");


        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining(s->System.out.println(s.toLowerCase()));

//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(list);
    }
}
