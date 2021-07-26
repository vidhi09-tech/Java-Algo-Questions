package DP;

/**
 * fibonacci
 */
public class fibonacci {

    static int max = 45;

    static int fibo_dp(int n) {
        int arr[] = new int[max];
        arr[0] = 0;
        arr[1] = 1;
        int i;

        for (i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return (arr[n]);
    }

    public static void main(String[] args) {
        System.out.println(fibo_dp(7));
    }
}