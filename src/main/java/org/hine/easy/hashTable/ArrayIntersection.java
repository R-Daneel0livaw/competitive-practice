package org.hine.easy.hashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public int[] arrayIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);
        return Arrays.stream(set1.toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();
    }
}