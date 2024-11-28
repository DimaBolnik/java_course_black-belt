package stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        Integer i = list.stream().filter(x-> x>0).reduce((a, b) -> a * b).get();
        System.out.println(i);

        Integer i2 = list.stream().filter(x-> x > 0)
                .reduce(1,(a, b) -> a * b);
        System.out.println(i2);


//        Optional<Integer> reduce = list.stream().filter(y -> y > 0).reduce((a, b) -> a * b);
//        if(reduce.isPresent()) {
//            System.out.println(reduce.get());
//        }else System.out.println("Optional is null");
        List<String> list3 = new ArrayList();

        list3.add("privet");
        list3.add("kak dela");
        list3.add("ok");
        list3.add("poka");
        list3.add("java");

        String s = list3.stream().reduce(" ",(ac, el) -> ac + " " + el);
        System.out.println(s);

    }
}
