package Recursion;

/*
 * Print N number.
 */

public class PrintNumber {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }

    private static void printNumber(int i) {
        if (i == 0) return;
        System.out.println("number is " + i);
        printNumber(i - 1);
    }
}
