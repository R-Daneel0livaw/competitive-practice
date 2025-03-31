package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteNodesTest {

    private ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testDeleteNodes() {
        DeleteNodes solution = new DeleteNodes();

        ListNode head1 = arrayToList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNode result1 = solution.deleteNodes(head1, 2, 2);
        assertArrayEquals(new int[]{1, 2, 5, 6, 9}, listToArray(result1));

        ListNode head2 = arrayToList(new int[]{1, 2, 3});
        ListNode result2 = solution.deleteNodes(head2, 2, 2);
        assertArrayEquals(new int[]{1, 2}, listToArray(result2));

        ListNode head3 = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result3 = solution.deleteNodes(head3, 2, 0);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, listToArray(result3));
    }
}
