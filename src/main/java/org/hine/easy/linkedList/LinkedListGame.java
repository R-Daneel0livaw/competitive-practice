package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

public class LinkedListGame {

    public String linkedListGame(ListNode head) {
        ListNode even = head;
        var evenPoints = 0; var oddPoints = 0;
        while (even != null) {
            ListNode odd = even.next;
            if (even.val > odd.val) evenPoints++;
            else oddPoints++;
            even = odd.next;
        }
        if (oddPoints > evenPoints) return "Odd";
        else if (evenPoints > oddPoints) return "Even";
        else return "Tie";
    }
}
