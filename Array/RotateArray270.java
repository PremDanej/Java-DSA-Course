package Array;

/*
 * Rotate 2D Array Clockwise by 270 degrees.
 *
 *       Input                   Output
 *
 *   1   2   3   4           4   8   12  16
 *   5   6   7   8           3   7   11  15
 *   9   10  11  12          2   6   10  14
 *   13  14  15  16          1   5   9   13
 *
 */
public class RotateArray270 {
    public static void main(String[] args) {

        // Array declaration
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }; // Same size of array

        // Reverse an Array
        for (int i = 0; i < arr.length; i++) {
            int endRow = arr[i].length - 1;
            for (int startRow = 0; startRow < endRow; startRow++) {
                int temp = arr[i][startRow];
                arr[i][startRow] = arr[i][endRow];
                arr[i][endRow] = temp;
                endRow--;
            }
        }

        // Transpose a Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        // Display a Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
