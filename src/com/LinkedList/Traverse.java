package com.LinkedList;

public class Traverse {
    public static void traverse(ListNode head) {
        if (head == null)
            return;

        while (head != null) {
            System.out.print(head.getData() + " => ");
            head = head.getNext();
        }
        System.out.println("null");
    }
}
