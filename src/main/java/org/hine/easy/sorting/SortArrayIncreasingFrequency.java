package org.hine.easy.sorting;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortArrayIncreasingFrequency {

    public int[] sortArrayIncreasingFrequency(int[] nums) {
        Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(
                Collectors.groupingBy(num -> num, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        return Arrays.stream(nums).boxed()
                .sorted((a, b) -> !Objects.equals(map.get(a), map.get(b)) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }
}