package com.example.importantinterviewquestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringWithNumberOfTimesOcurrences {
    void main() {
        // input = p3c2a2b1c5a9p2
        // output = pppccaabcccccaaaaaaaaapp

        // way-1
        String input = "p3c2a2b1c5a9p2";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i = i + 2) {
            char c = input.charAt(i);
            int count = input.charAt(i +1) - '0';
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        System.out.println(sb);


        // way-2
        String formedString = IntStream.range(0, input.length()/2).mapToObj(a -> {
            char c = input.charAt(a*2);
            int count  = Character.getNumericValue(input.charAt(a*2+1));
            return String.valueOf(c).repeat(count);
        }).collect(Collectors.joining());
        System.out.println(formedString);
    }
}
