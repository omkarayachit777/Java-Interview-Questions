package com.example.importantinterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcessZerosToLast {
    void main() {
        // Input - {1,2,0,4,3,0,5,0,9}
        // Output - {1,2,4,3,5,9,0,0,0}

        int input[] = {1, 2, 0, 4, 3, 0, 5, 0, 9};

        //way 1
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                l1.add(input[i]);
            } else {
                l2.add(input[i]);
            }
        }
        l1.addAll(l2);
        System.out.println(l1);


        //way 2
        List<Integer> processed = Stream.concat(Arrays.stream(input).boxed().filter(a -> a != 0), Arrays.stream(input).boxed().filter(a -> a == 0)).toList();
        System.out.println(processed);

//        NOTE = If array is given use Arrays.stream and do boxing manually..if it is list<Integer> then list.stream().filter(..) will directly work

        List<Integer> integerList = List.of(1, 2, 0, 4, 3, 0, 5, 0, 9);
        List<Integer> processedInts = Stream.concat(integerList.stream().filter(a -> a != 0), integerList.stream().filter(a -> a == 0)).toList();
        System.out.println(processedInts);

    }
}