package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(7);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(200);
        list2.add("A");
        list2.add("B");
        list2.add("C");


        List<String> list3 = new ArrayList<>();

        ArrayList<String> list4 = new ArrayList<>(list);
        System.out.println(list4);
    }
}
