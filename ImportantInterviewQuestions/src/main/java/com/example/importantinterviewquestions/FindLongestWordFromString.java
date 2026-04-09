package com.example.importantinterviewquestions;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindLongestWordFromString {
    void main() {
        String input = "java is very good programming language";
        String longestWordSequence = Stream.of(input.split(" ")).max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestWordSequence);
    }
}
