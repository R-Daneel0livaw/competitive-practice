package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : nums2) {
            while (!stack.isEmpty() && j > stack.peek()) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        var res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
