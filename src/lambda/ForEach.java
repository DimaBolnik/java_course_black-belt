package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
//        List<String> list = List.of("Privet", "Kak dela", "Normalno", "poka");
//        list.forEach(str -> System.out.println(str.toUpperCase()));
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.forEach(el -> {
            System.out.println(el);
            el*=2;
            System.out.println(el);
        });
    }

}
