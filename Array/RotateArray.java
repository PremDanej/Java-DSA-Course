/*
 * Rotate 2D Array Clockwise by 90 degrees.
 *
 *       Input                   Output
 *
 *   1   2   3   4           13  9   5   1
 *   5   6   7   8           14  10  6   2
 *   9   10  11  12          15  11  7   3
 *   13  14  15  16          16  12  8   4
 *
 */
public class RotateArray {
    public static void main(String[] args) {

        // Array declaration
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }; // Same size of array

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

        // Reverse an Array
        for (int i = 0; i < arr.length; i++) {
            int startCol = 0;
            int endCol = arr[i].length - 1;
            while (startCol < endCol) {
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                startCol++;
                endCol--;
            }
        }

        // Display a matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
