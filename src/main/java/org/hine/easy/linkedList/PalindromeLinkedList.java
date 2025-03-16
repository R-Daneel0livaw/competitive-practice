package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

public class PalindromeLinkedList {

    ListNode p;

    public boolean palindromeLinkedList(ListNode head) {
        p = head;
        return recursivelyCheck(head);
    }

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != p.val) return false;
            p = p.next;
        }
        return true;
    }
}