package dynamic_programming.AdityaVerma.Knapsack_problems.SubsetSum;

import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        int[] arr = {2,3,7,8,10};
        int targetSum = 11;
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][targetSum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int j=1;j<targetSum+1;j++){
            dp[0][j] = false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<targetSum+1;j++){
                if(j-arr[i-1]>=0){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
         for(int i=0;i<n+1;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[n][targetSum]);
    }
}
