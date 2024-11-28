package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5,8,4,8,1,2};
        Arrays.stream(arr).forEach(Utils::myMethod);
    }
}


class Utils {
    public static void myMethod(int a) {
        a +=5;
        System.out.println(a);
    }
}