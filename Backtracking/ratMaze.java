package Backtracking;

public class ratMaze {

    // To check whether the rat can go in that position
    static boolean isSafe(int maze[][], int x, int y, int n) {
        return (x < n && y < n && maze[x][y] == 1);
    }

    static boolean solveMaze(int arr[][], int x, int y, int n, int solArr[][]) {
        if (x == n - 1 && y == n - 1) {
            solArr[x][y] = 1;
            return true;
        }

        if (isSafe(arr, x, y, n)) {
            solArr[x][y] = 1;
            // Moving in right direction or down
            if (solveMaze(arr, x + 1, y, n, solArr) || solveMaze(arr, x, y + 1, n, solArr)) {
                return true;
            }
            // Backtrack if no possible path
            solArr[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int n = arr.length;
        int solArr[][] = new int[n][n];
        for (int i = 0; i < solArr.length; i++) {
            for (int j = 0; j < solArr.length; j++) {
                solArr[i][j] = 0;
            }
        }

        if (solveMaze(arr, 0, 0, n, solArr)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solArr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
