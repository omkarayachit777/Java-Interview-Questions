package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateVowels {
    void main() {
        // calculate vowels from the given String
        String s = "Today is Monday";

        // way-1
        List<Character> vowelsCharacters = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Map<Character, Long> vowelsCharactersList = s.chars().mapToObj(a -> (char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> vowelsCharacters.contains(a.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(vowelsCharactersList);

        // way-2
        List<String> vowelsStrings = List.of("a", "e", "i", "o", "u");
        List<Map.Entry<String, Long>> vowelsStringList = Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> vowelsStrings.contains(a.getKey())).toList();
        System.out.println(vowelsStringList);
    }
}
