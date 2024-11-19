package collection;

import java.util.Stack;

public class StackEX {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("!!!");
        System.out.println(stack);
//
        System.out.println(stack.peek());


//        System.out.println("main starts");
//        abc3();
//        System.out.println("main ends");
    }


    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }
}
