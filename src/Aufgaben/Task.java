package Aufgaben;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        int[] originalArray = {1,1,2};

        System.out.println(removeDuplicates(originalArray));


    }


    public static int removeDuplicates(int[] nums) {
        return (int)Arrays.stream(nums).distinct().count();
    }
}
