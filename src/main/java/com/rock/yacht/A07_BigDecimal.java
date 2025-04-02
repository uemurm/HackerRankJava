package com.rock.yacht;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A07_BigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        scanner.close();

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null && s2 == null) return 0;
                if (s1 == null) return 1;
                if (s2 == null) return -1;

                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);

                return bd2.compareTo(bd1);
            }
        });

        for (String string : s) {
            System.out.println(string);
        }
    }
}
