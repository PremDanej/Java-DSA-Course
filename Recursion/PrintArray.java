package Recursion;

/*
 * Print an Array
 */

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        printArray(arr, 0);
    }

    private static void printArray(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.println(arr[i]);
        printArray(arr, i + 1);
    }
}
