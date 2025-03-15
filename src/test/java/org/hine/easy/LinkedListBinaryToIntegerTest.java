package org.hine.easy;

import org.hine.easy.linkedList.LinkedListBinaryToInteger;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListBinaryToIntegerTest {

    @Test
    void testLinkedListBinaryToInteger() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int expected = 5;

        assertEquals(expected, new LinkedListBinaryToInteger().linkedListBinaryToInteger(head));
    }
}