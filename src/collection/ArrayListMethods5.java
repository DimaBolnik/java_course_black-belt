package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);

        List<Integer> list1 = List.of(1,2,3,4,5);
        System.out.println(list1);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2);


//        Object[] arr = list.toArray();
//        String[] arr2 = list.toArray(new String[0]);
//
//        for (String s : arr2) {
//            System.out.println(s);
//        }

//
//        List<String> list1 = list.subList(1, 3);
//        System.out.println(list1);
//        list1.add("12334");
//        System.out.println(list);
//        System.out.println(list1);
    }
}
