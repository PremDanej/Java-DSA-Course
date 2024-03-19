package Array;

/*
 * Rotate 2D Array Clockwise by 180 degrees.
 *
 *       Input                   Output
 *
 *   1   2   3   4           16  15  14  13
 *   5   6   7   8           12  11  10  9
 *   9   10  11  12          8   7   6   5
 *   13  14  15  16          4   3   2   1
 *
 */
public class RotateArray180 {
    public static void main(String[] args) {

        // Array declaration
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }; // Same size of array

        // Swapping -> Start row with End row.
        int endRow = arr.length - 1;
        for (int starRow = 0; starRow < endRow; starRow++) {
            for (int col = 0; col < arr[starRow].length; col++) {
                int temp = arr[starRow][col];
                arr[starRow][col] = arr[endRow][col];
                arr[endRow][col] = temp;
            }
            endRow--;
        }

        // Reverse an Array
        for (int i = 0; i < arr.length; i++) {
            int endCol = arr[i].length - 1;
            for (int startCol = 0; startCol < endCol; startCol++) {
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;
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
