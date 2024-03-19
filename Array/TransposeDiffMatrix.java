package Array;

/*
 * Transpose of Matrix (Different size).
 */
public class TransposeDiffMatrix {
    public static void main(String[] args) {

        // Array declaration
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        }; // Different size of array [5][4].

        int row = arr.length; // row = 5
        int col = arr[0].length; // col = 4

        int[][] transArr = new int[col][row]; // Declaring new array.

        for(int i = 0; i < transArr.length; i++){
            for(int j = 0; j < transArr[i].length; j++){
                transArr[i][j] = arr[j][i];
            }
        }

        // Display a matrix
        for (int i = 0; i < transArr.length; i++) {
            for (int j = 0; j < transArr[i].length; j++) {
                System.out.print(transArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
