package org.hine.easy;

import org.hine.easy.util.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeLinkedListElements(ListNode head, int num) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode prev = temp;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == num) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return temp.next;
    }
}