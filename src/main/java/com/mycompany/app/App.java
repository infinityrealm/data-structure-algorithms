package com.mycompany.app;

import com.mycompany.app.search.BinarySearch;
import com.mycompany.app.sort.InsertionSort;
import com.mycompany.app.sort.MergeSort;

import java.io.IOException;

/**
 * Main class
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        int[] arr = Generator.generateRandomIntArray(20, 500);
        InsertionSort.sort(arr);

        arr = Generator.generateRandomIntArray(20, 500);
        arr[10] = 250;
        MergeSort.sort(arr);

        System.out.println("result: " + BinarySearch.search(arr,251));

        System.in.read();
    }
}
