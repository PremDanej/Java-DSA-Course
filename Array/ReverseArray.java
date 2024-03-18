/*
 * Reverse an Array.
 */
public class ReverseArray {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {5, 2, -9, 11, 15, -4, 13};

        int startIndex = 0;
        int endIndex = arr.length - 1;

        // Swap values
        while (startIndex < endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        for(int element : arr){
            System.out.print(element +" ");
        }
    }
}
