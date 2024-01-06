package com.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        Traverse.traverse(head);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node2);

        boolean isLoop = Operations.isLoop(head);
        System.out.println(isLoop);

        int loopCount = Operations.loopCount(head);
        System.out.println(loopCount);

        ListNode startLoop = Operations.loopStart(head);
        System.out.println(startLoop.getData());

        int midList = Operations.midOfList(head);
        System.out.println(midList);

        Traverse.traverse(head);
        System.out.println("Length of LinkedList is : " + Operations.length(head));

        ListNode newHead = Operations.insertAtKthPosition(head, 16, 0);
        ListNode newNode = Operations.insertAtKthPosition(newHead, 12, 1);
        Traverse.traverse(newNode);

        System.out.println("After Deletion *********************");
        ListNode deleteNode = Operations.deleteAtKthPosition(newNode, 0);
        Traverse.traverse(deleteNode);

        ListNode deleteNode2 = Operations.deleteAtKthPosition(deleteNode, 3);
        Traverse.traverse(deleteNode2);
    }
}
