package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListFrequency {

    public ListNode linkedListFrequency(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode current = head;
        ListNode freq = null;

        while (current != null) {
            if (map.containsKey(current.val)) {
                ListNode f = map.get(current.val);
                f.val++;
            } else {
                ListNode f = new ListNode(1, freq);
                map.put(current.val, f);
                freq = f;
            }
            current = current.next;
        }
        return freq;
    }
}
