package com.LinkedList;

public class LinkedListWithRandomPointer {
    private int data;
    private LinkedListWithRandomPointer next;
    private int random;

    public LinkedListWithRandomPointer(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListWithRandomPointer getNext() {
        return next;
    }

    public void setNext(LinkedListWithRandomPointer next) {
        this.next = next;
    }

    public int getRandom() {
        return this.random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public static LinkedListWithRandomPointer cloneLinkedList(LinkedListWithRandomPointer head) {
        LinkedListWithRandomPointer current = head;
        while (head.getNext() != null) {
            head = head.getNext();
            head.setNext(head);
        }
        return current;
    }

    public static void main(String[] args) {
        LinkedListWithRandomPointer head = new LinkedListWithRandomPointer(1);
        LinkedListWithRandomPointer node1 = new LinkedListWithRandomPointer(2);
        LinkedListWithRandomPointer node2 = new LinkedListWithRandomPointer(3);
        LinkedListWithRandomPointer node3 = new LinkedListWithRandomPointer(4);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // added random pointer
        head.setRandom(node2.getData());
        node1.setRandom(head.getData());
        node2.setRandom(node3.getData());
        node3.setRandom(node1.getData());

        System.out.println("Original LinkedList ********");
        Traverse.traverse(head);

        System.out.println("Clone LinkedList *********");
        LinkedListWithRandomPointer clone = cloneLinkedList(head);
        Traverse.traverse(clone);

    }
}