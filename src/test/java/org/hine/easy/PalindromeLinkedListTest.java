package org.hine.easy;

import org.hine.easy.linkedList.PalindromeLinkedList;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeLinkedListTest {

    @Test
    void testPalindromeLinkedList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean expected = true;

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(2)));
        boolean expected2 = false;

        assertEquals(expected, new PalindromeLinkedList().palindromeLinkedList(head));
        assertEquals(expected2, new PalindromeLinkedList().palindromeLinkedList(head2));
    }
}