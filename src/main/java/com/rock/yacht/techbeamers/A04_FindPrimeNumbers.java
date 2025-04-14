package com.rock.yacht.techbeamers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A04_FindPrimeNumbers {
    static public Boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings(value = "ReassignedVariable")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = null;

        while (input == null) {
            System.out.print("Enter an int value: ");

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please input integer value.");
                scanner.next();
            }
        }
        System.out.print("Input value, " + input);

        if (isPrime(input)) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println(" is not a prime number.");
        }
    }
}
