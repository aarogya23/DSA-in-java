package sorting;

import java.util.Arrays;

public class RadixSort {

    // Function to get the maximum value in the array
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Counting Sort based on the digit represented by exp
    static void countingSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int count[] = new int[10]; // digits 0-9

        // Initialize count array
        Arrays.fill(count, 0);

        // Store count of occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Change count[i] so that it contains position
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output array to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main Radix Sort function
    static void radixSort(int arr[], int n) {
        int max = getMax(arr, n);

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        radixSort(arr, arr.length);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}