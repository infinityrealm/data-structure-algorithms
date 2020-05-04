package com.mycompany.app.search;

public class BinarySearch {
    /**
     * BinarySearch with O(Logn) Runtime
     */
    public static int search(int[] sortedArray, int target){
       return recursiveSearch(sortedArray, target, 0, sortedArray.length - 1);
    }

    private static int recursiveSearch(int[] data, int target, int low, int high){
        /**
         * This will be returned when target does not exit.
         * Either low or high will keeping incrementing/decrementing
         * until it satisfy the if statement
         */
        if(low > high)
            return -1;

        int middle = low + (high - low)/2;

        if(data[middle] == target){
            return middle;
        }
        else if (data[middle] > target){
            return recursiveSearch(data, target, low, middle - 1);
        }
        else {
            return recursiveSearch(data, target, middle + 1, high);
        }
    }
}
