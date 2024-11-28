package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8,1,5 ,19, 27,10};
//        int[] array1 = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array1));

        int result = Arrays.stream(array)
                .filter(x -> x % 2 == 1)
                .map(x -> {
                    if (x % 3 == 0) {
                        x = x / 3;
                    }
                    return x;
                })
                .reduce((a, e) -> a + e)
                .getAsInt();

//        System.out.println(result);

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);

        Stream<Integer> stream3 = Stream.concat(stream2,stream1 );
        stream3.forEach(System.out::println);
    }

}
