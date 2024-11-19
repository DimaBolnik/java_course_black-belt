package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "D");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
////        }
//        list.set(0, "E");
        String remove = list.remove(0);
        System.out.println(remove);


        System.out.println(list);

    }
}
