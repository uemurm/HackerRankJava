package com.rock.yacht;

import java.util.Scanner;

public class A10_SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int idx = 0; idx < n; idx++) {
            array[idx] = scanner.nextInt();
        }

        int negativeCount = 0;
        for (int subArrayLength = 1; subArrayLength <= n; subArrayLength++) {
            for (int startIdx = 0; startIdx <= n - subArrayLength ; startIdx++) {
                int sum = 0;
                for (int i = 0; i < subArrayLength; i++) {
                    sum += array[startIdx + i];
                }
//                System.out.println("(subArrayLength, startIdx): (" + subArrayLength + ", " + startIdx + ") => " + sum);
                if (sum < 0) {
                    negativeCount++;
                }
            }

        }

        System.out.println(negativeCount);
    }
}
