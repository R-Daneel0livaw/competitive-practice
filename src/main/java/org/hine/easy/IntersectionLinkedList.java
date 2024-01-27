package org.hine.easy;

import org.hine.easy.util.ListNode;

public class IntersectionLinkedList {

    public ListNode intersectionLinkedList(ListNode head1, ListNode head2) {
        ListNode pA = head1;
        ListNode pB = head2;

        while (pA != pB) {
            pA = pA == null ? head2 : pA.next;
            pB = pB == null ? head1 : pB.next;
        }
        return pA;
    }
}