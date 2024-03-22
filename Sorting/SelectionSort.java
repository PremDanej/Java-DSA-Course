package Sorting;

import java.util.Arrays;

/*
 * Sort an Array with Selection Sort.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, -1, 7, 10, 5, 6};

        for(int i = 0; i < arr.length -1 ; i++){
            int minValue = arr[i];
            int minIndex = i;

            for(int j = i +1 ; j <arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            int swap = arr[i];
            arr[i] = minValue;
            arr[minIndex] = swap;
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
