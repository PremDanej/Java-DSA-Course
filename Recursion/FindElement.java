package Recursion;

/*
 * Find element from array
 */
public class FindElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 10, 6, 8, 9, 12};
        int x = 9;
        int position = findElement(arr, x, 0);
        System.out.println(position >= 0 ? position : "Element Not found");
    }

    private static int findElement(int[] arr, int x, int i) {
        if(i == arr.length) return -1;
        if (arr[i] == x) return i;
        return findElement(arr, x, i + 1);
    }
}
