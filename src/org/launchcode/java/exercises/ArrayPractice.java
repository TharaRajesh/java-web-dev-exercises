package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int intArr[] = {1, 1, 2, 3, 5, 8};
        for (int number : intArr) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
        String str=" I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = str.split(" ");//splits the string based on whitespace
              System.out.println(Arrays.toString(words));

    }
}