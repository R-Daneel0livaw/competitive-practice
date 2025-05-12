package org.hine.easy.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection2 {

    public int[] arrayIntersection2(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return arrayIntersection2(nums2, nums1);
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        var k = 0;
        for (var num : nums2) {
            var count = map.getOrDefault(num, 0);
            if (count > 0) {
                nums1[k++] = num;
                map.put(num, count - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
