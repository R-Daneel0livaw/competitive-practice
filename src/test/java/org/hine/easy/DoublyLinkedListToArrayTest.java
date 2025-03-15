package org.hine.easy;

import org.hine.easy.doublyLinkedList.DoublyLinkedListToArray;
import org.hine.easy.util.DoublyListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DoublyLinkedListToArrayTest {

    @Test
    void testDoublyLinkedListToArray() {
        DoublyListNode head = createDoublyList(new int[]{1, 2, 3, 4, 3, 2, 1});
        int[] expected = {1, 2, 3, 4, 3, 2, 1};
        int[] actual = new DoublyLinkedListToArray().doublyLinkedListToArray(head);
        assertArrayEquals(expected, actual);
    }

    private DoublyListNode createDoublyList(int[] values) {
        if (values == null || values.length == 0) return null;

        DoublyListNode head = new DoublyListNode(values[0]);
        DoublyListNode current = head;

        for (int i = 1; i < values.length; i++) {
            DoublyListNode newNode = new DoublyListNode(values[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        return head;
    }
}
