package org.hine.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

    public List<List<Integer>> minAbsDifference(int[] arr) {
        Arrays.sort(arr);
        var minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            var currDiff = arr[i + 1] - arr[i];
            if (currDiff == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (currDiff < minDiff) {
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
                minDiff = currDiff;
            }
        }
        return ans;
    }
}
