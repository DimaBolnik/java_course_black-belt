package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
//        List<Object> list2 = new ArrayList<Integer>();
//        List<?> list2 = new ArrayList<String>();
//        list2.add("hello");
//        List<? extends Number> list30 = new ArrayList<Integer>();
////        list30.add(12);
//
        List<Double> list1 = List.of(12.3, 1123.5, 44.1);
        showListInfo(list1);

        List<String> list3 = List.of("privet", "poka", "44.1");
        showListInfo(list3);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        System.out.println(sum(list2));

        ArrayList<Integer> list33 = new ArrayList<>();
        list33.add(1);
        list33.add(6);
        list33.add(34);
        System.out.println(sum(list33));


    }

    static void showListInfo (List<?> list) {
        System.out.println(list);
    }

    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
