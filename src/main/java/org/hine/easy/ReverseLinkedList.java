package org.hine.easy;

import org.hine.easy.util.ListNode;

public class ReverseLinkedList {

    public ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null) {
           return head;
        }

        ListNode p = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}