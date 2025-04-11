package com.rock.yacht.techbeamers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write code to sort the list of strings without using Java collection.
public class A02a_SortStringListUsingCollection {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>(Arrays.asList(
                // Note some are in lowercase.
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "aug", "Sep", "Oct", "nov", "Dec"
        ));

        System.out.println("---- Input List ----");
        showList(inputList);

        System.out.println("---- Sorted List in case-sensitive ----");
        inputList.sort(String::compareTo);
        showList(inputList);

        System.out.println("---- Sorted List in case-insensitive ----");
        inputList.sort(String::compareToIgnoreCase);
        showList(inputList);
    }

    public static void showList(List<String> array) {
        for (String str: array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
