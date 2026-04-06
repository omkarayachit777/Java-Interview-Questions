package com.example.importantinterviewquestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {
    void main() {
        String s = "Omkar Ayachit";

        // way 1
        String reverseWay1 = s.chars().mapToObj(a -> (char) a).reduce("", (start, end) -> end + start, (s1, s2) -> s1 + s2);
        System.out.println(reverseWay1);

        // way 2
        String reverseWay2 = Arrays.stream(s.split("")).reduce("", (start, end) -> end + start);
        System.out.println(reverseWay2);

        // way 3
        String reverseWay3 = Stream.of(s.split("")).reduce("", (start, end) -> end + start);
        System.out.println(reverseWay3);

        // way 4
        String reverseWay4 = new StringBuffer(s.toString()).reverse().toString();
        System.out.println(reverseWay4);
    }
}
