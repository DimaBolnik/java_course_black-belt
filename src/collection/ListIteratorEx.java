package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "mamamamamamamamamamamamamamamamamamamamamamamamamam";
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> listIterator1 = list.listIterator();
        ListIterator<Character> listIterator2 = list.listIterator(list.size());
        boolean flag = true;
        int counter = 0;
        while (listIterator1.hasNext() && listIterator2.hasPrevious()) {
            if (listIterator1.next() == listIterator2.previous()) {
                counter++;
                if (counter ==list.size()/2) {
                    break;
                }
            }else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
