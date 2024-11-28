package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        Double v = list.parallelStream().reduce((ac, el) -> ac * el).get();
        System.out.println(v);

        Double x = list.stream().reduce((ac, el) -> ac * el).get();
        System.out.println(x);
    }
}
