package com.mycompany.app;

import java.util.Random;

public class Generator {
    public static int[] generateRandomIntArray(int size, int range){
        Random rd = new Random(); // creating Random object
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(range); // storing random integers in an array
        }
        return arr;
    }
}
