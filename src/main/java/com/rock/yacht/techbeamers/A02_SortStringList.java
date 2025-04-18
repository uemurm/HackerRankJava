package com.rock.yacht.techbeamers;

import java.util.Arrays;

// Write code to sort the list of strings without using Java collection.
public class A02_SortStringList {
    public static void main(String[] args) {
        String[] inputList = {
                // Note some are in lowercase.
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "aug", "Sep", "Oct", "nov", "Dec"
        };

        System.out.println("---- Input List ----");
        showList(inputList);

        System.out.println("---- Sorted List in case-sensitive ----");
        Arrays.sort(inputList);
        showList(inputList);

        System.out.println("---- Sorted List in case-insensitive ----");
        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
        showList(inputList);
    }

    public static void showList(String[] array) {
        for (String str: array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
