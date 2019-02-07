package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
Merge sort is a divide and conquer algorithm. Divide and conquer is an algorithm design paradigm based
on multi-branched recursion. A divide-and-conquer algorithm works by recursively breaking down a problem
into two or more sub-problems of the same or related type, until these become simple enough to be solved
directly. The solutions to the sub-problems are then combined to give a solution to the original problem.
Computational complexity - O(n·log n)
*/

public class MergeSort {

    private static int[] sortedArray;
    private static int[] tempArrayForMerge;

    public static void main(String[] args) {

        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static void sort(int[] ints) {
        sortedArray = ints;
        tempArrayForMerge = new int[ints.length];
        sortHalfOfArray(0, ints.length - 1);
    }

    private static void sortHalfOfArray(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middleIndexForSorting = lowerIndex + (higherIndex - lowerIndex) / 2;

            // sorts the left side of the sortedArray
            sortHalfOfArray(lowerIndex, middleIndexForSorting);

            // sorts the right side of the sortedArray
            sortHalfOfArray(middleIndexForSorting + 1, higherIndex);

            // merge both sides
            mergeHalfSortedArray(lowerIndex, middleIndexForSorting, higherIndex);
        }
    }

    private static void mergeHalfSortedArray(int lowerIndexArg, int middleIndexForSortingArg, int higherIndexArg) {

        for (int i = lowerIndexArg; i <= higherIndexArg; i++) {
            tempArrayForMerge[i] = sortedArray[i];
        }
        int lowIndxForTempArray = lowerIndexArg;
        int midIndxForTempArray = middleIndexForSortingArg + 1;
        int lowIndxForSortedArray = lowerIndexArg;
        while (lowIndxForTempArray <= middleIndexForSortingArg && midIndxForTempArray <= higherIndexArg) {
            if (tempArrayForMerge[lowIndxForTempArray] <= tempArrayForMerge[midIndxForTempArray]) {
                sortedArray[lowIndxForSortedArray] = tempArrayForMerge[lowIndxForTempArray];
                lowIndxForTempArray++;
            } else {
                sortedArray[lowIndxForSortedArray] = tempArrayForMerge[midIndxForTempArray];
                midIndxForTempArray++;
            }
            lowIndxForSortedArray++;
        }
        while (lowIndxForTempArray <= middleIndexForSortingArg) {
            sortedArray[lowIndxForSortedArray] = tempArrayForMerge[lowIndxForTempArray];
            lowIndxForSortedArray++;
            lowIndxForTempArray++;
        }

    }

}
