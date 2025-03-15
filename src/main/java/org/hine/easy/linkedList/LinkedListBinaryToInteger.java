package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

public class LinkedListBinaryToInteger {

    public int linkedListBinaryToInteger(ListNode head) {
        int num = head.val;

        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;
        }
        return num;
    }
}