package com.example.importantinterviewquestions;

import java.util.stream.IntStream;

public class PalindromeString {
    void main() {
        // palindrome string are - madam, kayak
        String input = "kayak";

        // way-1
        // writing a new method reverseString that will return reversed string and
        // with input we will match whether it is palindrome or not
        String reversedString = reverseString(input);
        System.out.println("Reversed String " + reversedString);
        if (input.equals(reversedString)) {
            System.out.println(input + " is palindrome String..");
        } else {
            System.out.println(input + " is not a palindrome String..");
        }

        // way-2
        // Using stream api
        boolean flag = IntStream.range(0, input.length()).allMatch(a -> input.charAt(a) == input.charAt(input.length() - a - 1));
        System.out.println(flag);
        if (flag) {
            System.out.println(input + " is palindrome String..");
        } else {
            System.out.println(input + " is not a palindrome String..");
        }
    }

    private String reverseString(String input) {
        return input.chars().mapToObj(a -> (char) a).reduce("", (start, end) -> end + start, (s1, s2) -> s1 + s2);
    }
}
