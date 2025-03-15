package org.hine.easy;

import org.hine.easy.linkedList.LinkedListCycle;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {

    @Test
    void testLinkedListCycleTest() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2, new ListNode(3, new ListNode(4, head)));
        boolean expected = true;

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        boolean expected2 = false;

        assertEquals(expected, new LinkedListCycle().linkedListCycle(head));
        assertEquals(expected2, new LinkedListCycle().linkedListCycle(head2));
    }
}