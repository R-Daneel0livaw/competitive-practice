package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

public class DeleteNodes {

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode lastMod = head;
        while (current != null) {
            var mCount = m; var nCount = n;
            while (current != null && mCount != 0) {
                lastMod = current;
                current = current.next;
                mCount--;
            }
            while (current != null && nCount != 0) {
                current = current.next;
                nCount--;
            }
            lastMod.next = current;
        }
        return head;
    }
}
