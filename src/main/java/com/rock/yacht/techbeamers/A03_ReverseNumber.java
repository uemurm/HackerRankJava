package com.rock.yacht.techbeamers;

public class A03_ReverseNumber {

    public long reverseDigits(long n) {
        StringBuilder reversedStr = new StringBuilder(String.valueOf(n)).reverse();
        return Long.parseLong(reversedStr.toString());
    }

    public static void main(String[] args) {
        long longNum = 654321;
        A03_ReverseNumber input = new A03_ReverseNumber();

        System.out.println("Input value : " + longNum);
        System.out.println("Inverted value : " + input.reverseDigits(longNum));
    }
}