package com.example.importantinterviewquestions;

import java.util.Comparator;
import java.util.List;

public class SumOfMaxTwoNumbers {
    void main() {
        // input = [1,6,0,2,8,3,15,4,20,11]
        // output = 35

        List<Integer> input = List.of(1, 6, 0, 2, 8, 3, 15, 4, 20, 11);
        Integer sumOfMaxTwo = input.stream().sorted(Comparator.reverseOrder()).limit(2).reduce(0, Integer::sum);
        // reduce(0, Integer::sum) -- starting from 0 Sum will be added to this number as step by step forwards for Integer's sum method..
        // if it could be 3 eg. reduce(3, Integer:sum) then o/p would be 3+35 =38
        System.out.println(sumOfMaxTwo);
    }
}
