package com.rock.yacht;

import java.util.ArrayList;
import java.util.Scanner;

public class A11_ArrayList {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        var arrays = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            var array = new ArrayList<Integer>();

            for (int j = 0; j < d; j++) {
                array.add(scanner.nextInt());
            }
            arrays.add(array);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            var element = new StringBuilder();
            try {
                element.append(arrays.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                element.append("ERROR!");
            }
            System.out.println(element);
        }
    }
}
