package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(-30);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

//        int[] arr = {-3,13,6,3456,324,14,66,88,99,};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int idex = Arrays.binarySearch(arr, 14);
//        System.out.println(idex);
    }
}
