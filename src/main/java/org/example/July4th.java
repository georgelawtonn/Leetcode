package org.example;

public class July4th {
    public ListNode mergeNodes(ListNode head) {
        if (head.val == 0) {
            head = head.next;
        }
        int sum = 0;
        while (head.val != 0) {
            sum += head.val;
            head = head.next;
        }
        head = head.next;
        if (head == null) {
            return new ListNode(sum);
        }
        else {
            return new ListNode(sum, mergeNodes(head));
        }
    }
}
