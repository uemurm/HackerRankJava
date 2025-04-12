package com.rock.yacht.techbeamers;

// Reverse a number without StringBuilder.reverse().
public class A03a_ReverseNumberByCalc {

    @SuppressWarnings("ReassignedVariable")
    public long reverseDigits(long n) {
        long ret = 0;

        while (n != 0) {
            long leastSignificantDigit = n % 10;
            ret = ret * 10 + leastSignificantDigit;
            n /= 10;
        }

        return  ret;
    }

    public static void main(String[] args) {
        long longNum = 654321;
        A03a_ReverseNumberByCalc input = new A03a_ReverseNumberByCalc();

        System.out.println("Input value : " + longNum);
        System.out.println("Inverted value : " + input.reverseDigits(longNum));
    }
}