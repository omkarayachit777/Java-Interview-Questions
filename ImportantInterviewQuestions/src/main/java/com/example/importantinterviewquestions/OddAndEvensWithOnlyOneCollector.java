package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEvensWithOnlyOneCollector {
    void main() {
        // Find out odd and even numbers but using Collectors only once
        // input = [1,2,3,4,5,6,7,8,9,10]

        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> map = input.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
        List<Integer> oddNumbers = map.get(true);
        List<Integer> evenNumbers = map.get(false);

        System.out.println("Odd Numbers = " + oddNumbers);
        System.out.println("Even Numbers = " + evenNumbers);
    }
}
