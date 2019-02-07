package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
The selection algorithm is finding the minimum (or maximum) element in the unsorted list by iterating
through it and then exchanging that element with the leftmost unsorted element (putting it in sorted order)
and moving the sublist boundaries one element to the right.
Computational complexity - O(n^{2}
*/

public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
    }

    private static void sort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            int min = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                int temp;
                if (min > ints[j]) {
                    min = ints[j];
                    temp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}
