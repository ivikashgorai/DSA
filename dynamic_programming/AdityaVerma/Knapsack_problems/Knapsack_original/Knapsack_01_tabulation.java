package dynamic_programming.AdityaVerma.Knapsack_problems.Knapsack_original;

import java.util.Arrays;

public class Knapsack_01_tabulation {
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,3,6,8};
        int n = wt.length;
        int W = 7;
        int[][] dp =  new int[n+1][W+1];

        //intialization from base condition // see recursive code
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j] = 0;
        }
       for(int i=1;i<n+1;i++){
        for(int j = 1;j<W+1;j++){
           if(j-wt[i-1]>=0){
            dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
           }
           else{
            dp[i][j] = dp[i-1][j];
           }
        }
       }
       System.out.println(dp[n][W]); // answer
    //    for(int i=0;i<n+1;i++){
    //     System.out.println(Arrays.toString(dp[i]));
    // }
    }
}
