/*
 * SubArrays of Array.
 */
public class SubArray {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {5, 2, -9, 11, 15, -4, 13};
        int n = arr.length;
        int c = 0;

        // Print SubArrays
        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                for (int element = startIndex; element <= endIndex; element++) {
                    System.out.print(arr[element] + " ");
                }
                c++; // Count total SubArray's
                System.out.println();
            }
        }

        System.out.println("Total SubArray is -> " + c);
    }
}
