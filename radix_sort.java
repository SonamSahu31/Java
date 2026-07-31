package sorting;
import java.util.*;

public class radix_sort {

    // Function to get maximum value
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Counting Sort based on digit (exp)
    static void countingSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int count[] = new int[10]; // digits 0-9

        Arrays.fill(count, 0);

        // count occurrences
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // build output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // copy to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main Radix Sort function
    static void radixSort(int arr[], int n) {
        int max = getMax(arr, n);

        // apply counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, n, exp);
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr, arr.length);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}