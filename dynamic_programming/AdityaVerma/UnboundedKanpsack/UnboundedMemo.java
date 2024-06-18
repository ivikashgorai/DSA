package dynamic_programming.AdityaVerma.UnboundedKanpsack;

public class UnboundedMemo {
    static int prof = 0;
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int W = 7;
        int n = wt.length;
        int[][] dp = new int[wt.length+1][W+1]; // [n+1][W+1]
        for(int i=0;i<dp.length;i++){
          for(int j=0;j<dp[0].length;j++){
            dp[i][j] = -1;
          }
        }
        System.out.println(Knapsack(wt, val, W, n,dp));
        
    }

    public static int Knapsack(int[] wt, int[] val, int W, int n,int[][] dp) {
      if(n==0 || W==0){
        return 0;
      }
      if(dp[n][W]!=-1){
        return dp[n][W];
      }
     if(W-wt[n-1]>=0){
      int a = val[n-1]+Knapsack(wt, val, W-wt[n-1], n,dp);
      int b = Knapsack(wt, val, W, n-1,dp);
      dp[n][W] = Math.max(a, b);
      return Math.max(a,b);
     }
     else{
     int a = Knapsack(wt, val, W, n-1,dp);
     dp[n][W] = a;
     return a;
     }

    }
}