package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

public class LinkedListMiddle {

    public ListNode linkedListMiddle(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}