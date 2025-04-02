package com.rock.yacht;

import java.math.BigInteger;
import java.util.Scanner;

class A06_BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
