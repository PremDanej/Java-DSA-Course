package Sorting;

/*
 * Sort an Array with Insertion Sort.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {3, 10, 6, 2, 4};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        for(int item : arr) System.out.print(item + " ");
    }

}
