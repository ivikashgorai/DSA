package dynamic_programming.AdityaVerma.CoinChangeI;

import java.util.Arrays;

/**
 * Tabulation
 */
public class Tabulation {
    public static void main(String[] args) {
        int[] coin = { 1, 2, 3 }; // positive integer
        int sum = 5;
        int n = coin.length;
        System.out.println(CountWaysTab(coin, n, sum));
    }

    static int CountWaysTab(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i < sum + 1; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (j - arr[i - 1] >= 0) {
                    dp[i][j] += dp[i][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];

                }
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[n][sum];
    }
}