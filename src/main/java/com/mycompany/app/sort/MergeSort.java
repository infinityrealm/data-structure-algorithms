package com.mycompany.app.sort;

import java.util.Arrays;

/**
 * MergeSort with O(nLogn) Runtime
 */
public class MergeSort {
    public static int[] sort(int[] numbers){
        System.out.println("Received input: " + Arrays.toString(numbers));

        recursiveSort(numbers, 0, numbers.length - 1);

        System.out.println("Output after MergeSort: " + Arrays.toString(numbers));
        return numbers;
    }

    private static void recursiveSort(int[] arr, int l, int r){
        if (l < r)
        {
            //Formula to get middle index: firstIndex + (lastIndex-firstIndex)/2
            int m = l + (r - l)/2;

            // Sort first and second halves
            recursiveSort(arr, l, m);
            recursiveSort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int firstHalfLength = m - l + 1;
        int secondHalfLength = r - m;

        int[] L = new int[firstHalfLength];
        int[] R = new int[secondHalfLength];

        // Copy data to temp arrays
        for(int i = 0; i < firstHalfLength; i++){
            L[i] = arr[l + i];
        }
        for(int i = 0; i < secondHalfLength; i++){
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;

        // Initial index of merged array
        int k = l;

        while(i < firstHalfLength && j < secondHalfLength){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of subarray if any */
        while (i < firstHalfLength){
            arr[k] = L[i];
            k++;
            i++;
        }

        while (j < secondHalfLength){
            arr[k] = R[j];
            k++;
            j++;
        }
    }

}