package DP;

// A child is running up a staircase with n steps and can hop either 1 step,2 steps,or 3 steps at a time.Implement a method to count how many possible ways the child can run up the stairs

public class hopStairs {

    public static int findStep_rec(int n) {
        if (n == 1 || n == 0)
            return 1;
        else if (n == 2)
            return 2;
        else
            return findStep_rec(n - 3) + findStep_rec(n - 2) + findStep_rec(n - 1);
    }

    public static int findStep_dp(int n) {
        int arr[] = new int[n + 1];
        // Base Condition
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        return arr[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Using Recursion");
        System.out.println(findStep_rec(n));
        System.out.println("Using Dp");
        System.out.println(findStep_dp(n));
    }
}
