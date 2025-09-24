package dynamic_programming.AdityaVerma.Knapsack_problems.Knapsack_unbounded;

public class knapsackU {

    static void main(String[] args){
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 3, 6, 8 };
        int W = 7;
        int n = wt.length;
        System.out.println(unboundedKnapsack(wt, val, W, n));
    }
    public static int unboundedKnapsack(int[] wt, int[] val, int W, int n) {
        Integer[][] dp = new Integer[n + 1][W + 1];
        return knap(wt, val, n, W, dp);
    }

    static int knap(int[] wt, int[] val, int n, int W, Integer[][] dp) {
        if (n == 0 || W == 0) return 0;
        if (dp[n][W] != null) return dp[n][W];

        if (W - wt[n - 1] >= 0) {
            int take = val[n - 1] + knap(wt, val, n, W - wt[n - 1], dp); // unbounded: n not reduced
            int skip = knap(wt, val, n - 1, W, dp);
            return dp[n][W] = Math.max(take, skip);
        } else {
            return dp[n][W] = knap(wt, val, n - 1, W, dp);
        }
    }
}

