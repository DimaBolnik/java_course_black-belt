package Aufgaben;


import java.util.HashSet;

public class Task {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

//        System.out.println(strStr(haystack, needle));


    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while (result.next != null) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            }else {
                result = result.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
