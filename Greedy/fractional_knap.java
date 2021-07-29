package Greedy;

import java.math.*;

public class fractional_knap {

    static double roundOff(int num, int deno) {
        double res = Math.round(((double) num / deno) * 100) / 100.00;
        return res;
    }

    public static double getMaxValue(double cost[], int w[], int p[], int capacity) {

        double res[] = new double[w.length];
        double maxProfit = 0.0;

        for (int i = 0; i < cost.length; i++) {
            if (capacity > w[i]) {
                capacity -= w[i];
                res[i] = 1;
            } else if (capacity > (capacity / w[i])) {
                res[i] = roundOff(capacity, w[i]);
                capacity = 0;
            }
            maxProfit += p[i] * res[i];
        }
        return maxProfit;
    }

    public static void sortArr(double arr[], int[] p, int[] w, int capacity) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int temp1 = p[i];
                    p[i] = p[j];
                    p[j] = temp1;

                    temp1 = w[i];
                    w[i] = w[j];
                    w[j] = temp1;
                }
            }
        }
        System.out.println("Maximum value we can obtain = " + getMaxValue(arr, w, p, capacity));
    }

    public static void main(String[] args) {
        int m = 20;
        int P[] = { 21, 24, 12, 40, 30 };
        int W[] = { 7, 4, 6, 5, 6 };
        double cost[] = new double[P.length];

        for (int i = 0; i < W.length; i++)
            // cost[i] = Math.round(((double) P[i] / W[i]) * 100) / 100.00;
            cost[i] = roundOff(P[i], W[i]);

        sortArr(cost, P, W, m);

    }

}
