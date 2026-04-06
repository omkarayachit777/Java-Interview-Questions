package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupWordsStartsWithM {
    void main() {
        // Group words starting with m in one group and words not starting with m in other group
        String s = "Today movie is released whose name is mission impossible";

        // way 1
        Map<String, List<String>> groupedWords = Arrays.stream(s.split("\\s+")).collect(Collectors.groupingBy(a -> a.toLowerCase().startsWith("m") ? "M-Group" : "Other"));
        System.out.println(groupedWords);

        // way 2
        Map<String, List<String>> groupedWords1 = Stream.of(s.split("\\s+")).collect(Collectors.groupingBy(a -> a.toLowerCase().startsWith("m") ? "M-Group" : "Other"));
        System.out.println(groupedWords1);
    }
}
