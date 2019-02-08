package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
Binary search finds the position of a target value within a sorted array. Binary search compares
the target value to the middle element of the array. If they are not equal, the half in which
the target cannot lie is eliminated and the search continues on the remaining half, again taking
the middle element to compare to the target value, and repeating this until the target value is found.
If the search ends with the remaining half being empty, the target is not in the array.
*/

public class BinarySearch {

    private static int aimValue;

    public static void main(String[] args) {
        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
        System.out.println(Arrays.toString(ints));
        int findValue = 5;          // change findValue to: -1, 0, 1, 5, 9, 10 or random
        if (binarySearch(ints, findValue)) {
            if (aimValue == 0) {
                System.out.println("For value \"" + findValue + "\" key is " + aimValue
                        + ". It's the first array element");
            } else if (aimValue == (ints.length - 1)) {
                System.out.println("For value \"" + findValue + "\" key is " + aimValue
                        + ". It's the last array element");
            } else {
                System.out.println("For value \"" + findValue + "\" key is " + aimValue);
            }
        }
    }

    // Insertion sort or another one
    private static void sort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (ints[i] < ints[j]) {
                    temp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = temp;
                }
            }
        }
    }

    private static boolean binarySearch(int[] ints, int valueForSearch) {
        int startIndexForSearch = 0;
        int endIndexForSearch = ints.length - 1;
        while (startIndexForSearch <= endIndexForSearch) {

            // calculate key index - a middle index number
            // z = x + (y - x)/2
            int midIndexForSearch = startIndexForSearch + ((endIndexForSearch - startIndexForSearch) / 2);

            if (valueForSearch == ints[midIndexForSearch]) {
                aimValue = midIndexForSearch;
                return true;
            } else if (valueForSearch < ints[midIndexForSearch]) {
                endIndexForSearch = midIndexForSearch - 1;
            } else {
                startIndexForSearch = midIndexForSearch + 1;
            }
        }
        System.out.println("Can't find key for value " + valueForSearch);
        return false;
    }

}
