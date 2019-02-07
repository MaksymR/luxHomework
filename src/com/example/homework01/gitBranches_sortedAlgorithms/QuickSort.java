package com.example.homework01.gitBranches_sortedAlgorithms;

import java.util.Arrays;

/*
Quick sort is a divide and conquer algorithm. Quick sort first divides a large tempArrayForSorting into
two smaller sub-arrays: the low elements and the high elements. Quick sort can then recursively sort
the sub-arrays.
Computational complexity - O(n·log n)
*/

public class QuickSort {

    private static int[] tempArrayForSorting;

    public static void main(String[] args) {

        int[] ints = {7, 3, 5, 1, 9, 4, 8};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void sort(int[] ints) {

        // if an array hasn't got any elements then go out from sort()-method
        if (ints == null || ints.length == 0) {
            return;
        }
        tempArrayForSorting = ints;
        quickSortTempArray(0, ints.length - 1);
    }

    private static void quickSortTempArray(int lowerIndex, int higherIndex) {

        int lowIndexForTempArray = lowerIndex;
        int highIndexForTempArray = higherIndex;

        // calculate key index - a middle index number
        int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

        int tempValueForSorting = tempArrayForSorting[midIndex];

        // Divide into two arrays
        while (lowIndexForTempArray <= highIndexForTempArray) {
            while (tempArrayForSorting[lowIndexForTempArray] < tempValueForSorting) {
                lowIndexForTempArray++;
            }
            while (tempArrayForSorting[highIndexForTempArray] > tempValueForSorting) {
                highIndexForTempArray--;
            }
            if (lowIndexForTempArray <= highIndexForTempArray) {
                exchangeNumbers(lowIndexForTempArray, highIndexForTempArray);
                //move index to next position on both sides
                lowIndexForTempArray++;
                highIndexForTempArray--;
            }
        }
        // call quickSortTempArray() method recursively
        if (lowerIndex < highIndexForTempArray)
            quickSortTempArray(lowerIndex, highIndexForTempArray);
        if (lowIndexForTempArray < higherIndex)
            quickSortTempArray(lowIndexForTempArray, higherIndex);
    }

    private static void exchangeNumbers(int lowerIndex, int higherIndex) {
        int temp = tempArrayForSorting[lowerIndex];
        tempArrayForSorting[lowerIndex] = tempArrayForSorting[higherIndex];
        tempArrayForSorting[higherIndex] = temp;
    }
}
