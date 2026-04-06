package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberFromArray {
    void main() {
        // Find out missing numbers from the given array..
        // input = {1,3,5,8,2,5,10}
        // output = 4,6,7,9

        int arr[] = {1, 3, 5, 8, 2, 5, 10};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> missingNumbers = IntStream.rangeClosed(min, max).boxed().filter(a -> !set.contains(a)).toList();
        System.out.println(missingNumbers);
    }
}
