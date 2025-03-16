package org.hine.easy;

import org.hine.easy.linkedList.RemoveDuplicatesLinkedList;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesLinkedListTest {

    @Test
    void testRemoveDuplicatesLinkedList() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = new RemoveDuplicatesLinkedList().removeDuplicatesLinkedList(head);

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
    }
}