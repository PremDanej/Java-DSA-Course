package Array;

/*
 * Find Maximum element from Array.
 */
public class MaxElementArray {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {5, 2, -9, 11, 15, -4, 13};

        // find max from array.
        int max = 0;
        for(int element : arr){
            max = Math.max(max, element);
        }
        System.out.println("Max is -> " + max);
    }
}
