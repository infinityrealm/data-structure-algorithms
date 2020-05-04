package com.mycompany.app.sort;

import java.util.Arrays;

/**
 * InsertionSort with O(n^2) Runtime
 */
public class InsertionSort {

    public static int[] sort(int[] numbers){
        System.out.println("Received input: " + Arrays.toString(numbers));

        if(numbers.length <= 1)
            return numbers;

        int cur;
        int j;

        for(int i = 1; i < numbers.length; i++){
            cur = numbers[i];
            j = i - 1;
            while (j >= 0 && cur < numbers[j]){
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = cur;
        }

        System.out.println("Output after InsertionSort: " + Arrays.toString(numbers));
        return numbers;
    }



}

