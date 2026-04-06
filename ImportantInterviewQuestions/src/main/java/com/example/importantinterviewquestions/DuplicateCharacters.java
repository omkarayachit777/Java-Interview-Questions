package com.example.importantinterviewquestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    void main() {
        // calculate duplicate characters from given string
        // eg. input = "Java is very popular language"
        // here a comes 5 times, g 2 times, l 2 times like that..

        String input = "Java is very popular language";
        Map<Character, Long> duplicateMap = input.chars().filter(a -> a != ' ').mapToObj(a -> (char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateMap);
    }
}
