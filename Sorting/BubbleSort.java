package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Sort an Array with Bubble Sort.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2, 8, 4, -1, 7, 10, 5, 6};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int item : arr) System.out.print(item + " ");
    }
}
