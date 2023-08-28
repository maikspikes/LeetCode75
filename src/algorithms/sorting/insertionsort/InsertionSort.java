package algorithms.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13, 12, 14, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

        InsertionSort insertionSort = new InsertionSort();

        insertionSort.insertionSort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        // loop for each iteration
        for (int i = 1; i < n; i++) {

            // storing value of arr[i] in key temporarily
            int key = arr[i];
            int j = i - 1;

            // Move all the elements to the right side of the key which are greater than key value.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
