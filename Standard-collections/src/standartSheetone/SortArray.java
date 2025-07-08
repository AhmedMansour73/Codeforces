
package standartSheetone;

import java.util.Scanner;

/**
 *
 * @author Ahmed Mansour
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =scanner.nextInt();
        int[] arr =new int[size];
        
        for (int i = 0; i < size ; i++) {
            arr[i] = scanner.nextInt();
        }
        
        sort(arr);
        
        
        
    }
    
    
           // Merges two subarrays of arr[]
    private static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
// Recursive merge sort function
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr,left, mid, right);
        }
    }
    
     public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Base case: already sorted
        }
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
}
