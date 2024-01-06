package com.LinkedList;

public class Operations {

    public static ListNode insertAtKthPosition(ListNode head, int data, int k) {
        if (k < 0 || k > length(head)) {
            System.out.println("k is not correct");
            return head;
        }

        if (k == 0) {
            ListNode node = new ListNode(data);
            node.setNext(head);
            head = node;
        } else {
            ListNode node = new ListNode(data);
            ListNode currNode = head;
            int count = 1;
            while (count < k) {
                currNode = currNode.getNext();
                count++;
            }
            node.setNext(currNode.getNext());
            currNode.setNext(node);
        }
        return head;
    }

    public static ListNode deleteAtKthPosition(ListNode head, int k) {
        if (k < 0 || k > length(head)) {
            System.out.println("k is not correct");
        }
        ListNode currNode = head;
        if (k == 0) {
            head = currNode.getNext();
        } else {
            int count = 1;
            while (count < k) {
                currNode = currNode.getNext();
                count++;
            }
            currNode.setNext(currNode.getNext().getNext()); // we can store nextNode in new ListNode then change point to NextNode
        }
        return head;
    }

    public static int midOfList(ListNode head) {
        int res = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            res = slow.getData();
        }
        return res;
    }

    public static boolean isLoop(ListNode head) { // 1-2-3-4-5-6
        if (head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static ListNode loopStart(ListNode head) {
        if (head == null)
            return null;

        boolean hasLoop = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if (!hasLoop) {
            System.out.println("LinkedList has no loop");
            return null;
        } else {
            ListNode left = head;
            ListNode right = slow;
            while (left != right) {
                left = left.getNext();
                right = right.getNext();
            }
            return right;
        }
    }

    public static int loopCount(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasLoop = false;

        while (fast != null || fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        if (!hasLoop) {
            System.out.println("No loop found");
            return 0;
        } else {
            ListNode start = slow.getNext();
            ListNode end = slow;
            int count = 1;
            while (start != end) {
                start = start.getNext();
                count++;
            }
            return count;
        }
    }

    public static int length(ListNode head) {
        if (head == null)
            return 0;
        int size = 0;
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;
    }
}
