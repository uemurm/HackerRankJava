package com.rock.yacht.techbeamers;

import java.util.StringTokenizer;

public class A07_RemoveMultipleSpaces {
    public static void main(String[] args) {
        String input = "Try    to    remove   extra   spaces.";
        StringTokenizer subStr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();

        // Tokenizer works like an iterator for a list of words split by more than one whitespaces.
        while (subStr.hasMoreElements()) {
            sb.append(subStr.nextElement()).append(" ");
        }

        System.out.println(input);
        System.out.println(sb);
    }
}
