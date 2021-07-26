package DP;

// Edit Distance

public class levenshtein {

    static int min(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        else if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    static int editDistance(String str1, String str2, int m, int n) {

        // Creating a table to store the results of the subproblem
        int dp[][] = new int[m + 1][n + 1];
        // Fill d[][] in bottom up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                // Inserting elements in the row
                if (i == 0)
                    dp[i][j] = j;

                // Removing elements in the column
                else if (j == 0)
                    dp[i][j] = i;

                // If the character of both the strings are same,remove last and recur for
                // the rest of the string
                else {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // Replace , Insert and Delete
                        dp[i][j] = 1 + min(dp[i - 1][j - 1], dp[i][j - 1], dp[i - 1][j]);
                    }
                }

            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        // Recursive Approach
        String str1 = "saturday";
        String str2 = "sunday";

        System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
    }
}
