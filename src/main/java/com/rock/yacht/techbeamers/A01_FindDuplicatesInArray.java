package com.rock.yacht.techbeamers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// cf. https://techbeamers.com/java-coding-questions-software-testers/
// Write code to filter duplicate elements from an array and print as a list.
public class A01_FindDuplicatesInArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Form a list of numbers from 0-9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // Insert a new set of numbers from 0-4.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Input list : " + list);
        System.out.println("\nFiltered duplicates : " + processList(list));
    }

    public static Set<String> processList(List<String> listContainingDuplicates) {
        // Set はインターフェースであるのに対して、HashSet はそれを実装したものの一つ。
        // TreeSet や LinkedHashSet などの実装を使って問題を解くこともできるが、HashSet が速く動作する。
        // HashSet でも良さそうだが Set に代入したのは、Set ならどんな実装でも問題は解決できるため、抽象化した。
        // これはデザイン・パターンのひとつ、ポリモーフィズムを活用している。
        Set<String> resultSet = new HashSet<>();
        Set<String> tmpSet = new HashSet<>();

        for (String intStr: listContainingDuplicates) {
            if (!tmpSet.add(intStr)) {
                resultSet.add(intStr);
            }
        }

        return resultSet;
    }
}
