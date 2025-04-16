package com.rock.yacht.techbeamers;

public class A05_FindFirstTwoMaxValues {
    @SuppressWarnings(value = "ReassignedVariable")
    public void GetTwoMaxValues(int[] numbers) {
        int largest;
        int larger;
        
        if (numbers[0] >= numbers[1]) {
            largest = numbers[0];
            larger  = numbers[1];
        } else {
            largest = numbers[1];
            larger  = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                larger = largest;
                largest = numbers[i];
            } else if (numbers[i] > larger) {
                larger = numbers[i];
            }
        }

        System.out.println("Largest value: " + largest);
        System.out.println("Larger value: " + larger);
    }

    public static void main(String[] args) {
        int[] list = {
                15, 24, 48, 21,
                43, 11, 79, 93
        };

        A05_FindFirstTwoMaxValues max = new A05_FindFirstTwoMaxValues();
        max.GetTwoMaxValues(list);
    }
}
