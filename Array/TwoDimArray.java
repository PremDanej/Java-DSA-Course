/*
 * Print two-dimensional 4 * 4 matrix.
 */
public class TwoDimArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int row = arr.length;
        int col = arr[0].length;

        System.out.println("Row length -> " + row); // row = 4
        System.out.println("Col length -> " + col); // col = 4

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
