package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location
it belongs within the sorted list and inserts it there. It repeats until no input elements remain.
Computational complexity - O(n^{2}
*/

public class InsertionSort {

    public static void main(String[] args) {
        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
    }

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
        System.out.println(Arrays.toString(ints));
    }

}
