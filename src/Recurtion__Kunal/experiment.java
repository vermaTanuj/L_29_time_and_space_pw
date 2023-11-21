package Recurtion__Kunal;
import java.util.Arrays;

public class experiment {
    public static void main(String[] args) {
       /* int[] a = {12, 11, 13, 5, 6, 7};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

        */
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);

    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            // merge(array, left, middle, right);
        }
    }


    // Merge function for merging two halves
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temporary arrays
        for (int i = 0; i < sizeLeft; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < sizeRight; ++j)
            rightArray[j] = array[middle + 1 + j];

        // Merge the temporary arrays

        // Initial indices of the two subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
