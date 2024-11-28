package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");
        list.add("java");

        List<Integer> list1 = list.stream().map(str -> str.length()).collect(Collectors.toList());
//        System.out.println(list1);

        int[] arr = {5, 9, 3, 8, 1};
        arr = Arrays.stream(arr).map(el ->
        {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
//        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        set.add("javset");
        System.out.println(set);

        Set<String> set1 = set.stream().map(el -> el + "asd").collect(Collectors.toSet());
        List<Integer> arr2 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(set1);
        System.out.println(arr2);

    }
}
