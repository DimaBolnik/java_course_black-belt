package collection.set_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEX {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);

        System.out.println(deque);
    }
}
