package org.hine.easy.sorting;

import java.util.TreeSet;

public class ThirdMaximumNumber {

    public int thirdMaximumNumber(int[] nums) {
        TreeSet<Integer> sortedNums = new TreeSet<>();

        for (int num : nums) {
            if (sortedNums.contains(num)) {
                continue;
            }

            if (sortedNums.size() == 3) {
                if (sortedNums.first() < num) {
                    sortedNums.pollFirst();
                    sortedNums.add(num);
                }
            } else {
                sortedNums.add(num);
            }
        }
        return sortedNums.size() == 3 ? sortedNums.first() : sortedNums.last();
    }
}