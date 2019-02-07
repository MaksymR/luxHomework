package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
compares adjacent pairs and swaps them if they are in the wrong order. The pass
through the list is repeated until the list is sorted.
Computational complexity - O(n^{2}
*/

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
    }

    private static void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < (ints.length - 1) - i; j++) {   // last element has got a max value after external
                // iteration
                int temp;
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ints));

    }

}
