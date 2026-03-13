package sorting;

import java.util.Arrays;

public class LinearSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}