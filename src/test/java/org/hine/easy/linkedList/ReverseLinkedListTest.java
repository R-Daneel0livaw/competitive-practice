package org.hine.easy.linkedList;

import org.hine.easy.linkedList.ReverseLinkedList;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {

    @Test
    void testReverseLinkedList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        ListNode actual = new ReverseLinkedList().reverseLinkedList(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
    }
}
