package Array;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] A = {1, 3};
        int[] B = {2, 4};
        int n = A.length + B.length;
        int[] C = new int[n];
        double sum = 0.0;

        for(int i = 0; i < A.length; i++) {
            C[i] = A[i];
            sum += A[i];
        }
        for(int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
            sum += B[i];
        }

        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
        System.out.println("Median -> " + sum / n);

    }
}
