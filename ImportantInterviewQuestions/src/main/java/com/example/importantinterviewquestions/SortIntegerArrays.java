package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortIntegerArrays {
    void main() {
        // sort these two arrays
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 10};
        int result[] = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
