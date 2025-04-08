package com.rock.yacht;

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}";
}

public class A12_ValidUserName {
    static private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- != 0) {
            String userName = scanner.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
