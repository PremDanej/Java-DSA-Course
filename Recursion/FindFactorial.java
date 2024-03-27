package Recursion;

/*
 * Find Factorial of given N number.
 */
public class FindFactorial {
    public static void main(String[] args) {

        int n = 5;
        int f = fact(n);
        System.out.println(f);
    }

    private static int fact(int n) {
        if(n == 1)
            return 1;
        return n * fact(n -1);
    }
}
