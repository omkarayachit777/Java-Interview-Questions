package com.example.importantinterviewquestions;

import java.util.stream.Collectors;

public class StringReverseKeepingLengthSame {
    void main(){
        // input = "I Am Not a String";
        // output = "g ni rtS a toNmAI"

        String input = "I Am Not a String";
        String reverse = new StringBuffer(input.replace(" ", "")).reverse().toString();
        int arr[] = {0};

        String result = input.chars().mapToObj(a -> {
            if(a == ' ') return " ";
            return String.valueOf(reverse.charAt(arr[0]++));
        }).collect(Collectors.joining());
        System.out.println(result);
    }
}
