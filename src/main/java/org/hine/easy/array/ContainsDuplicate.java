package org.hine.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>(arr.length);
        for (int num : arr) {
           if(set.contains(num)) return true;
           set.add(num);
        }
        return false;
    }
}