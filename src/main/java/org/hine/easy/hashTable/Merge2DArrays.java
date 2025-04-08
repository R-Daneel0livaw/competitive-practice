package org.hine.easy.hashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Merge2DArrays {

    public int[][] merge2DArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (var nums : nums1) {
            map.put(nums[0], nums[1]);
        }

        for (var nums : nums2) {
            map.put(nums[0], map.getOrDefault(nums[0], 0) + nums[1]);
        }

        List<int[]> merged = new ArrayList<>();
        for (var entry : map.entrySet()) {
            merged.add(new int[] {entry.getKey(), entry.getValue()});
        }

        var mergedArray = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            mergedArray[i] = merged.get(i);
        }
        return mergedArray;
    }
}
