package com.rock.yacht;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A08_PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();

        String result = new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime";
        System.out.println(result);
    }
}
