package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Privet");
        list.add("Poka");
        list.add("Ok");
        list.add("Uchim JAVA");
        list.add("a imenno lambdas");

//        list.removeIf(s -> s.length() < 5);
        Predicate<String> pr = s -> s.length()<5;
        list.removeIf(pr);

        System.out.println(list);
    }
}
