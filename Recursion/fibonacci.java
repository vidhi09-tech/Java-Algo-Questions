package Recursion;

public class fibonacci {
    // Recursion
    static int fibonacci_rec(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (fibonacci_rec(n - 1) + fibonacci_rec(n - 2));
    }

    // Caching
    static int fibonacci_java(int n) {
        if (arr[n] == unknown)
            arr[n] = fibonacci_java(n - 1) + fibonacci_java(n - 2);
        return (arr[n]);
    }

    static int fibonacci_driver(int n) {
        int i;
        arr[0] = 0;
        arr[1] = 1;
        for (i = 2; i <= n; i++)
            arr[i] = unknown;
        return (fibonacci_java(n));
    }

    static int max = 45;
    static int unknown = -1;

    static int arr[] = new int[max + 1];

    public static void main(String[] args) {
        int n = 7;
        // By recursion
        // System.out.println(fibonacci_rec(n));
        // By Caching
        System.out.println(fibonacci_driver(n));

    }
}
