package Recursion;

/*
 * Find N number of sum.
 */

public class Intro {
    public static void main(String[] args) {
        int n = 5;
        int val = sum(n);
        System.out.println(val);
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 3;
        }
        return n + sum(n - 1);
    }
}
