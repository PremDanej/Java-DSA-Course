public class SumOfArray {
    public static void main(String[] args) {

        // Array declaration
        int[] arr = {5, 2, -9, 11, 15, -4, 13};

        int sum = 0;

        for(int i : arr){
            sum += i; // sum = sum + i;
        }

        System.out.println("Sum is -> " + sum);
    }
}
