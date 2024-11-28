package collection.queue_interface;

import java.util.LinkedList;

public class LinkedListEX {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.offer("Zaur");
        list.offer("Dima");
        list.offer("Marina");
        list.offer("Ivan");
        list.offer("Shaha");

        System.out.println(list);
        System.out.println(list.remove("Marina"));


//        System.out.println(list.poll());
//        System.out.println(list.peek());
        System.out.println(list);


    }
}
