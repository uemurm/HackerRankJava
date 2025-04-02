package com.rock.yacht;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class A04_Instanceof {
    public static void main(String[] args) {
        // String filePath = "src/A04_Instanceof.input";
        List<String> lines = new ArrayList<>();

        // Read in from stdin instead of file
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();

        ArrayList<Object> list = new ArrayList<>();
        for (String line : lines) {
            if (line.equals("Student")) {
                list.add(new Student());
            } else if (line.equals("Rockstar")) {
                list.add(new Rockstar());
            } else if (line.equals("Hacker")) {
                list.add(new Hacker());
            }
        }

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;
        for (Object object: list) {
            if (object instanceof Student) {
                studentCount++;
            } else if (object instanceof Rockstar) {
                rockstarCount++;
            } else if (object instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
    }
}